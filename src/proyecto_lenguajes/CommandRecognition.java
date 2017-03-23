package proyecto_lenguajes;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 *
 * @author car_v
 */
public class CommandRecognition extends Thread {

    Principal Pantalla_Principal;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public CommandRecognition(Principal Pantalla_Principal) {
        this.Pantalla_Principal = Pantalla_Principal;
    }

    public void run() {
        try {
            Configuration configuration = new Configuration();
            configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
            configuration.setDictionaryPath("src/proyecto_lenguajes/comandos.dic");
            configuration.setLanguageModelPath("src/proyecto_lenguajes/comandos.lm");
            LiveSpeechRecognizer recognize = new LiveSpeechRecognizer(configuration);
            recognize.startRecognition(true);
            Pantalla_Principal.init();
            SpeechResult result;
            while (true) {
                String Command = "";
                if ((result = recognize.getResult()) != null) {
                    Command = result.getHypothesis();
                } else {
                    continue;
                }
                if (Command.toLowerCase().equals("username")) {
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
                    Pantalla_Principal.usernameFocusCommand();
                } else if (Command.toLowerCase().equals("password")) {
                    Pantalla_Principal.passwordFocusCommand();
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
                } else if (Command.toLowerCase().equals("ok")) {
                    Pantalla_Principal.generalListo();
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
                } else if (Command.toLowerCase().equals("mail")) {
                    Pantalla_Principal.mail();
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
                } else if (Command.toLowerCase().equals("contacts")) {
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
                    Pantalla_Principal.openContacts();
                } else if (Command.toLowerCase().equals("new")) {
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
                    Pantalla_Principal.addContactView();
                } else if (Command.toLowerCase().equals("sophia") || Command.toLowerCase().equals("jackson") || Command.toLowerCase().equals("emma") || Command.toLowerCase().equals("aiden") || Command.toLowerCase().equals("olivia") || Command.toLowerCase().equals("lucas") || Command.toLowerCase().equals("ava") || Command.toLowerCase().equals("liam") || Command.toLowerCase().equals("mia") || Command.toLowerCase().equals("noah") || Command.toLowerCase().equals("isabella") || Command.toLowerCase().equals("ethan") || Command.toLowerCase().equals("riley") || Command.toLowerCase().equals("mason") || Command.toLowerCase().equals("aria") || Command.toLowerCase().equals("caden") || Command.toLowerCase().equals("zoe") || Command.toLowerCase().equals("oliver") || Command.toLowerCase().equals("charlotte") || Command.toLowerCase().equals("elijah") || Command.toLowerCase().equals("lily") || Command.toLowerCase().equals("grayson") || Command.toLowerCase().equals("layla") || Command.toLowerCase().equals("jacob") || Command.toLowerCase().equals("amelia") || Command.toLowerCase().equals("michael") || Command.toLowerCase().equals("emily") || Command.toLowerCase().equals("benjamin") || Command.toLowerCase().equals("madelyn") || Command.toLowerCase().equals("carter") || Command.toLowerCase().equals("aubrey") || Command.toLowerCase().equals("james") || Command.toLowerCase().equals("adalyn") || Command.toLowerCase().equals("jayden") || Command.toLowerCase().equals("madison") || Command.toLowerCase().equals("logan") || Command.toLowerCase().equals("chloe") || Command.toLowerCase().equals("alexander") || Command.toLowerCase().equals("harper") || Command.toLowerCase().equals("caleb") || Command.toLowerCase().equals("abigail") || Command.toLowerCase().equals("ryan") || Command.toLowerCase().equals("luke") || Command.toLowerCase().equals("avery") || Command.toLowerCase().equals("daniel") || Command.toLowerCase().equals("evelyn") || Command.toLowerCase().equals("jack") || Command.toLowerCase().equals("kaylee") || Command.toLowerCase().equals("william")) {
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
                    Pantalla_Principal.setName(Command);
                } else if (Command.toLowerCase().equals("one") || Command.toLowerCase().equals("two") || Command.toLowerCase().equals("three") || Command.toLowerCase().equals("four") || Command.toLowerCase().equals("five") || Command.toLowerCase().equals("six") || Command.toLowerCase().equals("seven") || Command.toLowerCase().equals("eight") || Command.toLowerCase().equals("nine") || Command.toLowerCase().equals("zero")) {
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
                    Pantalla_Principal.addNumber(Command);
                } else if (Command.toLowerCase().equals("history")) {
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
                    Pantalla_Principal.history();
                } else if (Command.toLowerCase().equals("back")) {
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
                    Pantalla_Principal.back();
                } else if (Command.toLowerCase().equals("call")) {
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
                    Pantalla_Principal.makeCall();
                } else if (Command.toLowerCase().equals("video call")) {
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
                    Pantalla_Principal.makeVideoCall();
                } else if (Command.toLowerCase().equals("message")) {
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
                    Pantalla_Principal.makeMessage();
                } else if (Command.toLowerCase().equals("modify")) {
//                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
//                    Pantalla_Principal.contactModify();
                } else if (Command.toLowerCase().equals("hang up")) {
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
                    Pantalla_Principal.endCall();
                } else if (Command.toLowerCase().equals("send")) {
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
                    Pantalla_Principal.sendMessage();
                } else if (Command.toLowerCase().equals("delete")) {
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
                    Pantalla_Principal.contactDelete();
                } else if (Command.toLowerCase().equals("name")) {
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command + "\n");
                    Pantalla_Principal.focusName();
                } else if (Command.toLowerCase().equals("number")) {
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command);
                    Pantalla_Principal.focusNumber();
                } else if (Command.toLowerCase().equals("image")) {
                    Pantalla_Principal.appendHistory(sdf.format(new Timestamp(System.currentTimeMillis())) + "\t" + Command);
                    Pantalla_Principal.focusImage();
                } else if (Command.toLowerCase().equals("ex")) {
                    System.out.println("Exiting Process");
                    break;
                }
            }
            recognize.stopRecognition();
            System.exit(0);
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}
