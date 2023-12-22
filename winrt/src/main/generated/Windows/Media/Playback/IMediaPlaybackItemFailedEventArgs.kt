package Windows.Media.Playback

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

@ABIMarker(IMediaPlaybackItemFailedEventArgs.ABI::class)
@Signature("{7703134a-e9a7-47c3-862c-c656d30683d4}")
@Guid("7703134ae9a747c3862cc656d30683d4")
@WinRTInterface("7703134ae9a747c3862cc656d30683d4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackItemFailedEventArgs.ByReference::class)
public interface IMediaPlaybackItemFailedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Item(): MediaPlaybackItem?

  @InterfaceMethod(1)
  public fun get_Error(): MediaPlaybackItemError?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackItemFailedEventArgs> {
    public override fun getValue() =
        ABI.makeIMediaPlaybackItemFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackItemFailedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackItemFailedEventArgs {
    public val __406883071_Ptr: Pointer?

    public val _406883071_VtblPtr: Pointer?
      get() = __406883071_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Item(): MediaPlaybackItem? {
      val fnPtr = _406883071_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__406883071_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Error(): MediaPlaybackItemError? {
      val fnPtr = _406883071_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItemError>()
      val hr = fn.invokeHR(arrayOf(__406883071_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItemError>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlaybackItemFailedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __406883071_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackItemFailedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7703134ae9a747c3862cc656d30683d4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackItemFailedEventArgs(ptr: Pointer?): WithDefault =
        IMediaPlaybackItemFailedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackItemFailedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackItemFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackItemFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__406883071_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackItemFailedEventArgs):
        Array<IMediaPlaybackItemFailedEventArgs?> = (elements as
        Array<IMediaPlaybackItemFailedEventArgs?>).castToImpl<IMediaPlaybackItemFailedEventArgs,IMediaPlaybackItemFailedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackItemFailedEventArgs?> =
        arrayOfNulls<IMediaPlaybackItemFailedEventArgs_Impl>(size) as
        Array<IMediaPlaybackItemFailedEventArgs?>
  }
}
