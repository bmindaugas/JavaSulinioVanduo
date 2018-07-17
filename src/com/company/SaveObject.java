package com.company;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class SaveObject {
  public static void save(Object o, String fileName) {
    try {
      FileOutputStream fs = new FileOutputStream(fileName);
      ObjectOutputStream os = new ObjectOutputStream(fs);
      os.writeObject(o);
      os.close();
      fs.close();
    } catch (Exception ex) {
      System.out.println("Nepavyko irasyti");
      ex.printStackTrace();
    }
  }
  public static Object restore(String fileName) {
    try {
      FileInputStream fs = new FileInputStream(fileName);
      ObjectInputStream os = new ObjectInputStream(fs);
      Object o = os.readObject();
      os.close();
      fs.close();
      return o;
    } catch (Exception ex) {
      System.out.println("Nepavyko nuskaityti");
      ex.printStackTrace();
      return null;
    }
  }
}
