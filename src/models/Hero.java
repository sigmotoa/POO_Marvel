package models;

import java.util.Arrays;

public class Hero {
    private int id;
    private String name;
    private String secretName;
    private String [] powers;
    private boolean team; //True para los buenos, false para los malos

    public Hero(int id, String name, String secretName, String[] powers, boolean team) {
        this.id = id;
        this.name = name;
        this.secretName = secretName;
        this.powers = powers;
        this.team = team;
    }

    public Hero() {
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secretName='" + secretName + '\'' +
                ", powers=" + Arrays.toString(powers) +
                ", team=" + team +
                '}';
    }

    public String hero2CSV()
    {
        return this.id+","+
                this.name+","+
                this.secretName+","+
                this.team;
    }







    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public String[] getPowers() {
        return powers;
    }

    public void setPowers(String[] powers) {
        this.powers = powers;
    }

    public boolean isTeam() {
        return team;
    }

    public void setTeam(boolean team) {
        this.team = team;
    }
}


