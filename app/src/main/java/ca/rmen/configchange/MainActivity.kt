package ca.rmen.configchange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ca.rmen.configchange.databinding.ActivityMainBinding
import ca.rmen.configchange.databinding.ItemCardBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = Adapter()
        binding.recyclerView.adapter = adapter
    }

    class Adapter : RecyclerView.Adapter<ItemViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ItemViewHolder(
            DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_card, parent, false)
        )

        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        }

        override fun getItemCount() = 1

    }

    class ItemViewHolder(val binding: ItemCardBinding) : RecyclerView.ViewHolder(binding.root)
}