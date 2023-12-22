package Windows.Devices.PointOfService

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILineDisplayStatisticsCategorySelector.ABI::class)
@Signature("{b521c46b-9274-4d24-94f3-b6017b832444}")
@Guid("b521c46b92744d2494f3b6017b832444")
@WinRTInterface("b521c46b92744d2494f3b6017b832444")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineDisplayStatisticsCategorySelector.ByReference::class)
public interface ILineDisplayStatisticsCategorySelector : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllStatistics(): String?

  @InterfaceMethod(1)
  public fun get_UnifiedPosStatistics(): String?

  @InterfaceMethod(2)
  public fun get_ManufacturerStatistics(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILineDisplayStatisticsCategorySelector> {
    public override fun getValue() =
        ABI.makeILineDisplayStatisticsCategorySelector(pointer.getPointer(0))

    public fun setValue(value: ILineDisplayStatisticsCategorySelector_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineDisplayStatisticsCategorySelector {
    public val __1796589745_Ptr: Pointer?

    public val _1796589745_VtblPtr: Pointer?
      get() = __1796589745_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllStatistics(): String? {
      val fnPtr = _1796589745_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1796589745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UnifiedPosStatistics(): String? {
      val fnPtr = _1796589745_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1796589745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ManufacturerStatistics(): String? {
      val fnPtr = _1796589745_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1796589745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ILineDisplayStatisticsCategorySelector_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1796589745_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineDisplayStatisticsCategorySelector, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b521c46b92744d2494f3b6017b832444")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineDisplayStatisticsCategorySelector(ptr: Pointer?): WithDefault =
        ILineDisplayStatisticsCategorySelector_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineDisplayStatisticsCategorySelector {
      val address = segment.toRawLongValue()
      return makeILineDisplayStatisticsCategorySelector(Pointer(address))
    }

    public override fun toNative(obj: ILineDisplayStatisticsCategorySelector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1796589745_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineDisplayStatisticsCategorySelector):
        Array<ILineDisplayStatisticsCategorySelector?> = (elements as
        Array<ILineDisplayStatisticsCategorySelector?>).castToImpl<ILineDisplayStatisticsCategorySelector,ILineDisplayStatisticsCategorySelector_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineDisplayStatisticsCategorySelector?> =
        arrayOfNulls<ILineDisplayStatisticsCategorySelector_Impl>(size) as
        Array<ILineDisplayStatisticsCategorySelector?>
  }
}
