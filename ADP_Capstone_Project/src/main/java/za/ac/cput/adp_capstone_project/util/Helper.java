package za.ac.cput.adp_capstone_project.util;

import java.util.UUID;

public class Helper {
    public static boolean isNullOrEmpty(String s) {
        if(s == null || s.isEmpty())
            return true;
        return false;
    }
    public static String generateId(){
        return UUID.randomUUID().toString();
    }
}