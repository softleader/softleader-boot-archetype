# Softleader Boot Archetype

Maven Archetype，可基於此 `archetype` 建立 Softleader Boot 應用

### 安裝方式
```
mvn clean install
```

### 使用方式
```$
mvn archetype:generate
-DarchetypeGroupId=tw.com.softleader.archetype \
-DarchetypeArtifactId=softleader-boot-archetype \
-DarchetypeVersion=1.0-SNAPSHOT \
-DgroupId=<你的專案 groupId> \
-DartifactId=<你的專案 artifactId> \
-Dversion=<你的專案 version> \
-DinteractiveMode=false # 交互模式：預設為 true
```
