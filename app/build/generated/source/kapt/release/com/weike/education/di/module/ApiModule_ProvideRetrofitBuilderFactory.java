// Generated by Dagger (https://google.github.io/dagger).
package com.weike.education.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import retrofit2.Retrofit;

public final class ApiModule_ProvideRetrofitBuilderFactory implements Factory<Retrofit.Builder> {
  private final ApiModule module;

  public ApiModule_ProvideRetrofitBuilderFactory(ApiModule module) {
    this.module = module;
  }

  @Override
  public Retrofit.Builder get() {
    return provideInstance(module);
  }

  public static Retrofit.Builder provideInstance(ApiModule module) {
    return proxyProvideRetrofitBuilder(module);
  }

  public static ApiModule_ProvideRetrofitBuilderFactory create(ApiModule module) {
    return new ApiModule_ProvideRetrofitBuilderFactory(module);
  }

  public static Retrofit.Builder proxyProvideRetrofitBuilder(ApiModule instance) {
    return Preconditions.checkNotNull(
        instance.provideRetrofitBuilder(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
