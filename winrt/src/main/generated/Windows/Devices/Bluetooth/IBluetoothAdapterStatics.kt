package Windows.Devices.Bluetooth

import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothAdapterStatics.ABI::class)
@Signature("{8b02fb6a-ac4c-4741-8661-8eab7d17ea9f}")
@Guid("8b02fb6aac4c474186618eab7d17ea9f")
@WinRTInterface("8b02fb6aac4c474186618eab7d17ea9f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothAdapterStatics.ByReference::class)
public interface IBluetoothAdapterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<BluetoothAdapter?>?

  @InterfaceMethod(2)
  public fun GetDefaultAsync(): IAsyncOperation<BluetoothAdapter?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothAdapterStatics> {
    public override fun getValue() = ABI.makeIBluetoothAdapterStatics(pointer.getPointer(0))

    public fun setValue(value: IBluetoothAdapterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothAdapterStatics {
    public val __1732767987_Ptr: Pointer?

    public val _1732767987_VtblPtr: Pointer?
      get() = __1732767987_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1732767987_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1732767987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<BluetoothAdapter?>? {
      val fnPtr = _1732767987_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BluetoothAdapter?>>()
      val hr = fn.invokeHR(arrayOf(__1732767987_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<BluetoothAdapter?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDefaultAsync(): IAsyncOperation<BluetoothAdapter?>? {
      val fnPtr = _1732767987_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BluetoothAdapter?>>()
      val hr = fn.invokeHR(arrayOf(__1732767987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<BluetoothAdapter?>>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothAdapterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1732767987_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothAdapterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8b02fb6aac4c474186618eab7d17ea9f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothAdapterStatics(ptr: Pointer?): WithDefault =
        IBluetoothAdapterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothAdapterStatics {
      val address = segment.toRawLongValue()
      return makeIBluetoothAdapterStatics(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothAdapterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1732767987_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothAdapterStatics):
        Array<IBluetoothAdapterStatics?> = (elements as
        Array<IBluetoothAdapterStatics?>).castToImpl<IBluetoothAdapterStatics,IBluetoothAdapterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothAdapterStatics?> =
        arrayOfNulls<IBluetoothAdapterStatics_Impl>(size) as Array<IBluetoothAdapterStatics?>
  }
}
