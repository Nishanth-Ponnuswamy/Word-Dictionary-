package com.example.word_dictionary;

import java.io.*;
import java.util.HashMap;
import java.util.*;

public class DictionarySaver {
    private HashMap<String, String> dictionarylist;
    DictionarySaver(){
        dictionarylist = new HashMap<>();
    }
    HashMap<String, String> getDictionarylist(){
        return dictionarylist;
    }

    void serializeHashMap()  {
        try {
            FileOutputStream fos = new FileOutputStream("dictionaryData");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dictionarylist);
            oos.close();
            fos.close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    void deserializeHashMap() throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("dictionaryData");
        ObjectInputStream ois = new ObjectInputStream(file);
        dictionarylist = (HashMap<String, String>) ois.readObject();
    }

}
