package Windows.Devices.Sensors

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInclinometerReading2.ABI::class)
@Signature("{4f164781-e90b-4658-8915-0103e08a805a}")
@Guid("4f164781e90b465889150103e08a805a")
@WinRTInterface("4f164781e90b465889150103e08a805a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInclinometerReading2.ByReference::class)
public interface IInclinometerReading2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PerformanceCount(): IReference<TimeSpan?>?

  @InterfaceMethod(1)
  public fun get_Properties(): IMapView<String?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInclinometerReading2> {
    public override fun getValue() = ABI.makeIInclinometerReading2(pointer.getPointer(0))

    public fun setValue(value: IInclinometerReading2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInclinometerReading2 {
    public val __1142179233_Ptr: Pointer?

    public val _1142179233_VtblPtr: Pointer?
      get() = __1142179233_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PerformanceCount(): IReference<TimeSpan?>? {
      val fnPtr = _1142179233_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1142179233_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Properties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _1142179233_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1142179233_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IInclinometerReading2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1142179233_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInclinometerReading2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f164781e90b465889150103e08a805a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInclinometerReading2(ptr: Pointer?): WithDefault =
        IInclinometerReading2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInclinometerReading2 {
      val address = segment.toRawLongValue()
      return makeIInclinometerReading2(Pointer(address))
    }

    public override fun toNative(obj: IInclinometerReading2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1142179233_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInclinometerReading2): Array<IInclinometerReading2?> =
        (elements as
        Array<IInclinometerReading2?>).castToImpl<IInclinometerReading2,IInclinometerReading2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInclinometerReading2?> =
        arrayOfNulls<IInclinometerReading2_Impl>(size) as Array<IInclinometerReading2?>
  }
}
