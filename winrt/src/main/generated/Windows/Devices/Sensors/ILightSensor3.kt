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

@ABIMarker(ILightSensor3.ABI::class)
@Signature("{4876d0ff-9f4c-5f72-adbd-a3471b063c00}")
@Guid("4876d0ff9f4c5f72adbda3471b063c00")
@WinRTInterface("4876d0ff9f4c5f72adbda3471b063c00")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILightSensor3.ByReference::class)
public interface ILightSensor3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ReportThreshold(): LightSensorDataThreshold?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILightSensor3>
      {
    public override fun getValue() = ABI.makeILightSensor3(pointer.getPointer(0))

    public fun setValue(value: ILightSensor3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILightSensor3 {
    public val __1251700305_Ptr: Pointer?

    public val _1251700305_VtblPtr: Pointer?
      get() = __1251700305_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReportThreshold(): LightSensorDataThreshold? {
      val fnPtr = _1251700305_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LightSensorDataThreshold>()
      val hr = fn.invokeHR(arrayOf(__1251700305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LightSensorDataThreshold>(result.getValue())
      return resultValue
    }
  }

  public class ILightSensor3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1251700305_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILightSensor3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4876d0ff9f4c5f72adbda3471b063c00")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILightSensor3(ptr: Pointer?): WithDefault = ILightSensor3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILightSensor3 {
      val address = segment.toRawLongValue()
      return makeILightSensor3(Pointer(address))
    }

    public override fun toNative(obj: ILightSensor3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1251700305_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILightSensor3): Array<ILightSensor3?> = (elements as
        Array<ILightSensor3?>).castToImpl<ILightSensor3,ILightSensor3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILightSensor3?> =
        arrayOfNulls<ILightSensor3_Impl>(size) as Array<ILightSensor3?>
  }
}
