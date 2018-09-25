import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.Prompt;
import org.bukkit.conversations.StringPrompt;

public class UserPrompt extends StringPrompt {

    @Override
    public Prompt acceptInput(ConversationContext con, String answer) {

        String[] ratings = new String[5];
        con.getForWhom().sendRawMessage("Thanks!");
        int counter = 0;

        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] == null || ratings[i] == "") {
                ratings[i] = answer;
                counter++;
            }
        }

        if (ratings[4] != null || ratings[4] != "") {
            for (int f = 0; f < 5; f++) {
                System.out.println(ratings[f]);
            }
        }

        return null;
    }

    @Override
    public String getPromptText(ConversationContext arg0) {
        return "On a scale of 1-10, how much do you like the server?";
    }

}
