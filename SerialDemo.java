import java.io.FileInputStream;
import java.io.ObjectOutputStream;

import java.io.ObjectInputStream;
import java.io.File;
import java.io.Serializable;
import java.io.FileOutputStream;



public class SerialDemo

{
  public static void main(String[] args) throws Exception
    {   
        Save obj = new Save();
	obj.i = 4;
        File f = new File("Obj.txt");
        FileOutputStream fos = new FileOutputStream(f);
	ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);


         FileInputStream fis = new FileInputStream(f);
         ObjectInputStream ois = new ObjectInputStream(fis);
         Save obj1 = (Save) ois.readObject();
         
         System.out.println("Value of Obj1 " + obj1.i);
    }
 }

  class Save implements Serializable
  {
     int i;
   }
 



