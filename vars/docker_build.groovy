def docker_build(String ImageName, String ImageTag, String DockerHubUserName){
  echo "Start building image"
  sh "docker build -t ${DockerHubUserName}/${ImageName}:${ImageTag}"
  echo "Docker image built successsfully"
}
