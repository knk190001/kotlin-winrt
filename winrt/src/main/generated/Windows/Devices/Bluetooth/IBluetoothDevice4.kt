package Windows.Devices.Bluetooth

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

@ABIMarker(IBluetoothDevice4.ABI::class)
@Signature("{817c34ad-0e9c-42b2-a8dc-3e8094940d12}")
@Guid("817c34ad0e9c42b2a8dc3e8094940d12")
@WinRTInterface("817c34ad0e9c42b2a8dc3e8094940d12")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothDevice4.ByReference::class)
public interface IBluetoothDevice4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BluetoothDeviceId(): BluetoothDeviceId?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothDevice4> {
    public override fun getValue() = ABI.makeIBluetoothDevice4(pointer.getPointer(0))

    public fun setValue(value: IBluetoothDevice4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothDevice4 {
    public val __1985833241_Ptr: Pointer?

    public val _1985833241_VtblPtr: Pointer?
      get() = __1985833241_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BluetoothDeviceId(): BluetoothDeviceId? {
      val fnPtr = _1985833241_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothDeviceId>()
      val hr = fn.invokeHR(arrayOf(__1985833241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothDeviceId>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothDevice4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1985833241_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothDevice4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("817c34ad0e9c42b2a8dc3e8094940d12")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothDevice4(ptr: Pointer?): WithDefault = IBluetoothDevice4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothDevice4 {
      val address = segment.toRawLongValue()
      return makeIBluetoothDevice4(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothDevice4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1985833241_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothDevice4): Array<IBluetoothDevice4?> = (elements
        as Array<IBluetoothDevice4?>).castToImpl<IBluetoothDevice4,IBluetoothDevice4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothDevice4?> =
        arrayOfNulls<IBluetoothDevice4_Impl>(size) as Array<IBluetoothDevice4?>
  }
}
