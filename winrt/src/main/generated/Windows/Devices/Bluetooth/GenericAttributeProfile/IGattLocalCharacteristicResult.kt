package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Devices.Bluetooth.BluetoothError
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

@ABIMarker(IGattLocalCharacteristicResult.ABI::class)
@Signature("{7975de9b-0170-4397-9666-92f863f12ee6}")
@Guid("7975de9b01704397966692f863f12ee6")
@WinRTInterface("7975de9b01704397966692f863f12ee6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattLocalCharacteristicResult.ByReference::class)
public interface IGattLocalCharacteristicResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Characteristic(): GattLocalCharacteristic?

  @InterfaceMethod(1)
  public fun get_Error(): BluetoothError?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattLocalCharacteristicResult> {
    public override fun getValue() = ABI.makeIGattLocalCharacteristicResult(pointer.getPointer(0))

    public fun setValue(value: IGattLocalCharacteristicResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattLocalCharacteristicResult {
    public val __274307768_Ptr: Pointer?

    public val _274307768_VtblPtr: Pointer?
      get() = __274307768_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Characteristic(): GattLocalCharacteristic? {
      val fnPtr = _274307768_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattLocalCharacteristic>()
      val hr = fn.invokeHR(arrayOf(__274307768_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattLocalCharacteristic>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Error(): BluetoothError? {
      val fnPtr = _274307768_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothError>()
      val hr = fn.invokeHR(arrayOf(__274307768_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothError>(result.getValue())
      return resultValue
    }
  }

  public class IGattLocalCharacteristicResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __274307768_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattLocalCharacteristicResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7975de9b01704397966692f863f12ee6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattLocalCharacteristicResult(ptr: Pointer?): WithDefault =
        IGattLocalCharacteristicResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattLocalCharacteristicResult {
      val address = segment.toRawLongValue()
      return makeIGattLocalCharacteristicResult(Pointer(address))
    }

    public override fun toNative(obj: IGattLocalCharacteristicResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__274307768_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattLocalCharacteristicResult):
        Array<IGattLocalCharacteristicResult?> = (elements as
        Array<IGattLocalCharacteristicResult?>).castToImpl<IGattLocalCharacteristicResult,IGattLocalCharacteristicResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattLocalCharacteristicResult?> =
        arrayOfNulls<IGattLocalCharacteristicResult_Impl>(size) as
        Array<IGattLocalCharacteristicResult?>
  }
}
