package galdino.projetobasearquiteturamvp.api;

import java.util.List;

import galdino.projetobasearquiteturamvp.domain.BaseClass;
import io.reactivex.Observable;

/**
 * Created by Galdino on 22/12/2017.
 */

public interface ApiMvpHelper
{
    Observable <List<BaseClass>> get();
}
