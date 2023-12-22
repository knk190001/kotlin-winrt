package Windows.Devices.Bluetooth

import Windows.Foundation.IAsyncOperation
import Windows.Networking.HostName
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

@ABIMarker(IBluetoothDeviceStatics.ABI::class)
@Signature("{0991df51-57db-4725-bbd7-84f64327ec2c}")
@Guid("0991df5157db4725bbd784f64327ec2c")
@WinRTInterface("0991df5157db4725bbd784f64327ec2c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothDeviceStatics.ByReference::class)
public interface IBluetoothDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<BluetoothDevice?>?

  @InterfaceMethod(1)
  public fun FromHostNameAsync(hostName: HostName?): IAsyncOperation<BluetoothDevice?>?

  @InterfaceMethod(2)
  public fun FromBluetoothAddressAsync(address: WinDef.ULONG): IAsyncOperation<BluetoothDevice?>?

  @InterfaceMethod(3)
  public fun GetDeviceSelector(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothDeviceStatics> {
    public override fun getValue() = ABI.makeIBluetoothDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: IBluetoothDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothDeviceStatics {
    public val __502930456_Ptr: Pointer?

    public val _502930456_VtblPtr: Pointer?
      get() = __502930456_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<BluetoothDevice?>? {
      val fnPtr = _502930456_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BluetoothDevice?>>()
      val hr = fn.invokeHR(arrayOf(__502930456_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<BluetoothDevice?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromHostNameAsync(hostName: HostName?): IAsyncOperation<BluetoothDevice?>? {
      val fnPtr = _502930456_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BluetoothDevice?>>()
      val hr = fn.invokeHR(arrayOf(__502930456_Ptr, marshalToNative(hostName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<BluetoothDevice?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromBluetoothAddressAsync(address: WinDef.ULONG):
        IAsyncOperation<BluetoothDevice?>? {
      val fnPtr = _502930456_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BluetoothDevice?>>()
      val hr = fn.invokeHR(arrayOf(__502930456_Ptr, address, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<BluetoothDevice?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _502930456_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__502930456_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __502930456_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0991df5157db4725bbd784f64327ec2c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothDeviceStatics(ptr: Pointer?): WithDefault =
        IBluetoothDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothDeviceStatics {
      val address = segment.toRawLongValue()
      return makeIBluetoothDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__502930456_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothDeviceStatics): Array<IBluetoothDeviceStatics?>
        = (elements as
        Array<IBluetoothDeviceStatics?>).castToImpl<IBluetoothDeviceStatics,IBluetoothDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothDeviceStatics?> =
        arrayOfNulls<IBluetoothDeviceStatics_Impl>(size) as Array<IBluetoothDeviceStatics?>
  }
}
