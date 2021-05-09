package app.murakami.takuro.extendcount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number: Int =0;
        var position: Int =20;

        gobutton.setOnClickListener{
            position += 1
            textview.text = "GO"
        }
        backbutton.setOnClickListener{
            position -= 1
            textview.text = "BACK"
        }

        imageView.setX(position);
    }
}