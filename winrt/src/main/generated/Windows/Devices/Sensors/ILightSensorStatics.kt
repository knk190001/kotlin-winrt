package Windows.Devices.Sensors

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

@ABIMarker(ILightSensorStatics.ABI::class)
@Signature("{45db8c84-c3a8-471e-9a53-6457fad87c0e}")
@Guid("45db8c84c3a8471e9a536457fad87c0e")
@WinRTInterface("45db8c84c3a8471e9a536457fad87c0e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILightSensorStatics.ByReference::class)
public interface ILightSensorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): LightSensor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILightSensorStatics> {
    public override fun getValue() = ABI.makeILightSensorStatics(pointer.getPointer(0))

    public fun setValue(value: ILightSensorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILightSensorStatics {
    public val __329063457_Ptr: Pointer?

    public val _329063457_VtblPtr: Pointer?
      get() = __329063457_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): LightSensor? {
      val fnPtr = _329063457_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LightSensor>()
      val hr = fn.invokeHR(arrayOf(__329063457_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LightSensor>(result.getValue())
      return resultValue
    }
  }

  public class ILightSensorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __329063457_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILightSensorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("45db8c84c3a8471e9a536457fad87c0e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILightSensorStatics(ptr: Pointer?): WithDefault = ILightSensorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILightSensorStatics {
      val address = segment.toRawLongValue()
      return makeILightSensorStatics(Pointer(address))
    }

    public override fun toNative(obj: ILightSensorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__329063457_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILightSensorStatics): Array<ILightSensorStatics?> =
        (elements as
        Array<ILightSensorStatics?>).castToImpl<ILightSensorStatics,ILightSensorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILightSensorStatics?> =
        arrayOfNulls<ILightSensorStatics_Impl>(size) as Array<ILightSensorStatics?>
  }
}
