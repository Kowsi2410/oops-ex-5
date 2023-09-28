
package journals;

public class Journals {
    int journalId;
    String journalName;

    public Journals(int journalId, String journalName) {
        this.journalId = journalId;
        this.journalName = journalName;
    }

    // Getters for journal details

    @Override
    public String toString() {
        return "Journal ID: " + journalId +
                "\nJournal Name: " + journalName;
    }
}

