package com.Chat.App.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Message {

    private String senderName;
    private String receiverName;
    private String message;
    private String date;
    private Status status;
}
