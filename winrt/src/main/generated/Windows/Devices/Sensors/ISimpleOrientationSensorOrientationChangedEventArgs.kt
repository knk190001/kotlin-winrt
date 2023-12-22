package Windows.Devices.Sensors

import Windows.Foundation.DateTime
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

@ABIMarker(ISimpleOrientationSensorOrientationChangedEventArgs.ABI::class)
@Signature("{bcd5c660-23d4-4b4c-a22e-ba81ade0c601}")
@Guid("bcd5c66023d44b4ca22eba81ade0c601")
@WinRTInterface("bcd5c66023d44b4ca22eba81ade0c601")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISimpleOrientationSensorOrientationChangedEventArgs.ByReference::class)
public interface ISimpleOrientationSensorOrientationChangedEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_Orientation(): SimpleOrientation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISimpleOrientationSensorOrientationChangedEventArgs> {
    public override fun getValue() =
        ABI.makeISimpleOrientationSensorOrientationChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISimpleOrientationSensorOrientationChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISimpleOrientationSensorOrientationChangedEventArgs {
    public val __2026384921_Ptr: Pointer?

    public val _2026384921_VtblPtr: Pointer?
      get() = __2026384921_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _2026384921_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__2026384921_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Orientation(): SimpleOrientation? {
      val fnPtr = _2026384921_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SimpleOrientation>()
      val hr = fn.invokeHR(arrayOf(__2026384921_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SimpleOrientation>(result.getValue())
      return resultValue
    }
  }

  public class ISimpleOrientationSensorOrientationChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2026384921_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISimpleOrientationSensorOrientationChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bcd5c66023d44b4ca22eba81ade0c601")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISimpleOrientationSensorOrientationChangedEventArgs(ptr: Pointer?): WithDefault =
        ISimpleOrientationSensorOrientationChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISimpleOrientationSensorOrientationChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeISimpleOrientationSensorOrientationChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISimpleOrientationSensorOrientationChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__2026384921_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISimpleOrientationSensorOrientationChangedEventArgs):
        Array<ISimpleOrientationSensorOrientationChangedEventArgs?> = (elements as
        Array<ISimpleOrientationSensorOrientationChangedEventArgs?>).castToImpl<ISimpleOrientationSensorOrientationChangedEventArgs,ISimpleOrientationSensorOrientationChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISimpleOrientationSensorOrientationChangedEventArgs?> =
        arrayOfNulls<ISimpleOrientationSensorOrientationChangedEventArgs_Impl>(size) as
        Array<ISimpleOrientationSensorOrientationChangedEventArgs?>
  }
}
