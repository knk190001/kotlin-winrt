package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DataTemplate
import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(IDataTemplateSelectorOverrides.ABI::class)
@Signature("{2d162925-5966-4bfa-8638-4d345689f6cf}")
@Guid("2d16292559664bfa86384d345689f6cf")
@WinRTInterface("2d16292559664bfa86384d345689f6cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataTemplateSelectorOverrides.ByReference::class)
public interface IDataTemplateSelectorOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SelectTemplateCore(item: IUnknown?, container: DependencyObject?): DataTemplate?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataTemplateSelectorOverrides> {
    public override fun getValue() = ABI.makeIDataTemplateSelectorOverrides(pointer.getPointer(0))

    public fun setValue(value: IDataTemplateSelectorOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataTemplateSelectorOverrides {
    public val __1853462664_Ptr: Pointer?

    public val _1853462664_VtblPtr: Pointer?
      get() = __1853462664_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SelectTemplateCore(item: IUnknown?, container: DependencyObject?):
        DataTemplate? {
      val fnPtr = _1853462664_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__1853462664_Ptr, marshalToNative(item),
          marshalToNative(container), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }
  }

  public class IDataTemplateSelectorOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1853462664_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataTemplateSelectorOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d16292559664bfa86384d345689f6cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataTemplateSelectorOverrides(ptr: Pointer?): WithDefault =
        IDataTemplateSelectorOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataTemplateSelectorOverrides {
      val address = segment.toRawLongValue()
      return makeIDataTemplateSelectorOverrides(Pointer(address))
    }

    public override fun toNative(obj: IDataTemplateSelectorOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1853462664_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataTemplateSelectorOverrides):
        Array<IDataTemplateSelectorOverrides?> = (elements as
        Array<IDataTemplateSelectorOverrides?>).castToImpl<IDataTemplateSelectorOverrides,IDataTemplateSelectorOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataTemplateSelectorOverrides?> =
        arrayOfNulls<IDataTemplateSelectorOverrides_Impl>(size) as
        Array<IDataTemplateSelectorOverrides?>
  }
}
