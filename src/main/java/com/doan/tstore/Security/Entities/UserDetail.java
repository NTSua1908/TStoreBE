package com.doan.tstore.Security.Entities;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetail implements UserDetails{

	private long id;

	private String password;
  
  private String email;
  
  private String name;

  private String avatar;

	private List<SimpleGrantedAuthority> authorities;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
    public boolean isEnabled() {
      return true;
    }
  
    public UserDetail(long id, String password, String email, String name, String avatar,
        List<SimpleGrantedAuthority> authorities) {
      this.id = id;
      this.password = password;
      this.email = email;
      this.name = name;
      this.avatar = avatar;
      this.authorities = authorities;
    }


    public UserDetail() {
    }


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAvatar() {
    return this.avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }
  public void setAuthorities(List<SimpleGrantedAuthority> authorities) {
    this.authorities = authorities;
  }
  

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", password='" + getPassword() + "'" +
      ", email='" + getEmail() + "'" +
      ", name='" + getName() + "'" +
      ", avatar='" + getAvatar() + "'" +
      ", authorities='" + getAuthorities() + "'" +
      "}";
  }
  
}
