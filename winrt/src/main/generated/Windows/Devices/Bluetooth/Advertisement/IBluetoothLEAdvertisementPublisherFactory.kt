package Windows.Devices.Bluetooth.Advertisement

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

@ABIMarker(IBluetoothLEAdvertisementPublisherFactory.ABI::class)
@Signature("{5c5f065e-b863-4981-a1af-1c544d8b0c0d}")
@Guid("5c5f065eb8634981a1af1c544d8b0c0d")
@WinRTInterface("5c5f065eb8634981a1af1c544d8b0c0d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementPublisherFactory.ByReference::class)
public interface IBluetoothLEAdvertisementPublisherFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(advertisement: BluetoothLEAdvertisement?): BluetoothLEAdvertisementPublisher?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementPublisherFactory> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementPublisherFactory(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementPublisherFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementPublisherFactory {
    public val __1033390316_Ptr: Pointer?

    public val _1033390316_VtblPtr: Pointer?
      get() = __1033390316_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(advertisement: BluetoothLEAdvertisement?):
        BluetoothLEAdvertisementPublisher? {
      val fnPtr = _1033390316_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEAdvertisementPublisher>()
      val hr = fn.invokeHR(arrayOf(__1033390316_Ptr, marshalToNative(advertisement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEAdvertisementPublisher>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEAdvertisementPublisherFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1033390316_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementPublisherFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c5f065eb8634981a1af1c544d8b0c0d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementPublisherFactory(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementPublisherFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEAdvertisementPublisherFactory {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementPublisherFactory(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementPublisherFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1033390316_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementPublisherFactory):
        Array<IBluetoothLEAdvertisementPublisherFactory?> = (elements as
        Array<IBluetoothLEAdvertisementPublisherFactory?>).castToImpl<IBluetoothLEAdvertisementPublisherFactory,IBluetoothLEAdvertisementPublisherFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementPublisherFactory?> =
        arrayOfNulls<IBluetoothLEAdvertisementPublisherFactory_Impl>(size) as
        Array<IBluetoothLEAdvertisementPublisherFactory?>
  }
}
