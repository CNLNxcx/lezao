package User.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class templates {
    private Integer id;
    private Integer number;
    private String  name;
    private String  type;
    private String founder ;
    private String modifier;
    private String state;
    private String create_time;
    private String modified_time;


}