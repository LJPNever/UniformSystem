package yidong.model;

public class Vip {
    private String openId;

    private Float integral;

    private String  schoolName;
    private String phone;

    public String getOpenId() {
        return openId;
    }


    public Float getIntegral() {
        return integral;
    }

    public void setIntegral(Float integral) {
        this.integral = integral;
    }


    public void setOpenId(String openId) {
        this.openId = openId;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}