all: build

compose:
	@docker-compose -f docker-compose.ci.yml up -d

build:
	@./gradlew build --warning-mode all

run-tests:
	@./gradlew test --warning-mode all

# Start the app
run:
	@./gradlew bootRun
