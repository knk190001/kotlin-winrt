package Windows.ApplicationModel.Email.DataProvider

import Windows.ApplicationModel.Email.EmailRecipientResolutionResult
import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IEmailMailboxResolveRecipientsRequest.ABI::class)
@Signature("{efa4cf70-7b39-4c9b-811e-41eaf43a332d}")
@Guid("efa4cf707b394c9b811e41eaf43a332d")
@WinRTInterface("efa4cf707b394c9b811e41eaf43a332d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxResolveRecipientsRequest.ByReference::class)
public interface IEmailMailboxResolveRecipientsRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EmailMailboxId(): String?

  @InterfaceMethod(1)
  public fun get_Recipients(): IVectorView<String?>?

  @InterfaceMethod(2)
  public fun ReportCompletedAsync(resolutionResults: IIterable<EmailRecipientResolutionResult?>?):
      IAsyncAction?

  @InterfaceMethod(3)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxResolveRecipientsRequest> {
    public override fun getValue() =
        ABI.makeIEmailMailboxResolveRecipientsRequest(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxResolveRecipientsRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxResolveRecipientsRequest {
    public val __1006859219_Ptr: Pointer?

    public val _1006859219_VtblPtr: Pointer?
      get() = __1006859219_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EmailMailboxId(): String? {
      val fnPtr = _1006859219_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1006859219_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Recipients(): IVectorView<String?>? {
      val fnPtr = _1006859219_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1006859219_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun ReportCompletedAsync(resolutionResults: IIterable<EmailRecipientResolutionResult?>?):
        IAsyncAction? {
      val fnPtr = _1006859219_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1006859219_Ptr, marshalToNative(resolutionResults), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _1006859219_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1006859219_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxResolveRecipientsRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1006859219_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxResolveRecipientsRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("efa4cf707b394c9b811e41eaf43a332d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxResolveRecipientsRequest(ptr: Pointer?): WithDefault =
        IEmailMailboxResolveRecipientsRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxResolveRecipientsRequest {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxResolveRecipientsRequest(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxResolveRecipientsRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1006859219_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxResolveRecipientsRequest):
        Array<IEmailMailboxResolveRecipientsRequest?> = (elements as
        Array<IEmailMailboxResolveRecipientsRequest?>).castToImpl<IEmailMailboxResolveRecipientsRequest,IEmailMailboxResolveRecipientsRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxResolveRecipientsRequest?> =
        arrayOfNulls<IEmailMailboxResolveRecipientsRequest_Impl>(size) as
        Array<IEmailMailboxResolveRecipientsRequest?>
  }
}
