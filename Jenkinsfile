pipeline {
    agent any

    stages {
        stage('Hello World') {
            steps {
                echo 'Hello, World! New 123 > Dheeraj Test 123 > Jenkins Pipeline is Working!'
            }
        }
    }

    post {
        always {
            echo 'Pipeline Execution Finished.'
        }
    }
}
