package com.wakame.wapio.HelloSpringBoot.web.form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class MenuForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String profile;

	/**
	 * @return the profile
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * @param profile the profile to set
	 */
	public void setProfile(String profile) {
		this.profile = profile;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MenuForm [profile=" + profile + "]";
	}
}
