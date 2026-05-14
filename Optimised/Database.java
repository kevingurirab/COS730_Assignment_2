package Optimised;

import Optimised.Reviewer;

import java.util.ArrayList;
import java.util.List;

public class Database {
    List<String> submissions = new ArrayList<>();
    List<Optimised.Reviewer> reviewers = new ArrayList<>();
    List<Double> scores = new ArrayList<>();

    public Database(){

    }

    public void saveSubmission(String data){
        //returns confirmation
        submissions.add(data);

    }

    public List<Reviewer> quiryReviewers(){
        return reviewers;
    }

    public void saveScore(double score){
        scores.add(score);
    }

}
