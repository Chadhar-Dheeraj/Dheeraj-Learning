pipeline {
    agent any

    stages {
        stage('Hello World') {
            steps {
                echo 'Hello, World! New 123 > Demo TO Vainik > Jenkins Pipeline is Working!'
            }
        }
    }

    post {
        always {
            echo 'Pipeline Execution Finished.'
        }
    }
}
