package Optimised;

import java.util.List;

public class ScoreRepository {
    Database database;

    public ScoreRepository(Database db){
        database = db;
    }

    public void saveScore(double score) {
        database.saveScore(score);
    }
}
