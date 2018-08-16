package com.dy.entry;

import java.io.Serializable;
import java.util.Set;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    private Integer uid;

    private String username;

    private String password;
    
    private Integer locked;
    
    private Set<Role> roles;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

	public Integer getLocked() {
		return locked;
	}

	public void setLocked(Integer locked) {
		this.locked = locked;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public byte[] getCredentialsSalt() {
		String salt = "甜盐";
		return salt.getBytes();
	}
}