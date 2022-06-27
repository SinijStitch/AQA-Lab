package day_6;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    //CREATE TABLE `aqa_lab_six`.`user` (
    //  `id` INT NOT NULL AUTO_INCREMENT,
    //  `name` VARCHAR(45) NULL,
    //  `age` INT NULL,
    //  `city_id` INT NOT NULL,
    //  PRIMARY KEY (`id`));
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private Integer city_id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }
}
