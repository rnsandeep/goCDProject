docker build .
echo ${GO_PIPELINE_LABEL}
docker tag httpakka:latest nagasandeep/httpakkaproject:${GO_PIPELINE_LABEL}
docker image ls
