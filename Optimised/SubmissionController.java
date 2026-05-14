package Optimised;


import java.util.List;

public class SubmissionController {
    Validator validator;
    Optimised.DBmgr dBmgr;
    Optimised.UI ui;
    ReviewerManager reviewerManager;
    Optimised.EvaluationManager evaluationManager;

    public SubmissionController(Validator validator, DBmgr db, Optimised.UI ui, ReviewerManager reviewManager, Optimised.EvaluationManager evaluationManager){
        this.validator = validator;
        this.dBmgr = db;
        this.ui = ui;
        this.reviewerManager = reviewManager;
        this.evaluationManager = evaluationManager;
    }

    public void submit(String data) throws InterruptedException {
        String valid = validator.validateFormat(data);

        if (valid.equals("valid")){
            dBmgr.saveSubmission(data);
            //wait for confirmation

            //Decision logic
            //should initiate the assigning of reviewers
            //Change the name of the method
            String reviewerStatus = reviewerManager.getAvailableReviewers();

            if (reviewerStatus.equals("No reviewer")){
                /// ///ui
            }

            else{
                evaluationManager.startEvaluation();
            }
        }

        else {
            ui.returnError();
        }

    }



}
