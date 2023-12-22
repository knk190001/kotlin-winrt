package Windows.Devices.Bluetooth

import Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Networking.HostName
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IBluetoothDevice.ABI::class)
@Signature("{2335b156-90d2-4a04-aef5-0e20b9e6b707}")
@Guid("2335b15690d24a04aef50e20b9e6b707")
@WinRTInterface("2335b15690d24a04aef50e20b9e6b707")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothDevice.ByReference::class)
public interface IBluetoothDevice : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_HostName(): HostName?

  @InterfaceMethod(2)
  public fun get_Name(): String?

  @InterfaceMethod(3)
  public fun get_ClassOfDevice(): BluetoothClassOfDevice?

  @InterfaceMethod(4)
  public fun get_SdpRecords(): IVectorView<IBuffer?>?

  @InterfaceMethod(5)
  public fun get_RfcommServices(): IVectorView<RfcommDeviceService?>?

  @InterfaceMethod(6)
  public fun get_ConnectionStatus(): BluetoothConnectionStatus?

  @InterfaceMethod(7)
  public fun get_BluetoothAddress(): WinDef.ULONG

  @InterfaceMethod(8)
  public fun add_NameChanged(handler: TypedEventHandler<BluetoothDevice?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_NameChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_SdpRecordsChanged(handler: TypedEventHandler<BluetoothDevice?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_SdpRecordsChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_ConnectionStatusChanged(handler: TypedEventHandler<BluetoothDevice?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_ConnectionStatusChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothDevice> {
    public override fun getValue() = ABI.makeIBluetoothDevice(pointer.getPointer(0))

    public fun setValue(value: IBluetoothDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothDevice {
    public val __618248467_Ptr: Pointer?

    public val _618248467_VtblPtr: Pointer?
      get() = __618248467_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _618248467_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__618248467_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HostName(): HostName? {
      val fnPtr = _618248467_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__618248467_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Name(): String? {
      val fnPtr = _618248467_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__618248467_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ClassOfDevice(): BluetoothClassOfDevice? {
      val fnPtr = _618248467_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothClassOfDevice>()
      val hr = fn.invokeHR(arrayOf(__618248467_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothClassOfDevice>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SdpRecords(): IVectorView<IBuffer?>? {
      val fnPtr = _618248467_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__618248467_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IBuffer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_RfcommServices(): IVectorView<RfcommDeviceService?>? {
      val fnPtr = _618248467_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<RfcommDeviceService?>>()
      val hr = fn.invokeHR(arrayOf(__618248467_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<RfcommDeviceService?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ConnectionStatus(): BluetoothConnectionStatus? {
      val fnPtr = _618248467_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothConnectionStatus>()
      val hr = fn.invokeHR(arrayOf(__618248467_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothConnectionStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_BluetoothAddress(): WinDef.ULONG {
      val fnPtr = _618248467_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__618248467_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun add_NameChanged(handler: TypedEventHandler<BluetoothDevice?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _618248467_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__618248467_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_NameChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _618248467_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__618248467_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_SdpRecordsChanged(handler: TypedEventHandler<BluetoothDevice?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _618248467_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__618248467_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_SdpRecordsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _618248467_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__618248467_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_ConnectionStatusChanged(handler: TypedEventHandler<BluetoothDevice?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _618248467_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__618248467_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_ConnectionStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _618248467_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__618248467_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBluetoothDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __618248467_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2335b15690d24a04aef50e20b9e6b707")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothDevice(ptr: Pointer?): WithDefault = IBluetoothDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothDevice {
      val address = segment.toRawLongValue()
      return makeIBluetoothDevice(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__618248467_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothDevice): Array<IBluetoothDevice?> = (elements as
        Array<IBluetoothDevice?>).castToImpl<IBluetoothDevice,IBluetoothDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothDevice?> =
        arrayOfNulls<IBluetoothDevice_Impl>(size) as Array<IBluetoothDevice?>
  }
}
