package com.mdejesus.cleancodesamples.meaningfulnames.partone;

public class InterfaceAndImplementation {



}

// DO
class ShapeFactoryImp implements ShapeFactory{}
class CShapeFactory implements ShapeFactory{}

// DON'T
interface IShapeFactory{}

// DO
interface ShapeFactory{}
