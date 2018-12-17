pipeline {
    agent any
    triggers { cron('H */4 * * 1-5') }
    stages {
        stage('build') {
            steps {
                bat 'gradle clean build -x test'
            }
        }
        stage('test') {
            steps {
                bat 'gradle test'
            }
            post {
                always {
                    publishHTML([
                        allowMissing: false,
                        alwaysLinkToLastBuild: true,
                        keepAll: false,
                        reportDir: 'build/reports/tests/test',
                        reportFiles: 'index.html',
                        reportName: 'Resultado de los Test',
                        reportTitles: ''])
                }
            }
        }
        stage('sonar') {
            steps {
                script {
                     scannerHome = tool 'SonarQube 3.2';
                }
                withSonarQubeEnv('SonarQube') {
                      bat "\"${scannerHome}/bin/sonar-scanner.bat\""
                }
            }
        }
    }
}