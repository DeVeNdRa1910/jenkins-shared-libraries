def call(Sringe ImageName, String ImageTag, String credentialsId, String passwordVariable, String usernameVariable){
  withCredentials([usernamePassword(credentialsId: dockerHubCred,passwordVariable: dockerHubPass,usernameVariable: dockerHubUser)]){
      echo "start pushing Image on Docker Hub"
      sh "docker login -u ${usernameVariable} -p ${passwordVariable}"
      sh "docker tag ${ImageName}:${ImageTag} ${usernameVariable}/${ImageName}:${ImageTag}"
      sh "docker push ${usernameVariable}/${ImageName}:${ImageTag}"
      echo "Docker Image pushed on Dockerhub successfully"
    }
}
