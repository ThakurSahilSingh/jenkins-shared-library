// vars/commonBuild.groovy
def call() {
    stage('Checkout') {
        echo "skip checkout scm"
    }

    stage('Unit Tests') {
        echo 'Running unit tests...'
        sh './gradlew test'  
    }

    stage('Deploy') {
        echo 'Deploying to environment...'
       
    }
}

