package test.neo4j;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by wm on 2017/7/11.
 */
public class Test1 {
    public static void main(String[] args) {

        createNode();
    }


    public static void createNode()  {
        GraphDatabaseService graphdb = new GraphDatabaseFactory().newEmbeddedDatabase(new File("D:/install/neo4j-community-3.2.0-windows/neo4j-community-3.2.0/data/databases/graph.db"));
        Transaction tx = graphdb.beginTx();
        try {


            Node user1 = graphdb.createNode();
            Node user2 = graphdb.createNode();
            Node user3 = graphdb.createNode();

            user1.createRelationshipTo(user2,MyrelationshipType.IS_FRIEND_OF);


            user1.createRelationshipTo(user3,MyrelationshipType.IS_FRIEND_OF);




            user1.setProperty("name", "zhangsan");
            user2.setProperty("name", "lisi");
            user3.setProperty("name", "wangwu");
            user1.setProperty("year_of_birth", 1982);
            user2.setProperty("locked", true);
            user3.setProperty("cars_owns", new String[]{"BMW","AUDI"});



            System.out.println("node " + user1.getId());

            System.out.println("node " + user2.getId());
            tx.success();
        } catch (Exception e) {

            tx.failure();
        } finally {

        }
    }

    public static void createrelation()  {
        GraphDatabaseService graphdb = new GraphDatabaseFactory().newEmbeddedDatabase(new File("C:/neo4j"));
        Transaction tx = graphdb.beginTx();
        try {


            Node user1 = graphdb.createNode();
            Node user2 = graphdb.createNode();
            user1.setProperty("name", "zhangsan");
            System.out.println("node " + user1.getId());

            System.out.println("node " + user2.getId());
            tx.success();
        } catch (Exception e) {

            tx.failure();
        } finally {

        }
    }

}
