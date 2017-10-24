package com.framgia.soundcloud.screen.home.offline;

/**
 * Listens to user actions from the UI ({@link OfflineFragment}), retrieves the data and updates
 * the UI as required.
 */
final class OfflinePresenter implements OfflineContract.Presenter {
    private static final String TAG = OfflinePresenter.class.getName();

    private final OfflineContract.ViewModel mViewModel;

    public OfflinePresenter(OfflineContract.ViewModel viewModel) {
        mViewModel = viewModel;
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {
    }
}