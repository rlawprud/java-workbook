package main.java.workbook3.accesslevel;

import java.util.Scanner;

class SecureFile {
    private String fileName;
    SecureFile(String fileName) {
        this.fileName = fileName;
    }
    public void read(boolean hasPermission) {
        System.out.println(hasPermission ? fileName : "권한 없음");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = sc.next();
        String p1 = sc.next();
        String p2 = sc.next();
        SecureFile sf = new SecureFile(file);
        sf.read(p1.equals("granted"));
        sf.read(p2.equals("granted"));
    }
}