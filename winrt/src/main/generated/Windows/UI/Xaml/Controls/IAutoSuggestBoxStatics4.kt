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

@ABIMarker(IAutoSuggestBoxStatics4.ABI::class)
@Signature("{d63efaae-b9df-58d8-a00a-dbfe9ffdedd0}")
@Guid("d63efaaeb9df58d8a00adbfe9ffdedd0")
@WinRTInterface("d63efaaeb9df58d8a00adbfe9ffdedd0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutoSuggestBoxStatics4.ByReference::class)
public interface IAutoSuggestBoxStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DescriptionProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutoSuggestBoxStatics4> {
    public override fun getValue() = ABI.makeIAutoSuggestBoxStatics4(pointer.getPointer(0))

    public fun setValue(value: IAutoSuggestBoxStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutoSuggestBoxStatics4 {
    public val __1297762561_Ptr: Pointer?

    public val _1297762561_VtblPtr: Pointer?
      get() = __1297762561_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DescriptionProperty(): DependencyProperty? {
      val fnPtr = _1297762561_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1297762561_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAutoSuggestBoxStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1297762561_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutoSuggestBoxStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d63efaaeb9df58d8a00adbfe9ffdedd0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutoSuggestBoxStatics4(ptr: Pointer?): WithDefault =
        IAutoSuggestBoxStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutoSuggestBoxStatics4 {
      val address = segment.toRawLongValue()
      return makeIAutoSuggestBoxStatics4(Pointer(address))
    }

    public override fun toNative(obj: IAutoSuggestBoxStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1297762561_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutoSuggestBoxStatics4): Array<IAutoSuggestBoxStatics4?>
        = (elements as
        Array<IAutoSuggestBoxStatics4?>).castToImpl<IAutoSuggestBoxStatics4,IAutoSuggestBoxStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutoSuggestBoxStatics4?> =
        arrayOfNulls<IAutoSuggestBoxStatics4_Impl>(size) as Array<IAutoSuggestBoxStatics4?>
  }
}
