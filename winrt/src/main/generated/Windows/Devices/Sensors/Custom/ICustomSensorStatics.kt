package Windows.Devices.Sensors.Custom

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

@ABIMarker(ICustomSensorStatics.ABI::class)
@Signature("{992052cf-f422-4c7d-836b-e7dc74a7124b}")
@Guid("992052cff4224c7d836be7dc74a7124b")
@WinRTInterface("992052cff4224c7d836be7dc74a7124b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICustomSensorStatics.ByReference::class)
public interface ICustomSensorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(interfaceId: com.sun.jna.platform.win32.Guid.GUID?): String?

  @InterfaceMethod(1)
  public fun FromIdAsync(sensorId: String?): IAsyncOperation<CustomSensor?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICustomSensorStatics> {
    public override fun getValue() = ABI.makeICustomSensorStatics(pointer.getPointer(0))

    public fun setValue(value: ICustomSensorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICustomSensorStatics {
    public val __1386671309_Ptr: Pointer?

    public val _1386671309_VtblPtr: Pointer?
      get() = __1386671309_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(interfaceId: com.sun.jna.platform.win32.Guid.GUID?):
        String? {
      val fnPtr = _1386671309_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1386671309_Ptr, marshalToNative(interfaceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromIdAsync(sensorId: String?): IAsyncOperation<CustomSensor?>? {
      val fnPtr = _1386671309_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CustomSensor?>>()
      val hr = fn.invokeHR(arrayOf(__1386671309_Ptr, marshalToNative(sensorId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<CustomSensor?>>(result.getValue())
      return resultValue
    }
  }

  public class ICustomSensorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1386671309_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICustomSensorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("992052cff4224c7d836be7dc74a7124b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICustomSensorStatics(ptr: Pointer?): WithDefault = ICustomSensorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICustomSensorStatics {
      val address = segment.toRawLongValue()
      return makeICustomSensorStatics(Pointer(address))
    }

    public override fun toNative(obj: ICustomSensorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1386671309_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICustomSensorStatics): Array<ICustomSensorStatics?> =
        (elements as
        Array<ICustomSensorStatics?>).castToImpl<ICustomSensorStatics,ICustomSensorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICustomSensorStatics?> =
        arrayOfNulls<ICustomSensorStatics_Impl>(size) as Array<ICustomSensorStatics?>
  }
}
