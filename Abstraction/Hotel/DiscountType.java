package Abstraction.Hotel;

public enum DiscountType {
    VIP("VIP",20),
    NONE("None",0),
    SECONDVISIT("SecondVisit",10)
    ;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    DiscountType(String name, double percent) {
        this.name = name;
        this.percent = percent;
    }

    private double percent;
}
