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

@ABIMarker(IMediaPlaybackItemOpenedEventArgs.ABI::class)
@Signature("{cbd9bd82-3037-4fbe-ae8f-39fc39edf4ef}")
@Guid("cbd9bd8230374fbeae8f39fc39edf4ef")
@WinRTInterface("cbd9bd8230374fbeae8f39fc39edf4ef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackItemOpenedEventArgs.ByReference::class)
public interface IMediaPlaybackItemOpenedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Item(): MediaPlaybackItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackItemOpenedEventArgs> {
    public override fun getValue() =
        ABI.makeIMediaPlaybackItemOpenedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackItemOpenedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackItemOpenedEventArgs {
    public val __1580453291_Ptr: Pointer?

    public val _1580453291_VtblPtr: Pointer?
      get() = __1580453291_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Item(): MediaPlaybackItem? {
      val fnPtr = _1580453291_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__1580453291_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlaybackItemOpenedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1580453291_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackItemOpenedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cbd9bd8230374fbeae8f39fc39edf4ef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackItemOpenedEventArgs(ptr: Pointer?): WithDefault =
        IMediaPlaybackItemOpenedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackItemOpenedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackItemOpenedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackItemOpenedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1580453291_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackItemOpenedEventArgs):
        Array<IMediaPlaybackItemOpenedEventArgs?> = (elements as
        Array<IMediaPlaybackItemOpenedEventArgs?>).castToImpl<IMediaPlaybackItemOpenedEventArgs,IMediaPlaybackItemOpenedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackItemOpenedEventArgs?> =
        arrayOfNulls<IMediaPlaybackItemOpenedEventArgs_Impl>(size) as
        Array<IMediaPlaybackItemOpenedEventArgs?>
  }
}
