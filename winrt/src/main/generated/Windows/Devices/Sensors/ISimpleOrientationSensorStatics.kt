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

@ABIMarker(ISimpleOrientationSensorStatics.ABI::class)
@Signature("{72ed066f-70aa-40c6-9b1b-3433f7459b4e}")
@Guid("72ed066f70aa40c69b1b3433f7459b4e")
@WinRTInterface("72ed066f70aa40c69b1b3433f7459b4e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISimpleOrientationSensorStatics.ByReference::class)
public interface ISimpleOrientationSensorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): SimpleOrientationSensor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISimpleOrientationSensorStatics> {
    public override fun getValue() = ABI.makeISimpleOrientationSensorStatics(pointer.getPointer(0))

    public fun setValue(value: ISimpleOrientationSensorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISimpleOrientationSensorStatics {
    public val __325601415_Ptr: Pointer?

    public val _325601415_VtblPtr: Pointer?
      get() = __325601415_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): SimpleOrientationSensor? {
      val fnPtr = _325601415_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SimpleOrientationSensor>()
      val hr = fn.invokeHR(arrayOf(__325601415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SimpleOrientationSensor>(result.getValue())
      return resultValue
    }
  }

  public class ISimpleOrientationSensorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __325601415_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISimpleOrientationSensorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("72ed066f70aa40c69b1b3433f7459b4e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISimpleOrientationSensorStatics(ptr: Pointer?): WithDefault =
        ISimpleOrientationSensorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISimpleOrientationSensorStatics {
      val address = segment.toRawLongValue()
      return makeISimpleOrientationSensorStatics(Pointer(address))
    }

    public override fun toNative(obj: ISimpleOrientationSensorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__325601415_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISimpleOrientationSensorStatics):
        Array<ISimpleOrientationSensorStatics?> = (elements as
        Array<ISimpleOrientationSensorStatics?>).castToImpl<ISimpleOrientationSensorStatics,ISimpleOrientationSensorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISimpleOrientationSensorStatics?> =
        arrayOfNulls<ISimpleOrientationSensorStatics_Impl>(size) as
        Array<ISimpleOrientationSensorStatics?>
  }
}
