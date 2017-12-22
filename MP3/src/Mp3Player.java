
public interface Mp3Player {
	public abstract void play();
	public abstract void stop();
	public abstract void next();
	public abstract void back();
}
/*abstract void play(); ⇒ play()というメソッドは少なくとも宣言すべきだが、
具体的にどう動くかは現時点では確定できないので、メソッド内部の処理はここ
では記載しない*/