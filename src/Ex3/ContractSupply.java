package Ex3;

import java.util.Date;

public class ContractSupply extends Document {
    private String typeGoods;
    private int amountGoods;


    public ContractSupply(){
        super(1,new Date(2001,11,9));
        this.typeGoods = "computers";
        this.amountGoods = 10;
    }

    public ContractSupply(int numberDoc, Date dateDoc, String typeGoods, int amountGoods){
        super(numberDoc, dateDoc);
        this.typeGoods = typeGoods;
        this.amountGoods = amountGoods;


    }
    public void getInfo(){
        System.out.println("Номер документа - "+numberDoc+", Дата документа - "+dateDoc+", Тип товара - "+typeGoods+", Количество товара - "+amountGoods);
    }



}
