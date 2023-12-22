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

@ABIMarker(IPlaybackMediaMarkerReachedEventArgs.ABI::class)
@Signature("{578cd1b9-90e2-4e60-abc4-8740b01f6196}")
@Guid("578cd1b990e24e60abc48740b01f6196")
@WinRTInterface("578cd1b990e24e60abc48740b01f6196")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlaybackMediaMarkerReachedEventArgs.ByReference::class)
public interface IPlaybackMediaMarkerReachedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PlaybackMediaMarker(): PlaybackMediaMarker?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlaybackMediaMarkerReachedEventArgs> {
    public override fun getValue() =
        ABI.makeIPlaybackMediaMarkerReachedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPlaybackMediaMarkerReachedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlaybackMediaMarkerReachedEventArgs {
    public val __2000813743_Ptr: Pointer?

    public val _2000813743_VtblPtr: Pointer?
      get() = __2000813743_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlaybackMediaMarker(): PlaybackMediaMarker? {
      val fnPtr = _2000813743_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlaybackMediaMarker>()
      val hr = fn.invokeHR(arrayOf(__2000813743_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlaybackMediaMarker>(result.getValue())
      return resultValue
    }
  }

  public class IPlaybackMediaMarkerReachedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2000813743_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlaybackMediaMarkerReachedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("578cd1b990e24e60abc48740b01f6196")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlaybackMediaMarkerReachedEventArgs(ptr: Pointer?): WithDefault =
        IPlaybackMediaMarkerReachedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlaybackMediaMarkerReachedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPlaybackMediaMarkerReachedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPlaybackMediaMarkerReachedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2000813743_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlaybackMediaMarkerReachedEventArgs):
        Array<IPlaybackMediaMarkerReachedEventArgs?> = (elements as
        Array<IPlaybackMediaMarkerReachedEventArgs?>).castToImpl<IPlaybackMediaMarkerReachedEventArgs,IPlaybackMediaMarkerReachedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlaybackMediaMarkerReachedEventArgs?> =
        arrayOfNulls<IPlaybackMediaMarkerReachedEventArgs_Impl>(size) as
        Array<IPlaybackMediaMarkerReachedEventArgs?>
  }
}
