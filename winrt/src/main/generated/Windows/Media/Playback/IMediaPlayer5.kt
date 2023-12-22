package Windows.Media.Playback

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Rect
import Windows.Foundation.TypedEventHandler
import Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IMediaPlayer5.ABI::class)
@Signature("{cfe537fd-f86a-4446-bf4d-c8e792b7b4b3}")
@Guid("cfe537fdf86a4446bf4dc8e792b7b4b3")
@WinRTInterface("cfe537fdf86a4446bf4dc8e792b7b4b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayer5.ByReference::class)
public interface IMediaPlayer5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_VideoFrameAvailable(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_VideoFrameAvailable(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_IsVideoFrameServerEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsVideoFrameServerEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun CopyFrameToVideoSurface(destination: IDirect3DSurface?): Unit

  @InterfaceMethod(5)
  public fun CopyFrameToVideoSurface(destination: IDirect3DSurface?, targetRectangle: Rect?): Unit

  @InterfaceMethod(6)
  public fun CopyFrameToStereoscopicVideoSurfaces(destinationLeftEye: IDirect3DSurface?,
      destinationRightEye: IDirect3DSurface?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaPlayer5>
      {
    public override fun getValue() = ABI.makeIMediaPlayer5(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayer5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayer5 {
    public val __1314081335_Ptr: Pointer?

    public val _1314081335_VtblPtr: Pointer?
      get() = __1314081335_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_VideoFrameAvailable(value: TypedEventHandler<MediaPlayer?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1314081335_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1314081335_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_VideoFrameAvailable(token: EventRegistrationToken?): Unit {
      val fnPtr = _1314081335_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081335_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsVideoFrameServerEnabled(): Boolean {
      val fnPtr = _1314081335_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1314081335_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsVideoFrameServerEnabled(value: Boolean): Unit {
      val fnPtr = _1314081335_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081335_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun CopyFrameToVideoSurface(destination: IDirect3DSurface?): Unit {
      val fnPtr = _1314081335_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081335_Ptr, marshalToNative(destination),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun CopyFrameToVideoSurface(destination: IDirect3DSurface?,
        targetRectangle: Rect?): Unit {
      val fnPtr = _1314081335_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081335_Ptr, marshalToNative(destination),
          marshalToNative(targetRectangle),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun CopyFrameToStereoscopicVideoSurfaces(destinationLeftEye: IDirect3DSurface?,
        destinationRightEye: IDirect3DSurface?): Unit {
      val fnPtr = _1314081335_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081335_Ptr, marshalToNative(destinationLeftEye),
          marshalToNative(destinationRightEye),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaPlayer5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1314081335_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayer5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cfe537fdf86a4446bf4dc8e792b7b4b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayer5(ptr: Pointer?): WithDefault = IMediaPlayer5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayer5 {
      val address = segment.toRawLongValue()
      return makeIMediaPlayer5(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayer5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1314081335_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayer5): Array<IMediaPlayer5?> = (elements as
        Array<IMediaPlayer5?>).castToImpl<IMediaPlayer5,IMediaPlayer5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayer5?> =
        arrayOfNulls<IMediaPlayer5_Impl>(size) as Array<IMediaPlayer5?>
  }
}
