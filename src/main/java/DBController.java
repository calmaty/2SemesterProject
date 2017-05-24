/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoffer
 */
public class DBController {
    
    public Neo4jDB NDB;
    public SqlDB SDB;
    public IDBObject ActiveDB;
    
    public DBController(Neo4jDB NDB, SqlDB SDB) {
        this.NDB = NDB;
        this.SDB = SDB;
        ActiveDB = NDB;
    }

    

    public void SwichDB()
    {
        if(ActiveDB == NDB)
        {
            ActiveDB = SDB;
        }
        else
        {
            ActiveDB = NDB;
        }
    }
    
}
