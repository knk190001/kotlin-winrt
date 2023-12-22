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

@ABIMarker(IAccelerometer5.ABI::class)
@Signature("{7e7e7021-def4-53a6-af43-806fd538edf6}")
@Guid("7e7e7021def453a6af43806fd538edf6")
@WinRTInterface("7e7e7021def453a6af43806fd538edf6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccelerometer5.ByReference::class)
public interface IAccelerometer5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ReportThreshold(): AccelerometerDataThreshold?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccelerometer5> {
    public override fun getValue() = ABI.makeIAccelerometer5(pointer.getPointer(0))

    public fun setValue(value: IAccelerometer5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccelerometer5 {
    public val __9035442_Ptr: Pointer?

    public val _9035442_VtblPtr: Pointer?
      get() = __9035442_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReportThreshold(): AccelerometerDataThreshold? {
      val fnPtr = _9035442_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AccelerometerDataThreshold>()
      val hr = fn.invokeHR(arrayOf(__9035442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AccelerometerDataThreshold>(result.getValue())
      return resultValue
    }
  }

  public class IAccelerometer5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __9035442_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccelerometer5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7e7e7021def453a6af43806fd538edf6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccelerometer5(ptr: Pointer?): WithDefault = IAccelerometer5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccelerometer5 {
      val address = segment.toRawLongValue()
      return makeIAccelerometer5(Pointer(address))
    }

    public override fun toNative(obj: IAccelerometer5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__9035442_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccelerometer5): Array<IAccelerometer5?> = (elements as
        Array<IAccelerometer5?>).castToImpl<IAccelerometer5,IAccelerometer5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccelerometer5?> =
        arrayOfNulls<IAccelerometer5_Impl>(size) as Array<IAccelerometer5?>
  }
}
