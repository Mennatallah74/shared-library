#!/user/bin/env groovy
def call() {
    echo 'building the docker image...'
    withCredentials([usernamePassword(credentialsId: 'docker-secrets', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t menna213/demo-app:3.0 .'
        sh 'echo $PASS | docker login -u $USER --password-stdin'
        sh 'docker push menna213/demo-app:3.0'
    }
}
