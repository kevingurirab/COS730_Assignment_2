package Optimised;

import java.util.ArrayList;
import java.util.List;

public class EvaluationManager {
    NotificationService notificationService;
    List<Reviewer> reviewers;
    List<Double> scores = new ArrayList<>();
    DBmgr dBmgr;

    public EvaluationManager(DBmgr db, List<Optimised.Reviewer> reviewers){
        dBmgr = db;
        this.reviewers = reviewers;
    }

    public void startEvaluation() {

    }

    public void submitScore(double score){
        dBmgr.saveScore(score);
        scores.add(score);

        if (scores.size() == reviewers.size()){
            notifyAll();
        }
    }

    private double calculateAverage(){
        double total = 0;
        for (double score: scores){
            total += score;
        }
        return total/scores.size();
    }

    private void checkConsensus(){

    }

    private void applyRules(){

    }
}
