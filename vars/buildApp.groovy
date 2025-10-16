#!/user/bin/env groovy
def call() {
    echo 'building the application...'
    sh 'node app.js'
}
