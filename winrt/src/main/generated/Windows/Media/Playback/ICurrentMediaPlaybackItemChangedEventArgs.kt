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

@ABIMarker(ICurrentMediaPlaybackItemChangedEventArgs.ABI::class)
@Signature("{1743a892-5c43-4a15-967a-572d2d0f26c6}")
@Guid("1743a8925c434a15967a572d2d0f26c6")
@WinRTInterface("1743a8925c434a15967a572d2d0f26c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICurrentMediaPlaybackItemChangedEventArgs.ByReference::class)
public interface ICurrentMediaPlaybackItemChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NewItem(): MediaPlaybackItem?

  @InterfaceMethod(1)
  public fun get_OldItem(): MediaPlaybackItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICurrentMediaPlaybackItemChangedEventArgs> {
    public override fun getValue() =
        ABI.makeICurrentMediaPlaybackItemChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICurrentMediaPlaybackItemChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICurrentMediaPlaybackItemChangedEventArgs {
    public val __387091221_Ptr: Pointer?

    public val _387091221_VtblPtr: Pointer?
      get() = __387091221_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NewItem(): MediaPlaybackItem? {
      val fnPtr = _387091221_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__387091221_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OldItem(): MediaPlaybackItem? {
      val fnPtr = _387091221_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__387091221_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }
  }

  public class ICurrentMediaPlaybackItemChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __387091221_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICurrentMediaPlaybackItemChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1743a8925c434a15967a572d2d0f26c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICurrentMediaPlaybackItemChangedEventArgs(ptr: Pointer?): WithDefault =
        ICurrentMediaPlaybackItemChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICurrentMediaPlaybackItemChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeICurrentMediaPlaybackItemChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICurrentMediaPlaybackItemChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__387091221_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICurrentMediaPlaybackItemChangedEventArgs):
        Array<ICurrentMediaPlaybackItemChangedEventArgs?> = (elements as
        Array<ICurrentMediaPlaybackItemChangedEventArgs?>).castToImpl<ICurrentMediaPlaybackItemChangedEventArgs,ICurrentMediaPlaybackItemChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICurrentMediaPlaybackItemChangedEventArgs?> =
        arrayOfNulls<ICurrentMediaPlaybackItemChangedEventArgs_Impl>(size) as
        Array<ICurrentMediaPlaybackItemChangedEventArgs?>
  }
}
