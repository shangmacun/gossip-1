/**
    This file is part of the Java Gossip Cluster Framework.

    The Java Gossip Framework is free software: you can redistribute it and/or modify
    it under the terms of the Lesser GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    The Java Gossip Framework is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this framework.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.geertvos.gossip.api.cluster;

/**
 * @author Geert Vos
 */
public interface ClusterMember {

	/**
	 * The unique id of this member in the cluster.
	 * @return
	 */
	public String getId();
	
	/**
	 * The hostname on which the member can be reached.
	 * @return
	 */
	public String getHost();
	
	/**
	 * The port number on which this cluster member can be reached.
	 * @return
	 */
	public int getPort();
	
	/**
	 * Timestamp of when this member was last seen. (local to the member)
	 * @return
	 */
	public long getLastSeenOnline();
	
	/**
	 * Get any meta data that might have been provided for this member.
	 * @param key The key of a key value pair.
	 * @return The value or null if not found
	 */
	public String getMetaData(String key);

}
