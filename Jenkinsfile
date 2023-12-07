pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                script {
                    // Path to the Docker Compose executable on the Windows machine
                    def dockerComposePath = 'C:\\Users\\I527868\\Downloads\\docker-compose\\docker-compose-windows-x86_64.exe'
                    
                    // Check if the file exists
                    if (fileExists(dockerComposePath)) {
                        // Run Docker Compose build
                        bat "\"${dockerComposePath}\" build"
                    } else {
                        error "Docker Compose not found at specified path."
                    }
                }
            }
        }
    }
}
