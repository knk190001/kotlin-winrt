package Windows.Devices.Sensors

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

@ABIMarker(IMagnetometerStatics2.ABI::class)
@Signature("{2c0819f0-ffc6-4f89-a06f-18fa10792933}")
@Guid("2c0819f0ffc64f89a06f18fa10792933")
@WinRTInterface("2c0819f0ffc64f89a06f18fa10792933")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMagnetometerStatics2.ByReference::class)
public interface IMagnetometerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<Magnetometer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMagnetometerStatics2> {
    public override fun getValue() = ABI.makeIMagnetometerStatics2(pointer.getPointer(0))

    public fun setValue(value: IMagnetometerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagnetometerStatics2 {
    public val __1283170947_Ptr: Pointer?

    public val _1283170947_VtblPtr: Pointer?
      get() = __1283170947_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1283170947_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1283170947_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<Magnetometer?>? {
      val fnPtr = _1283170947_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Magnetometer?>>()
      val hr = fn.invokeHR(arrayOf(__1283170947_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Magnetometer?>>(result.getValue())
      return resultValue
    }
  }

  public class IMagnetometerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1283170947_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagnetometerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c0819f0ffc64f89a06f18fa10792933")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagnetometerStatics2(ptr: Pointer?): WithDefault =
        IMagnetometerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMagnetometerStatics2 {
      val address = segment.toRawLongValue()
      return makeIMagnetometerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IMagnetometerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1283170947_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMagnetometerStatics2): Array<IMagnetometerStatics2?> =
        (elements as
        Array<IMagnetometerStatics2?>).castToImpl<IMagnetometerStatics2,IMagnetometerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMagnetometerStatics2?> =
        arrayOfNulls<IMagnetometerStatics2_Impl>(size) as Array<IMagnetometerStatics2?>
  }
}
