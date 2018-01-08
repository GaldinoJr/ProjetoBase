package galdino.projetobasearquiteturamvp.coreMVP.modules;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import galdino.projetobasearquiteturamvp.api.ApiHelper;
import galdino.projetobasearquiteturamvp.api.ApiMvpHelper;
import galdino.projetobasearquiteturamvp.api.MyDbApi;
import galdino.projetobasearquiteturamvp.api.MyDbApiMocked;

/**
 * Created by galdino on 05/11/17.
 */

@Module
public class HelperModule {
    private Context mContext;
    private MyDbApi mApiMocked;

    public HelperModule(Context context) {
        this.mContext = context;
        this.mApiMocked = new MyDbApiMocked();
    }

    @Provides
    ApiMvpHelper providesApiHelper()
    {
        return new ApiHelper(mContext);
    }
}
