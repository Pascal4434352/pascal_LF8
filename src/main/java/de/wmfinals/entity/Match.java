package de.wmfinals.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "matchmatch")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date date;
    private String location;
    private Boolean penaltyShootout;

    public Integer getmatchId() { return id; }
    public void setmatchId(Integer id) { this.id = id; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public Boolean getPenaltyShootout() { return penaltyShootout; }
    public void setPenaltyShootout(Boolean penaltyShootout) { this.penaltyShootout = penaltyShootout; }
}
