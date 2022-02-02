package ca.rmen.configchange

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = Adapter()
        recyclerView.adapter = adapter
    }

    class Adapter : RecyclerView.Adapter<ItemViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        )

        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) { }

        override fun getItemCount() = 1
    }

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view)
}