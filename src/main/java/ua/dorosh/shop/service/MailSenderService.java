package ua.dorosh.shop.service;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

import java.io.IOException;

/**
 * Created by n.dorosh on 01.07.2017.
 */
public interface MailSenderService {

    void sendMail (String theme, String mailBody, String email);

//    void sendMailWithTickets (String theme, String mailBody, String email, String filePath) throws MessagingException, IOException;

}
