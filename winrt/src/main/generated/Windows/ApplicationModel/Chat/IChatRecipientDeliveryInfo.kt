package Windows.ApplicationModel.Chat

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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

@ABIMarker(IChatRecipientDeliveryInfo.ABI::class)
@Signature("{ffc7b2a2-283c-4c0a-8a0e-8c33bdbf0545}")
@Guid("ffc7b2a2283c4c0a8a0e8c33bdbf0545")
@WinRTInterface("ffc7b2a2283c4c0a8a0e8c33bdbf0545")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatRecipientDeliveryInfo.ByReference::class)
public interface IChatRecipientDeliveryInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TransportAddress(): String?

  @InterfaceMethod(1)
  public fun put_TransportAddress(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_DeliveryTime(): IReference<DateTime?>?

  @InterfaceMethod(3)
  public fun put_DeliveryTime(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(4)
  public fun get_ReadTime(): IReference<DateTime?>?

  @InterfaceMethod(5)
  public fun put_ReadTime(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(6)
  public fun get_TransportErrorCodeCategory(): ChatTransportErrorCodeCategory?

  @InterfaceMethod(7)
  public fun get_TransportInterpretedErrorCode(): ChatTransportInterpretedErrorCode?

  @InterfaceMethod(8)
  public fun get_TransportErrorCode(): Int

  @InterfaceMethod(9)
  public fun get_IsErrorPermanent(): Boolean

  @InterfaceMethod(10)
  public fun get_Status(): ChatMessageStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatRecipientDeliveryInfo> {
    public override fun getValue() = ABI.makeIChatRecipientDeliveryInfo(pointer.getPointer(0))

    public fun setValue(value: IChatRecipientDeliveryInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatRecipientDeliveryInfo {
    public val __244727972_Ptr: Pointer?

    public val _244727972_VtblPtr: Pointer?
      get() = __244727972_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TransportAddress(): String? {
      val fnPtr = _244727972_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__244727972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TransportAddress(value: String?): Unit {
      val fnPtr = _244727972_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__244727972_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DeliveryTime(): IReference<DateTime?>? {
      val fnPtr = _244727972_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__244727972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DeliveryTime(value: IReference<DateTime?>?): Unit {
      val fnPtr = _244727972_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__244727972_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ReadTime(): IReference<DateTime?>? {
      val fnPtr = _244727972_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__244727972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ReadTime(value: IReference<DateTime?>?): Unit {
      val fnPtr = _244727972_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__244727972_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_TransportErrorCodeCategory(): ChatTransportErrorCodeCategory? {
      val fnPtr = _244727972_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatTransportErrorCodeCategory>()
      val hr = fn.invokeHR(arrayOf(__244727972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatTransportErrorCodeCategory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_TransportInterpretedErrorCode(): ChatTransportInterpretedErrorCode? {
      val fnPtr = _244727972_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatTransportInterpretedErrorCode>()
      val hr = fn.invokeHR(arrayOf(__244727972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatTransportInterpretedErrorCode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_TransportErrorCode(): Int {
      val fnPtr = _244727972_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__244727972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_IsErrorPermanent(): Boolean {
      val fnPtr = _244727972_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__244727972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_Status(): ChatMessageStatus? {
      val fnPtr = _244727972_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatMessageStatus>()
      val hr = fn.invokeHR(arrayOf(__244727972_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatMessageStatus>(result.getValue())
      return resultValue
    }
  }

  public class IChatRecipientDeliveryInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __244727972_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatRecipientDeliveryInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ffc7b2a2283c4c0a8a0e8c33bdbf0545")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatRecipientDeliveryInfo(ptr: Pointer?): WithDefault =
        IChatRecipientDeliveryInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatRecipientDeliveryInfo {
      val address = segment.toRawLongValue()
      return makeIChatRecipientDeliveryInfo(Pointer(address))
    }

    public override fun toNative(obj: IChatRecipientDeliveryInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__244727972_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatRecipientDeliveryInfo):
        Array<IChatRecipientDeliveryInfo?> = (elements as
        Array<IChatRecipientDeliveryInfo?>).castToImpl<IChatRecipientDeliveryInfo,IChatRecipientDeliveryInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatRecipientDeliveryInfo?> =
        arrayOfNulls<IChatRecipientDeliveryInfo_Impl>(size) as Array<IChatRecipientDeliveryInfo?>
  }
}
