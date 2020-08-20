package com.park.parkingmanagment.response;

public class EntityNotFoundException extends ParkingExceptions {

    private static final long serialVersionUID = 1L;

    private final String identifier;

    public EntityNotFoundException(final String identifier, final String args) {
        super(args,identifier);
        this.identifier = identifier;
    }

    @Override
    public String getIdentifier() {
        return this.identifier;
    }

}
