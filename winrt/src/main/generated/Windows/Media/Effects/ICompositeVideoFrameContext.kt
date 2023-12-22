package Windows.Media.Effects

import Windows.Foundation.Collections.IVectorView
import Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import Windows.Media.Editing.MediaOverlay
import Windows.Media.VideoFrame
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

@ABIMarker(ICompositeVideoFrameContext.ABI::class)
@Signature("{6c30024b-f514-4278-a5f7-b9188049d110}")
@Guid("6c30024bf5144278a5f7b9188049d110")
@WinRTInterface("6c30024bf5144278a5f7b9188049d110")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositeVideoFrameContext.ByReference::class)
public interface ICompositeVideoFrameContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SurfacesToOverlay(): IVectorView<IDirect3DSurface?>?

  @InterfaceMethod(1)
  public fun get_BackgroundFrame(): VideoFrame?

  @InterfaceMethod(2)
  public fun get_OutputFrame(): VideoFrame?

  @InterfaceMethod(3)
  public fun GetOverlayForSurface(surfaceToOverlay: IDirect3DSurface?): MediaOverlay?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositeVideoFrameContext> {
    public override fun getValue() = ABI.makeICompositeVideoFrameContext(pointer.getPointer(0))

    public fun setValue(value: ICompositeVideoFrameContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositeVideoFrameContext {
    public val __1839476110_Ptr: Pointer?

    public val _1839476110_VtblPtr: Pointer?
      get() = __1839476110_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SurfacesToOverlay(): IVectorView<IDirect3DSurface?>? {
      val fnPtr = _1839476110_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IDirect3DSurface?>>()
      val hr = fn.invokeHR(arrayOf(__1839476110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IDirect3DSurface?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BackgroundFrame(): VideoFrame? {
      val fnPtr = _1839476110_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoFrame>()
      val hr = fn.invokeHR(arrayOf(__1839476110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_OutputFrame(): VideoFrame? {
      val fnPtr = _1839476110_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoFrame>()
      val hr = fn.invokeHR(arrayOf(__1839476110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetOverlayForSurface(surfaceToOverlay: IDirect3DSurface?): MediaOverlay? {
      val fnPtr = _1839476110_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaOverlay>()
      val hr = fn.invokeHR(arrayOf(__1839476110_Ptr, marshalToNative(surfaceToOverlay), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaOverlay>(result.getValue())
      return resultValue
    }
  }

  public class ICompositeVideoFrameContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1839476110_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositeVideoFrameContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6c30024bf5144278a5f7b9188049d110")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositeVideoFrameContext(ptr: Pointer?): WithDefault =
        ICompositeVideoFrameContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositeVideoFrameContext {
      val address = segment.toRawLongValue()
      return makeICompositeVideoFrameContext(Pointer(address))
    }

    public override fun toNative(obj: ICompositeVideoFrameContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1839476110_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositeVideoFrameContext):
        Array<ICompositeVideoFrameContext?> = (elements as
        Array<ICompositeVideoFrameContext?>).castToImpl<ICompositeVideoFrameContext,ICompositeVideoFrameContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositeVideoFrameContext?> =
        arrayOfNulls<ICompositeVideoFrameContext_Impl>(size) as Array<ICompositeVideoFrameContext?>
  }
}
