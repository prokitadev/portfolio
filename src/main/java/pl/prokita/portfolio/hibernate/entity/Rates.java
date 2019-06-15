package pl.prokita.portfolio.hibernate.entity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "rates")
public class Rates {
    @Id
    private int id;

    @Column
    private int rate;

    public int getId() {
        return id;
    }

    public int getRate() {
        return rate;
    }
}