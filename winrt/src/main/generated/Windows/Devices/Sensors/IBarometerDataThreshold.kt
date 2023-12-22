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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBarometerDataThreshold.ABI::class)
@Signature("{076b952c-cb62-5a90-a0d1-f85e4a936394}")
@Guid("076b952ccb625a90a0d1f85e4a936394")
@WinRTInterface("076b952ccb625a90a0d1f85e4a936394")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarometerDataThreshold.ByReference::class)
public interface IBarometerDataThreshold : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Hectopascals(): Double

  @InterfaceMethod(1)
  public fun put_Hectopascals(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarometerDataThreshold> {
    public override fun getValue() = ABI.makeIBarometerDataThreshold(pointer.getPointer(0))

    public fun setValue(value: IBarometerDataThreshold_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarometerDataThreshold {
    public val __420706432_Ptr: Pointer?

    public val _420706432_VtblPtr: Pointer?
      get() = __420706432_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Hectopascals(): Double {
      val fnPtr = _420706432_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__420706432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Hectopascals(value: Double): Unit {
      val fnPtr = _420706432_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__420706432_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBarometerDataThreshold_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __420706432_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarometerDataThreshold, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("076b952ccb625a90a0d1f85e4a936394")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarometerDataThreshold(ptr: Pointer?): WithDefault =
        IBarometerDataThreshold_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarometerDataThreshold {
      val address = segment.toRawLongValue()
      return makeIBarometerDataThreshold(Pointer(address))
    }

    public override fun toNative(obj: IBarometerDataThreshold): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__420706432_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarometerDataThreshold): Array<IBarometerDataThreshold?>
        = (elements as
        Array<IBarometerDataThreshold?>).castToImpl<IBarometerDataThreshold,IBarometerDataThreshold_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarometerDataThreshold?> =
        arrayOfNulls<IBarometerDataThreshold_Impl>(size) as Array<IBarometerDataThreshold?>
  }
}
