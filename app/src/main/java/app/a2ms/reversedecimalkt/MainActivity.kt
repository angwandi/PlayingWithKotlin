package app.a2ms.reversedecimalkt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import kotlinx.android.synthetic.main.activity_main.*

fun reverseDecimal(number: Long): Long = number.toString().reversed().toLong()

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = ""
        textView.movementMethod = ScrollingMovementMethod()
        editText.text.clear()

        button.setOnClickListener {
            val number: Long = editText.text.toString().toLong()
            val rev = reverseDecimal(number)
            textView.append(rev.toString())
            textView.append("\n")
            editText.text.clear()
        }
    }
}
