
import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Record;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import static org.neo4j.driver.v1.Values.parameters;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoffer
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Driver driver = GraphDatabase.driver( "bolt://localhost:7687", AuthTokens.basic( "neo4j", "class" ) );
Session session = driver.session();

//session.run( "CREATE (a:Person {name: {name}, title: {title}})",
//        parameters( "name", "Arthur", "title", "King" ) );

StatementResult result = session.run( "MATCH (b:Book)-[m:Mentions]->(c:City) WHERE c.name = {name} RETURN b.title AS title, b.author AS author", parameters("name","London"));
while ( result.hasNext() )
{
    Record record = result.next();
    System.out.println( record.get( "title" ).asString() + " " + record.get( "author" ).asString() );
}

session.close();
driver.close();
    }
    
}
