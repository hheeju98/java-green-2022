package jsonex01;

import com.google.gson.Gson;

//Dto => Data Transper Object
class UserDto {
    private String username;
    private String password;

    public UserDto(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public UserDto(String username2, int i) {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

public class GsonEx01 {
    public static void main(String[] args) {
        UserDto userDto = new UserDto("youngin", 1234);
        Gson gson = new Gson(); // toJson(), fromJson()
        String jsonUserDto = gson.toJson(userDto);
        System.out.println(jsonUserDto);

        // Json => JavaObject 로 변경(데이터 다운로드 목적)
        UserDto javaUserDto = gson.fromJson(jsonUserDto, UserDto.class);
        System.out.println(javaUserDto.getUsername());
        System.out.println(javaUserDto.getPassword());
    }
}