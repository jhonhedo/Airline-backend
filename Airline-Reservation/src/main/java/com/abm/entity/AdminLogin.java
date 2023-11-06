package com.abm.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_AdminLogin")
public class AdminLogin {
    @Id
    @Column(name = "Admin_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;

    @Column(name = "Admin_name")
    private String adminName;

    @Column(name = "Password")
    private String password;

	public Long getAdminId() {
		return adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}	

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    
}

