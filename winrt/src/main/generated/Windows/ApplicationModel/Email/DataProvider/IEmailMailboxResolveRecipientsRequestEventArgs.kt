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

@ABIMarker(IEmailMailboxResolveRecipientsRequestEventArgs.ABI::class)
@Signature("{260f9e02-b2cf-40f8-8c28-e3ed43b1e89a}")
@Guid("260f9e02b2cf40f88c28e3ed43b1e89a")
@WinRTInterface("260f9e02b2cf40f88c28e3ed43b1e89a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxResolveRecipientsRequestEventArgs.ByReference::class)
public interface IEmailMailboxResolveRecipientsRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): EmailMailboxResolveRecipientsRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxResolveRecipientsRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIEmailMailboxResolveRecipientsRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxResolveRecipientsRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxResolveRecipientsRequestEventArgs {
    public val __1727996932_Ptr: Pointer?

    public val _1727996932_VtblPtr: Pointer?
      get() = __1727996932_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): EmailMailboxResolveRecipientsRequest? {
      val fnPtr = _1727996932_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxResolveRecipientsRequest>()
      val hr = fn.invokeHR(arrayOf(__1727996932_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxResolveRecipientsRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1727996932_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1727996932_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxResolveRecipientsRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1727996932_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxResolveRecipientsRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("260f9e02b2cf40f88c28e3ed43b1e89a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxResolveRecipientsRequestEventArgs(ptr: Pointer?): WithDefault =
        IEmailMailboxResolveRecipientsRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEmailMailboxResolveRecipientsRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxResolveRecipientsRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxResolveRecipientsRequestEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1727996932_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxResolveRecipientsRequestEventArgs):
        Array<IEmailMailboxResolveRecipientsRequestEventArgs?> = (elements as
        Array<IEmailMailboxResolveRecipientsRequestEventArgs?>).castToImpl<IEmailMailboxResolveRecipientsRequestEventArgs,IEmailMailboxResolveRecipientsRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxResolveRecipientsRequestEventArgs?> =
        arrayOfNulls<IEmailMailboxResolveRecipientsRequestEventArgs_Impl>(size) as
        Array<IEmailMailboxResolveRecipientsRequestEventArgs?>
  }
}
