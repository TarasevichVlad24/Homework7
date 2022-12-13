package Ex3;

import java.util.Date;

public class FinancialInvoice extends Document {
    private int totalAmount;
    private int codeDep;

    public FinancialInvoice() {
        super(3, new Date(2010, 12, 12));
        this.totalAmount = 100000;
        this.codeDep = 100;
    }

    public FinancialInvoice(int numberDoc, Date dateDoc, int totalAmount, int codeDep) {
        super(numberDoc, dateDoc);
        this.totalAmount = totalAmount;
        this.codeDep = codeDep;
    }
    public void getInfo(){
        System.out.println("Номер документа - "+numberDoc+", Дата документа - "+dateDoc+", Итоговая сумма - "+totalAmount+", Код департамента - "+codeDep);
    }
}
