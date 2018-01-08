package galdino.projetobasearquiteturamvp.coreMVP.modules;

import dagger.Module;
import dagger.Provides;
import galdino.projetobasearquiteturamvp.api.ApiMvpHelper;
import galdino.projetobasearquiteturamvp.screens.main.MainDataManager;
import galdino.projetobasearquiteturamvp.screens.main.MainMvpDataManager;

/**
 * Created by galdino on 05/11/17.
 */

@Module
public class DataManagerModule
{
    @Provides
    MainMvpDataManager providesMainMvpDataManager(ApiMvpHelper apiHelper)
    {
        return new MainDataManager(apiHelper);
    }
}
