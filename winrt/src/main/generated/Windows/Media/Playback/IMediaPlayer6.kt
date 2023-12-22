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

@ABIMarker(IMediaPlayer6.ABI::class)
@Signature("{e0caa086-ae65-414c-b010-8bc55f00e692}")
@Guid("e0caa086ae65414cb0108bc55f00e692")
@WinRTInterface("e0caa086ae65414cb0108bc55f00e692")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayer6.ByReference::class)
public interface IMediaPlayer6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_SubtitleFrameChanged(handler: TypedEventHandler<MediaPlayer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SubtitleFrameChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun RenderSubtitlesToSurface(destination: IDirect3DSurface?): Boolean

  @InterfaceMethod(3)
  public fun RenderSubtitlesToSurface(destination: IDirect3DSurface?, targetRectangle: Rect?):
      Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaPlayer6>
      {
    public override fun getValue() = ABI.makeIMediaPlayer6(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayer6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayer6 {
    public val __1314081334_Ptr: Pointer?

    public val _1314081334_VtblPtr: Pointer?
      get() = __1314081334_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_SubtitleFrameChanged(handler: TypedEventHandler<MediaPlayer?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1314081334_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1314081334_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SubtitleFrameChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1314081334_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081334_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun RenderSubtitlesToSurface(destination: IDirect3DSurface?): Boolean {
      val fnPtr = _1314081334_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1314081334_Ptr, marshalToNative(destination), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun RenderSubtitlesToSurface(destination: IDirect3DSurface?,
        targetRectangle: Rect?): Boolean {
      val fnPtr = _1314081334_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1314081334_Ptr, marshalToNative(destination),
          marshalToNative(targetRectangle), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMediaPlayer6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1314081334_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayer6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e0caa086ae65414cb0108bc55f00e692")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayer6(ptr: Pointer?): WithDefault = IMediaPlayer6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayer6 {
      val address = segment.toRawLongValue()
      return makeIMediaPlayer6(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayer6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1314081334_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayer6): Array<IMediaPlayer6?> = (elements as
        Array<IMediaPlayer6?>).castToImpl<IMediaPlayer6,IMediaPlayer6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayer6?> =
        arrayOfNulls<IMediaPlayer6_Impl>(size) as Array<IMediaPlayer6?>
  }
}
