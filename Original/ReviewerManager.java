package Original;

import java.util.ArrayList;
import java.util.List;

public class ReviewerManager {
    Database database;

    public ReviewerManager(Database db){
        this.database = db;
    }

    public List<Reviewer> getAvailableReviewers(){
        List<Reviewer> reviewers = database.fetchReviewers();

        reviewers = filterConflicts(reviewers);
        reviewers = checkWorkload(reviewers);

        return reviewers;
    }

    public List<Reviewer> filterConflicts(List<Reviewer> reviewerList){
        List<Reviewer> noConflicts = new ArrayList<>();

        for (Reviewer reviewer : reviewerList){
            //some condition
            if (true){
                noConflicts.add(reviewer);
            }
        }
        return noConflicts;
    }

    public List<Reviewer> checkWorkload(List<Reviewer> reviewerList){
        List<Reviewer> goodWorkload = new ArrayList<>();

        for (Reviewer reviewer : reviewerList){
            //5 is a random number
            if (reviewer.workload < 5){
                goodWorkload.add(reviewer);
            }
        }
        return goodWorkload;
    }
}
