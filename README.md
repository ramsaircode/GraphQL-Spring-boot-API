## **Graphql Example with Spring boot**

This is [Graphql](https://graphql.org/) Example with [Spring Boot](http://projects.spring.io/spring-boot/) and performing basic operation on User, Post and Comment entities using graphql.

## What's inside 
This project is based on the spring boot and uses below packages :
- Maven
- Spring Boot
- Graphql

## Overview 
In this application we are using below configuration:
- **Entities**:
    - User
    - Post
    - Comment
- **Queries**:
    - getUserById(id:Int!): User
    - getPostById(id:Int!): Post
    - getCommentById(id:Int!): Comment
    - getCommentsFromPostId(id:Int!): [Comment]
- **Mutation**:
    - updatePost(id:Int!, title: String!, body: String!): Post
	- deletePost(id:Int!): Boolean

## Graphql Configuration
Created a schema.graphqls schema file in `/resources/schema.graphqls`.  
The contents are :
```
type User {
    id: ID!
    name: String!
    username: String!
    email: String!
}

type Post {
    id: ID!
    title: String!
    body: String!
    userId: Long!
}

type Comment {
    id: ID!
    name: String!
    email: String!
    body: String!
    postId: Long!
}

# The Root Query for the application
type Query {
	getUserById(id:Int!): User
    getPostById(id:Int!): Post
    getCommentById(id:Int!): Comment
    getCommentsFromPostId(id:Int!): [Comment]
}

# Mutation: to add entities
type Mutation {
	updatePost(id:Int!, title: String!, body: String!, userId: Long!): Post
	deletePost(id:Int!): Boolean
}
```

## Installation 
The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies

or 

run this command in the command line from the project folder

```
mvn clean install
```

## Usage 
Run the project through the IDE and head out to [http://localhost:8080](http://localhost:8080)

or 

run this command in the command line:
```
mvn spring-boot:run
```

#### You can Access graphhql UI using below link:

###### **For Localhost:** _http://localhost:8080/post/graphiql_

###### **For Other Environment:** _${ENV_HOSTNAME}/post/graphiql_


##Run Queries from Graphql UI:
| Type     | Request                                                                                                                                                                                                                                                                                                                                                                               | Response                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|----------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Queries  | {<br>  getUserById(id: 1) {<br>    id<br>    name<br>    username<br>    email<br>  }<br>  getPostById(id: 1) {<br>    id<br>    title<br>    body<br>    userId<br>  }<br>  getCommentById(id: 1) {<br>    id<br>    name<br>    email<br>    body<br>    postId<br>  }<br>  getCommentsFromPostId(id: 1) {<br>    id<br>    name<br>    email<br>    body<br>    postId<br>  }<br>} | {<br>  "data": {<br>    "getUserById": {<br>      "id": "1",<br>      "name": "Leanne Graham",<br>      "username": "Bret",<br>      "email": "Sincere@april.biz"<br>    },<br>    "getPostById": {<br>      "id": "1",<br>      "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",<br>      "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto",<br>      "userId": 1<br>    },<br>    "getCommentById": {<br>      "id": "1",<br>      "name": "id labore ex et quam laborum",<br>      "email": "Eliseo@gardner.biz",<br>      "body": "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium",<br>      "postId": 1<br>    },<br>    "getCommentsFromPostId": [<br>      {<br>        "id": "1",<br>        "name": "id labore ex et quam laborum",<br>        "email": "Eliseo@gardner.biz",<br>        "body": "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium",<br>        "postId": 1<br>      },<br>      {<br>        "id": "2",<br>        "name": "quo vero reiciendis velit similique earum",<br>        "email": "Jayne_Kuhic@sydney.com",<br>        "body": "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et",<br>        "postId": 1<br>      },<br>      {<br>        "id": "3",<br>        "name": "odio adipisci rerum aut animi",<br>        "email": "Nikita@garfield.biz",<br>        "body": "quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione",<br>        "postId": 1<br>      },<br>      {<br>        "id": "4",<br>        "name": "alias odio sit",<br>        "email": "Lew@alysha.tv",<br>        "body": "non et atque\noccaecati deserunt quas accusantium unde odit nobis qui voluptatem\nquia voluptas consequuntur itaque dolor\net qui rerum deleniti ut occaecati",<br>        "postId": 1<br>      },<br>      {<br>        "id": "5",<br>        "name": "vero eaque aliquid doloribus et culpa",<br>        "email": "Hayden@althea.biz",<br>        "body": "harum non quasi et ratione\ntempore iure ex voluptates in ratione\nharum architecto fugit inventore cupiditate\nvoluptates magni quo et",<br>        "postId": 1<br>      }<br>    ]<br>  }<br>} |
| Mutation | mutation {<br>  updatePost(id: 1, title: "Test Title 111", body: "Test Body 111", userId: 1) {<br>    id<br>    title<br>    body<br>    userId<br>  }<br>  <br>  deletePost(id: 1)<br>}                                                                                                                                                                                              | {<br>  "data": {<br>    "updatePost": {<br>      "id": "1",<br>      "title": "Test Title 111",<br>      "body": "Test Body 111",<br>      "userId": 1<br>    },<br>    "deletePost": true<br>  }<br>}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |


## Docker Image Creation 
Added below contents in Dockerfile path: `/docker/Dockerfile`:
```
FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```

run this command in the command line from the project folder to create docker image

```
mvn spring-boot:build-image
```