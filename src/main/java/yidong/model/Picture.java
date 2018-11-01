package yidong.model;

public class Picture {
    private Integer id;

    private String imgaddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgaddress() {
        return imgaddress;
    }

    public void setImgaddress(String imgaddress) {
        this.imgaddress = imgaddress == null ? null : imgaddress.trim();
    }
}