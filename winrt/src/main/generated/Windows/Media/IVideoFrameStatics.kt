package Windows.Media

import Windows.Graphics.DirectX.Direct3D11.IDirect3DDevice
import Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import Windows.Graphics.DirectX.DirectXPixelFormat
import Windows.Graphics.Imaging.SoftwareBitmap
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

@ABIMarker(IVideoFrameStatics.ABI::class)
@Signature("{ab2a556f-6111-4b33-8ec3-2b209a02e17a}")
@Guid("ab2a556f61114b338ec32b209a02e17a")
@WinRTInterface("ab2a556f61114b338ec32b209a02e17a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoFrameStatics.ByReference::class)
public interface IVideoFrameStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAsDirect3D11SurfaceBacked(
    format: DirectXPixelFormat?,
    width: Int,
    height: Int
  ): VideoFrame?

  @InterfaceMethod(1)
  public fun CreateAsDirect3D11SurfaceBacked(
    format: DirectXPixelFormat?,
    width: Int,
    height: Int,
    device: IDirect3DDevice?
  ): VideoFrame?

  @InterfaceMethod(2)
  public fun CreateWithSoftwareBitmap(bitmap: SoftwareBitmap?): VideoFrame?

  @InterfaceMethod(3)
  public fun CreateWithDirect3D11Surface(surface: IDirect3DSurface?): VideoFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoFrameStatics> {
    public override fun getValue() = ABI.makeIVideoFrameStatics(pointer.getPointer(0))

    public fun setValue(value: IVideoFrameStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoFrameStatics {
    public val __642674851_Ptr: Pointer?

    public val _642674851_VtblPtr: Pointer?
      get() = __642674851_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAsDirect3D11SurfaceBacked(
      format: DirectXPixelFormat?,
      width: Int,
      height: Int
    ): VideoFrame? {
      val fnPtr = _642674851_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoFrame>()
      val hr = fn.invokeHR(arrayOf(__642674851_Ptr, marshalToNative(format), width, height, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateAsDirect3D11SurfaceBacked(
      format: DirectXPixelFormat?,
      width: Int,
      height: Int,
      device: IDirect3DDevice?
    ): VideoFrame? {
      val fnPtr = _642674851_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoFrame>()
      val hr = fn.invokeHR(arrayOf(__642674851_Ptr, marshalToNative(format), width, height,
          marshalToNative(device), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateWithSoftwareBitmap(bitmap: SoftwareBitmap?): VideoFrame? {
      val fnPtr = _642674851_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoFrame>()
      val hr = fn.invokeHR(arrayOf(__642674851_Ptr, marshalToNative(bitmap), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateWithDirect3D11Surface(surface: IDirect3DSurface?): VideoFrame? {
      val fnPtr = _642674851_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoFrame>()
      val hr = fn.invokeHR(arrayOf(__642674851_Ptr, marshalToNative(surface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoFrame>(result.getValue())
      return resultValue
    }
  }

  public class IVideoFrameStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __642674851_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoFrameStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab2a556f61114b338ec32b209a02e17a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoFrameStatics(ptr: Pointer?): WithDefault = IVideoFrameStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoFrameStatics {
      val address = segment.toRawLongValue()
      return makeIVideoFrameStatics(Pointer(address))
    }

    public override fun toNative(obj: IVideoFrameStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__642674851_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoFrameStatics): Array<IVideoFrameStatics?> =
        (elements as
        Array<IVideoFrameStatics?>).castToImpl<IVideoFrameStatics,IVideoFrameStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoFrameStatics?> =
        arrayOfNulls<IVideoFrameStatics_Impl>(size) as Array<IVideoFrameStatics?>
  }
}
