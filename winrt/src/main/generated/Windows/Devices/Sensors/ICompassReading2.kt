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

@ABIMarker(ICompassReading2.ABI::class)
@Signature("{b13a661e-51bb-4a12-bedd-ad47ff87d2e8}")
@Guid("b13a661e51bb4a12beddad47ff87d2e8")
@WinRTInterface("b13a661e51bb4a12beddad47ff87d2e8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompassReading2.ByReference::class)
public interface ICompassReading2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PerformanceCount(): IReference<TimeSpan?>?

  @InterfaceMethod(1)
  public fun get_Properties(): IMapView<String?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompassReading2> {
    public override fun getValue() = ABI.makeICompassReading2(pointer.getPointer(0))

    public fun setValue(value: ICompassReading2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompassReading2 {
    public val __396135148_Ptr: Pointer?

    public val _396135148_VtblPtr: Pointer?
      get() = __396135148_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PerformanceCount(): IReference<TimeSpan?>? {
      val fnPtr = _396135148_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__396135148_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Properties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _396135148_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__396135148_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class ICompassReading2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __396135148_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompassReading2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b13a661e51bb4a12beddad47ff87d2e8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompassReading2(ptr: Pointer?): WithDefault = ICompassReading2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompassReading2 {
      val address = segment.toRawLongValue()
      return makeICompassReading2(Pointer(address))
    }

    public override fun toNative(obj: ICompassReading2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__396135148_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompassReading2): Array<ICompassReading2?> = (elements as
        Array<ICompassReading2?>).castToImpl<ICompassReading2,ICompassReading2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompassReading2?> =
        arrayOfNulls<ICompassReading2_Impl>(size) as Array<ICompassReading2?>
  }
}
