public class NoteDriver {

    public static void main(String[] args) {
        Note[] notes = new Note[3];

        notes[0] = new Note("En massa svammel", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
                + "Praesent pulvinar finibus lorem id semper. Nam non sapien non dolor congue feugiat in eget nulla. "
                + "Morbi nunc nulla, vulputate ornare turpis. Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
                + "Praesent pulvinar finibus lorem id semper.", "Lasse");
        notes[1] = new Note("Roligt för hela familjen", "Korvgrillning vid badplatsen i kväll 18.00.", "Lisa");
        notes[2] = new Note("En filosofisk betraktelse", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
                + "Donec dapibus, massa vitae porta hendrerit, velit nibh mollis leo, fringilla tincidunt velit lorem vitae nisi. "
                + "Proin lacus ipsum, fermentum non lacinia a, vehicula nec sem. Proin in blandit massa, eget ullamcorper magna. "
                +"In fermentum diam ac enim congue, in feugiat lorem laoreet. Suspendisse enim sapien, suscipit sit amet volutpat "
                + "accumsan, finibus in libero. Etiam blandit massa eu ante bibendum luctus. Duis erat dolor, laoreet nec justo at, "
                +"tincidunt interdum lorem. Nunc tristique dolor vitae lacus mattis, non congue nulla tempus. Donec.", "Mafalda");
        for (Note note : notes) {
            System.out.println("----------------------------------------------------------------------");
            String heading = note.getHeading();
            String text = note.getText();
            String signed = note.getSigned();
            int numberOfWords = note.getNumberOfWords();
            int numberOfChars = note.getNumberOfChars();
            int priceClass = note.getPriceClass();
            System.out.println(heading + "\n" + text
                    + "\nSignerat: " + signed
                    + "\nAntal ord: " + numberOfWords
                    + "\nAntal tecken: " + numberOfChars
                    + "\nPrisklass: " + priceClass);
        }
    }
}