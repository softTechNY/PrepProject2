package Utility;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static Utility.ConnectMongoDB.loadProperties;

/**
 * Created by JHANGIR on 1/8/2017.
 */
public class ConnectDB {

    Connection connect = null;
    Statement statement = null;
    PreparedStatement ps = null;
    private ResultSet rs = null;
    List<String> list = new ArrayList<String>();



    public void connectToDatabase() throws IOException, SQLException, ClassNotFoundException {
        Properties prop = loadProperties();
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String userName = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);
        connect = DriverManager.getConnection(url,userName,password);
          System.out.println("Database is connected");

    }



    public List<String> readDataBase(String tableName, String columnName)throws Exception{
        List<String> data = new ArrayList<String>();

        try {
            connectToDatabase();
            statement = connect.createStatement();
            rs = statement.executeQuery("select * from " + tableName);
            data = getResultSetData(rs, columnName);
        } catch (ClassNotFoundException e) {
            throw e;
        }finally{
            close();
        }
        return data;
    }

//    public List<String> readDataBase(String sql) throws Exception {
//
//        try {
//
//            connectToDatabase();
//            // Statements allow to issue SQL queries to the database
//            statement = connect.createStatement();
//            // Result set get the result of the SQL query
//            resultSet = statement
//                    .executeQuery(sql);
//            list = getResultSetData(resultSet);
//        } catch (Exception e) {
//            throw e;
//        } finally {
//            close();
//        }
//
//        return list;
//    }

    private void close() {
        try{
            if(rs != null){
                rs.close();
            }
            if(statement != null){
                statement.close();
            }
            if(connect != null){
                connect.close();
            }
        }catch(Exception e){

        }
    }

//    private List<String> getResultSetData(ResultSet resultSet) throws SQLException {
//        List<String> dataList = new ArrayList<String>();
//        while(resultSet.next()){
//            String itemName = resultSet.getString(columnName);
//            dataList.add(itemName);
//        }
//        return dataList;
//    }

    private List<String> getResultSetData(ResultSet rs, String columnName) throws SQLException {
        List<String> dataFromDB = new ArrayList<String>();
        while(rs.next()){
            String itemName = rs.getString(columnName);
            dataFromDB.add(itemName);
        }
        return dataFromDB;
    }

    // function  for Data insert into MySQL Database
    public void InsertDataFromArryToMySql(int [] ArrayData,String tableName, String columnName)
    {
        try {
            connectToDatabase();
            //  connect.createStatement("INSERT into tbl_insertionSort set SortingNumbers=1000");

            for(int n=0; n<ArrayData.length; n++){
                ps = connect.prepareStatement("INSERT INTO "+tableName+" ( "+columnName+" ) VALUES(?)");
                ps.setInt(1,ArrayData[n]);
                ps.executeUpdate();
                //System.out.println(list[n]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    // Function for Insert Single value in a table
    public void InsertDataFromStringToMySql(String ArrayData,String tableName, String columnName)
    {
        try {
            connectToDatabase();
            //  connect.createStatement("INSERT into tbl_insertionSort set SortingNumbers=1000");
            ps = connect.prepareStatement("INSERT INTO "+tableName+" ( "+columnName+" ) VALUES(?)");
            ps.setString(1,ArrayData);
            ps.executeUpdate();
            //System.out.println(list[n]);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //connection = ConnectionConfiguration.getConnection();
    }

    public List<String> directDatabaseQueryExecute(String passQuery,String dataColumn)throws Exception{
        List<String> data = new ArrayList<String>();
        try {
            connectToDatabase();
            statement = connect.createStatement();
            rs = statement.executeQuery(passQuery);
            data = getResultSetData(rs, dataColumn);
        } catch (ClassNotFoundException e) {
            throw e;
        }finally{
            close();
        }
        return data;
    }

    public void InsertDataFromArryListToMySql(List<Object> list,String tableName, String columnName)
    {
        try {
            connectToDatabase();
            //  connect.createStatement("INSERT into tbl_insertionSort set SortingNumbers=1000");
            for(Object st:list){
                // System.out.println(st);
                ps = connect.prepareStatement("INSERT INTO "+tableName+" ( "+columnName+" ) VALUES(?)");
                ps.setObject(1,st);
                ps.executeUpdate();
                //System.out.println(list[n]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //connection = ConnectionConfiguration.getConnection();
    }

}




