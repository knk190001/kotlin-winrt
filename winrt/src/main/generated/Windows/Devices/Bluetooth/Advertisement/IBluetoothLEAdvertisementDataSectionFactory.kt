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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothLEAdvertisementDataSectionFactory.ABI::class)
@Signature("{e7a40942-a845-4045-bf7e-3e9971db8a6b}")
@Guid("e7a40942a8454045bf7e3e9971db8a6b")
@WinRTInterface("e7a40942a8454045bf7e3e9971db8a6b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementDataSectionFactory.ByReference::class)
public interface IBluetoothLEAdvertisementDataSectionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(dataType: Byte, `data`: IBuffer?): BluetoothLEAdvertisementDataSection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementDataSectionFactory> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementDataSectionFactory(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementDataSectionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementDataSectionFactory {
    public val __582837933_Ptr: Pointer?

    public val _582837933_VtblPtr: Pointer?
      get() = __582837933_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(dataType: Byte, `data`: IBuffer?):
        BluetoothLEAdvertisementDataSection? {
      val fnPtr = _582837933_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEAdvertisementDataSection>()
      val hr = fn.invokeHR(arrayOf(__582837933_Ptr, dataType, marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEAdvertisementDataSection>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEAdvertisementDataSectionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __582837933_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementDataSectionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e7a40942a8454045bf7e3e9971db8a6b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementDataSectionFactory(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementDataSectionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEAdvertisementDataSectionFactory {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementDataSectionFactory(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementDataSectionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__582837933_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementDataSectionFactory):
        Array<IBluetoothLEAdvertisementDataSectionFactory?> = (elements as
        Array<IBluetoothLEAdvertisementDataSectionFactory?>).castToImpl<IBluetoothLEAdvertisementDataSectionFactory,IBluetoothLEAdvertisementDataSectionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementDataSectionFactory?> =
        arrayOfNulls<IBluetoothLEAdvertisementDataSectionFactory_Impl>(size) as
        Array<IBluetoothLEAdvertisementDataSectionFactory?>
  }
}
