import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.channel.voice.VoiceChannelCreateEvent;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.events.message.react.MessageReactionRemoveEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.io.File;

import javax.security.auth.login.LoginException;

public class App extends ListenerAdapter {
    public static void main(String[] args) throws LoginException, InterruptedException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        builder.setToken(Ref.token).buildAsync().addEventListener(new App());
        builder.buildBlocking();
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) {
            return;
        }
        //Objects
        User objUser = event.getAuthor();
        MessageChannel objMsgCh = event.getChannel();
        Message objMsg = event.getMessage();
        String asAString = objMsg.getContentRaw().toLowerCase();
        File help = new File ("/Users/watergal6654/Desktop/4131help.docx");
        File helpmobile = new File ("/Users/watergal6654/Desktop/helpmobile.png");
        //Declarations
        String outreach = "https://docs.google.com/spreadsheets/d/1Q30EvxNAsig8ud3OUYQuXVnKjX6gthGCXn-rznSkjis/edit?usp=sharing";



        //Commands
        //ping pong
        if (asAString.equals(Ref.prefix + "yo")) {
            objMsgCh.sendMessage("you're a fucking retard").queue();

        }

        //help menu
        if (asAString.contains("hello") || objMsg.getContentRaw().equalsIgnoreCase("hi") || objMsg.getContentRaw().equalsIgnoreCase("hey")) {
            objMsgCh.sendMessage(objUser.getAsMention() + " \n" + ":tada: :smile: I'm the 4131bot! :thonk: :Dean: :tingers: \n" + "My prefix is ;\n" + "For a list of commands, type ;help (or type ;helpmobile if you're on phone)" + "\n" + "Please let me know if you have any questions or issues to report!! I hope you enjoy using this bot :) ").queue();
        }

        //commands document
        if (asAString.equals(Ref.prefix + "help")) {
            objMsgCh.sendFile(help).queue();
        }
        if(asAString.equals(Ref.prefix + "helpmobile")) {
            objMsgCh.sendFile(helpmobile).queue();
        }

        //outreach sheet
        if (asAString.equals(Ref.prefix + "outreach")) {
            objMsgCh.sendMessage("Please sign up you loser" + " \n" + outreach).queue();
        }

        //kickoff countdown
        if (asAString.equals(Ref.prefix + "kickoff")) {
            objMsgCh.sendMessage(kickoffCountdown.calculate()).queue();
        }

        //bagandtag countdown
        if (asAString.equals(Ref.prefix + "bag&tag") ||asAString.equals(Ref.prefix + "bagandtag") || asAString.equals(Ref.prefix + "when will i get my life back") || asAString.equals(Ref.prefix + "bt")||asAString.equals(Ref.prefix + "bagtag")) {
            objMsgCh.sendMessage(bagandtagcountdown.calculate()).queue();
        }

        //surprise
        if (asAString.equals(Ref.prefix + "what")) {
            objMsgCh.sendMessage((event.getAuthor()).getAsMention() + "stupid").queue();
        }

        //deep space random trigger
        if (asAString.contains("deep space")) {
            objMsgCh.sendMessage("WATER GAME REEEEEEE").queue();
        }

        //upcoming dates
        if (asAString.equals(Ref.prefix + "dates")) {
            objMsgCh.sendMessage(upcomingDates.dates()).queue();
        }

        //helen's birthday
        if (asAString.contains("when is helen's birthday")) {
            objMsgCh.sendMessage(birthday.helenBday()).queue();
        }
        //NEEDS A CRAP TON OF WORK
            if (asAString.contains (Ref.prefix + "call")) {
                String name = asAString.substring(5);
                //
                // objMsgCh.sendMessage(name).queue();
                objMsgCh.sendMessage(contactInfo.person(name)).queue();
            }
        //


/*

    }
    public void onGenericVoiceChannel(GenericVoiceChannelEvent event) {
      event.
    }
    public void onGuildMessageReactionAdd(GuildMessageReactionAddEvent event) {

    }
    */

    }
}
