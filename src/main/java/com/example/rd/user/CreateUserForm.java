package com.example.rd.user;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserForm {
    @Size(min = 3, max = 25)
    @NotEmpty(message = "사용자Id는 필수 사항 입니다.")
    private Long id;
    @NotEmpty(message = "비밀번호는 필수 사항입니다.")
    private String password1;

    @NotEmpty(message = "비밀번호를 확인해 주세요")
    private String password2;
    @Email
    @NotEmpty(message = "이메일은 필수 사항압니다.")
    private String email;
}
