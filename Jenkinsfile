pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK17'
    }

    environment {
        EMAIL = 'https://github.com/gopikagopal2517/abademo.git'
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/gopikagopal2517/abademo.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {

        success {
            mail to: "https://github.com/gopikagopal2517/abademo.git",
                 subject: "✅ Build Success: ${env.JOB_NAME}",
                 body: "Build completed successfully!\nCheck Jenkins: ${env.BUILD_URL}"
        }

        failure {
            mail to: "https://github.com/gopikagopal2517/abademo.git",
                 subject: "❌ Build Failed: ${env.JOB_NAME}",
                 body: "Build failed!\nCheck Jenkins: ${env.BUILD_URL}"
        }
    }
}
