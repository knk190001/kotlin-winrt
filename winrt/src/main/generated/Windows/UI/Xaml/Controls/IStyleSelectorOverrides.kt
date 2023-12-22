package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.Style
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStyleSelectorOverrides.ABI::class)
@Signature("{08add66d-0e2e-43a0-aeca-8faa94b9d017}")
@Guid("08add66d0e2e43a0aeca8faa94b9d017")
@WinRTInterface("08add66d0e2e43a0aeca8faa94b9d017")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStyleSelectorOverrides.ByReference::class)
public interface IStyleSelectorOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SelectStyleCore(item: IUnknown?, container: DependencyObject?): Style?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStyleSelectorOverrides> {
    public override fun getValue() = ABI.makeIStyleSelectorOverrides(pointer.getPointer(0))

    public fun setValue(value: IStyleSelectorOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStyleSelectorOverrides {
    public val __2042253709_Ptr: Pointer?

    public val _2042253709_VtblPtr: Pointer?
      get() = __2042253709_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SelectStyleCore(item: IUnknown?, container: DependencyObject?): Style? {
      val fnPtr = _2042253709_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__2042253709_Ptr, marshalToNative(item),
          marshalToNative(container), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }
  }

  public class IStyleSelectorOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2042253709_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStyleSelectorOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08add66d0e2e43a0aeca8faa94b9d017")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStyleSelectorOverrides(ptr: Pointer?): WithDefault =
        IStyleSelectorOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStyleSelectorOverrides {
      val address = segment.toRawLongValue()
      return makeIStyleSelectorOverrides(Pointer(address))
    }

    public override fun toNative(obj: IStyleSelectorOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2042253709_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStyleSelectorOverrides): Array<IStyleSelectorOverrides?>
        = (elements as
        Array<IStyleSelectorOverrides?>).castToImpl<IStyleSelectorOverrides,IStyleSelectorOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStyleSelectorOverrides?> =
        arrayOfNulls<IStyleSelectorOverrides_Impl>(size) as Array<IStyleSelectorOverrides?>
  }
}
