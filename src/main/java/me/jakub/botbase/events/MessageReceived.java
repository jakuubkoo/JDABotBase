package me.jakub.botbase.events;

import me.jakub.botbase.Main;
import me.jakub.botbase.command.ICommand;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * @author Jakub
 * @since 18/05/2020
 */
public class MessageReceived extends ListenerAdapter {

    private Map<String, ICommand> loadedCommands = new HashMap<>();

    public MessageReceived(){

        try {
            Reflections reflections = new Reflections("me.jakub.botbase.command.commands");
            Set<Class<? extends ICommand>> classes = reflections.getSubTypesOf(ICommand.class);
            loadedCommands = new HashMap<>(classes.size());

            for (Class<? extends ICommand> clazz : classes){
                loadedCommands.put(clazz.getSimpleName(), clazz.getDeclaredConstructor().newInstance());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        if (!event.getMessage().getContentRaw().isEmpty() && event.getMessage().getContentRaw().startsWith(Main.getInstance().getPrefix())){
            String cmd = event.getMessage().getContentRaw().split(" ")[0].substring(1);
            String[] args = event.getMessage().getContentRaw().substring(0, cmd.length()).split(" ");

            Optional<ICommand> command = loadedCommands.entrySet()
                    .stream()
                    .filter(stringICommandEntry -> cmd.equalsIgnoreCase(stringICommandEntry.getKey()))
                    .map(Map.Entry::getValue)
                    .findAny();

            if (command.isPresent()){
                command.get().onCommand(Main.getInstance(), event.getMessage(), args);
            }else{
                event.getChannel().sendMessage("Unknown command!").queue();
            }
        }
        super.onGuildMessageReceived(event);
    }
}
