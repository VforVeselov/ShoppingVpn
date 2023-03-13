package org.example;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class BotClass extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "null";
    }

    @Override
    public String getBotToken() {
        return "-";
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
    }
}
