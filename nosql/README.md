# Payara with NoSQL

![Hello World Platform.sh and Payara](https://pbs.twimg.com/media/ES1yxFiWoAQnjIg?format=jpg&name=small)


The NoSQL DB is a database that provides a mechanism for storage and retrieval of data, which is modeled by means other than the tabular relations used in relational databases. These databases have speed and high scalability. This kind of database is becoming more popular in several applications, which include financial ones. As a result of the increase, the number of users and vendors is increasing too. In the Jakarta EE world, there is the [Jakarta NoSQL](https://projects.eclipse.org/projects/ee4j.nosql).
  
We'll create a similar rest application, but using [MongoDB](https://docs.platform.sh/configuration/services/mongodb.html) instead of relational database.


## Using Docker

![Docker](https://www.docker.com/sites/default/files/horizontal_large.png)

1. Install docker: https://www.docker.com/
1. https://store.docker.com/images/mongo
1. Run docker command
1. Run MongoDB: verify MongoDB image name with the command `docker images`, it can be mongodb or mongo, and then execute this command 
   * `docker run -d --name mongodb-instance -p 27017:27017 mongo`

![MongoDB Project](http://www.jnosql.org/img/logos/mongodb.png)


## How to Execute

```shell
mvn clean package payara-micro:bundle
java -jar -Xmx512m target/microprofile-microbundle.jar 
```

## Execute

```shell 
curl --location --request POST 'http://localhost:8080/fishes' \
--header 'Content-Type: application/json' \
--header 'Content-Type: application/javascript' \
--data-raw '{"name": "payara"}'
```

```shell
curl --location --request GET 'http://localhost:8080/fishes'
```