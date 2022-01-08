package cj.OOPS.Encapsulation.encapsul;

public class Encapsul {
    public static void main(String[] args) {
        ProductionCompany pc=new ProductionCompany();
        pc.setProductonCompanyRefId("123456NA");
        System.out.println(pc.getproductionCompanyRefId());
        pc.setProductonCompanyRefId("123987");
        System.out.println(pc.getproductionCompanyRefId());
        pc.setProductionType("Bollywood");
        System.out.println(pc.getProductionType());
        pc.setAge(20);
        System.out.println(pc.getAge());
    }
}


class ProductionCompany {
    private String productionCompanyRefId;
    private String productionType;
    private int age;

    public String getproductionCompanyRefId() {
        return this.productionCompanyRefId;
    }

    public String getProductionType() {
        return productionType;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setProductonCompanyRefId(String productonCompanyRefId){
        productonCompanyRefId="ram";
        this.productionCompanyRefId=productonCompanyRefId;
    }
    public void setProductionType(final String productionType){

        this.productionType=productionType;
    }


}
