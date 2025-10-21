# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Minecraft Fabric mod for version 1.21.9 called "Enchantment Rarities". The project uses:
- Java 21 (required for build)
- Fabric Loader 0.16.14
- Fabric API 0.131.0+1.21.9
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
- `src/main/java/top/cfti/enchantmentrarities/EnchantmentRarities.java` - Main mod initialization class
- `src/client/java/top/cfti/enchantmentrarities/EnchantmentRaritiesClient.java` - Client-side initialization
- `src/main/resources/fabric.mod.json` - Mod metadata and configuration
- `src/main/resources/enchantment-rarities.mixins.json` - Server-side Mixin configuration
- `src/client/resources/enchantment-rarities.client.mixins.json` - Client-side Mixin configuration

### Mixin System
The project uses Fabric's Mixin framework for code injection:
- Main mixins in `top.cfti.enchantmentrarities.mixin` package
- Client mixins in `top.cfti.enchantmentrarities.mixin.client` package
- Both require Java 21 compatibility level

### Key Configuration Files
- `gradle.properties` - Contains version information for Minecraft, Fabric, and the mod
- `build.gradle` - Gradle build configuration with Fabric Loom plugin
- `settings.gradle` - Gradle project settings with Fabric Maven repository

## Development Notes

- The mod ID is "enchantment-rarities"
- Main package: `top.cfti.enchantmentrarities`
- Uses SLF4J for logging via `EnchantmentRarities.LOGGER`
- Split environment setup allows separate client and server code
- Fabric Loom provides Minecraft development environment and mappings
