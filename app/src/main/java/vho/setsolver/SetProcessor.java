package vho.setsolver;

import java.util.ArrayList;
import java.util.List;

public class SetProcessor {
    /**
     * Processes an input data of SET cards and returns a list of SetCards.
     * 
     * @param cardInput an input data of SET cards
     * @return a list of SetCards from the input data
     */
    public static List<SetCard> process(String cardInput) {
        List<SetCard> cards = new ArrayList<>();

        String lines[] = cardInput.split("\\r?\\n");
        int total = Integer.parseInt(lines[0]);
        for (int i = 1; i <= total; i++) {
            String line = lines[i];
            String[] parts = line.split(" ");
            SetCard card = new SetCard(
                    SetCard.COLOR.valueOf(parts[0].toUpperCase()),
                    parts[1].charAt(0),
                    parts[1].length()
            );
            cards.add(card);
        }

        return cards;
    }
}
