pipeline {
    options {
        skipDefaultCheckout()
    }
 
    stages {
        stage('Build Docker Image') {
            steps {
                script {
                    def dockerCmd = "docker-compose -f docker-compose.yml build"
                    sh(script: dockerCmd, returnStatus: true)
                }
            }
        }
    }
}