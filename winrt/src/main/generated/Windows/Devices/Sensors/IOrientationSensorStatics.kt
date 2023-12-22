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

@ABIMarker(IOrientationSensorStatics.ABI::class)
@Signature("{10ef8712-fb4c-428a-898b-2765e409e669}")
@Guid("10ef8712fb4c428a898b2765e409e669")
@WinRTInterface("10ef8712fb4c428a898b2765e409e669")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOrientationSensorStatics.ByReference::class)
public interface IOrientationSensorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): OrientationSensor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOrientationSensorStatics> {
    public override fun getValue() = ABI.makeIOrientationSensorStatics(pointer.getPointer(0))

    public fun setValue(value: IOrientationSensorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOrientationSensorStatics {
    public val __388888743_Ptr: Pointer?

    public val _388888743_VtblPtr: Pointer?
      get() = __388888743_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): OrientationSensor? {
      val fnPtr = _388888743_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OrientationSensor>()
      val hr = fn.invokeHR(arrayOf(__388888743_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OrientationSensor>(result.getValue())
      return resultValue
    }
  }

  public class IOrientationSensorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __388888743_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOrientationSensorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10ef8712fb4c428a898b2765e409e669")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOrientationSensorStatics(ptr: Pointer?): WithDefault =
        IOrientationSensorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOrientationSensorStatics {
      val address = segment.toRawLongValue()
      return makeIOrientationSensorStatics(Pointer(address))
    }

    public override fun toNative(obj: IOrientationSensorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__388888743_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOrientationSensorStatics):
        Array<IOrientationSensorStatics?> = (elements as
        Array<IOrientationSensorStatics?>).castToImpl<IOrientationSensorStatics,IOrientationSensorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOrientationSensorStatics?> =
        arrayOfNulls<IOrientationSensorStatics_Impl>(size) as Array<IOrientationSensorStatics?>
  }
}
