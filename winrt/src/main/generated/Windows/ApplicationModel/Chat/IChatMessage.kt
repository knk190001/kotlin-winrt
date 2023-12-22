package Windows.ApplicationModel.Chat

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IVector
import Windows.Foundation.DateTime
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

@ABIMarker(IChatMessage.ABI::class)
@Signature("{4b39052a-1142-5089-76da-f2db3d17cd05}")
@Guid("4b39052a1142508976daf2db3d17cd05")
@WinRTInterface("4b39052a1142508976daf2db3d17cd05")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessage.ByReference::class)
public interface IChatMessage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Attachments(): IVector<ChatMessageAttachment?>?

  @InterfaceMethod(1)
  public fun get_Body(): String?

  @InterfaceMethod(2)
  public fun put_Body(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_From(): String?

  @InterfaceMethod(4)
  public fun get_Id(): String?

  @InterfaceMethod(5)
  public fun get_IsForwardingDisabled(): Boolean

  @InterfaceMethod(6)
  public fun get_IsIncoming(): Boolean

  @InterfaceMethod(7)
  public fun get_IsRead(): Boolean

  @InterfaceMethod(8)
  public fun get_LocalTimestamp(): DateTime?

  @InterfaceMethod(9)
  public fun get_NetworkTimestamp(): DateTime?

  @InterfaceMethod(10)
  public fun get_Recipients(): IVector<String?>?

  @InterfaceMethod(11)
  public fun get_RecipientSendStatuses(): IMapView<String?, ChatMessageStatus?>?

  @InterfaceMethod(12)
  public fun get_Status(): ChatMessageStatus?

  @InterfaceMethod(13)
  public fun get_Subject(): String?

  @InterfaceMethod(14)
  public fun get_TransportFriendlyName(): String?

  @InterfaceMethod(15)
  public fun get_TransportId(): String?

  @InterfaceMethod(16)
  public fun put_TransportId(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IChatMessage> {
    public override fun getValue() = ABI.makeIChatMessage(pointer.getPointer(0))

    public fun setValue(value: IChatMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessage {
    public val __184838568_Ptr: Pointer?

    public val _184838568_VtblPtr: Pointer?
      get() = __184838568_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Attachments(): IVector<ChatMessageAttachment?>? {
      val fnPtr = _184838568_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ChatMessageAttachment?>>()
      val hr = fn.invokeHR(arrayOf(__184838568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ChatMessageAttachment?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Body(): String? {
      val fnPtr = _184838568_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__184838568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Body(value: String?): Unit {
      val fnPtr = _184838568_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__184838568_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_From(): String? {
      val fnPtr = _184838568_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__184838568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Id(): String? {
      val fnPtr = _184838568_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__184838568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsForwardingDisabled(): Boolean {
      val fnPtr = _184838568_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__184838568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_IsIncoming(): Boolean {
      val fnPtr = _184838568_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__184838568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_IsRead(): Boolean {
      val fnPtr = _184838568_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__184838568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_LocalTimestamp(): DateTime? {
      val fnPtr = _184838568_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__184838568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_NetworkTimestamp(): DateTime? {
      val fnPtr = _184838568_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__184838568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_Recipients(): IVector<String?>? {
      val fnPtr = _184838568_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__184838568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_RecipientSendStatuses(): IMapView<String?, ChatMessageStatus?>? {
      val fnPtr = _184838568_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, ChatMessageStatus?>>()
      val hr = fn.invokeHR(arrayOf(__184838568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, ChatMessageStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_Status(): ChatMessageStatus? {
      val fnPtr = _184838568_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatMessageStatus>()
      val hr = fn.invokeHR(arrayOf(__184838568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatMessageStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_Subject(): String? {
      val fnPtr = _184838568_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__184838568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_TransportFriendlyName(): String? {
      val fnPtr = _184838568_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__184838568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_TransportId(): String? {
      val fnPtr = _184838568_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__184838568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_TransportId(value: String?): Unit {
      val fnPtr = _184838568_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__184838568_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IChatMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __184838568_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4b39052a1142508976daf2db3d17cd05")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessage(ptr: Pointer?): WithDefault = IChatMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessage {
      val address = segment.toRawLongValue()
      return makeIChatMessage(Pointer(address))
    }

    public override fun toNative(obj: IChatMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__184838568_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessage): Array<IChatMessage?> = (elements as
        Array<IChatMessage?>).castToImpl<IChatMessage,IChatMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessage?> =
        arrayOfNulls<IChatMessage_Impl>(size) as Array<IChatMessage?>
  }
}
