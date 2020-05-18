package me.jakub.botbase.command;

import me.jakub.botbase.Main;
import net.dv8tion.jda.core.entities.Message;

/**
 * @author Jakub
 * @since 18/05/2020
 */
public interface ICommand {

    public void onCommand(Main instance, Message message, String[] args);

}
