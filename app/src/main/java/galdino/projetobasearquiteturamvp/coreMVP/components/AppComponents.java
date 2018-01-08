package galdino.projetobasearquiteturamvp.coreMVP.components;


import dagger.Component;
import galdino.projetobasearquiteturamvp.coreMVP.modules.DataManagerModule;
import galdino.projetobasearquiteturamvp.coreMVP.modules.HelperModule;
import galdino.projetobasearquiteturamvp.coreMVP.modules.PresenterModule;
import galdino.projetobasearquiteturamvp.coreMVP.modules.SchedulerModule;


/**
 * Created by galdino on 05/11/17.
 */

@Component(modules = {PresenterModule.class, SchedulerModule.class, DataManagerModule.class, HelperModule.class})
public interface AppComponents extends BaseComponent{
}
