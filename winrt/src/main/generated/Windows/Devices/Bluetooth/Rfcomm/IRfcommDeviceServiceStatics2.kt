package Windows.Devices.Bluetooth.Rfcomm

import Windows.Devices.Bluetooth.BluetoothCacheMode
import Windows.Devices.Bluetooth.BluetoothDevice
import Windows.Devices.Bluetooth.Rfcomm.IRfcommDeviceServiceStatics.ABI.IID
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRfcommDeviceServiceStatics2.ABI::class)
@Signature("{aa8cb1c9-e78d-4be4-8076-0a3d87a0a05f}")
@Guid("aa8cb1c9e78d4be480760a3d87a0a05f")
@WinRTInterface("aa8cb1c9e78d4be480760a3d87a0a05f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRfcommDeviceServiceStatics2.ByReference::class)
public interface IRfcommDeviceServiceStatics2 : NativeMapped, IWinRTInterface,
    IRfcommDeviceServiceStatics {
  @InterfaceMethod(0)
  public fun GetDeviceSelectorForBluetoothDevice(bluetoothDevice: BluetoothDevice?): String?

  @InterfaceMethod(1)
  public fun GetDeviceSelectorForBluetoothDevice(bluetoothDevice: BluetoothDevice?,
      cacheMode: BluetoothCacheMode?): String?

  @InterfaceMethod(2)
  public fun GetDeviceSelectorForBluetoothDeviceAndServiceId(bluetoothDevice: BluetoothDevice?,
      serviceId: RfcommServiceId?): String?

  @InterfaceMethod(3)
  public fun GetDeviceSelectorForBluetoothDeviceAndServiceId(
    bluetoothDevice: BluetoothDevice?,
    serviceId: RfcommServiceId?,
    cacheMode: BluetoothCacheMode?
  ): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRfcommDeviceServiceStatics2> {
    public override fun getValue() = ABI.makeIRfcommDeviceServiceStatics2(pointer.getPointer(0))

    public fun setValue(value: IRfcommDeviceServiceStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRfcommDeviceServiceStatics2,
      IRfcommDeviceServiceStatics.WithDefault {
    public val __542322495_Ptr: Pointer?

    public val _542322495_VtblPtr: Pointer?
      get() = __542322495_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelectorForBluetoothDevice(bluetoothDevice: BluetoothDevice?):
        String? {
      val fnPtr = _542322495_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__542322495_Ptr, marshalToNative(bluetoothDevice), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelectorForBluetoothDevice(bluetoothDevice: BluetoothDevice?,
        cacheMode: BluetoothCacheMode?): String? {
      val fnPtr = _542322495_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__542322495_Ptr, marshalToNative(bluetoothDevice),
          marshalToNative(cacheMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun GetDeviceSelectorForBluetoothDeviceAndServiceId(bluetoothDevice: BluetoothDevice?,
        serviceId: RfcommServiceId?): String? {
      val fnPtr = _542322495_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__542322495_Ptr, marshalToNative(bluetoothDevice),
          marshalToNative(serviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDeviceSelectorForBluetoothDeviceAndServiceId(
      bluetoothDevice: BluetoothDevice?,
      serviceId: RfcommServiceId?,
      cacheMode: BluetoothCacheMode?
    ): String? {
      val fnPtr = _542322495_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__542322495_Ptr, marshalToNative(bluetoothDevice),
          marshalToNative(serviceId), marshalToNative(cacheMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IRfcommDeviceServiceStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IRfcommDeviceServiceStatics {
    public override val __1506526381_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_542322495_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __542322495_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRfcommDeviceServiceStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa8cb1c9e78d4be480760a3d87a0a05f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRfcommDeviceServiceStatics2(ptr: Pointer?): WithDefault =
        IRfcommDeviceServiceStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRfcommDeviceServiceStatics2 {
      val address = segment.toRawLongValue()
      return makeIRfcommDeviceServiceStatics2(Pointer(address))
    }

    public override fun toNative(obj: IRfcommDeviceServiceStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__542322495_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRfcommDeviceServiceStatics2):
        Array<IRfcommDeviceServiceStatics2?> = (elements as
        Array<IRfcommDeviceServiceStatics2?>).castToImpl<IRfcommDeviceServiceStatics2,IRfcommDeviceServiceStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRfcommDeviceServiceStatics2?> =
        arrayOfNulls<IRfcommDeviceServiceStatics2_Impl>(size) as
        Array<IRfcommDeviceServiceStatics2?>
  }
}
