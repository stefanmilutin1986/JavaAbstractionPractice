package folderandfiles;

public class Main {

    public static void main(String[] args) {

    Folder f1 = new Folder();
    Folder f2 = new Folder();
    Folder f3 = new Folder();
    Fajl file1 = new Fajl(5, EkstenzijaFajla.JPG);
    Fajl file2 = new Fajl(15, EkstenzijaFajla.EXE);
    Fajl file3 = new Fajl(25, EkstenzijaFajla.EXE);
    Fajl file4 = new Fajl(35, EkstenzijaFajla.EXE);
    Fajl file5 = new Fajl(35, EkstenzijaFajla.EXE);
        
    f2.addFileOrFolder(file1);
    f2.addFileOrFolder(file2);
    f1.addFileOrFolder(file3);
    f1.addFileOrFolder(file4);
    f1.addFileOrFolder(f2);
    f3.addFileOrFolder(file5);
    f2.addFileOrFolder(f3);
        
    System.out.println(f3.search("file3"));
    System.out.println(f2.getSize());   
    System.out.println(f1.getSize());   
    
    }
    
}
