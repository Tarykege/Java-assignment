package unit2;

import java.util.ArrayList;
import java.util.List;

public class ManageDocument {
    List<Document> documents = new ArrayList<>();
    public void addDocument(Document document){
        this.documents.add(document);
    }

    public boolean deleteDocument(String id){
        for (int i=0; i<this.documents.size(); i++) {
            if (this.documents.get(i).getId().equals(id)==true)
                {
                    documents.remove(i);
                    return true;
                }
        }
        return false;
    }

    public void showDocument(){
        this.documents.forEach(d -> System.out.println(d.toString()));
    }
    public void searchByBook(){
        for (Document document : documents) {
            if(document instanceof Book)
                System.out.println(document.toString());
        }
    }
    public void searchByNewspaper(){
        for (Document document : documents) {
            if(document instanceof Newspaper)
                System.out.println(document.toString());
        }
    }
    public void searchByJournal(){
        for (Document document : documents) {
            if(document instanceof Journal)
                System.out.println(document.toString());
        }
    }
    public static void main(String[] args) {
        System.out.println("Success");
    }
}
