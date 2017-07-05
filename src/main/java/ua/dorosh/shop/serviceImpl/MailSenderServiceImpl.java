package ua.dorosh.shop.serviceImpl;

import org.springframework.stereotype.*;
import org.springframework.stereotype.Service;
import ua.dorosh.shop.service.MailSenderService;


import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.DataSource;
import java.io.IOException;
import java.util.Properties;


/**
 * Created by Study on 09.06.2017.
 */
@Service
public class MailSenderServiceImpl implements MailSenderService {
    private final String EMAIL_FROM = "dorosh77727@gmail.com";
    private final String EMAIL_PASSWORD = "280885ipm";

    @Override
    public void sendMail(String theme, String mailBody, String email) {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.port", "465");
        properties.setProperty("mail.smtp.host", "smtp.gmail.com");
        properties.setProperty("mail.smtp.socketFactory.port", "465");
        properties.setProperty("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        Session session = Session.getDefaultInstance(properties,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(EMAIL_FROM, EMAIL_PASSWORD);
                    }
                });
        try {

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(EMAIL_FROM));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(
                    email));

            message.setSubject(theme, "UTF-8");
            message.setText(mailBody);
            synchronized (this) {
                System.out.println(5);
                //Transport.send(message);
                System.out.println(6);
            }
        } catch (MessagingException mex) {
            mex.printStackTrace();
            System.out.println("You have some problems with connection!");
        }

    }


}
