
# Payara with JPA

![Hello World Platform.sh and Payara](https://pbs.twimg.com/media/ES1yxFiWoAQnjIg?format=jpg&name=small)

After creating the first plain hello world with Payara Micro and Platform.sh, it’s time to create the first application connected with a SQL database. Payara has support for Jakarta technologies that includes JPA, [Jakarta Persistence API](https://projects.eclipse.org/projects/ee4j.jpa).

[Jakarta Persistence](https://jakarta.ee/specifications/persistence/) defines a standard for management of persistence and object/relational mapping in Java(R) environments.

On this point, we'll create a REST application this time connect to a relational database; we have support to [MySQL, Maria](https://docs.platform.sh/configuration/services/mysql.html) and [PostgreSQL](https://docs.platform.sh/configuration/services/postgresql.html), but on this application we'll use [PostgreSQL](https://docs.platform.sh/configuration/services/postgresql.html).





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
