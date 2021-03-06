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


package com.amazon.ask.smapi.model.v1.skill;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Describes the status of a build step.
 */

@JsonDeserialize(builder = BuildStep.Builder.class)
public final class BuildStep {

    @JsonProperty("name")
    private com.amazon.ask.smapi.model.v1.skill.BuildStepName name = null;

    @JsonProperty("status")
    private com.amazon.ask.smapi.model.v1.skill.Status status = null;

    @JsonProperty("errors")
    private List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> errors = new ArrayList<com.amazon.ask.smapi.model.v1.skill.StandardizedError>();

    public static Builder builder() {
        return new Builder();
    }

    private BuildStep(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.errors != null) {
            this.errors = builder.errors;
        }
    }

    /**
     * Get name
     * @return name
    **/
    @JsonProperty("name")
    public com.amazon.ask.smapi.model.v1.skill.BuildStepName getName() {
        return name;
    }

    /**
     * Get status
     * @return status
    **/
    @JsonProperty("status")
    public com.amazon.ask.smapi.model.v1.skill.Status getStatus() {
        return status;
    }

    /**
     * Get errors
     * @return errors
    **/
    @JsonProperty("errors")
    public List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> getErrors() {
        return errors;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BuildStep v1SkillBuildStep = (BuildStep) o;
        return Objects.equals(this.name, v1SkillBuildStep.name) &&
            Objects.equals(this.status, v1SkillBuildStep.status) &&
            Objects.equals(this.errors, v1SkillBuildStep.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildStep {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.BuildStepName name;
        private com.amazon.ask.smapi.model.v1.skill.Status status;
        private List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> errors;

        private Builder() {}

        @JsonProperty("name")
        public Builder withName(com.amazon.ask.smapi.model.v1.skill.BuildStepName name) {
            this.name = name;
            return this;
        }


        @JsonProperty("status")
        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.Status status) {
            this.status = status;
            return this;
        }


        @JsonProperty("errors")
        public Builder withErrors(List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> errors) {
            this.errors = errors;
            return this;
        }

        public Builder addErrorsItem(com.amazon.ask.smapi.model.v1.skill.StandardizedError errorsItem) {
            if (this.errors == null) {
                this.errors = new ArrayList<com.amazon.ask.smapi.model.v1.skill.StandardizedError>();
            }
            this.errors.add(errorsItem);
            return this;
        }

        public BuildStep build() {
            return new BuildStep(this);
        }
    }
}

