package pe.edu.upeu.prosocial;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import java.util.HashMap;

import pe.edu.upeu.prosocial.util.Conexion;
import pe.edu.upeu.prosocial.util.Mensaje;

public class Login extends Activity {
    EditText txtUser, txtClave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtClave= (EditText) findViewById(R.id.txtClave);
        txtUser= (EditText) findViewById(R.id.txtUsuario);
    }
    public void validar(View view){
        final String user=txtUser.getText().toString();
        final String clave=txtClave.getText().toString();
        class login extends AsyncTask<Void,Void,String>{
            ProgressDialog dialog;

            @Override
            protected String doInBackground(Void... params) {
                HashMap<String,String> parametros= new HashMap<>();
                parametros.put(Conexion.U_USER,user);
                parametros.put(Conexion.U_CLAVE, clave);
                Conexion conexion= new Conexion();
                if(conexion.isOnline(Login.this)){
                    return conexion.sendPostRequest(conexion.URL_LOGIN(),parametros);
                }else{
                    Mensaje.msgLong(Login.this,"No hay conexion a Internet");
                }
                return null;
            }

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                dialog=ProgressDialog.show(Login.this,"Comprobar Usuario","Conectando...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                dialog.dismiss();
                Mensaje.msgLong(Login.this, s);
                abrirPrincipal();
            }
        }
    }
    public void abrirPrincipal(){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

}
