

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Tests {

	@Test
	public void newStackHasZeroElements() {
		Stack stack = new Stack();
		int s = stack.getSize();
		assertThat(s, is(0));

	}

	@Test
	public void pushIncreasedStackSize() {
		Stack stack = new Stack();
		stack.push(2);
		int sSize = stack.getSize();
		assertThat(sSize, is(1));

	}

	@Test
	public void popDecreasedStackSize() {
		Stack stack = new Stack();
		stack.push(6);
		int beforePop = stack.getSize();
		stack.pop();
		int afterPop = stack.getSize();
		assertThat(beforePop, is(1));
		assertThat(afterPop, is(0));
	}

	@Test
	public void pushIncreasedAndPopDecreasedStackSize() {
		Stack stack = new Stack();
		stack.push(2);
		stack.pop();

		assertThat(stack.getSize(), is(0));
	}
	
	@Test
	public void peekElementSameSize() {
		Stack stack = new Stack();
		stack.push(6);
		stack.push(3);
		stack.peek();
		assertThat(stack.getSize(), is(2));
	}
	
	@Test
	public void isPeekElementSame() {
		Stack stack = new Stack();
		stack.push(5);
		stack.push(7);
		stack.peek();
		assertThat(stack.peek(), is(7));
	}
	
	@Test(expected = IllegalStateException.class)
	public void popEmptyStack(){
		Stack stack = new Stack();
		stack.pop();
	}
	
	@Test(expected = IllegalStateException.class)
	public void peekEmptyStack(){
		Stack stack = new Stack();
		stack.peek();
	}
	@Test
	public void sameSizeAfterPeek() {
		Stack stack = new Stack();
		stack.push(5);
		stack.push(7);
		stack.peek();
		assertThat(stack.getSize(), is(2));
	}
}
