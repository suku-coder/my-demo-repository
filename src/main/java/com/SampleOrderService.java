package com;

import java.util.*; // ❌ Guideline: Wildcard import violation
import java.io.*; // ❌ Guideline: Wildcard import violation
import java.sql.*;

public class SampleOrderService {
    // ❌ Guideline: Raw SQL concatenation (OWASP SQL Injection)
    public void findUser(Connection conn, String userInput) throws SQLException {
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        Statement stmt = conn.createStatement(); // ❌ Guideline: Missing try-with-resources (Resource leak)
        
        ResultSet rs = stmt.executeQuery(query);
        
    }

    // ❌ Guideline: Swallowed exception & unsafe Optional.get()
    public void processOrder(Optional<String> orderId) {
        try {
            String id = orderId.get(); // ❌ Guideline: Calling Optional.get() without isPresent()
            System.out.println("Processing " + id);
        } catch (Exception e) {
            // ❌ Guideline: Swallowed empty catch block
        }
    }
}
