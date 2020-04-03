package edu.escuelaing.arep.app.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class User {	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	 	@Column(name = "user_id")
	    private long userId;

	    @Column(nullable = false)
	    private String username;

	    @Column(nullable = false)
	    private String password;

	    private boolean active;

	    private String roles = "";

	    public User(String username, String password, String roles){
	        this.username = username;
	        this.password = password;
	        this.roles = roles;
	        this.active = true;
	    }
	    protected User() {}	
	    
		public List<String> getRoleList(){
	        if(this.roles.length() > 0){
	            return Arrays.asList(this.roles.split(","));
	        }
	        return new ArrayList<>();
	    }
		public long getUserId() {
			return userId;
		}
		public void setUserId(long userId) {
			this.userId = userId;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public boolean isActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		public String getRoles() {
			return roles;
		}
		public void setRoles(String roles) {
			this.roles = roles;
		}
}
