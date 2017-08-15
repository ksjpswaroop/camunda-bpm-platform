/**
 * Copyright (C) 2017 camunda services GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.integrationtest.functional.cdi.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import java.util.ArrayList;

/**
 * @author Tassilo Weidner
 */
@Named
@Dependent
public class DependentScopedBean {

  public static ArrayList<String> lifecycle = new ArrayList<String>();

  public void invoke() {
    lifecycle.add("bean-invoked");
  }

  public static void reset() {
    lifecycle.clear();
  }

  @PreDestroy
  public void preDestroy() {
    lifecycle.add("pre-destroy-invoked");
  }

  @PostConstruct
  public void postContruct() {
    lifecycle.add("post-construct-invoked");
  }

}