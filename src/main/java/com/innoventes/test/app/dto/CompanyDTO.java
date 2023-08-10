package com.innoventes.test.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO {

	private Long id;

	@NotEmpty(message = "Company name is mandatory")
	@Size(min = 5, message = "Company name should be at least 5 characters")
	private String companyName;

	@NotEmpty(message = "Email is mandatory")
	@Email(message = "Invalid email format")
	private String email;

	@PositiveOrZero(message = "Strength should be a positive number or zero")
	private Integer strength;

	private String webSiteURL;

	@Pattern(
			message = "Invalid company code format",
			regexp = "^[a-zA-Z]{2}\\d{2}[ENen]?$"
	)
	private String companyCode;

}

