rojoma-json-grisu
=================

This is an extension for
[rojoma-json](https://github.com/rjmac/rojoma-json) to use
[grisu-scala](https://github.com/rjmac/grisu-scala) to serialize
`JNumber`s which contain`Double`s.  To use it, simply ensure the jar
is on the classpath at startup.  rojoma-json will detect (via the Java
service provider interface system) and use it.

The following code will verify it has been loaded properly:
```scala
import com.rojoma.json.v3.extensions.DoubleWriter
import com.rojoma.json.v3.grisu.GrisuDoubleWriter

if(DoubleWriter.doubleWriter.isInstanceOf[GrisuDoubleWriter])
  println("Using GrisuDoubleWriter")
else
  println("Not using GrisuDoubleWriter")
```

It is published on Maven central, so setting up SBT is as simple as

```scala
libraryDependencies += "com.rojoma" %% "rojoma-json-v3-grisu" % "1.0.0"
```

While for Maven, the pom snippet is:

```xml
<dependencies>
  <dependency>
    <groupId>com.rojoma</groupId>
    <artifactId>rojoma-json-v3-grisu_${scala.version}</artifactId>
    <version>1.0.0</version>
  </dependency>
</dependencies>
```

rojoma-json-v3-grisu is published for Scala version 2.10 and 2.11.
