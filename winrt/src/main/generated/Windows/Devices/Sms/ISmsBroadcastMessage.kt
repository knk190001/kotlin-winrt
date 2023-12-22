package Windows.Devices.Sms

import Windows.Devices.Sms.ISmsMessageBase.ABI.IID
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

@ABIMarker(ISmsBroadcastMessage.ABI::class)
@Signature("{75aebbf1-e4b7-4874-a09c-2956e592f957}")
@Guid("75aebbf1e4b74874a09c2956e592f957")
@WinRTInterface("75aebbf1e4b74874a09c2956e592f957")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsBroadcastMessage.ByReference::class)
public interface ISmsBroadcastMessage : NativeMapped, IWinRTInterface, ISmsMessageBase {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_To(): String?

  @InterfaceMethod(2)
  public fun get_Body(): String?

  @InterfaceMethod(3)
  public fun get_Channel(): Int

  @InterfaceMethod(4)
  public fun get_GeographicalScope(): SmsGeographicalScope?

  @InterfaceMethod(5)
  public fun get_MessageCode(): Int

  @InterfaceMethod(6)
  public fun get_UpdateNumber(): Int

  @InterfaceMethod(7)
  public fun get_BroadcastType(): SmsBroadcastType?

  @InterfaceMethod(8)
  public fun get_IsEmergencyAlert(): Boolean

  @InterfaceMethod(9)
  public fun get_IsUserPopupRequested(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsBroadcastMessage> {
    public override fun getValue() = ABI.makeISmsBroadcastMessage(pointer.getPointer(0))

    public fun setValue(value: ISmsBroadcastMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsBroadcastMessage, ISmsMessageBase.WithDefault {
    public val __651281037_Ptr: Pointer?

    public val _651281037_VtblPtr: Pointer?
      get() = __651281037_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _651281037_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__651281037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_To(): String? {
      val fnPtr = _651281037_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__651281037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Body(): String? {
      val fnPtr = _651281037_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__651281037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Channel(): Int {
      val fnPtr = _651281037_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__651281037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_GeographicalScope(): SmsGeographicalScope? {
      val fnPtr = _651281037_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsGeographicalScope>()
      val hr = fn.invokeHR(arrayOf(__651281037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsGeographicalScope>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_MessageCode(): Int {
      val fnPtr = _651281037_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__651281037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_UpdateNumber(): Int {
      val fnPtr = _651281037_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__651281037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_BroadcastType(): SmsBroadcastType? {
      val fnPtr = _651281037_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsBroadcastType>()
      val hr = fn.invokeHR(arrayOf(__651281037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsBroadcastType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_IsEmergencyAlert(): Boolean {
      val fnPtr = _651281037_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__651281037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_IsUserPopupRequested(): Boolean {
      val fnPtr = _651281037_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__651281037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISmsBroadcastMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISmsMessageBase {
    public override val __1120832021_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_651281037_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __651281037_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsBroadcastMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("75aebbf1e4b74874a09c2956e592f957")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsBroadcastMessage(ptr: Pointer?): WithDefault = ISmsBroadcastMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsBroadcastMessage {
      val address = segment.toRawLongValue()
      return makeISmsBroadcastMessage(Pointer(address))
    }

    public override fun toNative(obj: ISmsBroadcastMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__651281037_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsBroadcastMessage): Array<ISmsBroadcastMessage?> =
        (elements as
        Array<ISmsBroadcastMessage?>).castToImpl<ISmsBroadcastMessage,ISmsBroadcastMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsBroadcastMessage?> =
        arrayOfNulls<ISmsBroadcastMessage_Impl>(size) as Array<ISmsBroadcastMessage?>
  }
}
