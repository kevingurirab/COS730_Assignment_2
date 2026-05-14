package Optimised;


import java.util.List;

public class SubmissionController {
    Validator validator;
    SubmissionRepository submissionRepository;
    Optimised.UI ui;
    ReviewerManager reviewerManager;
    Optimised.EvaluationManager evaluationManager;

    public SubmissionController(Validator validator, SubmissionRepository db, Optimised.UI ui, ReviewerManager reviewManager, Optimised.EvaluationManager evaluationManager){
        this.validator = validator;
        this.submissionRepository = db;
        this.ui = ui;
        this.reviewerManager = reviewManager;
        this.evaluationManager = evaluationManager;
    }

    public void submit(String data) throws InterruptedException {
        String valid = validator.validateFormat(data);

        if (valid.equals("valid")){
            submissionRepository.saveSubmission(data);
            ui.returnSuccess();

            String reviewerStatus = reviewerManager.getAvailableReviewers();

            if (reviewerStatus.equals("success")){
                evaluationManager.startEvaluation();
            }

            else{
                // assume always success
                //retry
            }
        }

        else {
            ui.returnError();
        }

    }



}
