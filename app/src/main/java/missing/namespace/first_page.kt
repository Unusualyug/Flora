package missing.namespace

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class first_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.first_page)
        val getbtn = findViewById<Button>(R.id.btnGetStarted);
        getbtn.setOnClickListener {
            val intent = Intent(this, first_page::class.java)
            startActivity(intent)
        }


    }
}