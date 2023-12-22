package Windows.ApplicationModel.Background

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

@ABIMarker(IBluetoothLEAdvertisementWatcherTrigger2.ABI::class)
@Signature("{39b56799-eb39-5ab6-9932-aa9e4549604d}")
@Guid("39b56799eb395ab69932aa9e4549604d")
@WinRTInterface("39b56799eb395ab69932aa9e4549604d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementWatcherTrigger2.ByReference::class)
public interface IBluetoothLEAdvertisementWatcherTrigger2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowExtendedAdvertisements(): Boolean

  @InterfaceMethod(1)
  public fun put_AllowExtendedAdvertisements(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementWatcherTrigger2> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementWatcherTrigger2(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementWatcherTrigger2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementWatcherTrigger2 {
    public val __2076346425_Ptr: Pointer?

    public val _2076346425_VtblPtr: Pointer?
      get() = __2076346425_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowExtendedAdvertisements(): Boolean {
      val fnPtr = _2076346425_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076346425_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AllowExtendedAdvertisements(value: Boolean): Unit {
      val fnPtr = _2076346425_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076346425_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBluetoothLEAdvertisementWatcherTrigger2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2076346425_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementWatcherTrigger2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("39b56799eb395ab69932aa9e4549604d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementWatcherTrigger2(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementWatcherTrigger2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEAdvertisementWatcherTrigger2 {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementWatcherTrigger2(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementWatcherTrigger2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2076346425_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementWatcherTrigger2):
        Array<IBluetoothLEAdvertisementWatcherTrigger2?> = (elements as
        Array<IBluetoothLEAdvertisementWatcherTrigger2?>).castToImpl<IBluetoothLEAdvertisementWatcherTrigger2,IBluetoothLEAdvertisementWatcherTrigger2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementWatcherTrigger2?> =
        arrayOfNulls<IBluetoothLEAdvertisementWatcherTrigger2_Impl>(size) as
        Array<IBluetoothLEAdvertisementWatcherTrigger2?>
  }
}
