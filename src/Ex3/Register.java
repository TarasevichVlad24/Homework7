package Ex3;

public class Register {
    private int pointer = 0;
    private Document[] documents = new Document[10];


    public Document[] getDocuments() {
        return documents;
    }

    public void addDoc(Document document){
        if(pointer<10){
            documents[pointer] = document;
            pointer++;
            System.out.println("Документ добавлен в массив");
            document.getInfo();
        }else {
            System.out.println("Документ не может быть добавлен");
        }

    }

    }

