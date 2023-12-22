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
import kotlin.Short
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothLEAdvertisementBytePatternFactory.ABI::class)
@Signature("{c2e24d73-fd5c-4ec3-be2a-9ca6fa11b7bd}")
@Guid("c2e24d73fd5c4ec3be2a9ca6fa11b7bd")
@WinRTInterface("c2e24d73fd5c4ec3be2a9ca6fa11b7bd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementBytePatternFactory.ByReference::class)
public interface IBluetoothLEAdvertisementBytePatternFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    dataType: Byte,
    offset: Short,
    `data`: IBuffer?
  ): BluetoothLEAdvertisementBytePattern?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementBytePatternFactory> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementBytePatternFactory(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementBytePatternFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementBytePatternFactory {
    public val __1614665600_Ptr: Pointer?

    public val _1614665600_VtblPtr: Pointer?
      get() = __1614665600_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      dataType: Byte,
      offset: Short,
      `data`: IBuffer?
    ): BluetoothLEAdvertisementBytePattern? {
      val fnPtr = _1614665600_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEAdvertisementBytePattern>()
      val hr = fn.invokeHR(arrayOf(__1614665600_Ptr, dataType, offset, marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEAdvertisementBytePattern>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEAdvertisementBytePatternFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1614665600_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementBytePatternFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c2e24d73fd5c4ec3be2a9ca6fa11b7bd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementBytePatternFactory(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementBytePatternFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEAdvertisementBytePatternFactory {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementBytePatternFactory(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementBytePatternFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1614665600_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementBytePatternFactory):
        Array<IBluetoothLEAdvertisementBytePatternFactory?> = (elements as
        Array<IBluetoothLEAdvertisementBytePatternFactory?>).castToImpl<IBluetoothLEAdvertisementBytePatternFactory,IBluetoothLEAdvertisementBytePatternFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementBytePatternFactory?> =
        arrayOfNulls<IBluetoothLEAdvertisementBytePatternFactory_Impl>(size) as
        Array<IBluetoothLEAdvertisementBytePatternFactory?>
  }
}
