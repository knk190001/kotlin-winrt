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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothAdapter2.ABI::class)
@Signature("{ac94cecc-24d5-41b3-916d-1097c50b102b}")
@Guid("ac94cecc24d541b3916d1097c50b102b")
@WinRTInterface("ac94cecc24d541b3916d1097c50b102b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothAdapter2.ByReference::class)
public interface IBluetoothAdapter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AreClassicSecureConnectionsSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_AreLowEnergySecureConnectionsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothAdapter2> {
    public override fun getValue() = ABI.makeIBluetoothAdapter2(pointer.getPointer(0))

    public fun setValue(value: IBluetoothAdapter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothAdapter2 {
    public val __448472474_Ptr: Pointer?

    public val _448472474_VtblPtr: Pointer?
      get() = __448472474_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AreClassicSecureConnectionsSupported(): Boolean {
      val fnPtr = _448472474_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__448472474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_AreLowEnergySecureConnectionsSupported(): Boolean {
      val fnPtr = _448472474_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__448472474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IBluetoothAdapter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __448472474_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothAdapter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ac94cecc24d541b3916d1097c50b102b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothAdapter2(ptr: Pointer?): WithDefault = IBluetoothAdapter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothAdapter2 {
      val address = segment.toRawLongValue()
      return makeIBluetoothAdapter2(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothAdapter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__448472474_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothAdapter2): Array<IBluetoothAdapter2?> =
        (elements as
        Array<IBluetoothAdapter2?>).castToImpl<IBluetoothAdapter2,IBluetoothAdapter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothAdapter2?> =
        arrayOfNulls<IBluetoothAdapter2_Impl>(size) as Array<IBluetoothAdapter2?>
  }
}
