pipelines{
agent any
maven 'maven'
stages{
stage('Cleaning up The project'){
    steps{
    DeleteDir()
    }
}
stage('Cloning The repo'){
    steps{
    sh 'git clone https://github.com/MohamedAmineDev/tp2-devops.git'
    }
}
stage('Generate the image spring-devops-app-tp-2'){
    steps{
    dir('tp2-devops'){
    sh 'docker build -t spring-devops-app-tp-2 .'
    }
    }
}
stage('Cleaning '){
    steps{
    dir('tp2-devops'){
    sh 'maven clean install'
    sh 'docker build -t spring-devops-app-tp-2 .'
    }
    }
}
stage('Starting the app'){
    steps{
    dir('tp2-devops'){
    sh 'docker compose up'
    }
    }
}
stage('Waiting 20 seconds'){
    steps{
    dir('tp2-devops'){
    sh 'sleep 5'
    }
    }
}
stage('Close the app'){
    steps{
    dir('tp2-devops'){
    sh 'docker compose down'
    }
    }
}

}
}