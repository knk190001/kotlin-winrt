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

@ABIMarker(IBarometerStatics.ABI::class)
@Signature("{286b270a-02e3-4f86-84fc-fdd892b5940f}")
@Guid("286b270a02e34f8684fcfdd892b5940f")
@WinRTInterface("286b270a02e34f8684fcfdd892b5940f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarometerStatics.ByReference::class)
public interface IBarometerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): Barometer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarometerStatics> {
    public override fun getValue() = ABI.makeIBarometerStatics(pointer.getPointer(0))

    public fun setValue(value: IBarometerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarometerStatics {
    public val __891049636_Ptr: Pointer?

    public val _891049636_VtblPtr: Pointer?
      get() = __891049636_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): Barometer? {
      val fnPtr = _891049636_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Barometer>()
      val hr = fn.invokeHR(arrayOf(__891049636_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Barometer>(result.getValue())
      return resultValue
    }
  }

  public class IBarometerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __891049636_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarometerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("286b270a02e34f8684fcfdd892b5940f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarometerStatics(ptr: Pointer?): WithDefault = IBarometerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarometerStatics {
      val address = segment.toRawLongValue()
      return makeIBarometerStatics(Pointer(address))
    }

    public override fun toNative(obj: IBarometerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__891049636_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarometerStatics): Array<IBarometerStatics?> = (elements
        as Array<IBarometerStatics?>).castToImpl<IBarometerStatics,IBarometerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarometerStatics?> =
        arrayOfNulls<IBarometerStatics_Impl>(size) as Array<IBarometerStatics?>
  }
}
