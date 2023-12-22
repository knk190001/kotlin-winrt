package Windows.Devices.Sensors

import Windows.Foundation.Collections.IMapView
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

@ABIMarker(IPedometer2.ABI::class)
@Signature("{e5a406df-2b81-4add-b2ff-77ab6c98ba19}")
@Guid("e5a406df2b814addb2ff77ab6c98ba19")
@WinRTInterface("e5a406df2b814addb2ff77ab6c98ba19")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPedometer2.ByReference::class)
public interface IPedometer2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentReadings(): IMapView<PedometerStepKind?, PedometerReading?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPedometer2> {
    public override fun getValue() = ABI.makeIPedometer2(pointer.getPointer(0))

    public fun setValue(value: IPedometer2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPedometer2 {
    public val __1245454837_Ptr: Pointer?

    public val _1245454837_VtblPtr: Pointer?
      get() = __1245454837_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentReadings(): IMapView<PedometerStepKind?, PedometerReading?>? {
      val fnPtr = _1245454837_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<PedometerStepKind?, PedometerReading?>>()
      val hr = fn.invokeHR(arrayOf(__1245454837_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<PedometerStepKind?,
          PedometerReading?>>(result.getValue())
      return resultValue
    }
  }

  public class IPedometer2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1245454837_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPedometer2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5a406df2b814addb2ff77ab6c98ba19")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPedometer2(ptr: Pointer?): WithDefault = IPedometer2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPedometer2 {
      val address = segment.toRawLongValue()
      return makeIPedometer2(Pointer(address))
    }

    public override fun toNative(obj: IPedometer2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1245454837_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPedometer2): Array<IPedometer2?> = (elements as
        Array<IPedometer2?>).castToImpl<IPedometer2,IPedometer2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPedometer2?> =
        arrayOfNulls<IPedometer2_Impl>(size) as Array<IPedometer2?>
  }
}
