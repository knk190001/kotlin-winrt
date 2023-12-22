package Windows.Devices.Bluetooth.Advertisement

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IBluetoothLEAdvertisementFilter.ABI::class)
@Signature("{131eb0d3-d04e-47b1-837e-49405bf6f80f}")
@Guid("131eb0d3d04e47b1837e49405bf6f80f")
@WinRTInterface("131eb0d3d04e47b1837e49405bf6f80f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementFilter.ByReference::class)
public interface IBluetoothLEAdvertisementFilter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Advertisement(): BluetoothLEAdvertisement?

  @InterfaceMethod(1)
  public fun put_Advertisement(value: BluetoothLEAdvertisement?): Unit

  @InterfaceMethod(2)
  public fun get_BytePatterns(): IVector<BluetoothLEAdvertisementBytePattern?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementFilter> {
    public override fun getValue() = ABI.makeIBluetoothLEAdvertisementFilter(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementFilter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementFilter {
    public val __149354890_Ptr: Pointer?

    public val _149354890_VtblPtr: Pointer?
      get() = __149354890_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Advertisement(): BluetoothLEAdvertisement? {
      val fnPtr = _149354890_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEAdvertisement>()
      val hr = fn.invokeHR(arrayOf(__149354890_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEAdvertisement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Advertisement(value: BluetoothLEAdvertisement?): Unit {
      val fnPtr = _149354890_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__149354890_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BytePatterns(): IVector<BluetoothLEAdvertisementBytePattern?>? {
      val fnPtr = _149354890_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<BluetoothLEAdvertisementBytePattern?>>()
      val hr = fn.invokeHR(arrayOf(__149354890_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<BluetoothLEAdvertisementBytePattern?>>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEAdvertisementFilter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __149354890_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementFilter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("131eb0d3d04e47b1837e49405bf6f80f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementFilter(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementFilter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEAdvertisementFilter {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementFilter(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__149354890_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementFilter):
        Array<IBluetoothLEAdvertisementFilter?> = (elements as
        Array<IBluetoothLEAdvertisementFilter?>).castToImpl<IBluetoothLEAdvertisementFilter,IBluetoothLEAdvertisementFilter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementFilter?> =
        arrayOfNulls<IBluetoothLEAdvertisementFilter_Impl>(size) as
        Array<IBluetoothLEAdvertisementFilter?>
  }
}
