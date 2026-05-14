package Optimised;

public class SubmissionRepository {
    Database database;

    public SubmissionRepository(Database db){
        database = db;
    }

    public void saveSubmission(String data) {
        database.saveSubmission(data);
    }
}
