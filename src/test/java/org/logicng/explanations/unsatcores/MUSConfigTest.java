///////////////////////////////////////////////////////////////////////////
//                   __                _      _   ________               //
//                  / /   ____  ____ _(_)____/ | / / ____/               //
//                 / /   / __ \/ __ `/ / ___/  |/ / / __                 //
//                / /___/ /_/ / /_/ / / /__/ /|  / /_/ /                 //
//               /_____/\____/\__, /_/\___/_/ |_/\____/                  //
//                           /____/                                      //
//                                                                       //
//               The Next Generation Logic Library                       //
//                                                                       //
///////////////////////////////////////////////////////////////////////////
//                                                                       //
//  Copyright 2015-20xx Christoph Zengler                                //
//                                                                       //
//  Licensed under the Apache License, Version 2.0 (the "License");      //
//  you may not use this file except in compliance with the License.     //
//  You may obtain a copy of the License at                              //
//                                                                       //
//  http://www.apache.org/licenses/LICENSE-2.0                           //
//                                                                       //
//  Unless required by applicable law or agreed to in writing, software  //
//  distributed under the License is distributed on an "AS IS" BASIS,    //
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or      //
//  implied.  See the License for the specific language governing        //
//  permissions and limitations under the License.                       //
//                                                                       //
///////////////////////////////////////////////////////////////////////////

package org.logicng.explanations.unsatcores;

import org.junit.Assert;
import org.junit.Test;
import org.logicng.transformations.cnf.CNFConfig;

import java.util.Arrays;

/**
 * Unit tests for the class {@link MUSConfig}.
 * @version 1.1
 * @since 1.1
 */
public class MUSConfigTest {

  @Test
  public void testMUSConfiguration() {
    final MUSConfig config = new MUSConfig.Builder().algorithm(MUSConfig.Algorithm.valueOf("DELETION")).build();
    Assert.assertEquals(String.format("MUSConfig{%nalgorithm=DELETION%n}%n"), config.toString());
    Assert.assertTrue(Arrays.asList(CNFConfig.Algorithm.values()).contains(CNFConfig.Algorithm.valueOf("TSEITIN")));
  }
}
