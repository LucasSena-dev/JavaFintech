public class Cost {
    public float cost;
    public int costType;
    public String costDate;


    public void Cost(float cost, int costType, String costDate) {
        this.cost = cost;
        this.costType = costType;
        this.costDate = costDate;
    }


    public void getCost(){
        System.out.println("Cost: " + cost);
    }
    
}
