set projectLocation=C:\Users\***\IdeaProjects\junittestNGexample
cd %projectLocation%
set classpath=C:\Maven\apache-maven-3.5.2\mvnRepo\org\testng\testng\6.11\testng-6.11.jar;%projectLocation%\target\test-classes;C:\Maven\apache-maven-3.5.2\mvnRepo\com\beust\jcommander\1.64\jcommander-1.64.jar;
java org.testng.TestNG testng.xml