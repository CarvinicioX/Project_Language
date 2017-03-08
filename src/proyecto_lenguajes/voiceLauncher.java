package proyecto_lenguajes;

//Imports
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import java.io.IOException;

/**
 *
 * @author car_v
 */
public class voiceLauncher {

    public static void main(String[] args) throws IOException {
        // Configuration Object
        Configuration configuration = new Configuration();

        // Set path to the acoustic model.
        configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        // Set path to the dictionary.
        configuration.setDictionaryPath("src/proyecto_lenguajes/comandos.dic");
        // Set path to the language model.
        configuration.setLanguageModelPath("src/proyecto_lenguajes/comandos.lm");
        /*/ Set grammar path
        configuration.setGrammarPath("src/grammar");
        configuration.setGrammarName("grammar");
        configuration.setUseGrammar(true);*/
        
        //Recognizer Object, Pass the Configuration object
        LiveSpeechRecognizer recognize = new LiveSpeechRecognizer(configuration);
 
        //Start Recognition Process (The bool parameter clears the previous cache if true)
        recognize.startRecognition(true);
 
        //Create SpeechResult Object
        SpeechResult result;
 
        //Checking if recognizer has recognized the speech
        while ((result = recognize.getResult()) != null) {
            //Get the recognize speech
            String command = result.getHypothesis();
            if (command.toLowerCase().equals("salir")) {
                System.exit(0);
            }
            System.out.println(command);
        }
    }
}
