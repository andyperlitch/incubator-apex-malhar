/*
 *  Copyright (c) 2012 Malhar, Inc.
 *  All Rights Reserved.
 */
package com.malhartech.demos.mobile;

import com.malhartech.demos.mobile.Application;
import com.malhartech.stram.StramLocalCluster;
import org.apache.hadoop.conf.Configuration;
import org.junit.Test;


public class ApplicationTest
{
  public ApplicationTest()
  {
  }

  /**
   * Test of getApplication method, of class Application.
   */
  @Test
  public void testGetApplication() throws Exception
  {
    Application app = new Application();
    StramLocalCluster lc = new StramLocalCluster(app.getApplication(new Configuration(false)));
    //lc.setHeartbeatMonitoringEnabled(false);
    lc.run();
  }
}
