package kata5P2.view;

import kata5P2model.Mail;
import kata5P2model.Histogram;
import java.util.List;
public class MailHistogramBuilder {
    
    public static Histogram<String> built(List<Mail> mailList){
        Histogram<String> histogram = new Histogram<>();
        
        for(Mail mail : mailList){
            histogram.increment(mail.getDomain());
        }
        
        return histogram;
    }
}
