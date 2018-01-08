package galdino.projetobasearquiteturamvp.screens.main;

import java.util.List;

import galdino.projetobasearquiteturamvp.domain.BaseClass;
import io.reactivex.Single;

/**
 * Created by galdino on 08/01/18.
 */

public interface MainMvpDataManager
{
    // TODO TROCAR
    Single<List<BaseClass>> load();
}
