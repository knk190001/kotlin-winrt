package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IPopupStatics4.ABI::class)
@Signature("{d1a42c06-8bfa-5164-8554-48bfe6bd4cc6}")
@Guid("d1a42c068bfa5164855448bfe6bd4cc6")
@WinRTInterface("d1a42c068bfa5164855448bfe6bd4cc6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPopupStatics4.ByReference::class)
public interface IPopupStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PlacementTargetProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_DesiredPlacementProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPopupStatics4>
      {
    public override fun getValue() = ABI.makeIPopupStatics4(pointer.getPointer(0))

    public fun setValue(value: IPopupStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPopupStatics4 {
    public val __1440539521_Ptr: Pointer?

    public val _1440539521_VtblPtr: Pointer?
      get() = __1440539521_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlacementTargetProperty(): DependencyProperty? {
      val fnPtr = _1440539521_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1440539521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DesiredPlacementProperty(): DependencyProperty? {
      val fnPtr = _1440539521_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1440539521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPopupStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1440539521_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPopupStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d1a42c068bfa5164855448bfe6bd4cc6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPopupStatics4(ptr: Pointer?): WithDefault = IPopupStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPopupStatics4 {
      val address = segment.toRawLongValue()
      return makeIPopupStatics4(Pointer(address))
    }

    public override fun toNative(obj: IPopupStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1440539521_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPopupStatics4): Array<IPopupStatics4?> = (elements as
        Array<IPopupStatics4?>).castToImpl<IPopupStatics4,IPopupStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPopupStatics4?> =
        arrayOfNulls<IPopupStatics4_Impl>(size) as Array<IPopupStatics4?>
  }
}
