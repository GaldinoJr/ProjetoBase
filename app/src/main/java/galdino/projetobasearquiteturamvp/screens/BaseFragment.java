package galdino.projetobasearquiteturamvp.screens;

import android.support.v4.app.Fragment;
import android.widget.Toast;

/**
 * Created by galdino on 08/01/18.
 */

public class BaseFragment extends Fragment{
    protected void showMessage(int id_message)
    {
        Toast.makeText(getContext(), getString(id_message), Toast.LENGTH_SHORT).show();
    }
}
