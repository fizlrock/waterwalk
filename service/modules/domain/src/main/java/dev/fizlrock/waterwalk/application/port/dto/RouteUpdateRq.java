package dev.fizlrock.waterwalk.application.port.dto;

/** RouteUpdateRq */
public record RouteUpdateRq(String locationName, String oldRouteName, RouteDto route) {}
