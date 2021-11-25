package kata5P2.main;

import java.util.List;
import kata5P2model.Histogram;
import kata5P2.view.HistogramDisplay;
import kata5P2model.Mail;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReaderBD;
import java.util.ArrayList;
public class Kata5P2 {
    private static ArrayList<String> emails;
    private static Histogram<String> histogram;
  
    public static void main(String[] args) {
        input();
        process();
        output();
    }
    
     public static void input(){
        String fileName  = ".src\\kata5P2\\view\\email.txt";
        MailListReaderBD x = new MailListReaderBD();
        emails = x.read(fileName);
    }
    public static void process(){
        histogram = MailHistogramBuilder.built(emails);
    }
    public static void output(){
        HistogramDisplay HistogramDisplay = new HistogramDisplay(histogram);
        HistogramDisplay.execute();
    }
}
    

