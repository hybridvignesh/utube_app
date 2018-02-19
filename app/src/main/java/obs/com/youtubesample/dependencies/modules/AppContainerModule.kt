package obs.com.youtubesample.dependencies.modules

import dagger.Module
import dagger.Provides
import obs.com.youtubesample.api.ApiService
import obs.com.youtubesample.models.JsonResponse
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * @author Created by vigneshwaran.n on 01-02-2018.
 */
@Module
class AppContainerModule {

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)


    @Provides
    @Singleton
    fun provideJsonResponse(): JsonResponse = JsonResponse()

}