package Original;

import java.util.List;

public class SubmissionController {
    Validator validator;
    Database database;
    UI ui;
    ReviewerManager reviewerManager;
    EvaluationManager evaluationManager;

    public SubmissionController(Validator validator, Database db, UI ui, ReviewerManager reviewerManager, EvaluationManager evaluationManager){
        this.validator = validator;
        this.database = db;
        this.ui = ui;
        this.reviewerManager = reviewerManager;
        this.evaluationManager = evaluationManager;
    }

    public void submit(String data) throws InterruptedException {
        String valid = validator.validateFormat(data);

        if (valid.equals("valid")){
            database.saveSubmission(data);
            //wait for confirmation
            List<Reviewer> filteredReviewers = reviewerManager.getAvailableReviewers();

            for (Reviewer reviewer: filteredReviewers){
                reviewer.assignReview();
            }

            evaluationManager.startEvaluation();
        }

        else {
            ui.returnError();
        }

    }



}
