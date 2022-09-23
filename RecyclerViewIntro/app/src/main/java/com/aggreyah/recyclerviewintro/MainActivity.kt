package com.aggreyah.recyclerviewintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aggreyah.recyclerviewintro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var todoList = mutableListOf(
            Todo("Follow Android Devs", false),
            Todo("Learn About RecyclerView", true),
            Todo("Feed the cat", false),
            Todo("Feed the dog", false),
            Todo("Feed the cow", true),
            Todo("Fix the car", true),
            Todo("Visit friend", false),
            Todo("Visit mom", false),
            Todo("Visit GrandPa", true),
            Todo("Take a shower", false),
            Todo("Cook some local foods", true),
            Todo("Drive through the forest", false),
            Todo("Take a road trip", false),
            Todo("Do some programming", true),
            Todo("Take dog for a walk", true),
            Todo("Grease the bicycle chain drive", true),
            Todo("Go jogging", true),
            Todo("Watch favorite movie", false),
            Todo("Hit the gym", false),
            Todo("Check social media feeds", true),
            Todo("Watch the stars", false)
        )

        val adapter = TodoAdaptor(todoList)
        binding.rvTodos.adapter = adapter
        binding.rvTodos.layoutManager = LinearLayoutManager(this)

        binding.btnAddTodo.setOnClickListener {
            val title = binding.etTodo.text.toString()
            val  todo = Todo(title, false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size - 1)
        }
    }

}