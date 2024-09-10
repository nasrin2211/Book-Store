package com.example.bookstore;

import java.util.ArrayList;
import java.util.List;

public class BooksSelector {
    List<String> getResult(String writer){
        List<String> result = new ArrayList<>();
        if (writer.equals("Jasimuddin")){
            result.add("Naksi Kanthar Math");
            result.add("Baluchor");
            result.add("Hashu");
            result.add("Matir Kanna");
        }
        else if (writer.equals("Kazi Nazrul Islam")) {
            result.add("Agnibeena");
            result.add("Sanchita");
            result.add("Chakrabak");
            result.add("Satbhai Champa");
        }
        else {
            result.add("Devdas");
            result.add("Srikanta");
            result.add("Parineeta");
            result.add("Charitraheen");
        }
        return result;
    }


}
