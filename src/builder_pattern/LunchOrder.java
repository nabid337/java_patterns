package builder_pattern;

public class LunchOrder {

    public static class Builder{
        private  String meat;
        private  String salad;
        private  String condiments;
        private  String dressing;


        public LunchOrder build(){
            return new LunchOrder(this);
        }
        public Builder setMeat(String meat){
            this.meat = meat;
            return this;
        }
        public Builder setSalad(String salad){
            this.salad = salad;
            return this;
        }
        public Builder setCondiments(String condiments){
            this.condiments = condiments;
            return this;
        }
        public Builder setDressing(String dressing){
            this.dressing = dressing;
            return this;
        }
    }

    private LunchOrder(Builder builder){
        this.meat = builder.meat;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.salad = builder.salad;
    }
    private final String meat;
    private final String salad;
    private final String condiments;
    private final String dressing;

    public String getMeat() {
        return meat;
    }

    public String getSalad() {
        return salad;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }
}
