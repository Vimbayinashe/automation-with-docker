module org.example.appserver {

}

/* path to App: org.example.appserver/org/example/App
 *
 * exports org.example;                 // all classes are open to public
 * exports org.example to java.base;    //all classes in org.example are open ONLY to java.base
 * requires java.sql;                   //our code requires code from java.sql when it is run
 * requires java.base;                  //is auto included by default
 */
