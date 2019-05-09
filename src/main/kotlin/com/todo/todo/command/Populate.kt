package com.todo.todo.command

import com.todo.todo.domain.Task
import com.todo.todo.repository.TaskRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Populate(val taskRepository: TaskRepository) : CommandLineRunner {

    override fun run(vararg args: String?) {
        val tasks = listOf(
            Task(name = "Task 1", value = "Task value 1"),
            Task(name = "Task 1", value = "Task value 1"),
            Task(name = "Task 1", value = "Task value 1")
        )
        taskRepository.saveAll(tasks)
    }

}
