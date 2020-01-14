package com.graphic.pattern.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {

    private PageMaker() {
    }

    static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getMemoryProperties();
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + "欢迎来到" + username + "的主页。");
            writer.paragraph("等着你的邮件哦! ");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + "(" + username + ")");
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    static void makeLinkPage(String filename) {
        try {
            Properties prop = Database.getMemoryProperties();
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link page");
            prop.keySet().forEach(k -> {
                try {
                    writer.mailto(k.toString(), prop.getProperty(k.toString()));
                } catch (IOException e) {
                    throw new RuntimeException(e.getMessage());
                }
            });
            writer.close();
            System.out.println(filename + " is created.");
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
