# Github Packages Gradle example

An example project that uses Github Packages repository
with credentials read from the hub configuration file.

## Running

    $ ./gradlew run

## Publishing

Set up [hub](https://hub.github.com/) or put your Github
username and access token as to `gradle.properties`:

    githubPackages.username=<username>
    githubPackages.accessToken=<token>

You can set the repository to be any repository you have
access to. Note that once you upload a package/version,
you can not reuse it within the same user/organization even
if you delete it!

Publishing can be done with the usual `maven-publish` tasks:

    $ ./gradlew publish
