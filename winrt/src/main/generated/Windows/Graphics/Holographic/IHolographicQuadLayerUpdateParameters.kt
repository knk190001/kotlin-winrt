package Windows.Graphics.Holographic

import Windows.Foundation.Numerics.Quaternion
import Windows.Foundation.Numerics.Vector2
import Windows.Foundation.Numerics.Vector3
import Windows.Foundation.Rect
import Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import Windows.Perception.Spatial.SpatialCoordinateSystem
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHolographicQuadLayerUpdateParameters.ABI::class)
@Signature("{2b0ea3b0-798d-5bca-55c2-2c0c762ebb08}")
@Guid("2b0ea3b0798d5bca55c22c0c762ebb08")
@WinRTInterface("2b0ea3b0798d5bca55c22c0c762ebb08")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicQuadLayerUpdateParameters.ByReference::class)
public interface IHolographicQuadLayerUpdateParameters : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AcquireBufferToUpdateContent(): IDirect3DSurface?

  @InterfaceMethod(1)
  public fun UpdateViewport(value: Rect?): Unit

  @InterfaceMethod(2)
  public fun UpdateContentProtectionEnabled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun UpdateExtents(value: Vector2?): Unit

  @InterfaceMethod(4)
  public fun UpdateLocationWithStationaryMode(
    coordinateSystem: SpatialCoordinateSystem?,
    position: Vector3?,
    orientation: Quaternion?
  ): Unit

  @InterfaceMethod(5)
  public fun UpdateLocationWithDisplayRelativeMode(position: Vector3?, orientation: Quaternion?):
      Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicQuadLayerUpdateParameters> {
    public override fun getValue() =
        ABI.makeIHolographicQuadLayerUpdateParameters(pointer.getPointer(0))

    public fun setValue(value: IHolographicQuadLayerUpdateParameters_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicQuadLayerUpdateParameters {
    public val __439418818_Ptr: Pointer?

    public val _439418818_VtblPtr: Pointer?
      get() = __439418818_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AcquireBufferToUpdateContent(): IDirect3DSurface? {
      val fnPtr = _439418818_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IDirect3DSurface>()
      val hr = fn.invokeHR(arrayOf(__439418818_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IDirect3DSurface>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun UpdateViewport(value: Rect?): Unit {
      val fnPtr = _439418818_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__439418818_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun UpdateContentProtectionEnabled(value: Boolean): Unit {
      val fnPtr = _439418818_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__439418818_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun UpdateExtents(value: Vector2?): Unit {
      val fnPtr = _439418818_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__439418818_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun UpdateLocationWithStationaryMode(
      coordinateSystem: SpatialCoordinateSystem?,
      position: Vector3?,
      orientation: Quaternion?
    ): Unit {
      val fnPtr = _439418818_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__439418818_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(position), marshalToNative(orientation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun UpdateLocationWithDisplayRelativeMode(position: Vector3?,
        orientation: Quaternion?): Unit {
      val fnPtr = _439418818_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__439418818_Ptr, marshalToNative(position),
          marshalToNative(orientation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHolographicQuadLayerUpdateParameters_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __439418818_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicQuadLayerUpdateParameters, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2b0ea3b0798d5bca55c22c0c762ebb08")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicQuadLayerUpdateParameters(ptr: Pointer?): WithDefault =
        IHolographicQuadLayerUpdateParameters_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicQuadLayerUpdateParameters {
      val address = segment.toRawLongValue()
      return makeIHolographicQuadLayerUpdateParameters(Pointer(address))
    }

    public override fun toNative(obj: IHolographicQuadLayerUpdateParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__439418818_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicQuadLayerUpdateParameters):
        Array<IHolographicQuadLayerUpdateParameters?> = (elements as
        Array<IHolographicQuadLayerUpdateParameters?>).castToImpl<IHolographicQuadLayerUpdateParameters,IHolographicQuadLayerUpdateParameters_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicQuadLayerUpdateParameters?> =
        arrayOfNulls<IHolographicQuadLayerUpdateParameters_Impl>(size) as
        Array<IHolographicQuadLayerUpdateParameters?>
  }
}
