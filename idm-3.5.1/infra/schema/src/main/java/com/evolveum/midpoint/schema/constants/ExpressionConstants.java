/*
 * Copyright (c) 2010-2013 Evolveum
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.evolveum.midpoint.schema.constants;

import javax.xml.namespace.QName;

/**
 * @author semancik
 *
 */
public class ExpressionConstants {

	public static final QName VAR_INPUT = new QName(SchemaConstants.NS_C, "input");
	public static final QName VAR_FOCUS = new QName(SchemaConstants.NS_C, "focus");
	public static final QName VAR_USER = new QName(SchemaConstants.NS_C, "user");
	public static final QName VAR_ACCOUNT = new QName(SchemaConstants.NS_C, "account");
	public static final QName VAR_PROJECTION = new QName(SchemaConstants.NS_C, "projection");
	public static final QName VAR_SHADOW = new QName(SchemaConstants.NS_C, "shadow");
	public static final QName VAR_SOURCE = new QName(SchemaConstants.NS_C, "source");
	
	/**
	 * The magic assignment variable. It will be always set to a value. Its value is basically the assignment that is the source of the assignment/incudement chain (usually user assignment). However, it is enriched by the values from the other inducements and roles along the chain. Extension part of this magic data structure contains values compiled from the whole chain. The value that is closer to focus (e.g. closer to user) overrides all the values that are further away along the chain.
	 */
	public static final QName VAR_ASSIGNMENT = new QName(SchemaConstants.NS_C, "assignment");
	
	/**
	 * The assignment or inducement that is right in front of thisAssignment in the assignment/inducement chain.
	 */
	public static final QName VAR_IMMEDIATE_ASSIGNMENT = new QName(SchemaConstants.NS_C, "immediateAssignment");
	
	/**
	 * The assignment or inducement that contains the construction.
	 * TODO: is this correct?
	 */
	public static final QName VAR_THIS_ASSIGNMENT = new QName(SchemaConstants.NS_C, "thisAssignment");
	
	/**
	 * The assignment contained in the focus object (e.g. in a user). This is the "primary" assignment, the source of the whole assignment/inducement chain.
	 */
	public static final QName VAR_FOCUS_ASSIGNMENT = new QName(SchemaConstants.NS_C, "focusAssignment");
	
	/**
	 * The role that is right in front of thisAssignment in the assignment/inducement chain.
	 */
	public static final QName VAR_IMMEDIATE_ROLE = new QName(SchemaConstants.NS_C, "immediateRole");
	
	/**
	 * The role that contains the expression.
	 */
	public static final QName VAR_CONTAINING_OBJECT = new QName(SchemaConstants.NS_C, "containingObject");
	
	/**
	 * TODO: ????
	 */
	public static final QName VAR_THIS_OBJECT = new QName(SchemaConstants.NS_C, "thisObject");
	
	public static final QName VAR_OPERATION = new QName(SchemaConstants.NS_C, "operation");
	public static final QName VAR_RESOURCE = new QName(SchemaConstants.NS_C, "resource");
	public static final QName VAR_MODEL_CONTEXT = new QName(SchemaConstants.NS_C, "modelContext");
	public static final QName VAR_PRISM_CONTEXT = new QName(SchemaConstants.NS_C, "prismContext");
	public static final QName VAR_CONFIGURATION = new QName(SchemaConstants.NS_C, "configuration");
    public static final QName VAR_ACTOR = new QName(SchemaConstants.NS_C, "actor");
	public static final QName VAR_VALUE = new QName(SchemaConstants.NS_C, "value");

	public static final QName VAR_LEGAL = new QName(SchemaConstants.NS_C, "legal");
    public static final QName VAR_ASSIGNED = new QName(SchemaConstants.NS_C, "assigned");
	public static final QName VAR_FOCUS_EXISTS = new QName(SchemaConstants.NS_C, "focusExists");
	public static final QName VAR_ADMINISTRATIVE_STATUS = new QName(SchemaConstants.NS_C, "administrativeStatus");
	
	public static final QName VAR_ASSOCIATION_TARGET_OBJECT_CLASS_DEFINITION = new QName(SchemaConstants.NS_C, "associationTargetObjectClassDefinition");
	
	/**
	 * Numeric value describing the current iteration. It starts with 0 and increments on every iteration.
	 * Iterations are used to find unique values for an account, to resolve naming conflicts, etc.
	 */
	public static final QName VAR_ITERATION = new QName(SchemaConstants.NS_C, "iteration");
	
	/**
	 * String value describing the current iteration. It is usually suffix that is appended to the username
	 * or a similar "extension" of the value. It should have different value for every iteration. The actual
	 * value is determined by the iteration settings.
	 */
	public static final QName VAR_ITERATION_TOKEN = new QName(SchemaConstants.NS_C, "iterationToken");
	
	// Variables used in object mergign expressions
	public static final QName VAR_SIDE = new QName(SchemaConstants.NS_C, "side");
	public static final QName VAR_OBJECT_LEFT = new QName(SchemaConstants.NS_C, "objectLeft");
	public static final QName VAR_OBJECT_RIGHT = new QName(SchemaConstants.NS_C, "objectRight");
	
	public static final QName OUTPUT_ELMENT_NAME = new QName(SchemaConstants.NS_C, "output");
	
}