package com.example.walletapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Wallet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@NotBlank(message = "Name can't be blank")
	@Size(min = 2, max = 30)
	private String name;
	@Size(min = 2, max = 30)
	private String accountnumber;
	@Size( max = 100)
	private String description;
	@Min(1)
	@Max(3)
	private Integer priority;
	 @OneToMany(cascade = CascadeType.REFRESH,fetch = FetchType.LAZY,mappedBy = "wallet",orphanRemoval = true)
	    @JsonIgnore
	private Double currentBalance;
	 @PrePersist
	    public void setBalance(){ this.currentBalance = new Double(0); }
	

}
