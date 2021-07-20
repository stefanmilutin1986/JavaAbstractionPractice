package folderandfiles;

import java.util.ArrayList;

public class Folder extends FFClass {
        
    ArrayList<FFClass> list = new ArrayList<FFClass>();
       
    public Folder() {
    }

    public Folder(String naziv, String datumKreiranja) {
        this.name = naziv;
        this.date = datumKreiranja;
    }

    @Override
    public double getSize() {
       double size = 0;
       for(FFClass item:list){
           size = size + item.getSize();
       }
       return size;
    }
    
    public void addFileOrFolder(FFClass item){
        this.list.add(item);
    }

    @Override
    public boolean search(String txt) {
        for(FFClass item:list){
        txt.equalsIgnoreCase(item.toString());
       }
       return true;
    }

}
