package Windows.ApplicationModel.Email.DataProvider

import Windows.Foundation.IAsyncAction
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEmailMailboxDownloadMessageRequest.ABI::class)
@Signature("{497b4187-5b4d-4b23-816c-f3842beb753e}")
@Guid("497b41875b4d4b23816cf3842beb753e")
@WinRTInterface("497b41875b4d4b23816cf3842beb753e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxDownloadMessageRequest.ByReference::class)
public interface IEmailMailboxDownloadMessageRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EmailMailboxId(): String?

  @InterfaceMethod(1)
  public fun get_EmailMessageId(): String?

  @InterfaceMethod(2)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxDownloadMessageRequest> {
    public override fun getValue() =
        ABI.makeIEmailMailboxDownloadMessageRequest(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxDownloadMessageRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxDownloadMessageRequest {
    public val __996535718_Ptr: Pointer?

    public val _996535718_VtblPtr: Pointer?
      get() = __996535718_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EmailMailboxId(): String? {
      val fnPtr = _996535718_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__996535718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EmailMessageId(): String? {
      val fnPtr = _996535718_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__996535718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _996535718_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__996535718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _996535718_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__996535718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxDownloadMessageRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __996535718_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxDownloadMessageRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("497b41875b4d4b23816cf3842beb753e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxDownloadMessageRequest(ptr: Pointer?): WithDefault =
        IEmailMailboxDownloadMessageRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxDownloadMessageRequest {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxDownloadMessageRequest(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxDownloadMessageRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__996535718_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxDownloadMessageRequest):
        Array<IEmailMailboxDownloadMessageRequest?> = (elements as
        Array<IEmailMailboxDownloadMessageRequest?>).castToImpl<IEmailMailboxDownloadMessageRequest,IEmailMailboxDownloadMessageRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxDownloadMessageRequest?> =
        arrayOfNulls<IEmailMailboxDownloadMessageRequest_Impl>(size) as
        Array<IEmailMailboxDownloadMessageRequest?>
  }
}
