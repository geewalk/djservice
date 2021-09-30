package com.example.demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class DJ {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String djName;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "user_dj", joinColumns = @JoinColumn(name = "dj_id"),
		inverseJoinColumns = @JoinColumn(name = "user_id"))
	private User user;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "user_dj", joinColumns = @JoinColumn(name = "dj_id"),
		inverseJoinColumns = @JoinColumn(name = "user_id"))
	private Set<User> users;
	
	public DJ(String djName, User user, Set<User> users) {
		super();
		this.djName = djName;
		this.user = user;
		this.users = users;
	}

	public DJ() {
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDjName() {
		return djName;
	}

	public void setDjName(String djName) {
		this.djName = djName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DJ other = (DJ) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DJ [id=" + id + ", djName=" + djName + ", user=" + user + ", users=" + users + "]";
	}


}
