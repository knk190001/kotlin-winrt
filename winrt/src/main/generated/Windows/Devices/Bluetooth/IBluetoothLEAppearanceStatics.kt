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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothLEAppearanceStatics.ABI::class)
@Signature("{a193c0c7-4504-4f4a-9ba5-cd1054e5e065}")
@Guid("a193c0c745044f4a9ba5cd1054e5e065")
@WinRTInterface("a193c0c745044f4a9ba5cd1054e5e065")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAppearanceStatics.ByReference::class)
public interface IBluetoothLEAppearanceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromRawValue(rawValue: WinDef.USHORT): BluetoothLEAppearance?

  @InterfaceMethod(1)
  public fun FromParts(appearanceCategory: WinDef.USHORT, appearanceSubCategory: WinDef.USHORT):
      BluetoothLEAppearance?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAppearanceStatics> {
    public override fun getValue() = ABI.makeIBluetoothLEAppearanceStatics(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAppearanceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAppearanceStatics {
    public val __143005489_Ptr: Pointer?

    public val _143005489_VtblPtr: Pointer?
      get() = __143005489_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromRawValue(rawValue: WinDef.USHORT): BluetoothLEAppearance? {
      val fnPtr = _143005489_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEAppearance>()
      val hr = fn.invokeHR(arrayOf(__143005489_Ptr, rawValue, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEAppearance>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromParts(appearanceCategory: WinDef.USHORT,
        appearanceSubCategory: WinDef.USHORT): BluetoothLEAppearance? {
      val fnPtr = _143005489_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEAppearance>()
      val hr = fn.invokeHR(arrayOf(__143005489_Ptr, appearanceCategory, appearanceSubCategory,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEAppearance>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEAppearanceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __143005489_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAppearanceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a193c0c745044f4a9ba5cd1054e5e065")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAppearanceStatics(ptr: Pointer?): WithDefault =
        IBluetoothLEAppearanceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEAppearanceStatics {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAppearanceStatics(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAppearanceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__143005489_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAppearanceStatics):
        Array<IBluetoothLEAppearanceStatics?> = (elements as
        Array<IBluetoothLEAppearanceStatics?>).castToImpl<IBluetoothLEAppearanceStatics,IBluetoothLEAppearanceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAppearanceStatics?> =
        arrayOfNulls<IBluetoothLEAppearanceStatics_Impl>(size) as
        Array<IBluetoothLEAppearanceStatics?>
  }
}
