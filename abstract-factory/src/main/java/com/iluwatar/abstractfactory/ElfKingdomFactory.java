package com.iluwatar.abstractfactory;

/**
 * 
 * ElfKingdomFactory concrete factory.
 * 
 */
public class ElfKingdomFactory implements KingdomFactory {

	@Override
	public Castle createCastle() {
		return new ElfCastle();
	}

	@Override
	public King createKing() {
		return new ElfKing();
	}

	@Override
	public Army createArmy() {
		return new ElfArmy();
	}

}
