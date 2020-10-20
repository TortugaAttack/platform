/**
 * This file is part of platform-controller.
 *
 * platform-controller is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * platform-controller is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with platform-controller.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.hobbit.controller.docker;

/**
 * Created by Timofey Ermilov on 01/09/16.
 */
public class ContainerTerminationCallbackImpl implements ContainerTerminationCallback {
    public String containerId;
    public long exitCode;

    @Override
    public void notifyTermination(String containerId, long exitCode) {
        this.containerId = containerId;
        this.exitCode = exitCode;
    }
}
