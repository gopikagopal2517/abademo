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
            mail to: "keerthanaskkeerthana2008@gmail.com",
                 subject: "✅ Build Success: ${env.JOB_NAME}",
                 body: "Build completed successfully!\nCheck Jenkins: ${env.BUILD_URL}"
        }

        failure {
            mail to: "keerthanaskkeerthana2008@gmail.com",
                 subject: "❌ Build Failed: ${env.JOB_NAME}",
                 body: "Build failed!\nCheck Jenkins: ${env.BUILD_URL}"
        }
    }
}
