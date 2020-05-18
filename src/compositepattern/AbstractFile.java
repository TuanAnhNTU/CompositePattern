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
public abstract class AbstractFile 
{
    String name;
    String ngayTao;   
    String prefix="";
    String path;
    
    public AbstractFile(String name, String ngayTao) {
        this.name = name;
        this.ngayTao = ngayTao;
        path = name;
    }
    public abstract String getStringTreeFolder();    
    public abstract void addItem(AbstractFile file);
    public abstract void removeItem(AbstractFile file);  
    
    public String getName() {
        return name;
    }
    public String getNgayTao() {
        return ngayTao;
    }
    public  String getPath()
    {
        return path;
    }
}
