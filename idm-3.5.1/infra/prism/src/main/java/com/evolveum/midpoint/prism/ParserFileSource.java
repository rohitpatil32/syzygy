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

package com.evolveum.midpoint.prism;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author mederly
 */
public class ParserFileSource implements ParserSource {

	@NotNull private final File file;

	public ParserFileSource(@NotNull File file) {
		this.file = file;
	}

	@NotNull
	public File getFile() {
		return file;
	}

	@NotNull
	@Override
	public InputStream getInputStream() throws FileNotFoundException {
		return new FileInputStream(file);
	}

	@Override
	public boolean closeStreamAfterParsing() {
		return true;
	}

	@Override
	public boolean throwsIOException() {
		return true;
	}
}
