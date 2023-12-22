package Windows.ApplicationModel.Chat

import Windows.ApplicationModel.Chat.IChatMessage3.ABI.IID
import Windows.Foundation.Collections.IVector
import Windows.Foundation.DateTime
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IChatMessage2.ABI::class)
@Signature("{86668332-543f-49f5-ac71-6c2afc6565fd}")
@Guid("86668332543f49f5ac716c2afc6565fd")
@WinRTInterface("86668332543f49f5ac716c2afc6565fd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessage2.ByReference::class)
public interface IChatMessage2 : NativeMapped, IWinRTInterface, IChatMessage3, IChatMessage {
  @InterfaceMethod(0)
  public fun get_EstimatedDownloadSize(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun put_EstimatedDownloadSize(value: WinDef.ULONG): Unit

  @InterfaceMethod(2)
  public fun put_From(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_IsAutoReply(): Boolean

  @InterfaceMethod(4)
  public fun put_IsAutoReply(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun put_IsForwardingDisabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsReplyDisabled(): Boolean

  @InterfaceMethod(7)
  public fun put_IsIncoming(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun put_IsRead(value: Boolean): Unit

  @InterfaceMethod(9)
  public fun get_IsSeen(): Boolean

  @InterfaceMethod(10)
  public fun put_IsSeen(value: Boolean): Unit

  @InterfaceMethod(11)
  public fun get_IsSimMessage(): Boolean

  @InterfaceMethod(12)
  public fun put_LocalTimestamp(value: DateTime?): Unit

  @InterfaceMethod(13)
  public fun get_MessageKind(): ChatMessageKind?

  @InterfaceMethod(14)
  public fun put_MessageKind(value: ChatMessageKind?): Unit

  @InterfaceMethod(15)
  public fun get_MessageOperatorKind(): ChatMessageOperatorKind?

  @InterfaceMethod(16)
  public fun put_MessageOperatorKind(value: ChatMessageOperatorKind?): Unit

  @InterfaceMethod(17)
  public fun put_NetworkTimestamp(value: DateTime?): Unit

  @InterfaceMethod(18)
  public fun get_IsReceivedDuringQuietHours(): Boolean

  @InterfaceMethod(19)
  public fun put_IsReceivedDuringQuietHours(value: Boolean): Unit

  @InterfaceMethod(20)
  public fun put_RemoteId(value: String?): Unit

  @InterfaceMethod(21)
  public fun put_Status(value: ChatMessageStatus?): Unit

  @InterfaceMethod(22)
  public fun put_Subject(value: String?): Unit

  @InterfaceMethod(23)
  public fun get_ShouldSuppressNotification(): Boolean

  @InterfaceMethod(24)
  public fun put_ShouldSuppressNotification(value: Boolean): Unit

  @InterfaceMethod(25)
  public fun get_ThreadingInfo(): ChatConversationThreadingInfo?

  @InterfaceMethod(26)
  public fun put_ThreadingInfo(value: ChatConversationThreadingInfo?): Unit

  @InterfaceMethod(27)
  public fun get_RecipientsDeliveryInfos(): IVector<ChatRecipientDeliveryInfo?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IChatMessage2>
      {
    public override fun getValue() = ABI.makeIChatMessage2(pointer.getPointer(0))

    public fun setValue(value: IChatMessage2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessage2, IChatMessage3.WithDefault, IChatMessage.WithDefault
      {
    public val __1435028362_Ptr: Pointer?

    public val _1435028362_VtblPtr: Pointer?
      get() = __1435028362_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EstimatedDownloadSize(): WinDef.ULONG {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_EstimatedDownloadSize(value: WinDef.ULONG): Unit {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun put_From(value: String?): Unit {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsAutoReply(): Boolean {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_IsAutoReply(value: Boolean): Unit {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun put_IsForwardingDisabled(value: Boolean): Unit {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsReplyDisabled(): Boolean {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsIncoming(value: Boolean): Unit {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun put_IsRead(value: Boolean): Unit {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_IsSeen(): Boolean {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_IsSeen(value: Boolean): Unit {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_IsSimMessage(): Boolean {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_LocalTimestamp(value: DateTime?): Unit {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_MessageKind(): ChatMessageKind? {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatMessageKind>()
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatMessageKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_MessageKind(value: ChatMessageKind?): Unit {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_MessageOperatorKind(): ChatMessageOperatorKind? {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatMessageOperatorKind>()
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatMessageOperatorKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_MessageOperatorKind(value: ChatMessageOperatorKind?): Unit {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun put_NetworkTimestamp(value: DateTime?): Unit {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_IsReceivedDuringQuietHours(): Boolean {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_IsReceivedDuringQuietHours(value: Boolean): Unit {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun put_RemoteId(value: String?): Unit {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun put_Status(value: ChatMessageStatus?): Unit {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun put_Subject(value: String?): Unit {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_ShouldSuppressNotification(): Boolean {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(24)
    public override fun put_ShouldSuppressNotification(value: Boolean): Unit {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun get_ThreadingInfo(): ChatConversationThreadingInfo? {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatConversationThreadingInfo>()
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatConversationThreadingInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun put_ThreadingInfo(value: ChatConversationThreadingInfo?): Unit {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_RecipientsDeliveryInfos(): IVector<ChatRecipientDeliveryInfo?>? {
      val fnPtr = _1435028362_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ChatRecipientDeliveryInfo?>>()
      val hr = fn.invokeHR(arrayOf(__1435028362_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ChatRecipientDeliveryInfo?>>(result.getValue())
      return resultValue
    }
  }

  public class IChatMessage2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IChatMessage3, IChatMessage {
    public override val __1435028363_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1435028362_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __184838568_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IChatMessage.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1435028362_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1435028362_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessage2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("86668332543f49f5ac716c2afc6565fd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessage2(ptr: Pointer?): WithDefault = IChatMessage2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessage2 {
      val address = segment.toRawLongValue()
      return makeIChatMessage2(Pointer(address))
    }

    public override fun toNative(obj: IChatMessage2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1435028362_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessage2): Array<IChatMessage2?> = (elements as
        Array<IChatMessage2?>).castToImpl<IChatMessage2,IChatMessage2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessage2?> =
        arrayOfNulls<IChatMessage2_Impl>(size) as Array<IChatMessage2?>
  }
}
