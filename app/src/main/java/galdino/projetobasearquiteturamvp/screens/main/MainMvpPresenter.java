package galdino.projetobasearquiteturamvp.screens.main;

import galdino.projetobasearquiteturamvp.coreMVP.MvpPresenter;

/**
 * Created by galdino on 08/01/18.
 */

public interface MainMvpPresenter extends MvpPresenter<MainMvpView>
{
    void load();
}
