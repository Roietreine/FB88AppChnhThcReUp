package project.rr.fb88appchinhref.common.presentation.dashboard


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import project.rr.fb88appchinhref.R
import project.rr.fb88appchinhref.weviewreup.WebviewActivityReup

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        Handler(Looper.getMainLooper()).postDelayed(
            {
                startActivity(WebviewActivityReup.getStartIntent(this))
                finish()
            },1500
        )
    }
}