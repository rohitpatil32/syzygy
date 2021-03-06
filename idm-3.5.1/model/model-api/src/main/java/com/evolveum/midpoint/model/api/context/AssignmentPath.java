/*
 * Copyright (c) 2010-2016 Evolveum
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

package com.evolveum.midpoint.model.api.context;

import com.evolveum.midpoint.util.DebugDumpable;
import com.evolveum.midpoint.xml.ns._public.common.common_3.ObjectType;

import java.util.List;

/**
 * @author semancik
 * @author mederly
 */
public interface AssignmentPath extends DebugDumpable {
	List<? extends AssignmentPathSegment> getSegments();

	AssignmentPathSegment getFirstAssignmentSegment();

	boolean isEmpty();

	int size();

	EvaluationOrder getEvaluationOrder();

	AssignmentPathSegment last();

	boolean containsTarget(ObjectType target);
}
