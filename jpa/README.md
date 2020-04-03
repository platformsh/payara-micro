
# Payara with JPA

![Hello World Platform.sh and Payara](https://pbs.twimg.com/media/ES1yxFiWoAQnjIg?format=jpg&name=small)

After creating the first plain hello world with Payara Micro and Platform.sh, it’s time to create the first application connected with a SQL database. Payara has support for Jakarta technologies that includes JPA, [Jakarta Persistence API](https://projects.eclipse.org/projects/ee4j.jpa).

[Jakarta Persistence](https://jakarta.ee/specifications/persistence/) defines a standard for management of persistence and object/relational mapping in Java(R) environments.

On this point, we'll create a REST application this time connect to a relational database; we have support to [MySQL, Maria](https://docs.platform.sh/configuration/services/mysql.html) and [PostgreSQL](https://docs.platform.sh/configuration/services/postgresql.html), but on this application we'll use [PostgreSQL](https://docs.platform.sh/configuration/services/postgresql.html).





## Using Docker

![Docker](https://www.docker.com/sites/default/files/horizontal_large.png)

1. Install docker: https://www.docker.com/
1. https://hub.docker.com/_/postgres
1. Run docker command
1. Run PostgreSQL: verify PostgreSQL image name with the command `docker images`, it can be mongodb or mongo, and then execute this command:
   * `docker run --name postgres-instance -p 5432:5432 -e POSTGRES_PASSWORD=password -e POSTGRES_DB=fishes -d postgres`

![Database](https://d1q6f0aelx0por.cloudfront.net/product-logos/library-postgres-logo.png)


## How to Execute

```shell
mvn clean package payara-micro:bundle
java -jar -Xmx512m -Dserver.host=localhost -Dserver.database=fishes -Dserver.user=postgres -Dserver.password=password target/microprofile-microbundle.jar 
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