#!/bin/bash

echo '============================================================='
echo '$                                                           $'
echo '$                      liumapp                              $'
echo '$                                                           $'
echo '$                                                           $'
echo '$  email:    liumapp.com@gmail.com                          $'
echo '$  homePage: http://www.liumapp.com                         $'
echo '$  Github:   https://github.com/liumapp                     $'
echo '$                                                           $'
echo '============================================================='
echo '.'

mvn -v

#export localM2=/Users/liumeishengqi/.m2/repository
export localM2=/usr/local/tomcat/project/maven-deal-multy-local-jar/using-local-jars/my-repo

mvn install:install-file -Dfile=lib/commons-io-2.5.jar -DgroupId=org.apache.commons.io \
                         -DartifactId=commons-io -Dversion=2.5 \
                         -Dpackaging=jar -DlocalRepositoryPath=${localM2} \
                         -DgeneratedPom=true

mvn install:install-file -Dfile=lib/simple-jar-a-v1.0.0.jar -DgroupId=com.liumapp.simple \
                         -DartifactId=simple-jar-a -Dversion=v1.0.0 \
                         -Dpackaging=jar -DlocalRepositoryPath=${localM2} \
                         -DgeneratedPom=true

mvn install:install-file -Dfile=lib/simple-jar-b-v1.0.0.jar -DgroupId=com.liumapp.simple \
                         -DartifactId=simple-jar-b -Dversion=v1.0.0 \
                         -Dpackaging=jar -DlocalRepositoryPath=${localM2} \
                         -DgeneratedPom=true

