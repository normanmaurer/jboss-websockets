package org.jboss.websockets.frame;

import org.jboss.websockets.FrameType;

/**
 * @author Mike Brock
 */
public class PingFrame extends AbstractFrame {
  private static final PingFrame INSTANCE = new PingFrame();

  private PingFrame() {
    super(FrameType.Ping);
  }

  public static PingFrame get() {
    return INSTANCE;
  }
}
