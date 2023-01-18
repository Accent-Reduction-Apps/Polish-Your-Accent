Files structure

markup cheatSheet https://github.com/tchapi/markdown-cheatsheet/blob/master/README.md

# The Root Directory

* maven-project/src/main – contains source code and resources that become part of the artifact
* maven-project/src/test – holds all the test code and resources
* maven-project/src/it – usually reserved for integration tests used by the Maven Failsafe Plugin
* maven-project/src/site – site documentation created using the Maven Site Plugin
* maven-project/src/assembly – assembly configuration for packaging binaries

# src/test
* src/test/java – Java source code for tests
* src/test/resources – configuration files and others used by tests
* src/test/filters – contains files that inject values into configuration properties in the resources folder during the test phase