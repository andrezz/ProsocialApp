package pe.edu.upeu.prosocial.util;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;

import pe.edu.upeu.prosocial.R;

/**
 * Created by Andres on 04/11/2015.
 */
public class FragmentActions {
    public static void setFragments(Activity a, Fragment fragment,String t){
        FragmentTransaction transaction = a.getFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_content, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
        a.setTitle(t);
    }
}
