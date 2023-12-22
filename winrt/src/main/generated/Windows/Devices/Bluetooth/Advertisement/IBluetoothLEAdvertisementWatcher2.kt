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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothLEAdvertisementWatcher2.ABI::class)
@Signature("{01bf26bc-b164-5805-90a3-e8a7997ff225}")
@Guid("01bf26bcb164580590a3e8a7997ff225")
@WinRTInterface("01bf26bcb164580590a3e8a7997ff225")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementWatcher2.ByReference::class)
public interface IBluetoothLEAdvertisementWatcher2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowExtendedAdvertisements(): Boolean

  @InterfaceMethod(1)
  public fun put_AllowExtendedAdvertisements(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementWatcher2> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementWatcher2(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementWatcher2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementWatcher2 {
    public val __529804940_Ptr: Pointer?

    public val _529804940_VtblPtr: Pointer?
      get() = __529804940_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowExtendedAdvertisements(): Boolean {
      val fnPtr = _529804940_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__529804940_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AllowExtendedAdvertisements(value: Boolean): Unit {
      val fnPtr = _529804940_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__529804940_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBluetoothLEAdvertisementWatcher2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __529804940_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementWatcher2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("01bf26bcb164580590a3e8a7997ff225")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementWatcher2(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementWatcher2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEAdvertisementWatcher2 {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementWatcher2(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementWatcher2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__529804940_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementWatcher2):
        Array<IBluetoothLEAdvertisementWatcher2?> = (elements as
        Array<IBluetoothLEAdvertisementWatcher2?>).castToImpl<IBluetoothLEAdvertisementWatcher2,IBluetoothLEAdvertisementWatcher2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementWatcher2?> =
        arrayOfNulls<IBluetoothLEAdvertisementWatcher2_Impl>(size) as
        Array<IBluetoothLEAdvertisementWatcher2?>
  }
}
