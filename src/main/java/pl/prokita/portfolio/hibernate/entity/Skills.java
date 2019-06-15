package pl.prokita.portfolio.hibernate.entity;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(name = "skills")
public class Skills {
    @Id
    private int id;

    @Column
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type")
    private Types type;

    @Column
    private Date dateStart;
    private boolean commercial;


}
