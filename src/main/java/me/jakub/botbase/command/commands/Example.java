package me.jakub.botbase.command.commands;

import me.jakub.botbase.Main;
import me.jakub.botbase.command.ICommand;
import net.dv8tion.jda.core.entities.Message;

/**
 * Example command
 *
 * Prefix for the command is the name of the class
 *
 * @author Jakub
 * @since 18/05/2020
 */
public class Example implements ICommand {

    /**
     * Method called when user type !example
     *
     * @param instance instance of Main class
     * @param message to get some instances from JDA if you need
     * @param args arguments from command
     */
    @Override
    public void onCommand(Main instance, Message message, String[] args) {

        //Send message when !example command received
        message.getChannel().sendMessage("Hello").queue();
    }

}
