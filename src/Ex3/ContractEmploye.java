package Ex3;

import java.util.Date;

public class ContractEmploye extends Document{
    private String nameEmpl;
    private Date dataEnd;

    public ContractEmploye(){
        super(2,new Date(2005,3,3));
        this.nameEmpl = "Ivan Ivanov";
        this.dataEnd = new Date(2022,12,13);

    }
    public ContractEmploye(int numberDoc, Date dateDoc, String nameEmpl, Date dataEnd) {
        super(numberDoc, dateDoc);
        this.nameEmpl = nameEmpl;
        this.dataEnd = dataEnd;

    }
    public void getInfo(){
        System.out.println("Номер документа - "+numberDoc+", Дата документа - "+dateDoc+", Имя сотрудника - "+nameEmpl+", Дата увольнения - "+dataEnd);
    }




}
