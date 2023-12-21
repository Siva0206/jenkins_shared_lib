def call(String artifactory) {
    sh """
        mvn clean install -D skipTests
        pwd
        cd Java_app_3.0/target
        curl -X PUT -u admin -p "Nokia?123" -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://${artifactory}:8082/artifactory/example-repo-local
    """
}