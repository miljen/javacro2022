package com.miljen.demo.javacro2022.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "javacro2022")
public class Predavanje {

    @DynamoDBHashKey
    private String id;
    @DynamoDBAttribute
    private String autor;
    @DynamoDBAttribute
    private String koautor;
    @DynamoDBAttribute
    private String naziv;
    @DynamoDBAttribute
    private String podrucje;
}
