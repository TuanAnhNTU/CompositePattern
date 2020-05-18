/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tuấn Anh
 */
public class Folder extends AbstractFile
{
    List<AbstractFile> listItem = new ArrayList<>();
    public Folder(String name, String ngayTao) {
        super(name, ngayTao);
    }
    @Override
    public String getStringTreeFolder() 
    {
        StringBuilder builder = new StringBuilder();
        builder.append(this.prefix).
                append(name);
        listItem.forEach((file) -> {
            builder.append("\n")
                    .append(file.getStringTreeFolder());
        });
        return builder.toString();
    }
   

    @Override
    public void addItem(AbstractFile file) 
    {
        listItem.add(file);
        String filePath = getPath() + "\\" + file.name;
        file.path = filePath;
        file.prefix = this.prefix + "..";
    }
    
    @Override
    public void removeItem(AbstractFile file) 
    {
        if(listItem.contains(file))
        {
            listItem.remove(file);
            return;
        }
        listItem.forEach((folder)->
        {
            folder.removeItem(file);
        });
    } 
}
