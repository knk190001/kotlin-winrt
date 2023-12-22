package Windows.ApplicationModel.Chat

import Windows.Foundation.Collections.IVector
import Windows.Foundation.DateTime
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
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

@ABIMarker(IChatConversation.ABI::class)
@Signature("{a58c080d-1a6f-46dc-8f3d-f5028660b6ee}")
@Guid("a58c080d1a6f46dc8f3df5028660b6ee")
@WinRTInterface("a58c080d1a6f46dc8f3df5028660b6ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatConversation.ByReference::class)
public interface IChatConversation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HasUnreadMessages(): Boolean

  @InterfaceMethod(1)
  public fun get_Id(): String?

  @InterfaceMethod(2)
  public fun get_Subject(): String?

  @InterfaceMethod(3)
  public fun put_Subject(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_IsConversationMuted(): Boolean

  @InterfaceMethod(5)
  public fun put_IsConversationMuted(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_MostRecentMessageId(): String?

  @InterfaceMethod(7)
  public fun get_Participants(): IVector<String?>?

  @InterfaceMethod(8)
  public fun get_ThreadingInfo(): ChatConversationThreadingInfo?

  @InterfaceMethod(9)
  public fun DeleteAsync(): IAsyncAction?

  @InterfaceMethod(10)
  public fun GetMessageReader(): ChatMessageReader?

  @InterfaceMethod(11)
  public fun MarkMessagesAsReadAsync(): IAsyncAction?

  @InterfaceMethod(12)
  public fun MarkMessagesAsReadAsync(value: DateTime?): IAsyncAction?

  @InterfaceMethod(13)
  public fun SaveAsync(): IAsyncAction?

  @InterfaceMethod(14)
  public fun NotifyLocalParticipantComposing(
    transportId: String?,
    participantAddress: String?,
    isComposing: Boolean
  ): Unit

  @InterfaceMethod(15)
  public fun NotifyRemoteParticipantComposing(
    transportId: String?,
    participantAddress: String?,
    isComposing: Boolean
  ): Unit

  @InterfaceMethod(16)
  public fun add_RemoteParticipantComposingChanged(handler: TypedEventHandler<ChatConversation?,
      RemoteParticipantComposingChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_RemoteParticipantComposingChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatConversation> {
    public override fun getValue() = ABI.makeIChatConversation(pointer.getPointer(0))

    public fun setValue(value: IChatConversation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatConversation {
    public val __20598658_Ptr: Pointer?

    public val _20598658_VtblPtr: Pointer?
      get() = __20598658_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HasUnreadMessages(): Boolean {
      val fnPtr = _20598658_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Id(): String? {
      val fnPtr = _20598658_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Subject(): String? {
      val fnPtr = _20598658_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Subject(value: String?): Unit {
      val fnPtr = _20598658_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsConversationMuted(): Boolean {
      val fnPtr = _20598658_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsConversationMuted(value: Boolean): Unit {
      val fnPtr = _20598658_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_MostRecentMessageId(): String? {
      val fnPtr = _20598658_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Participants(): IVector<String?>? {
      val fnPtr = _20598658_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ThreadingInfo(): ChatConversationThreadingInfo? {
      val fnPtr = _20598658_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatConversationThreadingInfo>()
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatConversationThreadingInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun DeleteAsync(): IAsyncAction? {
      val fnPtr = _20598658_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetMessageReader(): ChatMessageReader? {
      val fnPtr = _20598658_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatMessageReader>()
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatMessageReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun MarkMessagesAsReadAsync(): IAsyncAction? {
      val fnPtr = _20598658_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun MarkMessagesAsReadAsync(value: DateTime?): IAsyncAction? {
      val fnPtr = _20598658_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun SaveAsync(): IAsyncAction? {
      val fnPtr = _20598658_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun NotifyLocalParticipantComposing(
      transportId: String?,
      participantAddress: String?,
      isComposing: Boolean
    ): Unit {
      val fnPtr = _20598658_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr, marshalToNative(transportId),
          marshalToNative(participantAddress), isComposing,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun NotifyRemoteParticipantComposing(
      transportId: String?,
      participantAddress: String?,
      isComposing: Boolean
    ): Unit {
      val fnPtr = _20598658_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr, marshalToNative(transportId),
          marshalToNative(participantAddress), isComposing,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override
        fun add_RemoteParticipantComposingChanged(handler: TypedEventHandler<ChatConversation?,
        RemoteParticipantComposingChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _20598658_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_RemoteParticipantComposingChanged(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _20598658_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__20598658_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IChatConversation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __20598658_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatConversation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a58c080d1a6f46dc8f3df5028660b6ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatConversation(ptr: Pointer?): WithDefault = IChatConversation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatConversation {
      val address = segment.toRawLongValue()
      return makeIChatConversation(Pointer(address))
    }

    public override fun toNative(obj: IChatConversation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__20598658_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatConversation): Array<IChatConversation?> = (elements
        as Array<IChatConversation?>).castToImpl<IChatConversation,IChatConversation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatConversation?> =
        arrayOfNulls<IChatConversation_Impl>(size) as Array<IChatConversation?>
  }
}
