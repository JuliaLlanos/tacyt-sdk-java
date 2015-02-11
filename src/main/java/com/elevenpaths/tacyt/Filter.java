/*Path5 Java SDK - Set of  reusable classes to  allow developers integrate Path5 on their applications.
Copyright (C) 2013 Eleven Paths

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 2.1 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA*/

package com.elevenpaths.tacyt;

import java.util.List;

public class Filter {

    public static class Rule{

        private int weight;
        private String content;

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public Rule(int weight, String content) {
            this.weight = weight;
            this.content = content;
        }
    }

    public enum Visibility {
        PUBLIC, PRIVATE;

        public static Visibility getDefault() {
            return PRIVATE;
        }

        public String toString() {
            return super.toString().toUpperCase();
        }
    }

    private String id;
    private String appId;
    private String user;
    private String name;
    private String description;
    private String alias;
    private int weight;
    private Visibility visibility = Visibility.getDefault();
    private List<Rule> rules;
    private int numberOfSubscriptions;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public String getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    public int getNumberOfSubscriptions() {
        return numberOfSubscriptions;
    }

    public void setNumberOfSubscriptions(int numberOfSubscriptions) {
        this.numberOfSubscriptions = numberOfSubscriptions;
    }

    public Filter() {}

    public Filter(String id) {
        this.id = id;
    }

    public Filter(String id, String name, String description, int weight, Visibility visibility, List<Rule> rules) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.visibility = visibility;
        this.rules = rules;
        this.numberOfSubscriptions = 0;
    }

    public Filter(String name, String description, int weight, Visibility visibility, List<Rule> rules) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.visibility = visibility;
        this.rules = rules;
        this.numberOfSubscriptions = 0;
    }
}