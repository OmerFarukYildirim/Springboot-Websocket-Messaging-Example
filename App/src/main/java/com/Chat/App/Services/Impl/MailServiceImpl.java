package com.Chat.App.Services.Impl;

import com.Chat.App.Services.Interface.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {
    private JavaMailSender mailSender;
    @Autowired
    public MailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }
    @Override
    public String SendMail() {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("noreply@gmail.com");
        mailMessage.setTo("aahmetyldrm99@gmail.com");
        mailMessage.setText("Ben Java ile oluşturulan bir mailim.");
        mailMessage.setSubject("ABDUNUN ÇÜKÜ");
        mailSender.send(mailMessage);
        return "Gönderildi";
    }
}
