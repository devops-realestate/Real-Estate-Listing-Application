pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from the GitHub repository
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], userRemoteConfigs: [[url: 'https://YOUR_GITHUB_TOKEN@github.com/devops-realestate/Real-Estate-Listing-Application.git']]])
            }
        }

        stage('Build Docker Image') {
            steps {
                // Build the Docker image using the Dockerfile
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
                        def customImage = docker.build("your-dockerhub-username/your-image-name:latest")
                    }
                }
            }
        }

        stage('Deploy with Docker Compose') {
            steps {
                // Deploy using Docker Compose
                script {
                    sh 'docker-compose up -d'
                }
            }
        }
    }

    post {
        always {
            // Clean up (optional)
            script {
                sh 'docker-compose down'
            }
        }
    }
}
