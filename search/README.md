# Payara with NoSQL and Search Engine

![Hello World Platform.sh and Payara](https://pbs.twimg.com/media/ES1yxFiWoAQnjIg?format=jpg&name=small)


The NoSQL DB is a database that provides a mechanism for storage and retrieval of data, which is modeled by means other than the tabular relations used in relational databases. These databases have speed and high scalability. This kind of database is becoming more popular in several applications, which include financial ones. As a result of the increase, the number of users and vendors is increasing too. In the Jakarta EE world, there is the [Jakarta NoSQL](https://projects.eclipse.org/projects/ee4j.nosql).
  
We'll create a similar rest application, but using [MongoDB](https://docs.platform.sh/configuration/services/mongodb.html) instead of relational database.


## Using Docker

![Docker](https://www.docker.com/sites/default/files/horizontal_large.png)

1. Install docker: https://www.docker.com/
1. https://www.elastic.co/guide/en/elasticsearch/reference/current/docker.html
1. Run docker command 
   * `docker run -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" elasticsearch:7.6.2`

![Elasticsearch Project](https://jnosql.github.io/img/logos/elastic.svg)


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