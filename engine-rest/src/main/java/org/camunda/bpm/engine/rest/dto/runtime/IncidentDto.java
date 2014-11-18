/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.engine.rest.dto.runtime;

import org.camunda.bpm.engine.runtime.Incident;

import java.util.Date;

/**
 *
 * @author Roman Smirnov
 *
 */
public class IncidentDto {

  protected String id;
  protected String processDefinitionId;
  protected String processInstanceId;
  protected String executionId;
  protected Date incidentTimestamp;
  protected String incidentType;
  protected String activityId;
  protected String causeIncidentId;
  protected String rootCauseIncidentId;
  protected String configuration;
  protected String incidentMessage;

  public String getId() {
    return id;
  }

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public String getExecutionId() {
    return executionId;
  }

  public Date getIncidentTimestamp() {
    return incidentTimestamp;
  }

  public String getIncidentType() {
    return incidentType;
  }

  public String getActivityId() {
    return activityId;
  }

  public String getCauseIncidentId() {
    return causeIncidentId;
  }

  public String getRootCauseIncidentId() {
    return rootCauseIncidentId;
  }

  public String getConfiguration() {
    return configuration;
  }

  public String getIncidentMessage() {
    return incidentMessage;
  }

  public static IncidentDto fromIncident(Incident incident) {
    IncidentDto dto = new IncidentDto();

    dto.id = incident.getId();
    dto.processDefinitionId = incident.getProcessDefinitionId();
    dto.processInstanceId = incident.getProcessInstanceId();
    dto.executionId = incident.getExecutionId();
    dto.incidentTimestamp = incident.getIncidentTimestamp();
    dto.incidentType = incident.getIncidentType();
    dto.activityId = incident.getActivityId();
    dto.causeIncidentId = incident.getCauseIncidentId();
    dto.rootCauseIncidentId = incident.getRootCauseIncidentId();
    dto.configuration = incident.getConfiguration();
    dto.incidentMessage = incident.getIncidentMessage();

    return dto;
  }

}
