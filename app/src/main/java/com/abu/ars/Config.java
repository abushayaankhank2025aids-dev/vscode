package com.abu.ars;

/**
 * Centralized configuration for the ARS application.
 * Update the BASE_URL when ngrok is restarted.
 */
public class Config {
    // The public ngrok URL pointing to the backend laptop (http://localhost:5000)
    public static final String BASE_URL = "https://defile-blip-snowbird.ngrok-free.dev";
    
    // API Endpoints
    public static final String SOS_ENDPOINT = BASE_URL + "/sos";
    
    // Add other endpoints here if needed in the future
    // public static final String RESCUER_LOCATIONS = BASE_URL + "/rescuer-locations";
    // public static final String ASSIGNMENTS = BASE_URL + "/assignments";
}
