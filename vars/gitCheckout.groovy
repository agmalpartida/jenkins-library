def call(Map stageParams) {

    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ credentials: stageParams.credentialsId, url: stageParams.url ]]
    ])
  }
