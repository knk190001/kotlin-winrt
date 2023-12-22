package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.DependencyObject
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

@ABIMarker(IDataTemplateSelector.ABI::class)
@Signature("{86ca4fa4-7de0-5049-82f5-39ec78569028}")
@Guid("86ca4fa47de0504982f539ec78569028")
@WinRTInterface("86ca4fa47de0504982f539ec78569028")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataTemplateSelector.ByReference::class)
public interface IDataTemplateSelector : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SelectTemplate(item: IUnknown?, container: DependencyObject?): DataTemplate?

  @InterfaceMethod(1)
  public fun SelectTemplate(item: IUnknown?): DataTemplate?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataTemplateSelector> {
    public override fun getValue() = ABI.makeIDataTemplateSelector(pointer.getPointer(0))

    public fun setValue(value: IDataTemplateSelector_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataTemplateSelector {
    public val __561303178_Ptr: Pointer?

    public val _561303178_VtblPtr: Pointer?
      get() = __561303178_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SelectTemplate(item: IUnknown?, container: DependencyObject?):
        DataTemplate? {
      val fnPtr = _561303178_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__561303178_Ptr, marshalToNative(item),
          marshalToNative(container), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SelectTemplate(item: IUnknown?): DataTemplate? {
      val fnPtr = _561303178_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__561303178_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }
  }

  public class IDataTemplateSelector_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __561303178_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataTemplateSelector, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("86ca4fa47de0504982f539ec78569028")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataTemplateSelector(ptr: Pointer?): WithDefault =
        IDataTemplateSelector_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataTemplateSelector {
      val address = segment.toRawLongValue()
      return makeIDataTemplateSelector(Pointer(address))
    }

    public override fun toNative(obj: IDataTemplateSelector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__561303178_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataTemplateSelector): Array<IDataTemplateSelector?> =
        (elements as
        Array<IDataTemplateSelector?>).castToImpl<IDataTemplateSelector,IDataTemplateSelector_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataTemplateSelector?> =
        arrayOfNulls<IDataTemplateSelector_Impl>(size) as Array<IDataTemplateSelector?>
  }
}
