package com.becoder.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
	
	@Data
	@Entity
	public class UserDtls {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		private String fullName;

		private String email;

		private String address;

		private String qualification;

		private String password;
		
		private String role;
		
		private String mobileNumber;
		
		private boolean accountNonLocked;
		
		private boolean enabled;
		
		private String verificationCode;

		public UserDtls() {
			super();
		}
		public UserDtls(int id, String fullName, String email, String address, String qualification, String password,
				String role, String mobileNumber, boolean accountNonLocked, boolean enabled, String verificationCode) {
			super();
			this.id = id;
			this.fullName = fullName;
			this.email = email;
			this.address = address;
			this.qualification = qualification;
			this.password = password;
			this.role = role;
			this.mobileNumber = mobileNumber;
			this.accountNonLocked = accountNonLocked;
			this.enabled = enabled;
			this.verificationCode = verificationCode;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public boolean isAccountNonLocked() {
			return accountNonLocked;
		}

		public void setAccountNonLocked(boolean accountNonLocked) {
			this.accountNonLocked = accountNonLocked;
		}

		public boolean isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}

		public String getVerificationCode() {
			return verificationCode;
		}

		public void setVerificationCode(String verificationCode) {
			this.verificationCode = verificationCode;
		}
}