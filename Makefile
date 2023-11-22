
compose:
	@docker-compose -f docker-compose.ci.yml up -d

build:
	@./gradlew clean build

run-tests:
	@./gradlew test

# Start the app
run:
	@./gradlew bootRun
