package Windows.ApplicationModel.Chat

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IChatMessageStore.ABI::class)
@Signature("{31f2fd01-ccf6-580b-4976-0a07dd5d3b47}")
@Guid("31f2fd01ccf6580b49760a07dd5d3b47")
@WinRTInterface("31f2fd01ccf6580b49760a07dd5d3b47")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageStore.ByReference::class)
public interface IChatMessageStore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChangeTracker(): ChatMessageChangeTracker?

  @InterfaceMethod(1)
  public fun DeleteMessageAsync(localMessageId: String?): IAsyncAction?

  @InterfaceMethod(2)
  public fun DownloadMessageAsync(localChatMessageId: String?): IAsyncAction?

  @InterfaceMethod(3)
  public fun GetMessageAsync(localChatMessageId: String?): IAsyncOperation<ChatMessage?>?

  @InterfaceMethod(4)
  public fun GetMessageReader(): ChatMessageReader?

  @InterfaceMethod(5)
  public fun GetMessageReader(recentTimeLimit: TimeSpan?): ChatMessageReader?

  @InterfaceMethod(6)
  public fun MarkMessageReadAsync(localChatMessageId: String?): IAsyncAction?

  @InterfaceMethod(7)
  public fun RetrySendMessageAsync(localChatMessageId: String?): IAsyncAction?

  @InterfaceMethod(8)
  public fun SendMessageAsync(chatMessage: ChatMessage?): IAsyncAction?

  @InterfaceMethod(9)
  public fun ValidateMessage(chatMessage: ChatMessage?): ChatMessageValidationResult?

  @InterfaceMethod(10)
  public fun add_MessageChanged(value: TypedEventHandler<ChatMessageStore?,
      ChatMessageChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_MessageChanged(value: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageStore> {
    public override fun getValue() = ABI.makeIChatMessageStore(pointer.getPointer(0))

    public fun setValue(value: IChatMessageStore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageStore {
    public val __2016712679_Ptr: Pointer?

    public val _2016712679_VtblPtr: Pointer?
      get() = __2016712679_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChangeTracker(): ChatMessageChangeTracker? {
      val fnPtr = _2016712679_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatMessageChangeTracker>()
      val hr = fn.invokeHR(arrayOf(__2016712679_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatMessageChangeTracker>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun DeleteMessageAsync(localMessageId: String?): IAsyncAction? {
      val fnPtr = _2016712679_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2016712679_Ptr, marshalToNative(localMessageId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun DownloadMessageAsync(localChatMessageId: String?): IAsyncAction? {
      val fnPtr = _2016712679_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2016712679_Ptr, marshalToNative(localChatMessageId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetMessageAsync(localChatMessageId: String?):
        IAsyncOperation<ChatMessage?>? {
      val fnPtr = _2016712679_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ChatMessage?>>()
      val hr = fn.invokeHR(arrayOf(__2016712679_Ptr, marshalToNative(localChatMessageId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ChatMessage?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetMessageReader(): ChatMessageReader? {
      val fnPtr = _2016712679_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatMessageReader>()
      val hr = fn.invokeHR(arrayOf(__2016712679_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatMessageReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetMessageReader(recentTimeLimit: TimeSpan?): ChatMessageReader? {
      val fnPtr = _2016712679_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatMessageReader>()
      val hr = fn.invokeHR(arrayOf(__2016712679_Ptr, marshalToNative(recentTimeLimit), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatMessageReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun MarkMessageReadAsync(localChatMessageId: String?): IAsyncAction? {
      val fnPtr = _2016712679_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2016712679_Ptr, marshalToNative(localChatMessageId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun RetrySendMessageAsync(localChatMessageId: String?): IAsyncAction? {
      val fnPtr = _2016712679_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2016712679_Ptr, marshalToNative(localChatMessageId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SendMessageAsync(chatMessage: ChatMessage?): IAsyncAction? {
      val fnPtr = _2016712679_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2016712679_Ptr, marshalToNative(chatMessage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun ValidateMessage(chatMessage: ChatMessage?): ChatMessageValidationResult? {
      val fnPtr = _2016712679_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatMessageValidationResult>()
      val hr = fn.invokeHR(arrayOf(__2016712679_Ptr, marshalToNative(chatMessage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatMessageValidationResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun add_MessageChanged(value: TypedEventHandler<ChatMessageStore?,
        ChatMessageChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2016712679_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2016712679_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_MessageChanged(value: EventRegistrationToken?): Unit {
      val fnPtr = _2016712679_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2016712679_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IChatMessageStore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2016712679_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageStore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("31f2fd01ccf6580b49760a07dd5d3b47")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageStore(ptr: Pointer?): WithDefault = IChatMessageStore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageStore {
      val address = segment.toRawLongValue()
      return makeIChatMessageStore(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2016712679_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageStore): Array<IChatMessageStore?> = (elements
        as Array<IChatMessageStore?>).castToImpl<IChatMessageStore,IChatMessageStore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageStore?> =
        arrayOfNulls<IChatMessageStore_Impl>(size) as Array<IChatMessageStore?>
  }
}
