package obs.com.youtubesample.dependencies.components

import dagger.Component
import obs.com.youtubesample.dependencies.modules.AppContainerModule
import obs.com.youtubesample.dependencies.modules.ApplicationModule
import obs.com.youtubesample.dependencies.modules.NetworkModule
import obs.com.youtubesample.utills.RequestCallback
import obs.com.youtubesample.views.MainActivity
import javax.inject.Singleton

/**
 * @author Created by vigneshwaran.n on 01-02-2018.
 */

@Singleton
@Component(modules = arrayOf(ApplicationModule::class, AppContainerModule::class, NetworkModule::class))
interface AppComponent {

    fun inject(requestCallback: RequestCallback) {}
    fun inject(Activity: MainActivity)

}