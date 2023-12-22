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

@ABIMarker(IInclinometerStatics.ABI::class)
@Signature("{f22ec551-9c30-453a-8b49-3c3eeb33cb61}")
@Guid("f22ec5519c30453a8b493c3eeb33cb61")
@WinRTInterface("f22ec5519c30453a8b493c3eeb33cb61")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInclinometerStatics.ByReference::class)
public interface IInclinometerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): Inclinometer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInclinometerStatics> {
    public override fun getValue() = ABI.makeIInclinometerStatics(pointer.getPointer(0))

    public fun setValue(value: IInclinometerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInclinometerStatics {
    public val __1280572780_Ptr: Pointer?

    public val _1280572780_VtblPtr: Pointer?
      get() = __1280572780_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): Inclinometer? {
      val fnPtr = _1280572780_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Inclinometer>()
      val hr = fn.invokeHR(arrayOf(__1280572780_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Inclinometer>(result.getValue())
      return resultValue
    }
  }

  public class IInclinometerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1280572780_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInclinometerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f22ec5519c30453a8b493c3eeb33cb61")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInclinometerStatics(ptr: Pointer?): WithDefault = IInclinometerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInclinometerStatics {
      val address = segment.toRawLongValue()
      return makeIInclinometerStatics(Pointer(address))
    }

    public override fun toNative(obj: IInclinometerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1280572780_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInclinometerStatics): Array<IInclinometerStatics?> =
        (elements as
        Array<IInclinometerStatics?>).castToImpl<IInclinometerStatics,IInclinometerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInclinometerStatics?> =
        arrayOfNulls<IInclinometerStatics_Impl>(size) as Array<IInclinometerStatics?>
  }
}
