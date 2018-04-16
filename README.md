# maven-deal-multy-local-jar
Maven batch processing local jars .

## how to use

[中文文档](http://www.liumapp.com/articles/2018/04/10/1523359175512.html)

* simple-jar-a and simple-jar-b is two simple projects . To simulate multiple local jar packages and their dependencies .

* the main project is using-local-jars . 

* first of all , go to using-local-jars and run 

        mvn clean install
        
* now , we need update manifest.mf info of using-local-jars-v1.0.0.jar

        cd target
        
        unzip using-local-jars-v1.0.0.jar -d tmp
        
        cd tmp
        
        vim ./META-INF/MANIFEST.MF 
        
        (and add : Class-Path: lib/commons-io-2.5.jar
                              lib/simple-jar-a-v1.0.0.jar
                              lib/simple-jar-b-v1.0.0.jar)
        
        :wq
        
        jar cvfm final.jar ./META-INF/MANIFEST.MF ./
        
        mv final.jar ../
        
        cd ..
        
        java -jar final.jar (if you can find something output , than you are successful .)                       
                                                         
 