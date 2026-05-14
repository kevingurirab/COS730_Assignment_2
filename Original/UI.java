package Original;

public class UI {
    SubmissionController submissionController;

    public UI(){

    }

    public void submitResearchOutput(String data) throws InterruptedException {
        submissionController.submit(data);
    }

    public void returnError(){
        System.out.println("Error");
    }
}
