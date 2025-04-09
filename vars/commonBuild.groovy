// vars/commonBuild.groovy
def call() {
    stage('Checkout') {
        echo "skip checkout scm"
    }

    stage('Unit Tests') {
        echo 'Running unit tests...'
    
    }

    stage('Deploy') {
        echo 'Deploying to environment...'
       
    }
}

