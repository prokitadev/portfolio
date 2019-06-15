package pl.prokita.portfolio.hibernate.entity;

import pl.prokita.portfolio.hibernate.entity.*;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ratings")
public class Ratings {
    @Id
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "skillId")
    private Skills skillId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rateId")
    private Rates rateId;


    public Ratings(int id, Skills skillId, Rates rateId) {
        this.id = id;
        this.skillId = skillId;
        this.rateId = rateId;
    }

    public Ratings() {
    }

    public int getId() {
        return id;
    }

    public Skills getSkillId() {
        return skillId;
    }

    public Rates getRateId() {
        return rateId;
    }
}