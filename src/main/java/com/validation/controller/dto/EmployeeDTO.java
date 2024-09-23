package com.validation.controller.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    @NotNull(message = "El campo nombre no puede ser nulo")
    @Size(min = 3, max = 5)
    private String name;
    @NotNull
    private String lastName;
    @Email
    private String email;
    private Long phone;

    @Min(18)
    @Max(22)
    private byte age;
    private double height;
    private boolean married;
    @Past
    private LocalDate dateOfBirth;

    @Valid
    private DepartmentDTO departmentDTO;

}
/*
    @NotEmpty
    private List<Integer> numbers;


@NotNull = el campo no puede ser nulo
@NotBlank = el campo no puede estar vacío
@NotEmpty = la lista no puede estar vacía
@Min(X) = no debe ser menor a X
@Max(Y) = no debe ser mayor a Y
@Size(min = x, max = y) = debe tener como mínimo x caracteres y como máximos y caracteres
@Pattern(regexp = "expresion regexp", message = "personalizamos el mensaje") = valida string con expresiones regulares "regexp"
@Email = valida que sea un correo
@Digits(integer = 2, decimal = 3) = comprueba que la parte entera no tenga más de 2 dígitos y no más de 3 dígitos en la parte decimal
@Past = solo recibe fechas anteriores a la fecha actual
@Future = solo recibe fechas futurasa a la fecha actual
@AssertTrue = solo admite valores true
@AssertFalse = solo admite valores false
@CreditCardNumber = es para validar Long y se utiliza para validar números de tarjetas de créditos

para validar objetos anidados
@Valid en el objeto a validar
y luego en la clase del objeto colocar
@validated
y colocar las validaciones en cada campo
*/
