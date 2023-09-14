package dtos.requests;

import lombok.Data;

@Data
public class CreateE_MailRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
}
