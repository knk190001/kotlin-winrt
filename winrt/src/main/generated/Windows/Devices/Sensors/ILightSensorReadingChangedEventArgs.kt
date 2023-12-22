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

@ABIMarker(ILightSensorReadingChangedEventArgs.ABI::class)
@Signature("{a3a2f4cf-258b-420c-b8ab-8edd601ecf50}")
@Guid("a3a2f4cf258b420cb8ab8edd601ecf50")
@WinRTInterface("a3a2f4cf258b420cb8ab8edd601ecf50")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILightSensorReadingChangedEventArgs.ByReference::class)
public interface ILightSensorReadingChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reading(): LightSensorReading?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILightSensorReadingChangedEventArgs> {
    public override fun getValue() =
        ABI.makeILightSensorReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ILightSensorReadingChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILightSensorReadingChangedEventArgs {
    public val __1874345653_Ptr: Pointer?

    public val _1874345653_VtblPtr: Pointer?
      get() = __1874345653_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reading(): LightSensorReading? {
      val fnPtr = _1874345653_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LightSensorReading>()
      val hr = fn.invokeHR(arrayOf(__1874345653_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LightSensorReading>(result.getValue())
      return resultValue
    }
  }

  public class ILightSensorReadingChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1874345653_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILightSensorReadingChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a3a2f4cf258b420cb8ab8edd601ecf50")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILightSensorReadingChangedEventArgs(ptr: Pointer?): WithDefault =
        ILightSensorReadingChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILightSensorReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeILightSensorReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ILightSensorReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1874345653_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILightSensorReadingChangedEventArgs):
        Array<ILightSensorReadingChangedEventArgs?> = (elements as
        Array<ILightSensorReadingChangedEventArgs?>).castToImpl<ILightSensorReadingChangedEventArgs,ILightSensorReadingChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILightSensorReadingChangedEventArgs?> =
        arrayOfNulls<ILightSensorReadingChangedEventArgs_Impl>(size) as
        Array<ILightSensorReadingChangedEventArgs?>
  }
}
