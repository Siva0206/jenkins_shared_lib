def call(String artifactory) {
    sh """
        ls -lrht
        curl -X PUT -u "admin":"Nokia?123" -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://${artifactory}:8082/artifactory/example-repo-local
    """
}