package Ex3;

import java.util.Date;

public abstract class Document {
    protected int numberDoc;
    protected Date dateDoc;

    public Document(int numberDoc,Date dateDoc){
        this.numberDoc = numberDoc;
        this.dateDoc = dateDoc;
    }
    public abstract void  getInfo();
}
