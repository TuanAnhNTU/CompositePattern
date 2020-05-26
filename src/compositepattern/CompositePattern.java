/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

/**
 *
 * @author Tuấn Anh
 */
public class CompositePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        AbstractFile root = new Folder("Data", "1-1-2020");
        AbstractFile toanFolder = new  Folder("Toan", "1-1-2020");
        AbstractFile lyFolder = new Folder("Ly", "1-1-2020");
        AbstractFile lyFolder10 = new  Folder("LyLop10", "1-1-2020");
        AbstractFile coHoc = new File("CoHocVaSong.pdf", "1-1-2020");
        AbstractFile tichPhan = new File("TichPhan12.doc", "1-1-2020");
        AbstractFile daiSo = new File("DaiSo12.doc", "1-1-2020");
        
        root.addItem(toanFolder);
        toanFolder.addItem(daiSo);
        toanFolder.addItem(tichPhan);
        root.addItem(lyFolder);
        lyFolder.addItem(lyFolder10);
        lyFolder10.addItem(coHoc);
        System.out.println(root.getStringTreeFolder());
        System.out.println(daiSo.getPath());
        System.out.println(coHoc.getPath());
        root.removeItem(tichPhan);
        System.out.println(root.getStringTreeFolder());
        System.out.println("---------------------------------");
        System.out.println(toanFolder.getStringTreeFolder());
         System.out.println("----------------------------------");
        root.removeItem(lyFolder10);
        System.out.println(root.getStringTreeFolder());
    }
    
}
