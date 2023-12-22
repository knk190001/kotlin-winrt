package Windows.ApplicationModel.Email.DataProvider

import Windows.Foundation.Deferral
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

@ABIMarker(IEmailMailboxForwardMeetingRequestEventArgs.ABI::class)
@Signature("{2bd8f33a-2974-4759-a5a5-58f44d3c0275}")
@Guid("2bd8f33a29744759a5a558f44d3c0275")
@WinRTInterface("2bd8f33a29744759a5a558f44d3c0275")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxForwardMeetingRequestEventArgs.ByReference::class)
public interface IEmailMailboxForwardMeetingRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): EmailMailboxForwardMeetingRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxForwardMeetingRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIEmailMailboxForwardMeetingRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxForwardMeetingRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxForwardMeetingRequestEventArgs {
    public val __707372488_Ptr: Pointer?

    public val _707372488_VtblPtr: Pointer?
      get() = __707372488_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): EmailMailboxForwardMeetingRequest? {
      val fnPtr = _707372488_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxForwardMeetingRequest>()
      val hr = fn.invokeHR(arrayOf(__707372488_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxForwardMeetingRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _707372488_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__707372488_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxForwardMeetingRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __707372488_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxForwardMeetingRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2bd8f33a29744759a5a558f44d3c0275")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxForwardMeetingRequestEventArgs(ptr: Pointer?): WithDefault =
        IEmailMailboxForwardMeetingRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEmailMailboxForwardMeetingRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxForwardMeetingRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxForwardMeetingRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__707372488_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxForwardMeetingRequestEventArgs):
        Array<IEmailMailboxForwardMeetingRequestEventArgs?> = (elements as
        Array<IEmailMailboxForwardMeetingRequestEventArgs?>).castToImpl<IEmailMailboxForwardMeetingRequestEventArgs,IEmailMailboxForwardMeetingRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxForwardMeetingRequestEventArgs?> =
        arrayOfNulls<IEmailMailboxForwardMeetingRequestEventArgs_Impl>(size) as
        Array<IEmailMailboxForwardMeetingRequestEventArgs?>
  }
}
