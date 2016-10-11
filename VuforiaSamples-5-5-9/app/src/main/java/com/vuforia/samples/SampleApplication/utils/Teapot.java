/*===============================================================================
Copyright (c) 2016 PTC Inc. All Rights Reserved.

Copyright (c) 2012-2014 Qualcomm Connected Experiences, Inc. All Rights Reserved.

Vuforia is a trademark of PTC Inc., registered in the United States and other 
countries.
===============================================================================*/

package com.vuforia.samples.SampleApplication.utils;

import java.nio.Buffer;


public class Teapot extends MeshObject
{

    private Buffer mVertBuff;
    private Buffer mTexCoordBuff;
    private Buffer mNormBuff;
    private Buffer mIndBuff;

    private int indicesNumber = 0;
    private int verticesNumber = 0;


    public Teapot()
    {
        setVerts();
        setTexCoords();
        setNorms();
        setIndices();
    }


    private void setVerts()
    {
        double[] TEAPOT_VERTS = {
                -2.5f,  4.5f, 0.0f,   // top left
                -2.5f, -4.5f, 0.0f,   // bottom left
                2.5f, -4.5f, 0.0f,   // bottom right
                2.5f,  4.5f, 0.0f};
        mVertBuff = fillBuffer(TEAPOT_VERTS);
        verticesNumber = TEAPOT_VERTS.length / 3 ;
    }


    private void setTexCoords()
    {
        double[] TEAPOT_TEX_COORDS = { 0.608828, 0.354913, 0.609037, 0.414650,
                0.627128, 0.412296, 0.626946, 0.353747, 0.626946, 0.353747,
                0.627128, 0.412296};
        mTexCoordBuff = fillBuffer(TEAPOT_TEX_COORDS);

    }


    private void setNorms()
    {
        double[] TEAPOT_NORMS = { -0.964496, 0.067011, -0.255454, -0.865037,
                0.431362, -0.256198, -0.914727, 0.312709, -0.255904, -0.964979,
                -0.059958, -0.255382};
        mNormBuff = fillBuffer(TEAPOT_NORMS);
    }


    private void setIndices()
    {
        short[] TEAPOT_INDICES = { 0 , 1, 2, 0 , 2, 3, 0 , 1, 2, 0 , 2, 3};
        mIndBuff = fillBuffer(TEAPOT_INDICES);
        indicesNumber = TEAPOT_INDICES.length;
    }


    public int getNumObjectIndex()
    {
        return indicesNumber;
    }


    @Override
    public int getNumObjectVertex()
    {
        return verticesNumber;
    }


    @Override
    public Buffer getBuffer(BUFFER_TYPE bufferType)
    {
        Buffer result = null;
        switch (bufferType)
        {
            case BUFFER_TYPE_VERTEX:
                result = mVertBuff;
                break;
            case BUFFER_TYPE_TEXTURE_COORD:
                result = mTexCoordBuff;
                break;
            case BUFFER_TYPE_NORMALS:
                result = mNormBuff;
                break;
            case BUFFER_TYPE_INDICES:
                result = mIndBuff;
            default:
                break;

        }

        return result;
    }

}
