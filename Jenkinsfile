pipeline {
    agent any
    
    stages {
        stage('Install Docker Compose') {
            steps {
                script {
                    // Download Docker Compose binary
                    sh 'curl -L "https://github.com/docker/compose/releases/download/latest/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose'
                    
                    // Give execute permissions to the downloaded binary
                    sh 'chmod +x C:/Users/I527868/Downloads/docker-compose'
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
