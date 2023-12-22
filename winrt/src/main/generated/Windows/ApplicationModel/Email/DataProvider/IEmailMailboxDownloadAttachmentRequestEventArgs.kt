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

@ABIMarker(IEmailMailboxDownloadAttachmentRequestEventArgs.ABI::class)
@Signature("{ccddc46d-ffa8-4877-9f9d-fed7bcaf4104}")
@Guid("ccddc46dffa848779f9dfed7bcaf4104")
@WinRTInterface("ccddc46dffa848779f9dfed7bcaf4104")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxDownloadAttachmentRequestEventArgs.ByReference::class)
public interface IEmailMailboxDownloadAttachmentRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): EmailMailboxDownloadAttachmentRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxDownloadAttachmentRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIEmailMailboxDownloadAttachmentRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxDownloadAttachmentRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxDownloadAttachmentRequestEventArgs {
    public val __184062685_Ptr: Pointer?

    public val _184062685_VtblPtr: Pointer?
      get() = __184062685_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): EmailMailboxDownloadAttachmentRequest? {
      val fnPtr = _184062685_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxDownloadAttachmentRequest>()
      val hr = fn.invokeHR(arrayOf(__184062685_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxDownloadAttachmentRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _184062685_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__184062685_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxDownloadAttachmentRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __184062685_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxDownloadAttachmentRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ccddc46dffa848779f9dfed7bcaf4104")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxDownloadAttachmentRequestEventArgs(ptr: Pointer?): WithDefault =
        IEmailMailboxDownloadAttachmentRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEmailMailboxDownloadAttachmentRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxDownloadAttachmentRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxDownloadAttachmentRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__184062685_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxDownloadAttachmentRequestEventArgs):
        Array<IEmailMailboxDownloadAttachmentRequestEventArgs?> = (elements as
        Array<IEmailMailboxDownloadAttachmentRequestEventArgs?>).castToImpl<IEmailMailboxDownloadAttachmentRequestEventArgs,IEmailMailboxDownloadAttachmentRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxDownloadAttachmentRequestEventArgs?>
        = arrayOfNulls<IEmailMailboxDownloadAttachmentRequestEventArgs_Impl>(size) as
        Array<IEmailMailboxDownloadAttachmentRequestEventArgs?>
  }
}
