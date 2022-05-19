package nurulhakiki.polbeng.ac.id.fragmentexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import nurulhakiki.polbeng.ac.id.fragmentexample2.BookDescription
import nurulhakiki.polbeng.ac.id.fragmentexample2.Coordinator
import nurulhakiki.polbeng.ac.id.fragmentexample2.R

class MainActivity : AppCompatActivity(), Coordinator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBookchanged(index: Int) {
        val frag = fragmentbookdescription
        if (frag is BookDescription) {
            frag.changeDescription(index)
        }
    }
}
