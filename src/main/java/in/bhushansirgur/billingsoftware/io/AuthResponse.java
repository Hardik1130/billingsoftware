package in.bhushansirgur.billingsoftware.io;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class AuthResponse {

    private String email;
    private String token;
    private String role;

}
