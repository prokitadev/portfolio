package pl.prokita.portfolio.mongo;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import pl.prokita.portfolio.mongo.model.*;

import java.util.ArrayList;
import java.util.List;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;


public class MongoDBConnector {


    private CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
            fromProviders(PojoCodecProvider.builder().automatic(true).build()));
    private MongoClient mongoClient = new MongoClient();
    private MongoDatabase database = mongoClient.getDatabase("portfolio").withCodecRegistry(pojoCodecRegistry);




    public List<Projects> getAllProjects() {
        MongoCollection<Projects> collection = database.getCollection("projects", Projects.class);
        List<Projects> projects = collection.find(Projects.class).into(new ArrayList<>());

        return projects;

    }
}
