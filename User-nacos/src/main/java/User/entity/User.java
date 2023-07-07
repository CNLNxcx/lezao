package User.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

     private Integer id;
     private String  name;
     private Integer age;
     private String  address;
     private String  phone;
     private String  create_time;



}
