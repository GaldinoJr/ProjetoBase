package galdino.projetobasearquiteturamvp.api;

import java.util.List;

import galdino.projetobasearquiteturamvp.domain.BaseClass;
import io.reactivex.Observable;
import retrofit2.http.Query;

/**
 * Created by Galdino on 22/12/2017.
 */

public class MyDbApiMocked implements MyDbApi {

    @Override
    public Observable<List<BaseClass>> get(@Query(PATH_PER_PAGE) int per_page) {
        return null;
    }
}
