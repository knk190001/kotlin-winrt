package Windows.Media

import Windows.Foundation.TimeSpan
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

@ABIMarker(IPlaybackPositionChangeRequestedEventArgs.ABI::class)
@Signature("{b4493f88-eb28-4961-9c14-335e44f3e125}")
@Guid("b4493f88eb2849619c14335e44f3e125")
@WinRTInterface("b4493f88eb2849619c14335e44f3e125")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlaybackPositionChangeRequestedEventArgs.ByReference::class)
public interface IPlaybackPositionChangeRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RequestedPlaybackPosition(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlaybackPositionChangeRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIPlaybackPositionChangeRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPlaybackPositionChangeRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlaybackPositionChangeRequestedEventArgs {
    public val __36050477_Ptr: Pointer?

    public val _36050477_VtblPtr: Pointer?
      get() = __36050477_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequestedPlaybackPosition(): TimeSpan? {
      val fnPtr = _36050477_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__36050477_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class IPlaybackPositionChangeRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __36050477_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlaybackPositionChangeRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4493f88eb2849619c14335e44f3e125")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlaybackPositionChangeRequestedEventArgs(ptr: Pointer?): WithDefault =
        IPlaybackPositionChangeRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPlaybackPositionChangeRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPlaybackPositionChangeRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPlaybackPositionChangeRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__36050477_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlaybackPositionChangeRequestedEventArgs):
        Array<IPlaybackPositionChangeRequestedEventArgs?> = (elements as
        Array<IPlaybackPositionChangeRequestedEventArgs?>).castToImpl<IPlaybackPositionChangeRequestedEventArgs,IPlaybackPositionChangeRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlaybackPositionChangeRequestedEventArgs?> =
        arrayOfNulls<IPlaybackPositionChangeRequestedEventArgs_Impl>(size) as
        Array<IPlaybackPositionChangeRequestedEventArgs?>
  }
}
