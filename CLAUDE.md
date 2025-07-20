# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Minecraft Fabric mod for version 1.21.7 called "Better Enchant Names". The project uses:
- Java 21 (required for build)
- Fabric Loader 0.16.14
- Fabric API 0.129.0+1.21.7
- Fabric Loom 1.11-SNAPSHOT for building

## Build Commands

**Important**: This project requires Java 21 to build. The Gradle wrapper will fail with Java 17 or earlier.

- `./gradlew build` - Build the mod JAR
- `./gradlew runClient` - Run Minecraft client with the mod for testing
- `./gradlew runServer` - Run Minecraft server with the mod for testing
- `./gradlew clean` - Clean build artifacts
- `./gradlew publish` - Publish to configured Maven repository

## Project Structure

The mod follows Fabric's standard structure with split environments:

### Main Components
- `src/main/java/top/cfti/betterenchantnames/BetterEnchantNames.java` - Main mod initialization class
- `src/client/java/top/cfti/betterenchantnames/BetterEnchantNamesClient.java` - Client-side initialization
- `src/main/resources/fabric.mod.json` - Mod metadata and configuration
- `src/main/resources/better-enchant-names.mixins.json` - Server-side Mixin configuration
- `src/client/resources/better-enchant-names.client.mixins.json` - Client-side Mixin configuration

### Mixin System
The project uses Fabric's Mixin framework for code injection:
- Main mixins in `top.cfti.betterenchantnames.mixin` package
- Client mixins in `top.cfti.betterenchantnames.mixin.client` package
- Both require Java 21 compatibility level

### Key Configuration Files
- `gradle.properties` - Contains version information for Minecraft, Fabric, and the mod
- `build.gradle` - Gradle build configuration with Fabric Loom plugin
- `settings.gradle` - Gradle project settings with Fabric Maven repository

## Development Notes

- The mod ID is "better-enchant-names"
- Main package: `top.cfti.betterenchantnames`
- Uses SLF4J for logging via `BetterEnchantNames.LOGGER`
- Split environment setup allows separate client and server code
- Fabric Loom provides Minecraft development environment and mappings