/*
* Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
* except in compliance with the License. A copy of the License is located at
*
* http://aws.amazon.com/apache2.0/
*
* or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
* the specific language governing permissions and limitations under the License.
*/


package com.amazon.ask.smapi.model.v1.skill.evaluations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Slot
 */

@JsonDeserialize(builder = Slot.Builder.class)
public final class Slot {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("value")
    private String value = null;

    @JsonProperty("confirmationStatus")
    private com.amazon.ask.smapi.model.v1.skill.evaluations.ConfirmationStatusType confirmationStatus = null;

    @JsonProperty("resolutions")
    private com.amazon.ask.smapi.model.v1.skill.evaluations.SlotResolutions resolutions = null;

    public static Builder builder() {
        return new Builder();
    }

    private Slot(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.value != null) {
            this.value = builder.value;
        }
        if (builder.confirmationStatus != null) {
            this.confirmationStatus = builder.confirmationStatus;
        }
        if (builder.resolutions != null) {
            this.resolutions = builder.resolutions;
        }
    }

    /**
     * Get name
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Get value
     * @return value
    **/
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Get confirmationStatus
     * @return confirmationStatus
    **/
    @JsonProperty("confirmationStatus")
    public com.amazon.ask.smapi.model.v1.skill.evaluations.ConfirmationStatusType getConfirmationStatus() {
        return confirmationStatus;
    }

    /**
     * Get resolutions
     * @return resolutions
    **/
    @JsonProperty("resolutions")
    public com.amazon.ask.smapi.model.v1.skill.evaluations.SlotResolutions getResolutions() {
        return resolutions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Slot v1SkillEvaluationsSlot = (Slot) o;
        return Objects.equals(this.name, v1SkillEvaluationsSlot.name) &&
            Objects.equals(this.value, v1SkillEvaluationsSlot.value) &&
            Objects.equals(this.confirmationStatus, v1SkillEvaluationsSlot.confirmationStatus) &&
            Objects.equals(this.resolutions, v1SkillEvaluationsSlot.resolutions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, confirmationStatus, resolutions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Slot {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    confirmationStatus: ").append(toIndentedString(confirmationStatus)).append("\n");
        sb.append("    resolutions: ").append(toIndentedString(resolutions)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
  
    public static class Builder {
        private String name;
        private String value;
        private com.amazon.ask.smapi.model.v1.skill.evaluations.ConfirmationStatusType confirmationStatus;
        private com.amazon.ask.smapi.model.v1.skill.evaluations.SlotResolutions resolutions;

        private Builder() {}

        @JsonProperty("name")
        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("value")
        public Builder withValue(String value) {
            this.value = value;
            return this;
        }


        @JsonProperty("confirmationStatus")
        public Builder withConfirmationStatus(com.amazon.ask.smapi.model.v1.skill.evaluations.ConfirmationStatusType confirmationStatus) {
            this.confirmationStatus = confirmationStatus;
            return this;
        }


        @JsonProperty("resolutions")
        public Builder withResolutions(com.amazon.ask.smapi.model.v1.skill.evaluations.SlotResolutions resolutions) {
            this.resolutions = resolutions;
            return this;
        }


        public Slot build() {
            return new Slot(this);
        }
    }
}

