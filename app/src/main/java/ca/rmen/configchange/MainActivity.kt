package ca.rmen.configchange

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<RecyclerView>(R.id.recycler_view).adapter = Adapter()
    }

    class ItemContentRed : Fragment() {
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
            inflater.inflate(
                R.layout.item_content_red,
                container,
                false
            )
    }

    class Adapter : RecyclerView.Adapter<ItemViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_container_yellow, parent, false)
        )

        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {}

        override fun getItemCount() = 1
    }

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view)
}