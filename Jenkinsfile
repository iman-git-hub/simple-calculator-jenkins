pipeline {
    agent any
    
    tools {
		jdk 'JDK 25'
		maven 'Maven-3.10'
	}

    stages {
        stage('SCM Synchronization') {
            steps {
                echo 'Pulling latest code changes from Git repository...'
                checkout scm
            }
        }

        stage('Static Verification') {
            steps {
                echo 'Checking Maven project layout rules...'
                bat '"C:\\Users\\Student-A\\Downloads\\apache-maven-3.10.0-bin (1)\\apache-maven-3.10.0\\bin\\mvn.cmd" validate'
            }
        }

        stage('Compilation & Automated Testing') {
            steps {
                echo 'Compiling project and running automated tests...'
                bat '"C:\\Users\\Student-A\\Downloads\\apache-maven-3.10.0-bin (1)\\apache-maven-3.10.0\\bin\\mvn.cmd" clean package'
            }
            post {
                always {
                    echo 'Publishing unit test reports to Jenkins...'
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }

    post {
        success {
            echo 'CI Pipeline completed successfully. Code stability confirmed.'
        }
        failure {
            echo 'CI Pipeline failed. Check the console output for errors.'
        }
    }
}
