package com.badlogic.gdx.scenes.box2d.store;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.Joint;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.box2d.property.Box2DSceneCustomProperty;
import com.badlogic.gdx.utils.ObjectMap;

public class ByNameStore extends Box2DSceneStore
{
	ObjectMap<String, Object> objects;
	
	public ByNameStore()
	{
		objects = new ObjectMap<String, Object>();
	}
	
	public <T> T get(Class<T> _type, String _name)
	{
		if(_name != null && _type != null)
			return _type.cast(objects.get(_name));
		return null;
	}
	
	@Override
	public void onAddWorld(World _world, Box2DSceneCustomProperty _customProperty) 
	{
		int toto = 2;
	}

	@Override
	public void onAddBody(Body _body, String _name, Box2DSceneCustomProperty _customProperty) 
	{
		if(_body != null && _name != null)
			objects.put(_name, _body);
	}

	@Override
	public void onAddFixture(Fixture _fixture, String _name, Box2DSceneCustomProperty _customProperty) 
	{
		if(_fixture != null && _name != null)
			objects.put(_name, _fixture);
	}

	@Override
	public void onAddJoint(Joint _joint, String _name, Box2DSceneCustomProperty _customProperty) 
	{
		if(_joint != null && _name != null)
			objects.put(_name, _joint);
	}
}