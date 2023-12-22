package Windows.ApplicationModel.Chat

import Windows.ApplicationModel.Chat.IChatMessageStore.ABI.IID
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IChatMessageStore2.ABI::class)
@Signature("{ad4dc4ee-3ad4-491b-b311-abdf9bb22768}")
@Guid("ad4dc4ee3ad4491bb311abdf9bb22768")
@WinRTInterface("ad4dc4ee3ad4491bb311abdf9bb22768")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageStore2.ByReference::class)
public interface IChatMessageStore2 : NativeMapped, IWinRTInterface, IChatMessageStore {
  @InterfaceMethod(0)
  public fun ForwardMessageAsync(localChatMessageId: String?, addresses: IIterable<String?>?):
      IAsyncOperation<ChatMessage?>?

  @InterfaceMethod(1)
  public fun GetConversationAsync(conversationId: String?): IAsyncOperation<ChatConversation?>?

  @InterfaceMethod(2)
  public fun GetConversationAsync(conversationId: String?, transportIds: IIterable<String?>?):
      IAsyncOperation<ChatConversation?>?

  @InterfaceMethod(3)
  public fun GetConversationFromThreadingInfoAsync(threadingInfo: ChatConversationThreadingInfo?):
      IAsyncOperation<ChatConversation?>?

  @InterfaceMethod(4)
  public fun GetConversationReader(): ChatConversationReader?

  @InterfaceMethod(5)
  public fun GetConversationReader(transportIds: IIterable<String?>?): ChatConversationReader?

  @InterfaceMethod(6)
  public fun GetMessageByRemoteIdAsync(transportId: String?, remoteId: String?):
      IAsyncOperation<ChatMessage?>?

  @InterfaceMethod(7)
  public fun GetUnseenCountAsync(): IAsyncOperation<Int>?

  @InterfaceMethod(8)
  public fun GetUnseenCountAsync(transportIds: IIterable<String?>?): IAsyncOperation<Int>?

  @InterfaceMethod(9)
  public fun MarkAsSeenAsync(): IAsyncAction?

  @InterfaceMethod(10)
  public fun MarkAsSeenAsync(transportIds: IIterable<String?>?): IAsyncAction?

  @InterfaceMethod(11)
  public fun GetSearchReader(value: ChatQueryOptions?): ChatSearchReader?

  @InterfaceMethod(12)
  public fun SaveMessageAsync(chatMessage: ChatMessage?): IAsyncAction?

  @InterfaceMethod(13)
  public fun TryCancelDownloadMessageAsync(localChatMessageId: String?): IAsyncOperation<Boolean>?

  @InterfaceMethod(14)
  public fun TryCancelSendMessageAsync(localChatMessageId: String?): IAsyncOperation<Boolean>?

