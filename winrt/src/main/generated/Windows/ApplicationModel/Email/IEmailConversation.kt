package Windows.ApplicationModel.Email

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncOperation
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEmailConversation.ABI::class)
@Signature("{da18c248-a0bc-4349-902d-90f66389f51b}")
@Guid("da18c248a0bc4349902d90f66389f51b")
@WinRTInterface("da18c248a0bc4349902d90f66389f51b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailConversation.ByReference::class)
public interface IEmailConversation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_MailboxId(): String?

  @InterfaceMethod(2)
  public fun get_FlagState(): EmailFlagState?

  @InterfaceMethod(3)
  public fun get_HasAttachment(): Boolean

  @InterfaceMethod(4)
  public fun get_Importance(): EmailImportance?

  @InterfaceMethod(5)
  public fun get_LastEmailResponseKind(): EmailMessageResponseKind?

  @InterfaceMethod(6)
  public fun get_MessageCount(): WinDef.UINT

  @InterfaceMethod(7)
  public fun get_MostRecentMessageId(): String?

  @InterfaceMethod(8)
  public fun get_MostRecentMessageTime(): DateTime?

  @InterfaceMethod(9)
  public fun get_Preview(): String?

  @InterfaceMethod(10)
  public fun get_LatestSender(): EmailRecipient?

  @InterfaceMethod(11)
  public fun get_Subject(): String?

  @InterfaceMethod(12)
  public fun get_UnreadMessageCount(): WinDef.UINT

  @InterfaceMethod(13)
  public fun FindMessagesAsync(): IAsyncOperation<IVectorView<EmailMessage?>?>?

  @InterfaceMethod(14)
  public fun FindMessagesAsync(count: WinDef.UINT): IAsyncOperation<IVectorView<EmailMessage?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailConversation> {
    public override fun getValue() = ABI.makeIEmailConversation(pointer.getPointer(0))

    public fun setValue(value: IEmailConversation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailConversation {
    public val __1883047544_Ptr: Pointer?

    public val _1883047544_VtblPtr: Pointer?
      get() = __1883047544_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1883047544_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1883047544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MailboxId(): String? {
      val fnPtr = _1883047544_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1883047544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FlagState(): EmailFlagState? {
      val fnPtr = _1883047544_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailFlagState>()
      val hr = fn.invokeHR(arrayOf(__1883047544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailFlagState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_HasAttachment(): Boolean {
      val fnPtr = _1883047544_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1883047544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Importance(): EmailImportance? {
      val fnPtr = _1883047544_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailImportance>()
      val hr = fn.invokeHR(arrayOf(__1883047544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailImportance>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_LastEmailResponseKind(): EmailMessageResponseKind? {
      val fnPtr = _1883047544_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMessageResponseKind>()
      val hr = fn.invokeHR(arrayOf(__1883047544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMessageResponseKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_MessageCount(): WinDef.UINT {
      val fnPtr = _1883047544_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1883047544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_MostRecentMessageId(): String? {
      val fnPtr = _1883047544_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1883047544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_MostRecentMessageTime(): DateTime? {
      val fnPtr = _1883047544_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1883047544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_Preview(): String? {
      val fnPtr = _1883047544_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1883047544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_LatestSender(): EmailRecipient? {
      val fnPtr = _1883047544_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailRecipient>()
      val hr = fn.invokeHR(arrayOf(__1883047544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailRecipient>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_Subject(): String? {
      val fnPtr = _1883047544_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1883047544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_UnreadMessageCount(): WinDef.UINT {
      val fnPtr = _1883047544_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1883047544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun FindMessagesAsync(): IAsyncOperation<IVectorView<EmailMessage?>?>? {
      val fnPtr = _1883047544_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<EmailMessage?>?>>()
      val hr = fn.invokeHR(arrayOf(__1883047544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<EmailMessage?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun FindMessagesAsync(count: WinDef.UINT):
        IAsyncOperation<IVectorView<EmailMessage?>?>? {
      val fnPtr = _1883047544_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<EmailMessage?>?>>()
      val hr = fn.invokeHR(arrayOf(__1883047544_Ptr, count, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<EmailMessage?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IEmailConversation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1883047544_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailConversation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da18c248a0bc4349902d90f66389f51b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailConversation(ptr: Pointer?): WithDefault = IEmailConversation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailConversation {
      val address = segment.toRawLongValue()
      return makeIEmailConversation(Pointer(address))
    }

    public override fun toNative(obj: IEmailConversation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1883047544_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailConversation): Array<IEmailConversation?> =
        (elements as
        Array<IEmailConversation?>).castToImpl<IEmailConversation,IEmailConversation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailConversation?> =
        arrayOfNulls<IEmailConversation_Impl>(size) as Array<IEmailConversation?>
  }
}
