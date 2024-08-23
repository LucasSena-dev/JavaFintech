public class Investment {

    public float investment;
    public int investmentType;
    public String investmentDate;

    public void Investment(float investment, int investmentType, String investmentDate){
        this.investment = investment;
        this.investmentType = investmentType;
        this.investmentDate = investmentDate;
    }

    public void getInvestment(){
        System.out.println("Investment: " + investment);
    }

}
