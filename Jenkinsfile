pipeline {
    agent {
        docker {
            // Use the Docker image with Docker installed
            image 'docker:latest'
        }
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    checkout scm
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Build Docker image using Dockerfile
                    def imageName = "my-real-estate-app:latest"
                    sh "docker build -t ${imageName} ."
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    // Push Docker image to a registry (replace 'your-registry' with your actual registry)
                    def registryUrl = "your-registry.com"
                    def imageName = "my-real-estate-app:latest"
                    sh "docker tag ${imageName} ${registryUrl}/${imageName}"
                    sh "docker push ${registryUrl}/${imageName}"
                }
            }
        }
    }

    post {
        always {
            // Cleanup: Remove local Docker image after build and push
            script {
                def imageName = "my-real-estate-app:latest"
                sh "docker rmi ${imageName}"
            }
        }
    }
}
