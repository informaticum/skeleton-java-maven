#!/bin/sh

# mvn clean verify      --projects parent-pom --also-make-dependents
  mvn clean verify site --projects parent-pom --also-make-dependents
# mvn clean verify site --projects parent-pom --also-make-dependents | tee build.log
