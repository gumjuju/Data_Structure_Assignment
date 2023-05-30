package SuzumeGUI;

/**
 *  This enum represents the different types of components the the floor can have.
 */
public enum FloorTile {	// Inspector complains on enum not being used, which is not the case.
    /**
     * This enum-type represents the FLOOR on which the AbstractCharacters can move and drop bombs.
     */
    EMPTY_SPACES,
    /**
     * This enum-type represents the UNBREABLEBLOCKs which serves as a frame and blocks that cannot
     * be destroyed or walked over.
     */
    OBSTACLES,
    /**
     * This enum-type represents the BREABLEBLOCKs can be destroyed by bombs and potentially drop powerups.
     */
    STATIONS,
    
    FINAL_DESTINATION
}
