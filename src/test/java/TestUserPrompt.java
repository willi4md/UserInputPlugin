import org.bukkit.conversations.ConversationContext;
import org.junit.Test;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;

public class TestUserPrompt {

    @Mock
    private ConversationContext conversationContext;


    @Test
    public void testGetPromptText() {
        assertThat(new UserPrompt().getPromptText(conversationContext))
                .isEqualTo("On a scale of 1-10, how much do you like the server?");
    }
}
