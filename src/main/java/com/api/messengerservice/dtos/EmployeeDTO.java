package com.api.messengerservice.dtos;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EmployeeDTO {
    @NotNull(message = "The id cannot be null")
    private Long id;

    @NotEmpty(message = "The name cannot be empty")
    private String name;

    @NotEmpty (message = "The last name cannot be empty")
    private String lastName;

    @NotEmpty (message = "The phone number cannot be empty")
    private String phoneNumber;

    @NotEmpty (message = "The email cannot be empty")
    @Email
    private String email;

    @NotEmpty (message = "The address cannot be empty")
    private String address;

    @NotEmpty (message = "The city cannot be empty")
    private String city;

    @NotNull(message = "The seniority company cannot be null")
    private int seniorityCompany;

    @NotEmpty (message = "The blood type cannot be empty")
    private String bloodType;

    @NotEmpty (message = "The employee type cannot be empty")
    private String employeeType;
}
