package Windows.Devices.Bluetooth

import Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService
import Windows.Foundation.Collections.IVectorView
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothLEDevice.ABI::class)
@Signature("{b5ee2f7b-4ad8-4642-ac48-80a0b500e887}")
@Guid("b5ee2f7b4ad84642ac4880a0b500e887")
@WinRTInterface("b5ee2f7b4ad84642ac4880a0b500e887")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEDevice.ByReference::class)
public interface IBluetoothLEDevice : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_Name(): String?

  @InterfaceMethod(2)
  public fun get_GattServices(): IVectorView<GattDeviceService?>?

  @InterfaceMethod(3)
  public fun get_ConnectionStatus(): BluetoothConnectionStatus?

  @InterfaceMethod(4)
  public fun get_BluetoothAddress(): WinDef.ULONG

  @InterfaceMethod(5)
  public fun GetGattService(serviceUuid: com.sun.jna.platform.win32.Guid.GUID?): GattDeviceService?

  @InterfaceMethod(6)
  public fun add_NameChanged(handler: TypedEventHandler<BluetoothLEDevice?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_NameChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_GattServicesChanged(handler: TypedEventHandler<BluetoothLEDevice?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_GattServicesChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_ConnectionStatusChanged(handler: TypedEventHandler<BluetoothLEDevice?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_ConnectionStatusChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEDevice> {
    public override fun getValue() = ABI.makeIBluetoothLEDevice(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEDevice {
    public val __143634458_Ptr: Pointer?

    public val _143634458_VtblPtr: Pointer?
      get() = __143634458_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _143634458_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__143634458_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Name(): String? {
      val fnPtr = _143634458_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__143634458_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_GattServices(): IVectorView<GattDeviceService?>? {
      val fnPtr = _143634458_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GattDeviceService?>>()
      val hr = fn.invokeHR(arrayOf(__143634458_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GattDeviceService?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ConnectionStatus(): BluetoothConnectionStatus? {
      val fnPtr = _143634458_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothConnectionStatus>()
      val hr = fn.invokeHR(arrayOf(__143634458_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothConnectionStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_BluetoothAddress(): WinDef.ULONG {
      val fnPtr = _143634458_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__143634458_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun GetGattService(serviceUuid: com.sun.jna.platform.win32.Guid.GUID?):
        GattDeviceService? {
      val fnPtr = _143634458_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattDeviceService>()
      val hr = fn.invokeHR(arrayOf(__143634458_Ptr, marshalToNative(serviceUuid), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattDeviceService>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun add_NameChanged(handler: TypedEventHandler<BluetoothLEDevice?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _143634458_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__143634458_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_NameChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _143634458_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__143634458_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_GattServicesChanged(handler: TypedEventHandler<BluetoothLEDevice?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _143634458_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__143634458_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_GattServicesChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _143634458_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__143634458_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_ConnectionStatusChanged(handler: TypedEventHandler<BluetoothLEDevice?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _143634458_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__143634458_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_ConnectionStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _143634458_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__143634458_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBluetoothLEDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __143634458_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b5ee2f7b4ad84642ac4880a0b500e887")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEDevice(ptr: Pointer?): WithDefault = IBluetoothLEDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEDevice {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEDevice(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__143634458_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEDevice): Array<IBluetoothLEDevice?> =
        (elements as
        Array<IBluetoothLEDevice?>).castToImpl<IBluetoothLEDevice,IBluetoothLEDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEDevice?> =
        arrayOfNulls<IBluetoothLEDevice_Impl>(size) as Array<IBluetoothLEDevice?>
  }
}
