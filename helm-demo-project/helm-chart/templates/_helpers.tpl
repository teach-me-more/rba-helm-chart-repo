{{- define "app_labels" -}}
app: helm-demo-project
env: {{.Values.app.env}}
{{- end}}