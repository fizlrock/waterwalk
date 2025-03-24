package dev.fizlrock.waterwalk.application.port.dto;

/** RouteDto */
public record RouteDto(
    String id,
    String name,
    String comment,
    int distance,
    String difficulty,
    int duration,
    int price) {}