  @InterfaceMethod(15)
  public fun add_StoreChanged(handler: TypedEventHandler<ChatMessageStore?,
      ChatMessageStoreChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_StoreChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageStore2> {
    public override fun getValue() = ABI.makeIChatMessageStore2(pointer.getPointer(0))

    public fun setValue(value: IChatMessageStore2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageStore2, IChatMessageStore.WithDefault {
    public val __1906416441_Ptr: Pointer?

    public val _1906416441_VtblPtr: Pointer?
      get() = __1906416441_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ForwardMessageAsync(localChatMessageId: String?,
        addresses: IIterable<String?>?): IAsyncOperation<ChatMessage?>? {
      val fnPtr = _1906416441_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ChatMessage?>>()
      val hr = fn.invokeHR(arrayOf(__1906416441_Ptr, marshalToNative(localChatMessageId),
          marshalToNative(addresses), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ChatMessage?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetConversationAsync(conversationId: String?):
        IAsyncOperation<ChatConversation?>? {
      val fnPtr = _1906416441_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ChatConversation?>>()
      val hr = fn.invokeHR(arrayOf(__1906416441_Ptr, marshalToNative(conversationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ChatConversation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetConversationAsync(conversationId: String?,
        transportIds: IIterable<String?>?): IAsyncOperation<ChatConversation?>? {
      val fnPtr = _1906416441_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ChatConversation?>>()
      val hr = fn.invokeHR(arrayOf(__1906416441_Ptr, marshalToNative(conversationId),
          marshalToNative(transportIds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ChatConversation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override
        fun GetConversationFromThreadingInfoAsync(threadingInfo: ChatConversationThreadingInfo?):
        IAsyncOperation<ChatConversation?>? {
      val fnPtr = _1906416441_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ChatConversation?>>()
      val hr = fn.invokeHR(arrayOf(__1906416441_Ptr, marshalToNative(threadingInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ChatConversation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetConversationReader(): ChatConversationReader? {
      val fnPtr = _1906416441_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatConversationReader>()
      val hr = fn.invokeHR(arrayOf(__1906416441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatConversationReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetConversationReader(transportIds: IIterable<String?>?):
        ChatConversationReader? {
      val fnPtr = _1906416441_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatConversationReader>()
      val hr = fn.invokeHR(arrayOf(__1906416441_Ptr, marshalToNative(transportIds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatConversationReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetMessageByRemoteIdAsync(transportId: String?, remoteId: String?):
        IAsyncOperation<ChatMessage?>? {
      val fnPtr = _1906416441_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ChatMessage?>>()
      val hr = fn.invokeHR(arrayOf(__1906416441_Ptr, marshalToNative(transportId),
          marshalToNative(remoteId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ChatMessage?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetUnseenCountAsync(): IAsyncOperation<Int>? {
      val fnPtr = _1906416441_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Int>>()
      val hr = fn.invokeHR(arrayOf(__1906416441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetUnseenCountAsync(transportIds: IIterable<String?>?):
        IAsyncOperation<Int>? {
      val fnPtr = _1906416441_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Int>>()
      val hr = fn.invokeHR(arrayOf(__1906416441_Ptr, marshalToNative(transportIds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun MarkAsSeenAsync(): IAsyncAction? {
      val fnPtr = _1906416441_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1906416441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun MarkAsSeenAsync(transportIds: IIterable<String?>?): IAsyncAction? {
      val fnPtr = _1906416441_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1906416441_Ptr, marshalToNative(transportIds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun GetSearchReader(value: ChatQueryOptions?): ChatSearchReader? {
      val fnPtr = _1906416441_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatSearchReader>()
      val hr = fn.invokeHR(arrayOf(__1906416441_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatSearchReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun SaveMessageAsync(chatMessage: ChatMessage?): IAsyncAction? {
      val fnPtr = _1906416441_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1906416441_Ptr, marshalToNative(chatMessage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun TryCancelDownloadMessageAsync(localChatMessageId: String?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1906416441_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1906416441_Ptr, marshalToNative(localChatMessageId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun TryCancelSendMessageAsync(localChatMessageId: String?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1906416441_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1906416441_Ptr, marshalToNative(localChatMessageId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun add_StoreChanged(handler: TypedEventHandler<ChatMessageStore?,
        ChatMessageStoreChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1906416441_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1906416441_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_StoreChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1906416441_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1906416441_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IChatMessageStore2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IChatMessageStore {
    public override val __2016712679_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1906416441_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1906416441_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageStore2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ad4dc4ee3ad4491bb311abdf9bb22768")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageStore2(ptr: Pointer?): WithDefault = IChatMessageStore2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageStore2 {
      val address = segment.toRawLongValue()
      return makeIChatMessageStore2(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageStore2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1906416441_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageStore2): Array<IChatMessageStore2?> =
        (elements as
        Array<IChatMessageStore2?>).castToImpl<IChatMessageStore2,IChatMessageStore2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageStore2?> =
        arrayOfNulls<IChatMessageStore2_Impl>(size) as Array<IChatMessageStore2?>
  }
}
