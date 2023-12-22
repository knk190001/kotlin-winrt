package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Devices.Bluetooth.BluetoothDeviceId
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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGattSession.ABI::class)
@Signature("{d23b5143-e04e-4c24-999c-9c256f9856b1}")
@Guid("d23b5143e04e4c24999c9c256f9856b1")
@WinRTInterface("d23b5143e04e4c24999c9c256f9856b1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattSession.ByReference::class)
public interface IGattSession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): BluetoothDeviceId?

  @InterfaceMethod(1)
  public fun get_CanMaintainConnection(): Boolean

  @InterfaceMethod(2)
  public fun put_MaintainConnection(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_MaintainConnection(): Boolean

  @InterfaceMethod(4)
  public fun get_MaxPduSize(): WinDef.USHORT

  @InterfaceMethod(5)
  public fun get_SessionStatus(): GattSessionStatus?

  @InterfaceMethod(6)
  public fun add_MaxPduSizeChanged(handler: TypedEventHandler<GattSession?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_MaxPduSizeChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_SessionStatusChanged(handler: TypedEventHandler<GattSession?,
      GattSessionStatusChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_SessionStatusChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGattSession> {
    public override fun getValue() = ABI.makeIGattSession(pointer.getPointer(0))

    public fun setValue(value: IGattSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattSession {
    public val __1659859323_Ptr: Pointer?

    public val _1659859323_VtblPtr: Pointer?
      get() = __1659859323_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): BluetoothDeviceId? {
      val fnPtr = _1659859323_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothDeviceId>()
      val hr = fn.invokeHR(arrayOf(__1659859323_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothDeviceId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CanMaintainConnection(): Boolean {
      val fnPtr = _1659859323_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1659859323_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_MaintainConnection(value: Boolean): Unit {
      val fnPtr = _1659859323_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1659859323_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_MaintainConnection(): Boolean {
      val fnPtr = _1659859323_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1659859323_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_MaxPduSize(): WinDef.USHORT {
      val fnPtr = _1659859323_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1659859323_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_SessionStatus(): GattSessionStatus? {
      val fnPtr = _1659859323_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattSessionStatus>()
      val hr = fn.invokeHR(arrayOf(__1659859323_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattSessionStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun add_MaxPduSizeChanged(handler: TypedEventHandler<GattSession?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1659859323_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1659859323_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_MaxPduSizeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1659859323_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1659859323_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_SessionStatusChanged(handler: TypedEventHandler<GattSession?,
        GattSessionStatusChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1659859323_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1659859323_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_SessionStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1659859323_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1659859323_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGattSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1659859323_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d23b5143e04e4c24999c9c256f9856b1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattSession(ptr: Pointer?): WithDefault = IGattSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattSession {
      val address = segment.toRawLongValue()
      return makeIGattSession(Pointer(address))
    }

    public override fun toNative(obj: IGattSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1659859323_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattSession): Array<IGattSession?> = (elements as
        Array<IGattSession?>).castToImpl<IGattSession,IGattSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattSession?> =
        arrayOfNulls<IGattSession_Impl>(size) as Array<IGattSession?>
  }
}
