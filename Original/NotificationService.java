package Original;

public class NotificationService {
    Researcher researcher;

    public NotificationService(Researcher researcher){
        this.researcher = researcher;
    }

    public void notifyAcceptance(){
        researcher.sendNotification();
    }

    public void notifyRejection(){
        researcher.sendNotification();
    }

    public void notifyRevision(){
        researcher.sendNotification();
    }
}
