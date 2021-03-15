/**
 * 
 */
package io.gullynetwork.parkinglot.model.strategy;

/**
 * @author vaibhav
 *
 */
public interface ParkingStrategy
{
	public void add(int i);
	
	public int getSlot();
	
	public void removeSlot(int slot);
}
