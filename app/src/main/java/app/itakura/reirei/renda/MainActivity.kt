package app.itakura.reirei.renda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tapCount = 0

        tapButton.setOnClickListener{
            tapCount = tapCount + 1

            count.text = tapCount.toString()

        }
    }
}