package galdino.projetobasearquiteturamvp;

import android.app.Application;

import galdino.projetobasearquiteturamvp.coreMVP.components.BaseComponent;
import galdino.projetobasearquiteturamvp.coreMVP.components.DaggerAppComponents;
import galdino.projetobasearquiteturamvp.coreMVP.modules.HelperModule;

/**
 * Created by Galdino on 22/12/2017.
 */

public class MyApplication extends Application
{
    private BaseComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        BaseComponent baseComponent = DaggerAppComponents.builder()
                .helperModule(new HelperModule(this))
                .build();
        setDiComponent(baseComponent);
    }

    public BaseComponent getDiComponent() {
        return appComponent;
    }

    public void setDiComponent(BaseComponent appComponent) {
        this.appComponent = appComponent;
    }
}
