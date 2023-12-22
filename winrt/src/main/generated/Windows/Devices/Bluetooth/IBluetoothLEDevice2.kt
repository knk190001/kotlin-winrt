package Windows.Devices.Bluetooth

import Windows.Devices.Enumeration.DeviceInformation
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothLEDevice2.ABI::class)
@Signature("{26f062b3-7aee-4d31-baba-b1b9775f5916}")
@Guid("26f062b37aee4d31babab1b9775f5916")
@WinRTInterface("26f062b37aee4d31babab1b9775f5916")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEDevice2.ByReference::class)
public interface IBluetoothLEDevice2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceInformation(): DeviceInformation?

  @InterfaceMethod(1)
  public fun get_Appearance(): BluetoothLEAppearance?

  @InterfaceMethod(2)
  public fun get_BluetoothAddressType(): BluetoothAddressType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEDevice2> {
    public override fun getValue() = ABI.makeIBluetoothLEDevice2(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEDevice2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEDevice2 {
    public val __157700852_Ptr: Pointer?

    public val _157700852_VtblPtr: Pointer?
      get() = __157700852_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceInformation(): DeviceInformation? {
      val fnPtr = _157700852_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceInformation>()
      val hr = fn.invokeHR(arrayOf(__157700852_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Appearance(): BluetoothLEAppearance? {
      val fnPtr = _157700852_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEAppearance>()
      val hr = fn.invokeHR(arrayOf(__157700852_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEAppearance>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BluetoothAddressType(): BluetoothAddressType? {
      val fnPtr = _157700852_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothAddressType>()
      val hr = fn.invokeHR(arrayOf(__157700852_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothAddressType>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEDevice2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __157700852_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEDevice2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("26f062b37aee4d31babab1b9775f5916")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEDevice2(ptr: Pointer?): WithDefault = IBluetoothLEDevice2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEDevice2 {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEDevice2(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEDevice2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__157700852_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEDevice2): Array<IBluetoothLEDevice2?> =
        (elements as
        Array<IBluetoothLEDevice2?>).castToImpl<IBluetoothLEDevice2,IBluetoothLEDevice2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEDevice2?> =
        arrayOfNulls<IBluetoothLEDevice2_Impl>(size) as Array<IBluetoothLEDevice2?>
  }
}
