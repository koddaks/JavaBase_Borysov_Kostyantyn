package com.hillel.borysov.lessons.examples;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

//Поиск файлов в компьютере


public class SearchFilesOnPC {


    public static void main(String[] args) {
        ArrayList<File> fileList = new ArrayList<>();
        searchFiles(new File("C:\\"), fileList);
        for(File file: fileList) {
            System.out.println(file.getAbsolutePath());
        }


    }
    private static  void searchFiles(File rootFile, List<File> fileList){
        if (rootFile.isDirectory()) {
            System.out.println("Searching at: " + rootFile.getAbsolutePath());
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for(File file: directoryFiles) {
                    if (file.isDirectory()) {
                        searchFiles(file, fileList);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".jpg")) {
                            fileList.add(file);
                        }
                    }
                }

            }

        }

    }
}
