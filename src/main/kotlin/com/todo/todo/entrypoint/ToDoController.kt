package com.todo.todo.entrypoint

import com.todo.todo.domain.Task
import com.todo.todo.repository.TaskRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todo")
class ToDoController(val taskRepository: TaskRepository) {

    @GetMapping
    fun all(): MutableIterable<Task> {
        return taskRepository.findAll()
    }
}
