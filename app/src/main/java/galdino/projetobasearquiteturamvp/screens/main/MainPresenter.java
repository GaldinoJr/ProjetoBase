package galdino.projetobasearquiteturamvp.screens.main;

import java.util.List;

import galdino.projetobasearquiteturamvp.coreMVP.BasePresenter;
import galdino.projetobasearquiteturamvp.coreMVP.scheduler.SchedulerProvider;
import galdino.projetobasearquiteturamvp.domain.BaseClass;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

/**
 * Created by galdino on 08/01/18.
 */

public class MainPresenter extends BasePresenter<MainMvpView> implements MainMvpPresenter
{
    private MainMvpView mView;
    private MainMvpDataManager mDataManager;

    public MainPresenter(SchedulerProvider schedulerProvider, MainMvpDataManager dataManager)
    {
        super(schedulerProvider);
        mDataManager = dataManager;
    }


    @Override
    public void attach(MainMvpView view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = new MainMvpView() {
            @Override
            public void onGetting(boolean isGetting) {

            }

            @Override
            public void onError() {

            }

            @Override
            public void onSuccess() {

            }
        };
    }

    @Override
    public void load()
    {
        SchedulerProvider schedulerProvider = getSchedulerProvider();
        mDataManager.load()
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .subscribe(new SingleObserver<List<BaseClass>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        mView.onGetting(true);
                    }

                    @Override
                    public void onSuccess(List<BaseClass> baseClasses) {
                        mView.onGetting(false);
                        mView.onSuccess();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.onGetting(false);
                        mView.onError();
                    }
                });
    }
}
