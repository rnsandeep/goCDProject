set -ex
project=my-chart
helm install --wait --set version=$GO_PIPELINE_LABEL $project ops/helm --timeout 300s --values ops/helm/values.yaml
sleep 30
export POD_NAME=$(kubectl get pods --namespace default -l "app.kubernetes.io/name=bootcamp,app.kubernetes.io/instance=$project" -o jsonpath="{.items[0].metadata.name}")
