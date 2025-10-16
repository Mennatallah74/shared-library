#!/user/bin/env groovy
def call() {
    echo "building the application... on branch $BRANCH_NAME"
    sh 'node app.js'
}
