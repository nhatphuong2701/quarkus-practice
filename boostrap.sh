mvn -U io.quarkus:quarkus-maven-plugin:create \
        -DprojectGroupId=org.acme \
        -DprojectArtifactId=code-with-quarkus \
        -DclassName="org.acme.GreetingResource" \
        -Dpath="/api/hello" \
        -Dextensions="resteasy-jsonb"