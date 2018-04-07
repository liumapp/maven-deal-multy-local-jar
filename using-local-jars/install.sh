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

mvn install:install-file -Dfile=lib/commons-io-2.5.jar -DgroupId=org.apache.commons.io \
                         -DartifactId=commons-io -Dversion=2.5 \
                          -Dpackaging=jar -DlocalRepositoryPath=/Users/liumeishengqi/.m2/repository

