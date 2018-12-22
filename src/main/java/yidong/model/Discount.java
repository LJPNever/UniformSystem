package yidong.model;

import java.util.Date;

public class Discount {
    private Float discountCondition;

    private Float reduce;

    private Float discount;

    private String start;

    private String end;


    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }



    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Float getDiscountCondition() {
        return discountCondition;
    }

    public void setDiscountCondition(Float discountCondition) {
        this.discountCondition = discountCondition;
    }

    public Float getReduce() {
        return reduce;
    }

    public void setReduce(Float reduce) {
        this.reduce = reduce;
    }
}