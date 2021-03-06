package io.app.fiztec.customerapiv1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;



@Getter
@Setter
public class CustomerDto {

    private String name;
    private String fatherSurname;

    private String motherSurname;

    private String dateBirth;
    @JsonProperty("document")
    private DocumentDto documentDto;

    @Email
    private String email;

    private String cellphoneNumber;
    @JsonProperty("direction")
    private DirectionDto directionDto;
}
