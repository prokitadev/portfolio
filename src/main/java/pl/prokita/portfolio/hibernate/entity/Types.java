package pl.prokita.portfolio.hibernate.entity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "skilltypes")
public class Types {
    @Id
    private int id;

    @Column
    private String name;

}