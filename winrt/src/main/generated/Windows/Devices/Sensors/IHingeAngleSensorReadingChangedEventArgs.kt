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

@ABIMarker(IHingeAngleSensorReadingChangedEventArgs.ABI::class)
@Signature("{24d9558b-fad0-42b8-a854-78923049a1ba}")
@Guid("24d9558bfad042b8a85478923049a1ba")
@WinRTInterface("24d9558bfad042b8a85478923049a1ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHingeAngleSensorReadingChangedEventArgs.ByReference::class)
public interface IHingeAngleSensorReadingChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reading(): HingeAngleReading?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHingeAngleSensorReadingChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIHingeAngleSensorReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IHingeAngleSensorReadingChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHingeAngleSensorReadingChangedEventArgs {
    public val __2046280991_Ptr: Pointer?

    public val _2046280991_VtblPtr: Pointer?
      get() = __2046280991_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reading(): HingeAngleReading? {
      val fnPtr = _2046280991_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HingeAngleReading>()
      val hr = fn.invokeHR(arrayOf(__2046280991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HingeAngleReading>(result.getValue())
      return resultValue
    }
  }

  public class IHingeAngleSensorReadingChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2046280991_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHingeAngleSensorReadingChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("24d9558bfad042b8a85478923049a1ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHingeAngleSensorReadingChangedEventArgs(ptr: Pointer?): WithDefault =
        IHingeAngleSensorReadingChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHingeAngleSensorReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIHingeAngleSensorReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IHingeAngleSensorReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2046280991_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHingeAngleSensorReadingChangedEventArgs):
        Array<IHingeAngleSensorReadingChangedEventArgs?> = (elements as
        Array<IHingeAngleSensorReadingChangedEventArgs?>).castToImpl<IHingeAngleSensorReadingChangedEventArgs,IHingeAngleSensorReadingChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHingeAngleSensorReadingChangedEventArgs?> =
        arrayOfNulls<IHingeAngleSensorReadingChangedEventArgs_Impl>(size) as
        Array<IHingeAngleSensorReadingChangedEventArgs?>
  }
}
