package obs.com.youtubesample.views

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import obs.com.youtubesample.R
import obs.com.youtubesample.app.BaseApp.Companion.app

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        app.inject(this)
    }
}
