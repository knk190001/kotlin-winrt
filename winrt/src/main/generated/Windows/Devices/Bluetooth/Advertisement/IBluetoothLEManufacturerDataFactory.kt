package Windows.Devices.Bluetooth.Advertisement

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IBluetoothLEManufacturerDataFactory.ABI::class)
@Signature("{c09b39f8-319a-441e-8de5-66a81e877a6c}")
@Guid("c09b39f8319a441e8de566a81e877a6c")
@WinRTInterface("c09b39f8319a441e8de566a81e877a6c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEManufacturerDataFactory.ByReference::class)
public interface IBluetoothLEManufacturerDataFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(companyId: WinDef.USHORT, `data`: IBuffer?): BluetoothLEManufacturerData?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEManufacturerDataFactory> {
    public override fun getValue() =
        ABI.makeIBluetoothLEManufacturerDataFactory(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEManufacturerDataFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEManufacturerDataFactory {
    public val __984042888_Ptr: Pointer?

    public val _984042888_VtblPtr: Pointer?
      get() = __984042888_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(companyId: WinDef.USHORT, `data`: IBuffer?):
        BluetoothLEManufacturerData? {
      val fnPtr = _984042888_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEManufacturerData>()
      val hr = fn.invokeHR(arrayOf(__984042888_Ptr, companyId, marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEManufacturerData>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEManufacturerDataFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __984042888_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEManufacturerDataFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c09b39f8319a441e8de566a81e877a6c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEManufacturerDataFactory(ptr: Pointer?): WithDefault =
        IBluetoothLEManufacturerDataFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEManufacturerDataFactory {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEManufacturerDataFactory(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEManufacturerDataFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__984042888_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEManufacturerDataFactory):
        Array<IBluetoothLEManufacturerDataFactory?> = (elements as
        Array<IBluetoothLEManufacturerDataFactory?>).castToImpl<IBluetoothLEManufacturerDataFactory,IBluetoothLEManufacturerDataFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEManufacturerDataFactory?> =
        arrayOfNulls<IBluetoothLEManufacturerDataFactory_Impl>(size) as
        Array<IBluetoothLEManufacturerDataFactory?>
  }
}
