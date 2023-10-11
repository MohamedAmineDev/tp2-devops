pipeline{
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage("Clean up the project"){
          steps{
            deleteDir()
          }  
        }
        stage("Clone the project"){
          steps{
            sh "git clone https://github.com/MohamedAmineDev/tp2-devops.git"
          }  
        }
        stage("Create the app image"){
          steps{
            dir("tp2-devops"){
                sh "maven clean install"
                sh "docker build -t spring-devops-app-tp-2 ."
            }
          }  
        }
        stage("Launch the app"){
          steps{
            dir("tp2-devops"){
                sh "docker compose up"
            }
          }  
        }
        stage("Wait for 10 seconds"){
          steps{
            dir("tp2-devops"){
                sh "sleep 10"
            }
          }  
        }
        stage("Close the app"){
          steps{
            dir("tp2-devops"){
                sh "docker compose down"
            }
          }  
        }
    }
}