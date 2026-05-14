package Optimised;

import java.util.List;

public class ReviewerRepository {
    Database database;

    public ReviewerRepository(Database db){
        database = db;
    }

    public List<Reviewer> fetchReviewers(){
        return database.quiryReviewers();
    }
}
