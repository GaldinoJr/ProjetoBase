package galdino.projetobasearquiteturamvp.screens.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import galdino.projetobasearquiteturamvp.MyApplication;
import galdino.projetobasearquiteturamvp.R;
import galdino.projetobasearquiteturamvp.databinding.FragmentMainBinding;
import galdino.projetobasearquiteturamvp.screens.BaseFragment;

public class MainFragment extends BaseFragment implements MainMvpView
{
    private FragmentMainBinding mBinding;
    private MainMvpPresenter mPresenter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        loadControls();
        return mBinding.getRoot();
    }

    private void loadControls()
    {
        MyApplication application = (MyApplication) getContext().getApplicationContext();
        application.getDiComponent().inject(this);

        mPresenter.load();
    }

    @Inject
    public void setPresenter(MainMvpPresenter presenter)
    {
        mPresenter = presenter;
        mPresenter.attach(this);
    }

    @Override
    public void onGetting(boolean isGetting) {

    }

    @Override
    public void onError() {

    }

    @Override
    public void onSuccess() {

    }
}
