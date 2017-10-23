/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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

package org.gradle.nativeplatform.toolchain.internal;

import org.gradle.language.base.internal.compile.Compiler;
import org.gradle.language.base.internal.compile.VersionAwareCompiler;
import org.gradle.util.VersionNumber;

import java.io.File;
import java.util.List;

public class VersionAwareNativeCompiler<T extends NativeCompileSpec> extends VersionAwareCompiler<T> implements SystemIncludesAwareNativeCompiler<T> {

    private final List<File> systemIncludes;

    public VersionAwareNativeCompiler(Compiler<T> compiler, String type, VersionNumber version, List<File> systemIncludes) {
        super(compiler, type, version);
        this.systemIncludes = systemIncludes;
    }

    @Override
    public List<File> getSystemIncludes() {
        return systemIncludes;
    }

}
