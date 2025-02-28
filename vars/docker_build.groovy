def docker_build(String ImageName, String ImageTag){
  echo "Start building image"
  sh "docker build -t ${ImageName}:${ImageTag}"
  echo "Docker image built successsfully"
}
