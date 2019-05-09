package com.todo.todo.repository

import com.todo.todo.domain.Task
import org.springframework.data.repository.CrudRepository

interface TaskRepository : CrudRepository<Task, Int> {
}
