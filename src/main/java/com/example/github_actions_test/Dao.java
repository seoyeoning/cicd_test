package com.example.github_actions_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class Dao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void test(int id, String name) {

        String query = "insert into new_table (id, name)\n" + "VALUES (?, ?)";
        Object[] param = new Object[]{id, name};

        this.jdbcTemplate.update(query,param);

    }



}
