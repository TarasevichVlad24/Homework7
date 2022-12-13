package Ex3;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static  void main(String[] args){
        Document contract1 = new ContractEmploye(36, new Date(2014,05,05), "Petr Petrov", new Date(2014,10,10));
        Document contract2 = new ContractSupply(37,new Date(2005,5,5), "phones",3000);
        Document invoice1 = new FinancialInvoice(38,new Date(2022,4,4), 40000, 300);
        Document invoice2 = new FinancialInvoice();


        Register register = new Register();

        register.addDoc(contract1);
        register.addDoc(contract2);
        register.addDoc(invoice1);
        register.addDoc(invoice2);

        System.out.println(Arrays.toString(register.getDocuments()));



    }
}
