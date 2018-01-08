package galdino.projetobasearquiteturamvp.screens.main;

import galdino.projetobasearquiteturamvp.coreMVP.MvpView;

/**
 * Created by galdino on 08/01/18.
 */

public interface MainMvpView extends MvpView
{
    void onGetting(boolean isGetting);

    void onError();

    void onSuccess();
}
