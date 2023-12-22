package Windows.ApplicationModel.Email

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
import Windows.Foundation.DateTime
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEmailMailbox.ABI::class)
@Signature("{a8790649-cf5b-411b-80b1-4a6a1484ce25}")
@Guid("a8790649cf5b411b80b14a6a1484ce25")
@WinRTInterface("a8790649cf5b411b80b14a6a1484ce25")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailbox.ByReference::class)
public interface IEmailMailbox : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Capabilities(): EmailMailboxCapabilities?

  @InterfaceMethod(1)
  public fun get_ChangeTracker(): EmailMailboxChangeTracker?

  @InterfaceMethod(2)
  public fun get_DisplayName(): String?

  @InterfaceMethod(3)
  public fun put_DisplayName(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Id(): String?

  @InterfaceMethod(5)
  public fun get_IsOwnedByCurrentApp(): Boolean

  @InterfaceMethod(6)
  public fun get_IsDataEncryptedUnderLock(): Boolean

  @InterfaceMethod(7)
  public fun get_MailAddress(): String?

  @InterfaceMethod(8)
  public fun put_MailAddress(value: String?): Unit

  @InterfaceMethod(9)
  public fun get_MailAddressAliases(): IVector<String?>?

  @InterfaceMethod(10)
  public fun get_OtherAppReadAccess(): EmailMailboxOtherAppReadAccess?

  @InterfaceMethod(11)
  public fun put_OtherAppReadAccess(value: EmailMailboxOtherAppReadAccess?): Unit

  @InterfaceMethod(12)
  public fun get_OtherAppWriteAccess(): EmailMailboxOtherAppWriteAccess?

  @InterfaceMethod(13)
  public fun put_OtherAppWriteAccess(value: EmailMailboxOtherAppWriteAccess?): Unit

  @InterfaceMethod(14)
  public fun get_Policies(): EmailMailboxPolicies?

  @InterfaceMethod(15)
  public fun get_SourceDisplayName(): String?

  @InterfaceMethod(16)
  public fun get_SyncManager(): EmailMailboxSyncManager?

  @InterfaceMethod(17)
  public fun get_UserDataAccountId(): String?

  @InterfaceMethod(18)
  public fun GetConversationReader(): EmailConversationReader?

  @InterfaceMethod(19)
  public fun GetConversationReader(options: EmailQueryOptions?): EmailConversationReader?

  @InterfaceMethod(20)
  public fun GetMessageReader(): EmailMessageReader?

  @InterfaceMethod(21)
  public fun GetMessageReader(options: EmailQueryOptions?): EmailMessageReader?

  @InterfaceMethod(22)
  public fun DeleteAsync(): IAsyncAction?

  @InterfaceMethod(23)
  public fun GetConversationAsync(id: String?): IAsyncOperation<EmailConversation?>?

  @InterfaceMethod(24)
  public fun GetFolderAsync(id: String?): IAsyncOperation<EmailFolder?>?

  @InterfaceMethod(25)
  public fun GetMessageAsync(id: String?): IAsyncOperation<EmailMessage?>?

  @InterfaceMethod(26)
  public fun GetSpecialFolderAsync(folderType: EmailSpecialFolderKind?):
      IAsyncOperation<EmailFolder?>?

  @InterfaceMethod(27)
  public fun SaveAsync(): IAsyncAction?

  @InterfaceMethod(28)
  public fun MarkMessageAsSeenAsync(messageId: String?): IAsyncAction?

  @InterfaceMethod(29)
  public fun MarkFolderAsSeenAsync(folderId: String?): IAsyncAction?

  @InterfaceMethod(30)
  public fun MarkMessageReadAsync(messageId: String?, isRead: Boolean): IAsyncAction?

  @InterfaceMethod(31)
  public fun ChangeMessageFlagStateAsync(messageId: String?, flagState: EmailFlagState?):
      IAsyncAction?

  @InterfaceMethod(32)
  public fun TryMoveMessageAsync(messageId: String?, newParentFolderId: String?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(33)
  public fun TryMoveFolderAsync(folderId: String?, newParentFolderId: String?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(34)
  public fun TryMoveFolderAsync(
    folderId: String?,
    newParentFolderId: String?,
    newFolderName: String?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(35)
  public fun DeleteMessageAsync(messageId: String?): IAsyncAction?

  @InterfaceMethod(36)
  public fun MarkFolderSyncEnabledAsync(folderId: String?, isSyncEnabled: Boolean): IAsyncAction?

  @InterfaceMethod(37)
  public fun SendMessageAsync(message: EmailMessage?): IAsyncAction?

  @InterfaceMethod(38)
  public fun SaveDraftAsync(message: EmailMessage?): IAsyncAction?

  @InterfaceMethod(39)
  public fun DownloadMessageAsync(messageId: String?): IAsyncAction?

  @InterfaceMethod(40)
  public fun DownloadAttachmentAsync(attachmentId: String?): IAsyncAction?

  @InterfaceMethod(41)
  public fun CreateResponseMessageAsync(
    messageId: String?,
    responseType: EmailMessageResponseKind?,
    subject: String?,
    responseHeaderType: EmailMessageBodyKind?,
    responseHeader: String?
  ): IAsyncOperation<EmailMessage?>?

  @InterfaceMethod(42)
  public fun TryUpdateMeetingResponseAsync(
    meeting: EmailMessage?,
    response: EmailMeetingResponseType?,
    subject: String?,
    comment: String?,
    sendUpdate: Boolean
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(43)
  public fun TryForwardMeetingAsync(
    meeting: EmailMessage?,
    recipients: IIterable<EmailRecipient?>?,
    subject: String?,
    forwardHeaderType: EmailMessageBodyKind?,
    forwardHeader: String?,
    comment: String?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(44)
  public fun TryProposeNewTimeForMeetingAsync(
    meeting: EmailMessage?,
    newStartTime: DateTime?,
    newDuration: TimeSpan?,
    subject: String?,
    comment: String?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(45)
  public fun add_MailboxChanged(pHandler: TypedEventHandler<EmailMailbox?,
      EmailMailboxChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(46)
  public fun remove_MailboxChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(47)
  public fun SendMessageAsync(message: EmailMessage?, smartSend: Boolean): IAsyncAction?

  @InterfaceMethod(48)
  public fun TrySetAutoReplySettingsAsync(autoReplySettings: EmailMailboxAutoReplySettings?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(49)
  public
      fun TryGetAutoReplySettingsAsync(requestedFormat: EmailMailboxAutoReplyMessageResponseKind?):
      IAsyncOperation<EmailMailboxAutoReplySettings?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEmailMailbox>
      {
    public override fun getValue() = ABI.makeIEmailMailbox(pointer.getPointer(0))

    public fun setValue(value: IEmailMailbox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailbox {
    public val __164914033_Ptr: Pointer?

    public val _164914033_VtblPtr: Pointer?
      get() = __164914033_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Capabilities(): EmailMailboxCapabilities? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxCapabilities>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ChangeTracker(): EmailMailboxChangeTracker? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxChangeTracker>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxChangeTracker>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DisplayName(): String? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _164914033_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Id(): String? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsOwnedByCurrentApp(): Boolean {
      val fnPtr = _164914033_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_IsDataEncryptedUnderLock(): Boolean {
      val fnPtr = _164914033_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_MailAddress(): String? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_MailAddress(value: String?): Unit {
      val fnPtr = _164914033_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_MailAddressAliases(): IVector<String?>? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_OtherAppReadAccess(): EmailMailboxOtherAppReadAccess? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxOtherAppReadAccess>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxOtherAppReadAccess>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_OtherAppReadAccess(value: EmailMailboxOtherAppReadAccess?): Unit {
      val fnPtr = _164914033_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_OtherAppWriteAccess(): EmailMailboxOtherAppWriteAccess? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxOtherAppWriteAccess>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxOtherAppWriteAccess>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_OtherAppWriteAccess(value: EmailMailboxOtherAppWriteAccess?): Unit {
      val fnPtr = _164914033_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_Policies(): EmailMailboxPolicies? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxPolicies>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxPolicies>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_SourceDisplayName(): String? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_SyncManager(): EmailMailboxSyncManager? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxSyncManager>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxSyncManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_UserDataAccountId(): String? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun GetConversationReader(): EmailConversationReader? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailConversationReader>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailConversationReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun GetConversationReader(options: EmailQueryOptions?):
        EmailConversationReader? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailConversationReader>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailConversationReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun GetMessageReader(): EmailMessageReader? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMessageReader>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMessageReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun GetMessageReader(options: EmailQueryOptions?): EmailMessageReader? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMessageReader>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMessageReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun DeleteAsync(): IAsyncAction? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun GetConversationAsync(id: String?): IAsyncOperation<EmailConversation?>? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailConversation?>>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EmailConversation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun GetFolderAsync(id: String?): IAsyncOperation<EmailFolder?>? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailFolder?>>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EmailFolder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun GetMessageAsync(id: String?): IAsyncOperation<EmailMessage?>? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailMessage?>>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EmailMessage?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun GetSpecialFolderAsync(folderType: EmailSpecialFolderKind?):
        IAsyncOperation<EmailFolder?>? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailFolder?>>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(folderType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EmailFolder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun SaveAsync(): IAsyncAction? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun MarkMessageAsSeenAsync(messageId: String?): IAsyncAction? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(messageId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun MarkFolderAsSeenAsync(folderId: String?): IAsyncAction? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(folderId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun MarkMessageReadAsync(messageId: String?, isRead: Boolean): IAsyncAction? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(messageId), isRead, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun ChangeMessageFlagStateAsync(messageId: String?, flagState: EmailFlagState?):
        IAsyncAction? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(messageId),
          marshalToNative(flagState), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun TryMoveMessageAsync(messageId: String?, newParentFolderId: String?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(messageId),
          marshalToNative(newParentFolderId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun TryMoveFolderAsync(folderId: String?, newParentFolderId: String?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(folderId),
          marshalToNative(newParentFolderId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun TryMoveFolderAsync(
      folderId: String?,
      newParentFolderId: String?,
      newFolderName: String?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(folderId),
          marshalToNative(newParentFolderId), marshalToNative(newFolderName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun DeleteMessageAsync(messageId: String?): IAsyncAction? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(messageId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun MarkFolderSyncEnabledAsync(folderId: String?, isSyncEnabled: Boolean):
        IAsyncAction? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(folderId), isSyncEnabled,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun SendMessageAsync(message: EmailMessage?): IAsyncAction? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun SaveDraftAsync(message: EmailMessage?): IAsyncAction? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun DownloadMessageAsync(messageId: String?): IAsyncAction? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(messageId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(40)
    public override fun DownloadAttachmentAsync(attachmentId: String?): IAsyncAction? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(attachmentId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun CreateResponseMessageAsync(
      messageId: String?,
      responseType: EmailMessageResponseKind?,
      subject: String?,
      responseHeaderType: EmailMessageBodyKind?,
      responseHeader: String?
    ): IAsyncOperation<EmailMessage?>? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailMessage?>>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(messageId),
          marshalToNative(responseType), marshalToNative(subject),
          marshalToNative(responseHeaderType), marshalToNative(responseHeader), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EmailMessage?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun TryUpdateMeetingResponseAsync(
      meeting: EmailMessage?,
      response: EmailMeetingResponseType?,
      subject: String?,
      comment: String?,
      sendUpdate: Boolean
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(meeting),
          marshalToNative(response), marshalToNative(subject), marshalToNative(comment), sendUpdate,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun TryForwardMeetingAsync(
      meeting: EmailMessage?,
      recipients: IIterable<EmailRecipient?>?,
      subject: String?,
      forwardHeaderType: EmailMessageBodyKind?,
      forwardHeader: String?,
      comment: String?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(meeting),
          marshalToNative(recipients), marshalToNative(subject), marshalToNative(forwardHeaderType),
          marshalToNative(forwardHeader), marshalToNative(comment), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun TryProposeNewTimeForMeetingAsync(
      meeting: EmailMessage?,
      newStartTime: DateTime?,
      newDuration: TimeSpan?,
      subject: String?,
      comment: String?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(meeting),
          marshalToNative(newStartTime), marshalToNative(newDuration), marshalToNative(subject),
          marshalToNative(comment), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun add_MailboxChanged(pHandler: TypedEventHandler<EmailMailbox?,
        EmailMailboxChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(pHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun remove_MailboxChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _164914033_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(47)
    public override fun SendMessageAsync(message: EmailMessage?, smartSend: Boolean):
        IAsyncAction? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(message), smartSend, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override
        fun TrySetAutoReplySettingsAsync(autoReplySettings: EmailMailboxAutoReplySettings?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(autoReplySettings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override
        fun TryGetAutoReplySettingsAsync(requestedFormat: EmailMailboxAutoReplyMessageResponseKind?):
        IAsyncOperation<EmailMailboxAutoReplySettings?>? {
      val fnPtr = _164914033_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailMailboxAutoReplySettings?>>()
      val hr = fn.invokeHR(arrayOf(__164914033_Ptr, marshalToNative(requestedFormat), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<EmailMailboxAutoReplySettings?>>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailbox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __164914033_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailbox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a8790649cf5b411b80b14a6a1484ce25")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailbox(ptr: Pointer?): WithDefault = IEmailMailbox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailbox {
      val address = segment.toRawLongValue()
      return makeIEmailMailbox(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailbox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__164914033_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailbox): Array<IEmailMailbox?> = (elements as
        Array<IEmailMailbox?>).castToImpl<IEmailMailbox,IEmailMailbox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailbox?> =
        arrayOfNulls<IEmailMailbox_Impl>(size) as Array<IEmailMailbox?>
  }
}
