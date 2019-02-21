// Generated by Dagger (https://google.github.io/dagger).
package com.weike.education.mvp.presenter.app;

import com.weike.education.network.helper.RetrofitHelper;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ChoosePhasePresenter_Factory implements Factory<ChoosePhasePresenter> {
  private final Provider<RetrofitHelper> mRetrofitHelperProvider;

  public ChoosePhasePresenter_Factory(Provider<RetrofitHelper> mRetrofitHelperProvider) {
    this.mRetrofitHelperProvider = mRetrofitHelperProvider;
  }

  @Override
  public ChoosePhasePresenter get() {
    return provideInstance(mRetrofitHelperProvider);
  }

  public static ChoosePhasePresenter provideInstance(
      Provider<RetrofitHelper> mRetrofitHelperProvider) {
    return new ChoosePhasePresenter(mRetrofitHelperProvider.get());
  }

  public static ChoosePhasePresenter_Factory create(
      Provider<RetrofitHelper> mRetrofitHelperProvider) {
    return new ChoosePhasePresenter_Factory(mRetrofitHelperProvider);
  }

  public static ChoosePhasePresenter newChoosePhasePresenter(RetrofitHelper mRetrofitHelper) {
    return new ChoosePhasePresenter(mRetrofitHelper);
  }
}
