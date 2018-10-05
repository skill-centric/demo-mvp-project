package com.zavanton123.demomvp;

public class MainPresenter implements MvpPresenter {

    MvpView view;

    @Override
    public void setView(MvpView view) {
        this.view = view;
    }

    @Override
    public void processFabClick() {

        int result = 1 + 1;

        view.showResult(result);
    }
}
