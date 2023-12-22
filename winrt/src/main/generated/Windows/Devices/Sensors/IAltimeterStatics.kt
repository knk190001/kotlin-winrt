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

@ABIMarker(IAltimeterStatics.ABI::class)
@Signature("{9eb4d7c3-e5ac-47ce-8eef-d3718168c01f}")
@Guid("9eb4d7c3e5ac47ce8eefd3718168c01f")
@WinRTInterface("9eb4d7c3e5ac47ce8eefd3718168c01f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAltimeterStatics.ByReference::class)
public interface IAltimeterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): Altimeter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAltimeterStatics> {
    public override fun getValue() = ABI.makeIAltimeterStatics(pointer.getPointer(0))

    public fun setValue(value: IAltimeterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAltimeterStatics {
    public val __1554085320_Ptr: Pointer?

    public val _1554085320_VtblPtr: Pointer?
      get() = __1554085320_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): Altimeter? {
      val fnPtr = _1554085320_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Altimeter>()
      val hr = fn.invokeHR(arrayOf(__1554085320_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Altimeter>(result.getValue())
      return resultValue
    }
  }

  public class IAltimeterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1554085320_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAltimeterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9eb4d7c3e5ac47ce8eefd3718168c01f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAltimeterStatics(ptr: Pointer?): WithDefault = IAltimeterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAltimeterStatics {
      val address = segment.toRawLongValue()
      return makeIAltimeterStatics(Pointer(address))
    }

    public override fun toNative(obj: IAltimeterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1554085320_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAltimeterStatics): Array<IAltimeterStatics?> = (elements
        as Array<IAltimeterStatics?>).castToImpl<IAltimeterStatics,IAltimeterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAltimeterStatics?> =
        arrayOfNulls<IAltimeterStatics_Impl>(size) as Array<IAltimeterStatics?>
  }
}
