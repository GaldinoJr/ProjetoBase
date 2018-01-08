package galdino.projetobasearquiteturamvp.api;

import java.util.List;

import galdino.projetobasearquiteturamvp.domain.BaseClass;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Galdino on 22/12/2017.
 */

public interface MyDbApi
{
    // Parameters
    String PAR_SHOT_ID = "shotId";
    // Métodos get
    String GET_SHOTS = "shots";
    String GET_SHOT_DETAIL = GET_SHOTS + "/{" + PAR_SHOT_ID + "}";
    // parametros
    String PATH_ACCESS_TOKEN = "access_token";
    String PATH_PER_PAGE = "per_page";

    // TODO TROCAR O NOME DO METODO
    @GET(GET_SHOTS)
    Observable<List<BaseClass>> get(
            @Query(PATH_PER_PAGE) int per_page);
}
