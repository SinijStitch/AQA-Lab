package day_6;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "city")
public class City {
    //  CREATE TABLE `aqa_lab_six`.`city` (
    //    `id` INT NOT NULL AUTO_INCREMENT,
    //    `name` VARCHAR(45) NOT NULL,
    //    `post_index` INT NULL,
    //    PRIMARY KEY (`id`));
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer post_index;

    @OneToMany(mappedBy = "city")
    private Set<User> users;

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

    public Integer getPost_index() {
        return post_index;
    }

    public void setPost_index(Integer post_index) {
        this.post_index = post_index;
    }
}
