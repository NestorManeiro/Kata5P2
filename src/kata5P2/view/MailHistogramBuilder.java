package kata5P2.view;

import java.util.ArrayList;
import kata5P2model.Mail;
import kata5P2model.Histogram;
public class MailHistogramBuilder {
    
    public static Histogram<String> built(ArrayList<String> emails){
        Histogram<String> histogram = new Histogram<>();
        for(int i = 0 ; i<emails.size();i++){
            Mail mail = new Mail(emails.get(i));
            histogram.increment(mail.getDomain());
        }
        
        return histogram;
   }       
}
