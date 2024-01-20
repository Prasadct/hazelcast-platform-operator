# hazelcast-platform-operator
Simple project with Hazelcast platform operator



#1 Add the Hazelcast Helm Charts repository
helm repo add hazelcast https://hazelcast-charts.s3.amazonaws.com/
helm repo update

#2 deploy the Hazelcast Platform Operator
helm install operator hazelcast/hazelcast-platform-operator --version=5.10.0 \
    --set=installCRDs=true

#3 Operator logs
k logs deployment.apps/operator-hazelcast-platform-operator

#4 Start hazelcast
k apply -f hazelcast-smart.yaml

#5 Map configs
k apply -f map-sample.yaml

#6 Check hazel cast is running
k get hazelcast

#6 Deploy management center
k apply -f management-center.yaml
