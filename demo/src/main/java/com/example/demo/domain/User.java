package com.example.demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String email;
	private String passWord;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "user")
	private DJ djProfile;
	
	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "users", cascade = CascadeType.ALL)
	private Set<DJ> djsFollowed;
	
	public User() {
		
	}


	public User(String email, String passWord, DJ djProfile, Set<DJ> djsFollowed) {
		super();
		this.email = email;
		this.passWord = passWord;
		this.djProfile = djProfile;
		this.djsFollowed = djsFollowed;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public DJ getDjProfile() {
		return djProfile;
	}

	public void setDjProfile(DJ djProfile) {
		this.djProfile = djProfile;
	}

	public Set<DJ> getDjsFollowed() {
		return djsFollowed;
	}

	public void setDjsFollowed(Set<DJ> djsFollowed) {
		this.djsFollowed = djsFollowed;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", djProfile=" + djProfile + ", djsFollowed=" + djsFollowed
				+ ", getEmail()=" + getEmail() + ", getPassWord()=" + getPassWord() + ", getDjProfile()="
				+ getDjProfile() + ", getDjsFollowed()=" + getDjsFollowed() + ", getId()=" + getId() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}


}
