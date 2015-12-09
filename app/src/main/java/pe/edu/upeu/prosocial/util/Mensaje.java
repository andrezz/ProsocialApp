package pe.edu.upeu.prosocial.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;

import java.util.TooManyListenersException;

/**
 * Created by Andres on 09/12/2015.
 */
public class Mensaje {
    public static void msgShort(Activity a,String m){
        Toast.makeText(a,m,Toast.LENGTH_SHORT).show();
    }
    public static void msgLong(Activity a,String m){
        Toast.makeText(a,m,Toast.LENGTH_LONG).show();
    }
    public static AlertDialog crearAlertaDialog(Activity activity){
        final CharSequence[] items = {
                "Editar",
                "Eliminar"
        };
        AlertDialog.Builder alert = new AlertDialog.Builder(activity);
        alert.setTitle("Opciones");
        alert.setItems(items, (DialogInterface.OnClickListener) activity);
        return alert.create();
    }
}
