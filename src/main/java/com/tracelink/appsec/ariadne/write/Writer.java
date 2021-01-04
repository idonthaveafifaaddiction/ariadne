/*
Copyright 2019 TraceLink, Inc.

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.tracelink.appsec.ariadne.write;

import com.tracelink.appsec.ariadne.Ariadne;
import com.tracelink.appsec.ariadne.model.Artifact;
import java.util.List;

/**
 * Writes {@link Ariadne} results to multiple output files.
 *
 * @author mcool
 */
public interface Writer {

	/**
	 * Sets the given list of artifacts to be reported by this writer.
	 *
	 * @param artifacts artifacts to report on
	 */
	void setArtifacts(List<Artifact> artifacts);

	/**
	 * Writes dependency information to an output file, if configured.
	 */
	void writeDependencies();

	/**
	 * Writes vulnerability information to an output file, if configured.
	 */
	void writeVulnerabilities();

	/**
	 * Writes tier assignments to an output file.
	 */
	void writeTiers();
}
