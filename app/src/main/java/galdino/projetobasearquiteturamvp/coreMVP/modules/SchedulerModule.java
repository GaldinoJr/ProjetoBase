package galdino.projetobasearquiteturamvp.coreMVP.modules;


import dagger.Module;
import dagger.Provides;
import galdino.projetobasearquiteturamvp.coreMVP.scheduler.AppSchedulerProvider;
import galdino.projetobasearquiteturamvp.coreMVP.scheduler.SchedulerProvider;

/**
 * Created by galdino on 05/11/17.
 */

@Module
public class SchedulerModule
{
    @Provides
    SchedulerProvider provideSchedulerModule()
    {
        return new AppSchedulerProvider();
    }
}
