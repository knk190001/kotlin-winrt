package Windows.Devices.Gpio

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

@ABIMarker(IGpioControllerStatics.ABI::class)
@Signature("{2ed6f42e-7af7-4116-9533-c43d99a1fb64}")
@Guid("2ed6f42e7af741169533c43d99a1fb64")
@WinRTInterface("2ed6f42e7af741169533c43d99a1fb64")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGpioControllerStatics.ByReference::class)
public interface IGpioControllerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): GpioController?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGpioControllerStatics> {
    public override fun getValue() = ABI.makeIGpioControllerStatics(pointer.getPointer(0))

    public fun setValue(value: IGpioControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGpioControllerStatics {
    public val __441641372_Ptr: Pointer?

    public val _441641372_VtblPtr: Pointer?
      get() = __441641372_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): GpioController? {
      val fnPtr = _441641372_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GpioController>()
      val hr = fn.invokeHR(arrayOf(__441641372_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GpioController>(result.getValue())
      return resultValue
    }
  }

  public class IGpioControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __441641372_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGpioControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ed6f42e7af741169533c43d99a1fb64")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGpioControllerStatics(ptr: Pointer?): WithDefault =
        IGpioControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGpioControllerStatics {
      val address = segment.toRawLongValue()
      return makeIGpioControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: IGpioControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__441641372_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGpioControllerStatics): Array<IGpioControllerStatics?> =
        (elements as
        Array<IGpioControllerStatics?>).castToImpl<IGpioControllerStatics,IGpioControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGpioControllerStatics?> =
        arrayOfNulls<IGpioControllerStatics_Impl>(size) as Array<IGpioControllerStatics?>
  }
}
