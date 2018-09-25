package UserInput;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationFactory;
import org.bukkit.conversations.Prompt;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("survey")) {
			
			ConversationFactory cf = new ConversationFactory(this);
			Conversation convo = cf.withFirstPrompt(new UserPrompt()).withLocalEcho(true).buildConversation((Player)sender);
			convo.begin();
		}
		
		return true;
		
	}
	
}
