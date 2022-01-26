open module org.example.appserver {
    requires org.junit.jupiter;
    requires org.mockito;
    requires net.bytebuddy; //Mockito requires this
    requires org.assertj.core;
}

//open -> open up all files in this module for reflection. This is necessary for junit & mockito