# Skeleton of a Multi-Maven Java Project

This skeleton project comes along with the following features:

- Separation of [the aggregate and the parent POM](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html#Project_Inheritance_vs_Project_Aggregation)
- Separation of the plug-ins and the dependencies management (i.e., parent POM and [separate BOM](https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html#Importing_Dependencies))
- Specifies the version of all required plug-ins
- Java sources follow the [Maven's standard directory layout](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html)
- Enforcer rule to ensure an up-to-date Maven
- Automatic versions checks (for [parent POM](https://www.mojohaus.org/versions-maven-plugin/display-parent-updates-mojo.html), [plug-ins](https://www.mojohaus.org/versions-maven-plugin/display-plugin-updates-mojo.html), [dependencies](https://www.mojohaus.org/versions-maven-plugin/display-dependency-updates-mojo.html), and [properties](https://www.mojohaus.org/versions-maven-plugin/display-property-updates-mojo.html)) during the build process
- [Flattens the POM](https://www.mojohaus.org/flatten-maven-plugin/) of the application sub-module 

So, if this fits to you needs, get your clone and adopt everything you want to.
I suggest to alter the project's name; It probably is not named "skeleton".