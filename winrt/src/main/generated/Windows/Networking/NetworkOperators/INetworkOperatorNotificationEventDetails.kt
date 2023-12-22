package Windows.Networking.NetworkOperators

import Windows.Devices.Sms.ISmsMessage
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
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INetworkOperatorNotificationEventDetails.ABI::class)
@Signature("{bc68a9d1-82e1-4488-9f2c-1276c2468fac}")
@Guid("bc68a9d182e144889f2c1276c2468fac")
@WinRTInterface("bc68a9d182e144889f2c1276c2468fac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkOperatorNotificationEventDetails.ByReference::class)
public interface INetworkOperatorNotificationEventDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NotificationType(): NetworkOperatorEventMessageType?

  @InterfaceMethod(1)
  public fun get_NetworkAccountId(): String?

  @InterfaceMethod(2)
  public fun get_EncodingType(): Byte

  @InterfaceMethod(3)
  public fun get_Message(): String?

  @InterfaceMethod(4)
  public fun get_RuleId(): String?

  @InterfaceMethod(5)
  public fun get_SmsMessage(): ISmsMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkOperatorNotificationEventDetails> {
    public override fun getValue() =
        ABI.makeINetworkOperatorNotificationEventDetails(pointer.getPointer(0))

    public fun setValue(value: INetworkOperatorNotificationEventDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkOperatorNotificationEventDetails {
    public val __1253856820_Ptr: Pointer?

    public val _1253856820_VtblPtr: Pointer?
      get() = __1253856820_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NotificationType(): NetworkOperatorEventMessageType? {
      val fnPtr = _1253856820_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkOperatorEventMessageType>()
      val hr = fn.invokeHR(arrayOf(__1253856820_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkOperatorEventMessageType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NetworkAccountId(): String? {
      val fnPtr = _1253856820_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1253856820_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_EncodingType(): Byte {
      val fnPtr = _1253856820_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1253856820_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Message(): String? {
      val fnPtr = _1253856820_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1253856820_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_RuleId(): String? {
      val fnPtr = _1253856820_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1253856820_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SmsMessage(): ISmsMessage? {
      val fnPtr = _1253856820_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ISmsMessage>()
      val hr = fn.invokeHR(arrayOf(__1253856820_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ISmsMessage>(result.getValue())
      return resultValue
    }
  }

  public class INetworkOperatorNotificationEventDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1253856820_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkOperatorNotificationEventDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc68a9d182e144889f2c1276c2468fac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkOperatorNotificationEventDetails(ptr: Pointer?): WithDefault =
        INetworkOperatorNotificationEventDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INetworkOperatorNotificationEventDetails {
      val address = segment.toRawLongValue()
      return makeINetworkOperatorNotificationEventDetails(Pointer(address))
    }

    public override fun toNative(obj: INetworkOperatorNotificationEventDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1253856820_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkOperatorNotificationEventDetails):
        Array<INetworkOperatorNotificationEventDetails?> = (elements as
        Array<INetworkOperatorNotificationEventDetails?>).castToImpl<INetworkOperatorNotificationEventDetails,INetworkOperatorNotificationEventDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkOperatorNotificationEventDetails?> =
        arrayOfNulls<INetworkOperatorNotificationEventDetails_Impl>(size) as
        Array<INetworkOperatorNotificationEventDetails?>
  }
}
