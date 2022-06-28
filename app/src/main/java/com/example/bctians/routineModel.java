package com.example.bctians;

public class routineModel {

private String rtext1,rtext2,rtext3,rtext4,rtext5,date;

    public routineModel() {
    }

    public routineModel(String rtext1, String rtext2, String rtext3, String rtext4, String rtext5, String date) {
        this.rtext1 = rtext1;
        this.rtext2 = rtext2;
        this.rtext3 = rtext3;
        this.rtext4 = rtext4;
        this.rtext5 = rtext5;
        this.date = date;
        ;
    }

    public String getRtext1() {
        return rtext1;
    }

    public void setRtext1(String rtext1) {
        this.rtext1 = rtext1;
    }

    public String getRtext2() {
        return rtext2;
    }

    public void setRtext2(String rtext2) {
        this.rtext2 = rtext2;
    }

    public String getRtext3() {
        return rtext3;
    }

    public void setRtext3(String rtext3) {
        this.rtext3 = rtext3;
    }

    public String getRtext4() {
        return rtext4;
    }

    public void setRtext4(String rtext4) {
        this.rtext4 = rtext4;
    }

    public String getRtext5() {
        return rtext5;
    }

    public void setRtext5(String rtext5) {
        this.rtext5 = rtext5;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
