package Original;

import java.util.ArrayList;
import java.util.List;


//a class that acts like a database
public class Database {
    List<String> submissions = new ArrayList<>();
    List<Reviewer> reviewers = new ArrayList<>();
    List<Double> scores = new ArrayList<>();

    public Database(){

    }

    public void saveSubmission(String data){
        //returns confirmation
        submissions.add(data);

    }

    public List<Reviewer> fetchReviewers(){
        return reviewers;
    }

    public void saveScore(double score){
        scores.add(score);
    }
}
