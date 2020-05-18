package me.jakub.botbase;

import lombok.Getter;
import me.jakub.botbase.events.MessageReceivedListener;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;

import javax.security.auth.login.LoginException;

/**
 * This Base using Lombok library, if you have any problem with this library you can delete it, base can work without Lombok.
 *
 * @author Jakub
 * @since 17/05/2020
 */
public class Main {

    public static Main getInstance(){
        return new Main();
    }

    @Getter
    private final String prefix = "!";

    @Getter
    private final String token = "TOKEN_HERE";

    public static JDA jda;

    public static void main(String[] args) throws LoginException, InterruptedException {
        jda = new JDABuilder(AccountType.BOT)
                .setToken(Main.getInstance().getToken())
                .setStatus(OnlineStatus.ONLINE)
                .setGame(Game.playing("!help"))
                .buildBlocking();

        jda.addEventListener(new MessageReceivedListener());
    }
}
