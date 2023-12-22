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

@ABIMarker(IBluetoothDevice2.ABI::class)
@Signature("{0133f954-b156-4dd0-b1f5-c11bc31a5163}")
@Guid("0133f954b1564dd0b1f5c11bc31a5163")
@WinRTInterface("0133f954b1564dd0b1f5c11bc31a5163")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothDevice2.ByReference::class)
public interface IBluetoothDevice2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceInformation(): DeviceInformation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothDevice2> {
    public override fun getValue() = ABI.makeIBluetoothDevice2(pointer.getPointer(0))

    public fun setValue(value: IBluetoothDevice2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothDevice2 {
    public val __1985833243_Ptr: Pointer?

    public val _1985833243_VtblPtr: Pointer?
      get() = __1985833243_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceInformation(): DeviceInformation? {
      val fnPtr = _1985833243_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceInformation>()
      val hr = fn.invokeHR(arrayOf(__1985833243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceInformation>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothDevice2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1985833243_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothDevice2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0133f954b1564dd0b1f5c11bc31a5163")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothDevice2(ptr: Pointer?): WithDefault = IBluetoothDevice2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothDevice2 {
      val address = segment.toRawLongValue()
      return makeIBluetoothDevice2(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothDevice2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1985833243_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothDevice2): Array<IBluetoothDevice2?> = (elements
        as Array<IBluetoothDevice2?>).castToImpl<IBluetoothDevice2,IBluetoothDevice2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothDevice2?> =
        arrayOfNulls<IBluetoothDevice2_Impl>(size) as Array<IBluetoothDevice2?>
  }
}
