pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout code from the GitHub repository
                git branch: 'main', url: 'https://github.com/devops-realestate/Real-Estate-Listing-Application'
            }
        }
        
        stage('Build') {
            steps {
                // Run Docker Compose build
                script {
                    // Assuming docker-compose.yml is in the root directory of the repository
                    sh 'docker-compose build'
                }
            }
        }
    }
}
