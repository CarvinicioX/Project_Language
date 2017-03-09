package proyecto_lenguajes;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

/**
 *
 * @author car_v
 */
public class CommandRecognition extends Thread {

    Principal Pantalla_Principal;

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
            SpeechResult result;
            while (true) {
                String Command = "";
                if ((result = recognize.getResult()) != null) {
                    System.out.println("entro al if inicial");
                    Command = result.getHypothesis();
                } else {
                    System.out.println("no entro al if");
                }
                System.out.println(Command);
                if (Command.toLowerCase().equals("username")) {
                    Pantalla_Principal.usernameFocusCommand();
                    System.out.println("Username");
                } else if (Command.toLowerCase().equals("password")) {
                    Pantalla_Principal.passwordFocusCommand();
                    System.out.println("Password");
                } else if (Command.toLowerCase().equals("listo")) {
                    Pantalla_Principal.generalListo();
                } else if (Command.toLowerCase().equals("contactos")) {
                    Pantalla_Principal.openContacts();
                    System.out.println("Contactos");
                } else if (Command.toLowerCase().equals("nuevo")) {
                    Pantalla_Principal.addContact();
                } else if (Command.toLowerCase().equals("sophia") || Command.toLowerCase().equals("jackson") || Command.toLowerCase().equals("emma") || Command.toLowerCase().equals("aiden") || Command.toLowerCase().equals("olivia") || Command.toLowerCase().equals("lucas") || Command.toLowerCase().equals("ava") || Command.toLowerCase().equals("liam") || Command.toLowerCase().equals("mia") || Command.toLowerCase().equals("noah") || Command.toLowerCase().equals("isabella") || Command.toLowerCase().equals("ethan") || Command.toLowerCase().equals("riley") || Command.toLowerCase().equals("mason") || Command.toLowerCase().equals("aria") || Command.toLowerCase().equals("caden") || Command.toLowerCase().equals("zoe") || Command.toLowerCase().equals("oliver") || Command.toLowerCase().equals("charlotte") || Command.toLowerCase().equals("elijah") || Command.toLowerCase().equals("lily") || Command.toLowerCase().equals("grayson") || Command.toLowerCase().equals("layla") || Command.toLowerCase().equals("jacob") || Command.toLowerCase().equals("amelia") || Command.toLowerCase().equals("michael") || Command.toLowerCase().equals("emily") || Command.toLowerCase().equals("benjamin") || Command.toLowerCase().equals("madelyn") || Command.toLowerCase().equals("carter") || Command.toLowerCase().equals("aubrey") || Command.toLowerCase().equals("james") || Command.toLowerCase().equals("adalyn") || Command.toLowerCase().equals("jayden") || Command.toLowerCase().equals("madison") || Command.toLowerCase().equals("logan") || Command.toLowerCase().equals("chloe") || Command.toLowerCase().equals("alexander") || Command.toLowerCase().equals("harper") || Command.toLowerCase().equals("caleb") || Command.toLowerCase().equals("abigail") || Command.toLowerCase().equals("ryan") || Command.toLowerCase().equals("luke") || Command.toLowerCase().equals("avery") || Command.toLowerCase().equals("daniel") || Command.toLowerCase().equals("evelyn") || Command.toLowerCase().equals("jack") || Command.toLowerCase().equals("kaylee") || Command.toLowerCase().equals("william")) {
                    Pantalla_Principal.setName(Command);
                    System.out.println("Name");
                } else if (Command.toLowerCase().equals("salir")) {
                    System.out.println("Good Bye");
                    System.exit(0);
                }
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}
