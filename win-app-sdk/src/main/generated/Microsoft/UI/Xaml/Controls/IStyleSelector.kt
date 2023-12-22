package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.Style
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

@ABIMarker(IStyleSelector.ABI::class)
@Signature("{7f9cf759-785b-5ef9-9ea7-1555673a475a}")
@Guid("7f9cf759785b5ef99ea71555673a475a")
@WinRTInterface("7f9cf759785b5ef99ea71555673a475a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStyleSelector.ByReference::class)
public interface IStyleSelector : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SelectStyle(item: IUnknown?, container: DependencyObject?): Style?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStyleSelector>
      {
    public override fun getValue() = ABI.makeIStyleSelector(pointer.getPointer(0))

    public fun setValue(value: IStyleSelector_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStyleSelector {
    public val __1011106377_Ptr: Pointer?

    public val _1011106377_VtblPtr: Pointer?
      get() = __1011106377_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SelectStyle(item: IUnknown?, container: DependencyObject?): Style? {
      val fnPtr = _1011106377_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__1011106377_Ptr, marshalToNative(item),
          marshalToNative(container), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }
  }

  public class IStyleSelector_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1011106377_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStyleSelector, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f9cf759785b5ef99ea71555673a475a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStyleSelector(ptr: Pointer?): WithDefault = IStyleSelector_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStyleSelector {
      val address = segment.toRawLongValue()
      return makeIStyleSelector(Pointer(address))
    }

    public override fun toNative(obj: IStyleSelector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1011106377_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStyleSelector): Array<IStyleSelector?> = (elements as
        Array<IStyleSelector?>).castToImpl<IStyleSelector,IStyleSelector_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStyleSelector?> =
        arrayOfNulls<IStyleSelector_Impl>(size) as Array<IStyleSelector?>
  }
}
