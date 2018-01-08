package galdino.projetobasearquiteturamvp.api;

import android.content.Context;

import java.util.List;

import galdino.projetobasearquiteturamvp.domain.BaseClass;
import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Galdino on 22/12/2017.
 */

public class ApiHelper implements ApiMvpHelper
{
    // TODO TROCAR A URL DA API
    private static final String BASE_URL = "http://api.dribbble.com/v1/";
    private Context mContext;
    private MyDbApi mDbApi;

    public ApiHelper(Context context) {
        this.mContext = context;
        Retrofit retrofit = getRetrofit();
        mDbApi = retrofit.create(MyDbApi.class);
    }

    private Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    // TODO TROCAR O NOME DO METODO
    @Override
    public Observable<List<BaseClass>> get() {
        return mDbApi.get(30).flatMap(
            new Function<List<BaseClass>, Observable<List<BaseClass>>>()
            {
                  @Override
                  public Observable<List<BaseClass>> apply(@NonNull List<BaseClass> baseClasses) throws Exception {
                      return Observable.just(baseClasses);
                  }
              });
    }
}
