package obs.com.youtubesample.app

import android.app.Application
import obs.com.youtubesample.dependencies.components.AppComponent
import obs.com.youtubesample.dependencies.components.DaggerAppComponent
import obs.com.youtubesample.dependencies.modules.ApplicationModule


/**
 * @author Created by vigneshwaran.n on 01-02-2018.
 */

class BaseApp : Application() {
    //change class name as per
    companion object {
        lateinit var app: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        app = DaggerAppComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}