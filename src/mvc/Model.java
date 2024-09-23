package mvc;

import java.util.Objects;

public class Model {
    private String stud_name;
    private int stud_std;
    private int stud_cno;
    private boolean stud_gender;
    private double stud_fees;

    public Model(){}

    public Model(String stud_name,int stud_std, boolean stud_gender, int stud_cno, double stud_fees ) {
        this.stud_name = stud_name;
        this.stud_std = stud_std;
        this.stud_gender = stud_gender;
        this.stud_cno = stud_cno;
        this.stud_fees = stud_fees;
    }
    public Model(String stud_name,boolean stud_gender, int stud_cno) {
        this.stud_name = stud_name;
        this.stud_gender = stud_gender;
        this.stud_cno = stud_cno;
    }

    public String getStud_name() {
        return stud_name;
    }
    public void setStud_name(String stud_name) {
        this.stud_name = stud_name;
    }

    public int getStud_cno(){
        return stud_cno;
    }
    public void setStud_cno(int stud_cno){
        this.stud_cno = stud_cno;
    }

    public int getStud_std() {
        return stud_std;
    }

    public void setStud_std(int stud_std) {
        this.stud_std = stud_std;
    }

    public boolean isStud_gender() {
        return stud_gender;
    }

    public void setStud_gender(boolean stud_gender) {
        this.stud_gender = stud_gender;
    }

    public double getStud_fees() {
        return stud_fees;
    }

    public void setStud_fees(double stud_fees) {
        this.stud_fees = stud_fees;
    }

    @Override
    public String toString() {
        return "{" +
                "stud_name='" + stud_name + '\'' +
                ", stud_std=" + stud_std +
                ", stud_cno=" + stud_cno +
                ", stud_gender=" + stud_gender +
                ", stud_fees=" + stud_fees +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return stud_std == model.stud_std && stud_cno == model.stud_cno && stud_gender == model.stud_gender && Double.compare(stud_fees, model.stud_fees) == 0 && Objects.equals(stud_name, model.stud_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stud_name, stud_std, stud_cno, stud_gender, stud_fees);
    }
}
