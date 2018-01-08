package galdino.projetobasearquiteturamvp.coreMVP.modules;

import dagger.Module;
import dagger.Provides;
import galdino.projetobasearquiteturamvp.coreMVP.scheduler.SchedulerProvider;
import galdino.projetobasearquiteturamvp.screens.main.MainMvpDataManager;
import galdino.projetobasearquiteturamvp.screens.main.MainMvpPresenter;
import galdino.projetobasearquiteturamvp.screens.main.MainPresenter;

/**
 * Created by galdino on 05/11/17.
 */

@Module
public class PresenterModule {

    @Provides
    MainMvpPresenter providesMainMvpPresenter(SchedulerProvider schedulerProvider, MainMvpDataManager mainMvpDataManager){
        return new MainPresenter(schedulerProvider, mainMvpDataManager);
    }
}
