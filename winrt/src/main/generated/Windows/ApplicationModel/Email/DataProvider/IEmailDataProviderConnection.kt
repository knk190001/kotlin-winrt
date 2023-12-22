package Windows.ApplicationModel.Email.DataProvider

import Windows.Foundation.EventRegistrationToken
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEmailDataProviderConnection.ABI::class)
@Signature("{3b9c9dc7-37b2-4bf0-ae30-7b644a1c96e1}")
@Guid("3b9c9dc737b24bf0ae307b644a1c96e1")
@WinRTInterface("3b9c9dc737b24bf0ae307b644a1c96e1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailDataProviderConnection.ByReference::class)
public interface IEmailDataProviderConnection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_MailboxSyncRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
      EmailMailboxSyncManagerSyncRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_MailboxSyncRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_DownloadMessageRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
      EmailMailboxDownloadMessageRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_DownloadMessageRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public
      fun add_DownloadAttachmentRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
      EmailMailboxDownloadAttachmentRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_DownloadAttachmentRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_CreateFolderRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
      EmailMailboxCreateFolderRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_CreateFolderRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_DeleteFolderRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
      EmailMailboxDeleteFolderRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_DeleteFolderRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_EmptyFolderRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
      EmailMailboxEmptyFolderRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_EmptyFolderRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_MoveFolderRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
      EmailMailboxMoveFolderRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_MoveFolderRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public
      fun add_UpdateMeetingResponseRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
      EmailMailboxUpdateMeetingResponseRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_UpdateMeetingResponseRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun add_ForwardMeetingRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
      EmailMailboxForwardMeetingRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_ForwardMeetingRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public
      fun add_ProposeNewTimeForMeetingRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
      EmailMailboxProposeNewTimeForMeetingRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_ProposeNewTimeForMeetingRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(20)
  public
      fun add_SetAutoReplySettingsRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
      EmailMailboxSetAutoReplySettingsRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(21)
  public fun remove_SetAutoReplySettingsRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(22)
  public
      fun add_GetAutoReplySettingsRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
      EmailMailboxGetAutoReplySettingsRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(23)
  public fun remove_GetAutoReplySettingsRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(24)
  public fun add_ResolveRecipientsRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
      EmailMailboxResolveRecipientsRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(25)
  public fun remove_ResolveRecipientsRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(26)
  public
      fun add_ValidateCertificatesRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
      EmailMailboxValidateCertificatesRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(27)
  public fun remove_ValidateCertificatesRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(28)
  public
      fun add_ServerSearchReadBatchRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
      EmailMailboxServerSearchReadBatchRequestEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(29)
  public fun remove_ServerSearchReadBatchRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(30)
  public fun Start(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailDataProviderConnection> {
    public override fun getValue() = ABI.makeIEmailDataProviderConnection(pointer.getPointer(0))

    public fun setValue(value: IEmailDataProviderConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailDataProviderConnection {
    public val __1600249757_Ptr: Pointer?

    public val _1600249757_VtblPtr: Pointer?
      get() = __1600249757_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_MailboxSyncRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
        EmailMailboxSyncManagerSyncRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_MailboxSyncRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_DownloadMessageRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
        EmailMailboxDownloadMessageRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_DownloadMessageRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_DownloadAttachmentRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
        EmailMailboxDownloadAttachmentRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_DownloadAttachmentRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_CreateFolderRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
        EmailMailboxCreateFolderRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_CreateFolderRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override
        fun add_DeleteFolderRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
        EmailMailboxDeleteFolderRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_DeleteFolderRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override
        fun add_EmptyFolderRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
        EmailMailboxEmptyFolderRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_EmptyFolderRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override
        fun add_MoveFolderRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
        EmailMailboxMoveFolderRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_MoveFolderRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override
        fun add_UpdateMeetingResponseRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
        EmailMailboxUpdateMeetingResponseRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_UpdateMeetingResponseRequested(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override
        fun add_ForwardMeetingRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
        EmailMailboxForwardMeetingRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_ForwardMeetingRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override
        fun add_ProposeNewTimeForMeetingRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
        EmailMailboxProposeNewTimeForMeetingRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_ProposeNewTimeForMeetingRequested(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override
        fun add_SetAutoReplySettingsRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
        EmailMailboxSetAutoReplySettingsRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun remove_SetAutoReplySettingsRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override
        fun add_GetAutoReplySettingsRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
        EmailMailboxGetAutoReplySettingsRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun remove_GetAutoReplySettingsRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override
        fun add_ResolveRecipientsRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
        EmailMailboxResolveRecipientsRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun remove_ResolveRecipientsRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override
        fun add_ValidateCertificatesRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
        EmailMailboxValidateCertificatesRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun remove_ValidateCertificatesRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override
        fun add_ServerSearchReadBatchRequested(handler: TypedEventHandler<EmailDataProviderConnection?,
        EmailMailboxServerSearchReadBatchRequestEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun remove_ServerSearchReadBatchRequested(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun Start(): Unit {
      val fnPtr = _1600249757_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600249757_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEmailDataProviderConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1600249757_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailDataProviderConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b9c9dc737b24bf0ae307b644a1c96e1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailDataProviderConnection(ptr: Pointer?): WithDefault =
        IEmailDataProviderConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailDataProviderConnection {
      val address = segment.toRawLongValue()
      return makeIEmailDataProviderConnection(Pointer(address))
    }

    public override fun toNative(obj: IEmailDataProviderConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1600249757_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailDataProviderConnection):
        Array<IEmailDataProviderConnection?> = (elements as
        Array<IEmailDataProviderConnection?>).castToImpl<IEmailDataProviderConnection,IEmailDataProviderConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailDataProviderConnection?> =
        arrayOfNulls<IEmailDataProviderConnection_Impl>(size) as
        Array<IEmailDataProviderConnection?>
  }
}
