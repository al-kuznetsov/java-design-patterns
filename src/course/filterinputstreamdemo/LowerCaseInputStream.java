package course.filterinputstreamdemo;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		int c = in.read();
		return c == -1 ? c : Character.toLowerCase(c);
	}
}
