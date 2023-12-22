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

@ABIMarker(IEmailMailboxUpdateMeetingResponseRequestEventArgs.ABI::class)
@Signature("{6898d761-56c9-4f17-be31-66fda94ba159}")
@Guid("6898d76156c94f17be3166fda94ba159")
@WinRTInterface("6898d76156c94f17be3166fda94ba159")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxUpdateMeetingResponseRequestEventArgs.ByReference::class)
public interface IEmailMailboxUpdateMeetingResponseRequestEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_Request(): EmailMailboxUpdateMeetingResponseRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxUpdateMeetingResponseRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIEmailMailboxUpdateMeetingResponseRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxUpdateMeetingResponseRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxUpdateMeetingResponseRequestEventArgs {
    public val __111836655_Ptr: Pointer?

    public val _111836655_VtblPtr: Pointer?
      get() = __111836655_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): EmailMailboxUpdateMeetingResponseRequest? {
      val fnPtr = _111836655_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxUpdateMeetingResponseRequest>()
      val hr = fn.invokeHR(arrayOf(__111836655_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<EmailMailboxUpdateMeetingResponseRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _111836655_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__111836655_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxUpdateMeetingResponseRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __111836655_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxUpdateMeetingResponseRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6898d76156c94f17be3166fda94ba159")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxUpdateMeetingResponseRequestEventArgs(ptr: Pointer?): WithDefault =
        IEmailMailboxUpdateMeetingResponseRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEmailMailboxUpdateMeetingResponseRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxUpdateMeetingResponseRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxUpdateMeetingResponseRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__111836655_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxUpdateMeetingResponseRequestEventArgs):
        Array<IEmailMailboxUpdateMeetingResponseRequestEventArgs?> = (elements as
        Array<IEmailMailboxUpdateMeetingResponseRequestEventArgs?>).castToImpl<IEmailMailboxUpdateMeetingResponseRequestEventArgs,IEmailMailboxUpdateMeetingResponseRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IEmailMailboxUpdateMeetingResponseRequestEventArgs?> =
        arrayOfNulls<IEmailMailboxUpdateMeetingResponseRequestEventArgs_Impl>(size) as
        Array<IEmailMailboxUpdateMeetingResponseRequestEventArgs?>
  }
}
