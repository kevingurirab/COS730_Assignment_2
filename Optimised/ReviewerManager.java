package Optimised;

import java.util.List;

public class ReviewerManager {
    DBmgr dBmgr;

    public ReviewerManager(){

    }

    //Change the name of this method
    public String getAvailableReviewers() {
        List<Reviewer> reviewerList = dBmgr.fetchReviewers();

        List<Reviewer> finalList = filterReviewers(reviewerList);

        if (finalList.isEmpty()){
            return "No reviewers";
        }

        for (Reviewer reviewer: finalList){
            reviewer.assignReview();
        }

        return "Success";
    }

    public List<Reviewer> filterReviewers(List<Reviewer> list){
        //filter conflicts
        //check workload
        return List.of();
    }
}
