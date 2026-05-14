package Optimised;

import java.util.List;

public class ReviewerManager {
    ReviewerRepository reviewerRepository;

    public ReviewerManager(){

    }

    //Change the name of this method
    public String getAvailableReviewers() {
        List<Reviewer> reviewerList = reviewerRepository.fetchReviewers();

        List<Reviewer> finalList = filterReviewers(reviewerList);
        //assume always not empty
        /*if (finalList.isEmpty()){
            return "No reviewers";
        }*/

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
