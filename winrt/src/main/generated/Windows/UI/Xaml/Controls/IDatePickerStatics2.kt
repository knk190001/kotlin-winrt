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

@ABIMarker(IDatePickerStatics2.ABI::class)
@Signature("{f1076df6-fba6-4550-8b88-a6420847f60d}")
@Guid("f1076df6fba645508b88a6420847f60d")
@WinRTInterface("f1076df6fba645508b88a6420847f60d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerStatics2.ByReference::class)
public interface IDatePickerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LightDismissOverlayModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerStatics2> {
    public override fun getValue() = ABI.makeIDatePickerStatics2(pointer.getPointer(0))

    public fun setValue(value: IDatePickerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerStatics2 {
    public val __1660729381_Ptr: Pointer?

    public val _1660729381_VtblPtr: Pointer?
      get() = __1660729381_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LightDismissOverlayModeProperty(): DependencyProperty? {
      val fnPtr = _1660729381_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1660729381_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IDatePickerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1660729381_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f1076df6fba645508b88a6420847f60d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerStatics2(ptr: Pointer?): WithDefault = IDatePickerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerStatics2 {
      val address = segment.toRawLongValue()
      return makeIDatePickerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1660729381_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerStatics2): Array<IDatePickerStatics2?> =
        (elements as
        Array<IDatePickerStatics2?>).castToImpl<IDatePickerStatics2,IDatePickerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerStatics2?> =
        arrayOfNulls<IDatePickerStatics2_Impl>(size) as Array<IDatePickerStatics2?>
  }
}
