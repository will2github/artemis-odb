package com.artemis.component;

import com.artemis.Component;
import com.artemis.compile.NodeOld;
import com.badlogic.gdx.math.Vector2;

import static com.artemis.compile.NodeOld.node;

public class PositionXy extends Component {
	public transient Vector2 oldAndIgnored = new Vector2();
	public Vector2 xy = new Vector2();

	{
		xy.set(420, -12.345f);
	}

	public static NodeOld expected =
		node(PositionXy.class,
			node(Vector2.class,  "xy",
				node(float.class, "x", 420f),
				node(float.class, "y", -12.345f)));
}
