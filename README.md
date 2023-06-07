<p align="right">
  <a href="https://masterminds.github.io/stability/experimental.html">
    <img src="https://masterminds.github.io/stability/experimental.svg">
  </a>
</p>

# openehr-base-java

This repository contains the Java interface types for the openEHR [BASE specifications](https://specifications.openehr.org/releases/BASE).

## Overview

TBD

## Usage

The packages are published to GitHub Packages.
So, even though the packages are publicly available, clients that want to apply package need a GitHub access token with the "read:packages" scope.
How to create such an access token is described here: [docs.github.com](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token).

### Maven

```xml
<dependency>
  <groupId>com.experimental-software.java-api</groupId>
  <artifactId>openehr-base-foundation-types</artifactId>
  <version>1.2.0-alpha-1</version>
</dependency>
```

### Gradle

The GitHub access token should be registered in the global Gradle properties, e.g.:

`~/.gradle/gradle.properties`:

```text
gpr.user=jdoe
gpr.key=ghp_**********************************
```

After the configuration of the GitHub Maven repository, the  

`build.gradle`:

```groovy
repositories {
    maven {
        url = uri('https://maven.pkg.github.com/openehr-java-api/openehr-base-java')
        credentials {
            username = project.findProperty('gpr.user')
            password = project.findProperty('gpr.key')
        }
    }
}

dependencies {
    implementation 'com.experimental-software.java-api:openehr-base-foundation-types:1.2.0-alpha-1'
}
```

**Also see**

- [Working with the Gradle registry | docs.github.com](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry)

## Development

### Publish to Maven Local

```
./gradlew publishToMavenLocal
find ~/.m2/repository/com/experimental-software
```

## Maintenance

### Publish to GitHub Packages

The packages are automatically published after the creation of a new GitHub release.

## References

- https://specifications.openehr.org/releases/BASE
- https://github.com/openEHR/specifications-BASE
