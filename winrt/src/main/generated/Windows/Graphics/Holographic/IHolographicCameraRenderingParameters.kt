package Windows.Graphics.Holographic

import Windows.Foundation.Numerics.Vector3
import Windows.Graphics.DirectX.Direct3D11.IDirect3DDevice
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHolographicCameraRenderingParameters.ABI::class)
@Signature("{8eac2ed1-5bf4-4e16-8236-ae0800c11d0d}")
@Guid("8eac2ed15bf44e168236ae0800c11d0d")
@WinRTInterface("8eac2ed15bf44e168236ae0800c11d0d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicCameraRenderingParameters.ByReference::class)
public interface IHolographicCameraRenderingParameters : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetFocusPoint(coordinateSystem: SpatialCoordinateSystem?, position: Vector3?): Unit

  @InterfaceMethod(1)
  public fun SetFocusPoint(
    coordinateSystem: SpatialCoordinateSystem?,
    position: Vector3?,
    normal: Vector3?
  ): Unit

  @InterfaceMethod(2)
  public fun SetFocusPoint(
    coordinateSystem: SpatialCoordinateSystem?,
    position: Vector3?,
    normal: Vector3?,
    linearVelocity: Vector3?
  ): Unit

  @InterfaceMethod(3)
  public fun get_Direct3D11Device(): IDirect3DDevice?

  @InterfaceMethod(4)
  public fun get_Direct3D11BackBuffer(): IDirect3DSurface?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicCameraRenderingParameters> {
    public override fun getValue() =
        ABI.makeIHolographicCameraRenderingParameters(pointer.getPointer(0))

    public fun setValue(value: IHolographicCameraRenderingParameters_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicCameraRenderingParameters {
    public val __1672098314_Ptr: Pointer?

    public val _1672098314_VtblPtr: Pointer?
      get() = __1672098314_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetFocusPoint(coordinateSystem: SpatialCoordinateSystem?,
        position: Vector3?): Unit {
      val fnPtr = _1672098314_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1672098314_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(position),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SetFocusPoint(
      coordinateSystem: SpatialCoordinateSystem?,
      position: Vector3?,
      normal: Vector3?
    ): Unit {
      val fnPtr = _1672098314_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1672098314_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(position), marshalToNative(normal),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetFocusPoint(
      coordinateSystem: SpatialCoordinateSystem?,
      position: Vector3?,
      normal: Vector3?,
      linearVelocity: Vector3?
    ): Unit {
      val fnPtr = _1672098314_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1672098314_Ptr, marshalToNative(coordinateSystem),
          marshalToNative(position), marshalToNative(normal), marshalToNative(linearVelocity),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Direct3D11Device(): IDirect3DDevice? {
      val fnPtr = _1672098314_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IDirect3DDevice>()
      val hr = fn.invokeHR(arrayOf(__1672098314_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IDirect3DDevice>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Direct3D11BackBuffer(): IDirect3DSurface? {
      val fnPtr = _1672098314_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IDirect3DSurface>()
      val hr = fn.invokeHR(arrayOf(__1672098314_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IDirect3DSurface>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicCameraRenderingParameters_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1672098314_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicCameraRenderingParameters, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8eac2ed15bf44e168236ae0800c11d0d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicCameraRenderingParameters(ptr: Pointer?): WithDefault =
        IHolographicCameraRenderingParameters_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicCameraRenderingParameters {
      val address = segment.toRawLongValue()
      return makeIHolographicCameraRenderingParameters(Pointer(address))
    }

    public override fun toNative(obj: IHolographicCameraRenderingParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1672098314_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicCameraRenderingParameters):
        Array<IHolographicCameraRenderingParameters?> = (elements as
        Array<IHolographicCameraRenderingParameters?>).castToImpl<IHolographicCameraRenderingParameters,IHolographicCameraRenderingParameters_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicCameraRenderingParameters?> =
        arrayOfNulls<IHolographicCameraRenderingParameters_Impl>(size) as
        Array<IHolographicCameraRenderingParameters?>
  }
}
