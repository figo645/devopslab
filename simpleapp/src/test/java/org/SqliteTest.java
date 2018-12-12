package org;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.common.db.RowMapper;
import org.common.db.SqliteHelper;
import org.junit.Test;

public class SqliteTest {

    @Test
    public void testHelper() {
        try {
            SqliteHelper h = new SqliteHelper("testHelper.db");
            //h.executeUpdate("drop table if exists test;");
            //h.executeUpdate("create table test(name varchar(20));");
            h.executeUpdate("insert into test values('sqliteHelper test1');");
            h.executeUpdate("insert into test values('sqliteHelper test2');");
            h.executeUpdate("insert into test values('sqliteHelper test3');");
            h.executeUpdate("insert into test values('sqliteHelper test4');");
            h.executeUpdate("insert into test values('sqliteHelper test5');");
            h.executeUpdate("insert into test values('sqliteHelper test6');");
            h.executeUpdate("insert into test values('sqliteHelper test7');");
            List<String> sList = h.executeQuery("select name from test", new RowMapper<String>() {
                @Override
                public String mapRow(ResultSet rs, int index)
                        throws SQLException {
                    return rs.getString("name");
                }
            });
            for (Object c:sList){
                System.out.println(c.toString());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}