pipeline {
    agent any
    
    stages {
        stage('Install Docker Compose') {
            steps {
                script {
                    // Install Docker Compose inside the Jenkins Docker container
                    sh 'apk update && apk add docker-compose'  // Adjust for the package manager used in your Jenkins container
                }
            }
        }
        
        stage('Build') {
            steps {
                script {
                    sh 'docker-compose build'
                }
            }
        }
    }
}
