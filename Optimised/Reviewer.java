package Optimised;

import Optimised.EvaluationManager;

import java.util.List;

public class Reviewer {
    EvaluationManager evaluationManager;
    ReviewerRepository reviewerRepository;

    String conflicts;
    int workload;
    List<String> reviews;

    public Reviewer(){

    }

    public String getConflicts() {
        return conflicts;
    }

    public void setConflicts(String conflicts) {
        this.conflicts = conflicts;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void assignReview(){
        //this.reviews.add();
    }


}
