/**
 * 
 */
package org.resthub.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Nasir Khan
 *
 */
@Entity
public class Task {
	
	@Id
	@GeneratedValue
    private Long id;
	
	private String title;
	private String description;
		
	public Task(){
		
	}
	public Task(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public Long getId(){
		return id;
	}
	
	public void setId(Long id) {
	this.id = id;	
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}