pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK17'
    }

    environment {
        EMAIL = 'keerthanaskkeerthana2008@gmail.com'
    }

    stages {

        stage('Checkout') {
            steps {
                git credentialsId: 'github-creds',
                    branch: 'master',
                    url: 'https://github.com/gopikagopal2517/abademo.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }

    post {

        success {
            mail to: "${EMAIL}",
                 subject: "✅ Build Success: ${env.JOB_NAME}",
                 body: "Build completed successfully!\nCheck Jenkins: ${env.BUILD_URL}"
        }

        failure {
            mail to: "${EMAIL}",
                 subject: "❌ Build Failed: ${env.JOB_NAME}",
                 body: "Build failed!\nCheck Jenkins: ${env.BUILD_URL}"
        }
    }
}
