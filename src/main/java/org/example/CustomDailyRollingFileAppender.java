package org.example;


import java.io.File;



public class CustomDailyRollingFileAppender {

    @Override
    public void rollOver(String getFile) throws CloneNotSupportedException {
        super.clone();



        File logFile = new File(getFile);
        if (logFile.exists()) {
            boolean deleted = logFile.delete();
            if (deleted) {
                System.out.println("Günlük dosyası başarıyla silindi: " + logFile.getAbsolutePath());
            } else {
                System.out.println("Günlük dosyası silinirken bir hata oluştu: " + logFile.getAbsolutePath());
            }
        } else {
            System.out.println("Günlük dosyası bulunamadı: " + logFile.getAbsolutePath());
        }
    }
}
