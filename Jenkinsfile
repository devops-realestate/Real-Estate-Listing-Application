pipeline {
    agent any

    stages {
        stage('Download Docker Image') {
            steps {
                script {
                    // Download a Docker image with Docker CLI
                    sh 'docker pull docker:latest'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Clone the repository
                    sh 'git clone https://github.com/devops-realestate/Real-Estate-Listing-Application'

                    // Move into the repository directory
                    sh 'cd Real-Estate-Listing-Application'

                    // Build the Docker image using Dockerfile and docker-compose.yml
                    sh 'docker build -t my-real-estate-app:latest .'
                }
            }
        }
    }
}
