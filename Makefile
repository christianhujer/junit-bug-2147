.PHONY: all
all:
	./mvnw clean && ./mvnw verify

-include User.mk
-include ~/User.mk
