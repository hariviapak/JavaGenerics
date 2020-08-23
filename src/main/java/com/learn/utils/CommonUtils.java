package com.learn.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class CommonUtils {
    public HashMap getFileIntoMap(String filePath,String delimiter) throws IOException {

        HashMap<String, String> map = new HashMap<String, String>();

        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null)
        {
            String[] parts = line.split(delimiter, 2);
            if (parts.length >= 2)
            {
                String key = parts[0];
                String value = parts[1];
                map.put(key, value);
            } else {
                System.out.println("ignoring line: " + line);
            }
        }

       /* for (String key : map.keySet())
        {
            System.out.println(key + ":" + map.get(key));
        }*/
        reader.close();
        return map;
    }
}
