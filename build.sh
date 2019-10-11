#!/bin/sh

# mvn clean verify      --projects parent-pom --also-make-dependents
  mvn clean verify site --projects parent-pom --also-make-dependents
# mvn clean verify site --projects parent-pom --also-make-dependents | tee build.log

# mvn versions:set -DnewVersion=0.0.2-SNAPSHOT -DgenerateBackupPoms=false --projects parent-pom --also-make-dependents
