package com.commons.Bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="Role")
public class Role {
	
	
	private int roleid;
	
	
	private Set<User> user;
	
	private String role;

	@Id
	@GeneratedValue
	@Column(name="userrole_id")
	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="userroles",joinColumns={@JoinColumn(name="Userid")},
	inverseJoinColumns={@JoinColumn(name="userrole_id")})
	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}
	@Column(name="role")
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	
}
