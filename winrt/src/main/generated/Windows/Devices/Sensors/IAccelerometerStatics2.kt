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

@ABIMarker(IAccelerometerStatics2.ABI::class)
@Signature("{c4c4842f-d86b-4685-b2d7-3396f798d57b}")
@Guid("c4c4842fd86b4685b2d73396f798d57b")
@WinRTInterface("c4c4842fd86b4685b2d73396f798d57b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccelerometerStatics2.ByReference::class)
public interface IAccelerometerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(readingType: AccelerometerReadingType?): Accelerometer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccelerometerStatics2> {
    public override fun getValue() = ABI.makeIAccelerometerStatics2(pointer.getPointer(0))

    public fun setValue(value: IAccelerometerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccelerometerStatics2 {
    public val __1403103248_Ptr: Pointer?

    public val _1403103248_VtblPtr: Pointer?
      get() = __1403103248_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(readingType: AccelerometerReadingType?): Accelerometer? {
      val fnPtr = _1403103248_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Accelerometer>()
      val hr = fn.invokeHR(arrayOf(__1403103248_Ptr, marshalToNative(readingType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Accelerometer>(result.getValue())
      return resultValue
    }
  }

  public class IAccelerometerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1403103248_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccelerometerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c4c4842fd86b4685b2d73396f798d57b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccelerometerStatics2(ptr: Pointer?): WithDefault =
        IAccelerometerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccelerometerStatics2 {
      val address = segment.toRawLongValue()
      return makeIAccelerometerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IAccelerometerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1403103248_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccelerometerStatics2): Array<IAccelerometerStatics2?> =
        (elements as
        Array<IAccelerometerStatics2?>).castToImpl<IAccelerometerStatics2,IAccelerometerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccelerometerStatics2?> =
        arrayOfNulls<IAccelerometerStatics2_Impl>(size) as Array<IAccelerometerStatics2?>
  }
}
