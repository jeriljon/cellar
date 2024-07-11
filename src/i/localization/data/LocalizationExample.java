package i.localization.data;

import java.util.Locale;
import java.util.ResourceBundle;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LocalizationExample {
    public static void main(String[] args) {
        // Set the default locale to English
        Locale.setDefault(new Locale("en", "US"));

        // Display messages for the default locale
        printMessages(Locale.getDefault());

        // Display messages for the French locale
        printMessages(Locale.FRANCE);
    }

    public static void printMessages(Locale locale) {
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);

        // Get messages from the resource bundle
        String greeting = messages.getString("greeting");
        String farewell = messages.getString("farewell");
        String dateFormatPattern = messages.getString("dateFormat");

        // Format the current date
        DateFormat dateFormat = new SimpleDateFormat(dateFormatPattern);
        String formattedDate = dateFormat.format(new Date());

        // Print localized messages
        System.out.println("Locale: " + locale);
        System.out.println(greeting);
        System.out.println(farewell);
        System.out.println("Formatted Date: " + formattedDate);
        System.out.println();
    }
}
