package sfm.web;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDb {
    MongoClient client;
    MongoDatabase database;

    public MongoDb(String url, String dbName) {
        client = MongoClients.create(url);
        database = client.getDatabase(dbName);
    }


}
