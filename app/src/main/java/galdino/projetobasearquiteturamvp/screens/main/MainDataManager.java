package galdino.projetobasearquiteturamvp.screens.main;

import java.util.List;

import galdino.projetobasearquiteturamvp.api.ApiMvpHelper;
import galdino.projetobasearquiteturamvp.domain.BaseClass;
import io.reactivex.Single;

/**
 * Created by galdino on 08/01/18.
 */

public class MainDataManager implements MainMvpDataManager {
    private ApiMvpHelper mApiMvpHelper;

    public MainDataManager(ApiMvpHelper mApiMvpHelper) {
        this.mApiMvpHelper = mApiMvpHelper;
    }

    @Override
    public Single<List<BaseClass>> load() {
        return mApiMvpHelper.get().singleOrError();
    }
}
