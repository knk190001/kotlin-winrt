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

@ABIMarker(IBluetoothAdapter3.ABI::class)
@Signature("{8f8624e0-cba9-5211-9f89-3aac62b4c6b8}")
@Guid("8f8624e0cba952119f893aac62b4c6b8")
@WinRTInterface("8f8624e0cba952119f893aac62b4c6b8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothAdapter3.ByReference::class)
public interface IBluetoothAdapter3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsExtendedAdvertisingSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_MaxAdvertisementDataLength(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothAdapter3> {
    public override fun getValue() = ABI.makeIBluetoothAdapter3(pointer.getPointer(0))

    public fun setValue(value: IBluetoothAdapter3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothAdapter3 {
    public val __448472475_Ptr: Pointer?

    public val _448472475_VtblPtr: Pointer?
      get() = __448472475_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsExtendedAdvertisingSupported(): Boolean {
      val fnPtr = _448472475_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__448472475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_MaxAdvertisementDataLength(): WinDef.UINT {
      val fnPtr = _448472475_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__448472475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IBluetoothAdapter3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __448472475_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothAdapter3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f8624e0cba952119f893aac62b4c6b8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothAdapter3(ptr: Pointer?): WithDefault = IBluetoothAdapter3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothAdapter3 {
      val address = segment.toRawLongValue()
      return makeIBluetoothAdapter3(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothAdapter3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__448472475_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothAdapter3): Array<IBluetoothAdapter3?> =
        (elements as
        Array<IBluetoothAdapter3?>).castToImpl<IBluetoothAdapter3,IBluetoothAdapter3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothAdapter3?> =
        arrayOfNulls<IBluetoothAdapter3_Impl>(size) as Array<IBluetoothAdapter3?>
  }
}
