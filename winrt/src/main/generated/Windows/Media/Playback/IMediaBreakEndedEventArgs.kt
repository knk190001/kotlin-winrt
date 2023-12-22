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

@ABIMarker(IMediaBreakEndedEventArgs.ABI::class)
@Signature("{32b93276-1c5d-4fee-8732-236dc3a88580}")
@Guid("32b932761c5d4fee8732236dc3a88580")
@WinRTInterface("32b932761c5d4fee8732236dc3a88580")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaBreakEndedEventArgs.ByReference::class)
public interface IMediaBreakEndedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MediaBreak(): MediaBreak?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaBreakEndedEventArgs> {
    public override fun getValue() = ABI.makeIMediaBreakEndedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaBreakEndedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaBreakEndedEventArgs {
    public val __421968049_Ptr: Pointer?

    public val _421968049_VtblPtr: Pointer?
      get() = __421968049_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MediaBreak(): MediaBreak? {
      val fnPtr = _421968049_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaBreak>()
      val hr = fn.invokeHR(arrayOf(__421968049_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaBreak>(result.getValue())
      return resultValue
    }
  }

  public class IMediaBreakEndedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __421968049_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaBreakEndedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("32b932761c5d4fee8732236dc3a88580")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaBreakEndedEventArgs(ptr: Pointer?): WithDefault =
        IMediaBreakEndedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaBreakEndedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaBreakEndedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaBreakEndedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__421968049_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaBreakEndedEventArgs):
        Array<IMediaBreakEndedEventArgs?> = (elements as
        Array<IMediaBreakEndedEventArgs?>).castToImpl<IMediaBreakEndedEventArgs,IMediaBreakEndedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaBreakEndedEventArgs?> =
        arrayOfNulls<IMediaBreakEndedEventArgs_Impl>(size) as Array<IMediaBreakEndedEventArgs?>
  }
}
