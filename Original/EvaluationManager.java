package Original;

import java.util.ArrayList;
import java.util.List;

public class EvaluationManager {
    private String Evaluation;
    Researcher researcher;
    Database database;
    NotificationService notificationService;
    List<Reviewer> reviewers;
    List<Double> scores = new ArrayList<>();

    public EvaluationManager(Researcher researcher, Database db, List<Reviewer> reviewers){
        this.researcher = researcher;
        database = db;
        this.reviewers = reviewers;
        notificationService = new NotificationService(this.researcher);

    }

    public void startEvaluation() throws InterruptedException {

        while (scores.size() < reviewers.size()){
            wait();
        }

        double average = calculateAverage();
        checkConsensus();
        applyRules();

        switch(Evaluation){
            case "accepted":
                notificationService.notifyAcceptance();
                break;
            case "rejected":
                notificationService.notifyRejection();
                break;
            case "revision":
                notificationService.notifyRevision();
                break;
        }
    }

    public void submitScore(double score){
        database.saveScore(score);
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
