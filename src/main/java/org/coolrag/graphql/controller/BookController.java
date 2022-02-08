package org.coolrag.graphql.controller;

import graphql.ExecutionResult;
import org.coolrag.graphql.service.GraphQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/rest/books")
@RestController
public class BookController {

    @Autowired
    GraphQLService graphQLService;

    @GetMapping
    public ResponseEntity<Object> getAllBooks(@RequestBody String query) {
        ExecutionResult execute = graphQLService.getGraphQL().execute(query);

        return new ResponseEntity<>(execute, HttpStatus.OK);
    }
}