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
public class File extends AbstractFile
{

    public File(String name, String ngayTao) {
        super(name, ngayTao);
    }

    @Override
    public String getStringTreeFolder() 
    {
        return this.prefix + this.name;
    }

    @Override
    public void addItem(AbstractFile file) 
    {
    }

    @Override
    public void removeItem(AbstractFile file) 
    {
    }
    
}
