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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothDeviceId.ABI::class)
@Signature("{c17949af-57c1-4642-bcce-e6c06b20ae76}")
@Guid("c17949af57c14642bccee6c06b20ae76")
@WinRTInterface("c17949af57c14642bccee6c06b20ae76")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothDeviceId.ByReference::class)
public interface IBluetoothDeviceId : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_IsClassicDevice(): Boolean

  @InterfaceMethod(2)
  public fun get_IsLowEnergyDevice(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothDeviceId> {
    public override fun getValue() = ABI.makeIBluetoothDeviceId(pointer.getPointer(0))

    public fun setValue(value: IBluetoothDeviceId_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothDeviceId {
    public val __1431287576_Ptr: Pointer?

    public val _1431287576_VtblPtr: Pointer?
      get() = __1431287576_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1431287576_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1431287576_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsClassicDevice(): Boolean {
      val fnPtr = _1431287576_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1431287576_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsLowEnergyDevice(): Boolean {
      val fnPtr = _1431287576_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1431287576_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IBluetoothDeviceId_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1431287576_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothDeviceId, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c17949af57c14642bccee6c06b20ae76")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothDeviceId(ptr: Pointer?): WithDefault = IBluetoothDeviceId_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothDeviceId {
      val address = segment.toRawLongValue()
      return makeIBluetoothDeviceId(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothDeviceId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1431287576_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothDeviceId): Array<IBluetoothDeviceId?> =
        (elements as
        Array<IBluetoothDeviceId?>).castToImpl<IBluetoothDeviceId,IBluetoothDeviceId_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothDeviceId?> =
        arrayOfNulls<IBluetoothDeviceId_Impl>(size) as Array<IBluetoothDeviceId?>
  }
}
