package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Devices.Bluetooth.BluetoothDeviceId
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGattSessionStatics.ABI::class)
@Signature("{2e65b95c-539f-4db7-82a8-73bdbbf73ebf}")
@Guid("2e65b95c539f4db782a873bdbbf73ebf")
@WinRTInterface("2e65b95c539f4db782a873bdbbf73ebf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattSessionStatics.ByReference::class)
public interface IGattSessionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromDeviceIdAsync(deviceId: BluetoothDeviceId?): IAsyncOperation<GattSession?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattSessionStatics> {
    public override fun getValue() = ABI.makeIGattSessionStatics(pointer.getPointer(0))

    public fun setValue(value: IGattSessionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattSessionStatics {
    public val __2108385846_Ptr: Pointer?

    public val _2108385846_VtblPtr: Pointer?
      get() = __2108385846_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromDeviceIdAsync(deviceId: BluetoothDeviceId?):
        IAsyncOperation<GattSession?>? {
      val fnPtr = _2108385846_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattSession?>>()
      val hr = fn.invokeHR(arrayOf(__2108385846_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GattSession?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattSessionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2108385846_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattSessionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e65b95c539f4db782a873bdbbf73ebf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattSessionStatics(ptr: Pointer?): WithDefault = IGattSessionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattSessionStatics {
      val address = segment.toRawLongValue()
      return makeIGattSessionStatics(Pointer(address))
    }

    public override fun toNative(obj: IGattSessionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2108385846_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattSessionStatics): Array<IGattSessionStatics?> =
        (elements as
        Array<IGattSessionStatics?>).castToImpl<IGattSessionStatics,IGattSessionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattSessionStatics?> =
        arrayOfNulls<IGattSessionStatics_Impl>(size) as Array<IGattSessionStatics?>
  }
}
