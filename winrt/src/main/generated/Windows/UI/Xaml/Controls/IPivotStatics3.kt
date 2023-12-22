package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IPivotStatics3.ABI::class)
@Signature("{78b6274e-6616-4600-a039-922a5d09330b}")
@Guid("78b6274e66164600a039922a5d09330b")
@WinRTInterface("78b6274e66164600a039922a5d09330b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivotStatics3.ByReference::class)
public interface IPivotStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HeaderFocusVisualPlacementProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsHeaderItemsCarouselEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPivotStatics3>
      {
    public override fun getValue() = ABI.makeIPivotStatics3(pointer.getPointer(0))

    public fun setValue(value: IPivotStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivotStatics3 {
    public val __1675360468_Ptr: Pointer?

    public val _1675360468_VtblPtr: Pointer?
      get() = __1675360468_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HeaderFocusVisualPlacementProperty(): DependencyProperty? {
      val fnPtr = _1675360468_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1675360468_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsHeaderItemsCarouselEnabledProperty(): DependencyProperty? {
      val fnPtr = _1675360468_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1675360468_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPivotStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1675360468_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivotStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("78b6274e66164600a039922a5d09330b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivotStatics3(ptr: Pointer?): WithDefault = IPivotStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivotStatics3 {
      val address = segment.toRawLongValue()
      return makeIPivotStatics3(Pointer(address))
    }

    public override fun toNative(obj: IPivotStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1675360468_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivotStatics3): Array<IPivotStatics3?> = (elements as
        Array<IPivotStatics3?>).castToImpl<IPivotStatics3,IPivotStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivotStatics3?> =
        arrayOfNulls<IPivotStatics3_Impl>(size) as Array<IPivotStatics3?>
  }
}
