package Windows.ApplicationModel.Email.DataProvider

import Windows.ApplicationModel.Email.EmailMailboxAutoReplyMessageResponseKind
import Windows.ApplicationModel.Email.EmailMailboxAutoReplySettings
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

@ABIMarker(IEmailMailboxGetAutoReplySettingsRequest.ABI::class)
@Signature("{9b380789-1e88-4e01-84cc-1386ad9a2c2f}")
@Guid("9b3807891e884e0184cc1386ad9a2c2f")
@WinRTInterface("9b3807891e884e0184cc1386ad9a2c2f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxGetAutoReplySettingsRequest.ByReference::class)
public interface IEmailMailboxGetAutoReplySettingsRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EmailMailboxId(): String?

  @InterfaceMethod(1)
  public fun get_RequestedFormat(): EmailMailboxAutoReplyMessageResponseKind?

  @InterfaceMethod(2)
  public fun ReportCompletedAsync(autoReplySettings: EmailMailboxAutoReplySettings?): IAsyncAction?

  @InterfaceMethod(3)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxGetAutoReplySettingsRequest> {
    public override fun getValue() =
        ABI.makeIEmailMailboxGetAutoReplySettingsRequest(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxGetAutoReplySettingsRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxGetAutoReplySettingsRequest {
    public val __90914173_Ptr: Pointer?

    public val _90914173_VtblPtr: Pointer?
      get() = __90914173_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EmailMailboxId(): String? {
      val fnPtr = _90914173_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__90914173_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RequestedFormat(): EmailMailboxAutoReplyMessageResponseKind? {
      val fnPtr = _90914173_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxAutoReplyMessageResponseKind>()
      val hr = fn.invokeHR(arrayOf(__90914173_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<EmailMailboxAutoReplyMessageResponseKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportCompletedAsync(autoReplySettings: EmailMailboxAutoReplySettings?):
        IAsyncAction? {
      val fnPtr = _90914173_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__90914173_Ptr, marshalToNative(autoReplySettings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _90914173_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__90914173_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxGetAutoReplySettingsRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __90914173_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxGetAutoReplySettingsRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b3807891e884e0184cc1386ad9a2c2f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxGetAutoReplySettingsRequest(ptr: Pointer?): WithDefault =
        IEmailMailboxGetAutoReplySettingsRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEmailMailboxGetAutoReplySettingsRequest {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxGetAutoReplySettingsRequest(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxGetAutoReplySettingsRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__90914173_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxGetAutoReplySettingsRequest):
        Array<IEmailMailboxGetAutoReplySettingsRequest?> = (elements as
        Array<IEmailMailboxGetAutoReplySettingsRequest?>).castToImpl<IEmailMailboxGetAutoReplySettingsRequest,IEmailMailboxGetAutoReplySettingsRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxGetAutoReplySettingsRequest?> =
        arrayOfNulls<IEmailMailboxGetAutoReplySettingsRequest_Impl>(size) as
        Array<IEmailMailboxGetAutoReplySettingsRequest?>
  }
}
