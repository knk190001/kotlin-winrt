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

@ABIMarker(IInclinometerReadingYawAccuracy.ABI::class)
@Signature("{b453e880-1fe3-4986-a257-e6ece2723949}")
@Guid("b453e8801fe34986a257e6ece2723949")
@WinRTInterface("b453e8801fe34986a257e6ece2723949")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInclinometerReadingYawAccuracy.ByReference::class)
public interface IInclinometerReadingYawAccuracy : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_YawAccuracy(): MagnetometerAccuracy?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInclinometerReadingYawAccuracy> {
    public override fun getValue() = ABI.makeIInclinometerReadingYawAccuracy(pointer.getPointer(0))

    public fun setValue(value: IInclinometerReadingYawAccuracy_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInclinometerReadingYawAccuracy {
    public val __741301845_Ptr: Pointer?

    public val _741301845_VtblPtr: Pointer?
      get() = __741301845_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_YawAccuracy(): MagnetometerAccuracy? {
      val fnPtr = _741301845_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagnetometerAccuracy>()
      val hr = fn.invokeHR(arrayOf(__741301845_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagnetometerAccuracy>(result.getValue())
      return resultValue
    }
  }

  public class IInclinometerReadingYawAccuracy_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __741301845_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInclinometerReadingYawAccuracy, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b453e8801fe34986a257e6ece2723949")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInclinometerReadingYawAccuracy(ptr: Pointer?): WithDefault =
        IInclinometerReadingYawAccuracy_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInclinometerReadingYawAccuracy {
      val address = segment.toRawLongValue()
      return makeIInclinometerReadingYawAccuracy(Pointer(address))
    }

    public override fun toNative(obj: IInclinometerReadingYawAccuracy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__741301845_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInclinometerReadingYawAccuracy):
        Array<IInclinometerReadingYawAccuracy?> = (elements as
        Array<IInclinometerReadingYawAccuracy?>).castToImpl<IInclinometerReadingYawAccuracy,IInclinometerReadingYawAccuracy_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInclinometerReadingYawAccuracy?> =
        arrayOfNulls<IInclinometerReadingYawAccuracy_Impl>(size) as
        Array<IInclinometerReadingYawAccuracy?>
  }
}
