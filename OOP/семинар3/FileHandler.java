package family_tree;

import java.io.*;

public class FileHandler implements Writable{
    @Override
    public boolean save(Serializable serializable, String filePath){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))){
            objectOutputStream.writeOblect(serializable);
            return true;
        } catch(Exeption e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Object read(String filePath){
        try (ObjectInpitStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))){
            return objectInputStream.readObject();
        } catch (Exeption e){
            e.printStackTrace();
            return null;
        }
    }
}
