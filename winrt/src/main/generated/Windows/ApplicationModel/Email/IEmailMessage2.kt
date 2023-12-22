package Windows.ApplicationModel.Email

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
import Windows.Storage.Streams.IRandomAccessStreamReference
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

@ABIMarker(IEmailMessage2.ABI::class)
@Signature("{fdc8248b-9f1a-44db-bd3c-65c384770f86}")
@Guid("fdc8248b9f1a44dbbd3c65c384770f86")
@WinRTInterface("fdc8248b9f1a44dbbd3c65c384770f86")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMessage2.ByReference::class)
public interface IEmailMessage2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_RemoteId(): String?

  @InterfaceMethod(2)
  public fun put_RemoteId(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_MailboxId(): String?

  @InterfaceMethod(4)
  public fun get_ConversationId(): String?

  @InterfaceMethod(5)
  public fun get_FolderId(): String?

  @InterfaceMethod(6)
  public fun get_AllowInternetImages(): Boolean

  @InterfaceMethod(7)
  public fun put_AllowInternetImages(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_ChangeNumber(): WinDef.ULONG

  @InterfaceMethod(9)
  public fun get_DownloadState(): EmailMessageDownloadState?

  @InterfaceMethod(10)
  public fun put_DownloadState(value: EmailMessageDownloadState?): Unit

  @InterfaceMethod(11)
  public fun get_EstimatedDownloadSizeInBytes(): WinDef.UINT

  @InterfaceMethod(12)
  public fun put_EstimatedDownloadSizeInBytes(value: WinDef.UINT): Unit

  @InterfaceMethod(13)
  public fun get_FlagState(): EmailFlagState?

  @InterfaceMethod(14)
  public fun put_FlagState(value: EmailFlagState?): Unit

  @InterfaceMethod(15)
  public fun get_HasPartialBodies(): Boolean

  @InterfaceMethod(16)
  public fun get_Importance(): EmailImportance?

  @InterfaceMethod(17)
  public fun put_Importance(value: EmailImportance?): Unit

  @InterfaceMethod(18)
  public fun get_InResponseToMessageId(): String?

  @InterfaceMethod(19)
  public fun get_IrmInfo(): EmailIrmInfo?

  @InterfaceMethod(20)
  public fun put_IrmInfo(value: EmailIrmInfo?): Unit

  @InterfaceMethod(21)
  public fun get_IsDraftMessage(): Boolean

  @InterfaceMethod(22)
  public fun get_IsRead(): Boolean

  @InterfaceMethod(23)
  public fun put_IsRead(value: Boolean): Unit

  @InterfaceMethod(24)
  public fun get_IsSeen(): Boolean

  @InterfaceMethod(25)
  public fun put_IsSeen(value: Boolean): Unit

  @InterfaceMethod(26)
  public fun get_IsServerSearchMessage(): Boolean

  @InterfaceMethod(27)
  public fun get_IsSmartSendable(): Boolean

  @InterfaceMethod(28)
  public fun get_MessageClass(): String?

  @InterfaceMethod(29)
  public fun put_MessageClass(value: String?): Unit

  @InterfaceMethod(30)
  public fun get_NormalizedSubject(): String?

  @InterfaceMethod(31)
  public fun get_OriginalCodePage(): Int

  @InterfaceMethod(32)
  public fun put_OriginalCodePage(value: Int): Unit

  @InterfaceMethod(33)
  public fun get_Preview(): String?

  @InterfaceMethod(34)
  public fun put_Preview(value: String?): Unit

  @InterfaceMethod(35)
  public fun get_LastResponseKind(): EmailMessageResponseKind?

  @InterfaceMethod(36)
  public fun put_LastResponseKind(value: EmailMessageResponseKind?): Unit

  @InterfaceMethod(37)
  public fun get_Sender(): EmailRecipient?

  @InterfaceMethod(38)
  public fun put_Sender(value: EmailRecipient?): Unit

  @InterfaceMethod(39)
  public fun get_SentTime(): IReference<DateTime?>?

  @InterfaceMethod(40)
  public fun put_SentTime(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(41)
  public fun get_MeetingInfo(): EmailMeetingInfo?

  @InterfaceMethod(42)
  public fun put_MeetingInfo(value: EmailMeetingInfo?): Unit

  @InterfaceMethod(43)
  public fun GetBodyStream(type: EmailMessageBodyKind?): IRandomAccessStreamReference?

  @InterfaceMethod(44)
  public fun SetBodyStream(type: EmailMessageBodyKind?, stream: IRandomAccessStreamReference?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEmailMessage2>
      {
    public override fun getValue() = ABI.makeIEmailMessage2(pointer.getPointer(0))

    public fun setValue(value: IEmailMessage2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMessage2 {
    public val __1269602160_Ptr: Pointer?

    public val _1269602160_VtblPtr: Pointer?
      get() = __1269602160_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RemoteId(): String? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_RemoteId(value: String?): Unit {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_MailboxId(): String? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ConversationId(): String? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_FolderId(): String? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_AllowInternetImages(): Boolean {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_AllowInternetImages(value: Boolean): Unit {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ChangeNumber(): WinDef.ULONG {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_DownloadState(): EmailMessageDownloadState? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMessageDownloadState>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMessageDownloadState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_DownloadState(value: EmailMessageDownloadState?): Unit {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_EstimatedDownloadSizeInBytes(): WinDef.UINT {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_EstimatedDownloadSizeInBytes(value: WinDef.UINT): Unit {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_FlagState(): EmailFlagState? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailFlagState>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailFlagState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_FlagState(value: EmailFlagState?): Unit {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_HasPartialBodies(): Boolean {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun get_Importance(): EmailImportance? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailImportance>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailImportance>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_Importance(value: EmailImportance?): Unit {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_InResponseToMessageId(): String? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_IrmInfo(): EmailIrmInfo? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailIrmInfo>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailIrmInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_IrmInfo(value: EmailIrmInfo?): Unit {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_IsDraftMessage(): Boolean {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(22)
    public override fun get_IsRead(): Boolean {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun put_IsRead(value: Boolean): Unit {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_IsSeen(): Boolean {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun put_IsSeen(value: Boolean): Unit {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_IsServerSearchMessage(): Boolean {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun get_IsSmartSendable(): Boolean {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(28)
    public override fun get_MessageClass(): String? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_MessageClass(value: String?): Unit {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_NormalizedSubject(): String? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun get_OriginalCodePage(): Int {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(32)
    public override fun put_OriginalCodePage(value: Int): Unit {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(33)
    public override fun get_Preview(): String? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun put_Preview(value: String?): Unit {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun get_LastResponseKind(): EmailMessageResponseKind? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMessageResponseKind>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMessageResponseKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun put_LastResponseKind(value: EmailMessageResponseKind?): Unit {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun get_Sender(): EmailRecipient? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailRecipient>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailRecipient>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun put_Sender(value: EmailRecipient?): Unit {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun get_SentTime(): IReference<DateTime?>? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(40)
    public override fun put_SentTime(value: IReference<DateTime?>?): Unit {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun get_MeetingInfo(): EmailMeetingInfo? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMeetingInfo>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMeetingInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun put_MeetingInfo(value: EmailMeetingInfo?): Unit {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun GetBodyStream(type: EmailMessageBodyKind?): IRandomAccessStreamReference? {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun SetBodyStream(type: EmailMessageBodyKind?,
        stream: IRandomAccessStreamReference?): Unit {
      val fnPtr = _1269602160_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1269602160_Ptr, marshalToNative(type),
          marshalToNative(stream),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEmailMessage2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1269602160_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMessage2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fdc8248b9f1a44dbbd3c65c384770f86")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMessage2(ptr: Pointer?): WithDefault = IEmailMessage2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMessage2 {
      val address = segment.toRawLongValue()
      return makeIEmailMessage2(Pointer(address))
    }

    public override fun toNative(obj: IEmailMessage2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1269602160_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMessage2): Array<IEmailMessage2?> = (elements as
        Array<IEmailMessage2?>).castToImpl<IEmailMessage2,IEmailMessage2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMessage2?> =
        arrayOfNulls<IEmailMessage2_Impl>(size) as Array<IEmailMessage2?>
  }
}
