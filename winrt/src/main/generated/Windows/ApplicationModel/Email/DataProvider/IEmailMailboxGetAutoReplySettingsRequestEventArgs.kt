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

@ABIMarker(IEmailMailboxGetAutoReplySettingsRequestEventArgs.ABI::class)
@Signature("{d79f55c2-fd45-4004-8a91-9bacf38b7022}")
@Guid("d79f55c2fd4540048a919bacf38b7022")
@WinRTInterface("d79f55c2fd4540048a919bacf38b7022")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxGetAutoReplySettingsRequestEventArgs.ByReference::class)
public interface IEmailMailboxGetAutoReplySettingsRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): EmailMailboxGetAutoReplySettingsRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxGetAutoReplySettingsRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIEmailMailboxGetAutoReplySettingsRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxGetAutoReplySettingsRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxGetAutoReplySettingsRequestEventArgs {
    public val __604936602_Ptr: Pointer?

    public val _604936602_VtblPtr: Pointer?
      get() = __604936602_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): EmailMailboxGetAutoReplySettingsRequest? {
      val fnPtr = _604936602_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxGetAutoReplySettingsRequest>()
      val hr = fn.invokeHR(arrayOf(__604936602_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<EmailMailboxGetAutoReplySettingsRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _604936602_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__604936602_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxGetAutoReplySettingsRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __604936602_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxGetAutoReplySettingsRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d79f55c2fd4540048a919bacf38b7022")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxGetAutoReplySettingsRequestEventArgs(ptr: Pointer?): WithDefault =
        IEmailMailboxGetAutoReplySettingsRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEmailMailboxGetAutoReplySettingsRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxGetAutoReplySettingsRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxGetAutoReplySettingsRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__604936602_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxGetAutoReplySettingsRequestEventArgs):
        Array<IEmailMailboxGetAutoReplySettingsRequestEventArgs?> = (elements as
        Array<IEmailMailboxGetAutoReplySettingsRequestEventArgs?>).castToImpl<IEmailMailboxGetAutoReplySettingsRequestEventArgs,IEmailMailboxGetAutoReplySettingsRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IEmailMailboxGetAutoReplySettingsRequestEventArgs?> =
        arrayOfNulls<IEmailMailboxGetAutoReplySettingsRequestEventArgs_Impl>(size) as
        Array<IEmailMailboxGetAutoReplySettingsRequestEventArgs?>
  }
}
