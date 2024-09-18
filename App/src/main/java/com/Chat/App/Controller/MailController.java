package com.Chat.App.Controller;

import com.Chat.App.Services.Interface.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MailController {
    private final MailService mailService;
    @Autowired
    public MailController(SimpMessagingTemplate template, MailService mailService) {
        this.mailService = mailService;
    }
    @GetMapping("/mail")
    public ResponseEntity<String> SendMail()
    {
        return ResponseEntity.ok(mailService.SendMail());
    }
}
