package org.resthub.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.resthub.training.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
	
	public Task findByTitle(String title);
}
