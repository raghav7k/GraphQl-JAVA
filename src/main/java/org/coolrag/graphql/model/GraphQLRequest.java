package org.coolrag.graphql.model;

import java.util.Map;

/**
 * @author rk250084
 */
public class GraphQLRequest {
    private String query;
    private String operation;
    private Map<String, Object> variables;

    public String getQuery() {
        return query;
    }

    public String getOperation() {
        return operation;
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }
}
