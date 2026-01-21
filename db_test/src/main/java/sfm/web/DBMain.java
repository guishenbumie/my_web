package sfm.web;

import com.mongodb.client.MongoClients;
import com.mongodb.client.model.Filters;

public class DBMain {

    public static void main(String[] args) {
        com.mongodb.client.MongoDatabase database;
//        var client = MongoClients.create("mongodb://root:mM6RhffEkaqswZUc@mongoshardf484c54949cb0.mongodb.ivolces.com:3717,mongoshardf484c54949cb1.mongodb.ivolces.com:3717/?authSource=admin&retryWrites=true");
        var client = MongoClients.create("mongodb://soultarkov:2rp7mJBcngW8yxHM@10.253.14.169:27017");
        database = client.getDatabase("st_dev");
//        var collection = database.getCollection("tasks");
        var collection = database.getCollection("users");
//        var collection = database.getCollection("user_items");
//        var collection = database.getCollection("roles");
        long uniqId = 6641707374865743906L;
//        long uniqId = 6642268037417331390L;
        var res = collection.find(Filters.eq("_id", uniqId)).first();
        System.out.println(res);
//        System.out.println(res.get("account").toString());
//        System.out.println(res.getClass());
    }
}