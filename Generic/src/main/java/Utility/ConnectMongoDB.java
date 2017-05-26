package Utility;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by JHANGIR on 1/18/2017.
 */
public class ConnectMongoDB {
    public static MongoDatabase mongoDatabase = null;

    Connection connect = null;
    Statement statement = null;
    PreparedStatement ps = null;
    private ResultSet resultSet = null;
    List<String> list = new ArrayList<String>();

    public static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        InputStream ism = new FileInputStream("mysqlProp/MySql.properties");
        prop.load(ism);
        ism.close();
        return prop;
    }


    public static MongoDatabase connectMongoDB() {

        String host = "localhost";
        MongoClientURI mongoClientURI = new MongoClientURI(host);
        MongoClient mongoClient = new MongoClient(mongoClientURI);
        System.out.println("MongoDB Connection Eastablished");
        mongoDatabase = mongoClient.getDatabase("database_name");
        System.out.println("Database Connected");

        return mongoDatabase;
    }
}
