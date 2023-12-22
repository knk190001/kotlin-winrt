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

@ABIMarker(IEmailMailboxProposeNewTimeForMeetingRequestEventArgs.ABI::class)
@Signature("{fb480b98-33ad-4a67-8251-0f9c249b6a20}")
@Guid("fb480b9833ad4a6782510f9c249b6a20")
@WinRTInterface("fb480b9833ad4a6782510f9c249b6a20")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IEmailMailboxProposeNewTimeForMeetingRequestEventArgs.ByReference::class)
public interface IEmailMailboxProposeNewTimeForMeetingRequestEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): EmailMailboxProposeNewTimeForMeetingRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxProposeNewTimeForMeetingRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIEmailMailboxProposeNewTimeForMeetingRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxProposeNewTimeForMeetingRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxProposeNewTimeForMeetingRequestEventArgs {
    public val __382964755_Ptr: Pointer?

    public val _382964755_VtblPtr: Pointer?
      get() = __382964755_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): EmailMailboxProposeNewTimeForMeetingRequest? {
      val fnPtr = _382964755_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxProposeNewTimeForMeetingRequest>()
      val hr = fn.invokeHR(arrayOf(__382964755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<EmailMailboxProposeNewTimeForMeetingRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _382964755_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__382964755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxProposeNewTimeForMeetingRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __382964755_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxProposeNewTimeForMeetingRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb480b9833ad4a6782510f9c249b6a20")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxProposeNewTimeForMeetingRequestEventArgs(ptr: Pointer?): WithDefault
        = IEmailMailboxProposeNewTimeForMeetingRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEmailMailboxProposeNewTimeForMeetingRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxProposeNewTimeForMeetingRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxProposeNewTimeForMeetingRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__382964755_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxProposeNewTimeForMeetingRequestEventArgs):
        Array<IEmailMailboxProposeNewTimeForMeetingRequestEventArgs?> = (elements as
        Array<IEmailMailboxProposeNewTimeForMeetingRequestEventArgs?>).castToImpl<IEmailMailboxProposeNewTimeForMeetingRequestEventArgs,IEmailMailboxProposeNewTimeForMeetingRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IEmailMailboxProposeNewTimeForMeetingRequestEventArgs?> =
        arrayOfNulls<IEmailMailboxProposeNewTimeForMeetingRequestEventArgs_Impl>(size) as
        Array<IEmailMailboxProposeNewTimeForMeetingRequestEventArgs?>
  }
}
