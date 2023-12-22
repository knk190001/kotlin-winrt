package Windows.ApplicationModel.Email.DataProvider

import Windows.ApplicationModel.Email.EmailMessageBodyKind
import Windows.ApplicationModel.Email.EmailRecipient
import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IEmailMailboxForwardMeetingRequest.ABI::class)
@Signature("{616d6af1-70d4-4832-b869-b80542ae9be8}")
@Guid("616d6af170d44832b869b80542ae9be8")
@WinRTInterface("616d6af170d44832b869b80542ae9be8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxForwardMeetingRequest.ByReference::class)
public interface IEmailMailboxForwardMeetingRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EmailMailboxId(): String?

  @InterfaceMethod(1)
  public fun get_EmailMessageId(): String?

  @InterfaceMethod(2)
  public fun get_Recipients(): IVectorView<EmailRecipient?>?

  @InterfaceMethod(3)
  public fun get_Subject(): String?

  @InterfaceMethod(4)
  public fun get_ForwardHeaderType(): EmailMessageBodyKind?

  @InterfaceMethod(5)
  public fun get_ForwardHeader(): String?

  @InterfaceMethod(6)
  public fun get_Comment(): String?

  @InterfaceMethod(7)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(8)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxForwardMeetingRequest> {
    public override fun getValue() =
        ABI.makeIEmailMailboxForwardMeetingRequest(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxForwardMeetingRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxForwardMeetingRequest {
    public val __597744241_Ptr: Pointer?

    public val _597744241_VtblPtr: Pointer?
      get() = __597744241_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EmailMailboxId(): String? {
      val fnPtr = _597744241_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__597744241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EmailMessageId(): String? {
      val fnPtr = _597744241_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__597744241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Recipients(): IVectorView<EmailRecipient?>? {
      val fnPtr = _597744241_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<EmailRecipient?>>()
      val hr = fn.invokeHR(arrayOf(__597744241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<EmailRecipient?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Subject(): String? {
      val fnPtr = _597744241_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__597744241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ForwardHeaderType(): EmailMessageBodyKind? {
      val fnPtr = _597744241_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMessageBodyKind>()
      val hr = fn.invokeHR(arrayOf(__597744241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMessageBodyKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ForwardHeader(): String? {
      val fnPtr = _597744241_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__597744241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Comment(): String? {
      val fnPtr = _597744241_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__597744241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _597744241_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__597744241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _597744241_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__597744241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxForwardMeetingRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __597744241_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxForwardMeetingRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("616d6af170d44832b869b80542ae9be8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxForwardMeetingRequest(ptr: Pointer?): WithDefault =
        IEmailMailboxForwardMeetingRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxForwardMeetingRequest {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxForwardMeetingRequest(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxForwardMeetingRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__597744241_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxForwardMeetingRequest):
        Array<IEmailMailboxForwardMeetingRequest?> = (elements as
        Array<IEmailMailboxForwardMeetingRequest?>).castToImpl<IEmailMailboxForwardMeetingRequest,IEmailMailboxForwardMeetingRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxForwardMeetingRequest?> =
        arrayOfNulls<IEmailMailboxForwardMeetingRequest_Impl>(size) as
        Array<IEmailMailboxForwardMeetingRequest?>
  }
}
