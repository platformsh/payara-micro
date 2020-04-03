# Hello World with Payara Micro and Platform.sh

In this section we will cover how to create your first REST project with Payara Micro, and then move that project to Platform.sh  using the Maven Archetype, which  is a Maven project templating toolkit. An archetype is defined as an original pattern or model from which all other things of the same kind are made. 

```shell
mvn archetype:generate -DarchetypeGroupId=sh.platform.archetype   -DarchetypeArtifactId=payara  -DarchetypeVersion=0.0.1  -DgroupId=my.company  -DartifactId=hello -Dversion=0.0.1 -DinteractiveMode=false
```


## How to Execute

```shell
mvn clean package payara-micro:bundle
java -jar -Xmx512m target/microprofile-microbundle.jar 
```
