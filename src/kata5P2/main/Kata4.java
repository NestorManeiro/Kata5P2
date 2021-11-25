package kata5P2.main;

import java.util.List;
import kata5P2model.Histogram;
import kata5P2.view.HistogramDisplay;
import kata5P2model.Mail;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailHistogramReader;

public class Kata4 {
    private static List<Mail> mailList;
    private static Histogram<String> histogram;
  
    public static void main(String[] args) {
        input();
        process();
        output();
    }
    
     public static void input(){
        String fileName  = "..\\Kata4\\src\\kata4\\view\\email.txt";
        mailList = MailHistogramReader.read(fileName);
    }
    public static void process(){
        histogram = MailHistogramBuilder.built(mailList);
    }
    public static void output(){
        HistogramDisplay HistogramDisplay = new HistogramDisplay(histogram);
        HistogramDisplay.execute();
    }
}
    

