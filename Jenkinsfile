pipeline {
    agent any

    stages {
        stage('Download and Install Docker Compose') {
            steps {
                script {
                    // Download Docker Compose
                    sh 'curl -L https://github.com/docker/compose/releases/download/v2.23.3/docker-compose-linux-x86_64 -o docker-compose'
                    
                    // Make it executable
                    sh 'chmod +x docker-compose'
                    
                    // Move it to a directory in the PATH
                    // args 'sudo mv docker-compose /usr/local/bin/'
                    
                    // Verify installation
                    sh 'docker-compose --version'
                }
            }
        }

        stage('Download and Install Docker Engine') {
            steps {
                script {
                    // Download Docker Engine
                    sh 'curl -L https://download.docker.com/linux/static/stable/x86_64/docker-17.03.0-ce.tgz -o docker.tgz'
                    
                    // Extract the archive
                    sh 'tar -xzvf docker.tgz'
                    
                    // Move Docker binary to a directory in the PATH
                    // args 'sudo mv docker/* /usr/local/bin/'
                    
                    // Verify installation
                    sh 'docker --version'
                    
                    // Start the Docker daemon
                    // args 'sudo dockerd &'
                    
                    // Verify Docker daemon is running
                    sh 'docker info'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Clone the repository
                    sh 'git clone https://github.com/devops-realestate/Real-Estate-Listing-Application'
                    
                    // Navigate to the repository directory
                    dir('Real-Estate-Listing-Application') {
                        // Build Docker image using docker-compose
                        sh 'docker-compose build'
                        
                        // Tag the Docker image
                        // sh 'docker tag your-image-name:latest your-docker-registry/your-image-name:latest'
                    }
                }
            }
        }
    }

    post {
        always {
            script {
                // Clean up (optional)
                sh 'rm -f docker.tgz'
            }
        }
    }
}
