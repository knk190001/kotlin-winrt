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

@ABIMarker(IInclinometerStatics2.ABI::class)
@Signature("{043f9775-6a1e-499c-86e0-638c1a864b00}")
@Guid("043f97756a1e499c86e0638c1a864b00")
@WinRTInterface("043f97756a1e499c86e0638c1a864b00")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInclinometerStatics2.ByReference::class)
public interface IInclinometerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefaultForRelativeReadings(): Inclinometer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInclinometerStatics2> {
    public override fun getValue() = ABI.makeIInclinometerStatics2(pointer.getPointer(0))

    public fun setValue(value: IInclinometerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInclinometerStatics2 {
    public val __1043050566_Ptr: Pointer?

    public val _1043050566_VtblPtr: Pointer?
      get() = __1043050566_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefaultForRelativeReadings(): Inclinometer? {
      val fnPtr = _1043050566_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Inclinometer>()
      val hr = fn.invokeHR(arrayOf(__1043050566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Inclinometer>(result.getValue())
      return resultValue
    }
  }

  public class IInclinometerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1043050566_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInclinometerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("043f97756a1e499c86e0638c1a864b00")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInclinometerStatics2(ptr: Pointer?): WithDefault =
        IInclinometerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInclinometerStatics2 {
      val address = segment.toRawLongValue()
      return makeIInclinometerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IInclinometerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1043050566_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInclinometerStatics2): Array<IInclinometerStatics2?> =
        (elements as
        Array<IInclinometerStatics2?>).castToImpl<IInclinometerStatics2,IInclinometerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInclinometerStatics2?> =
        arrayOfNulls<IInclinometerStatics2_Impl>(size) as Array<IInclinometerStatics2?>
  }
}
