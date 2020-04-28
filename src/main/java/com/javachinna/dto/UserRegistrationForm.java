package com.javachinna.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.javachinna.validator.PasswordMatches;

/**
 * @author Chinna
 * @since 26/3/18
 */
@PasswordMatches
public class UserRegistrationForm {

	private Long userID;

	private String providerUserId;

	@NotEmpty
	private String displayName;
	
	private String firstName;
	
	private String lastName;
	
	private String imgUrl;

	@NotEmpty
	private String email;

	private SocialProvider socialProvider;

	@Size(min = 8, message = "{Size.userDto.password}")
	private String password;

	@NotEmpty
	private String matchingPassword;

	public UserRegistrationForm() {
	}

	/**
	 * @param userID
	 * @param displayName
	 * @param firstName
	 * @param lastName
	 * @param phoneno
	 * @param email
	 * @param password
	 * @param socialProvider
	 */
	public UserRegistrationForm(String providerUserId, String displayName, String firstName, String lastName, String imgUrl, String email, String password, SocialProvider socialProvider) {
		this.providerUserId = providerUserId;
		this.displayName = displayName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.imgUrl = imgUrl;
		this.email = email;
		this.password = password;
		this.socialProvider = socialProvider;
	}

	public static Builder getBuilder() {
		return new Builder();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public SocialProvider getSocialProvider() {
		return socialProvider;
	}

	public void setSocialProvider(final SocialProvider socialProvider) {
		this.socialProvider = socialProvider;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getProviderUserId() {
		return providerUserId;
	}

	public void setProviderUserId(String providerUserId) {
		this.providerUserId = providerUserId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getMatchingPassword() {
		return matchingPassword;
	}

	public void setMatchingPassword(String matchingPassword) {
		this.matchingPassword = matchingPassword;
	}

	public static class Builder {
		private String providerUserID;
		private String displayName;
		private String email;
		private String password;
		private SocialProvider socialProvider;
		private String firstName;
		private String lastName;
		private String imgUrl;

		public Builder addProviderUserID(final String userID) {
			this.providerUserID = userID;
			return this;
		}

		public Builder addDisplayName(final String displayName) {
			this.displayName = displayName;
			return this;
		}
		
		public Builder addFirstName(final String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public Builder addLastName(final String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public Builder addImgUrl(final String imgUrl) {
			this.imgUrl = imgUrl;
			return this;
		}

		public Builder addEmail(final String email) {
			this.email = email;
			return this;
		}

		public Builder addPassword(final String password) {
			this.password = password;
			return this;
		}

		public Builder addSocialProvider(final SocialProvider socialProvider) {
			this.socialProvider = socialProvider;
			return this;
		}

		public UserRegistrationForm build() {
			return new UserRegistrationForm(providerUserID, displayName, firstName, lastName, imgUrl, email, password, socialProvider);
		}
	}

}
