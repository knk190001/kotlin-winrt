package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DataTemplate
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IItemsControlOverrides.ABI::class)
@Signature("{285c215f-64b2-5f7d-88d2-56c6658f73ee}")
@Guid("285c215f64b25f7d88d256c6658f73ee")
@WinRTInterface("285c215f64b25f7d88d256c6658f73ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsControlOverrides.ByReference::class)
public interface IItemsControlOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsItemItsOwnContainerOverride(item: IUnknown?): Boolean

  @InterfaceMethod(1)
  public fun GetContainerForItemOverride(): DependencyObject?

  @InterfaceMethod(2)
  public fun ClearContainerForItemOverride(element: DependencyObject?, item: IUnknown?): Unit

  @InterfaceMethod(3)
  public fun PrepareContainerForItemOverride(element: DependencyObject?, item: IUnknown?): Unit

  @InterfaceMethod(4)
  public fun OnItemsChanged(e: IUnknown?): Unit

  @InterfaceMethod(5)
  public fun OnItemContainerStyleChanged(oldItemContainerStyle: Style?,
      newItemContainerStyle: Style?): Unit

  @InterfaceMethod(6)
  public fun OnItemContainerStyleSelectorChanged(oldItemContainerStyleSelector: StyleSelector?,
      newItemContainerStyleSelector: StyleSelector?): Unit

  @InterfaceMethod(7)
  public fun OnItemTemplateChanged(oldItemTemplate: DataTemplate?, newItemTemplate: DataTemplate?):
      Unit

  @InterfaceMethod(8)
  public fun OnItemTemplateSelectorChanged(oldItemTemplateSelector: DataTemplateSelector?,
      newItemTemplateSelector: DataTemplateSelector?): Unit

  @InterfaceMethod(9)
  public fun OnGroupStyleSelectorChanged(oldGroupStyleSelector: GroupStyleSelector?,
      newGroupStyleSelector: GroupStyleSelector?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsControlOverrides> {
    public override fun getValue() = ABI.makeIItemsControlOverrides(pointer.getPointer(0))

    public fun setValue(value: IItemsControlOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsControlOverrides {
    public val __1546641859_Ptr: Pointer?

    public val _1546641859_VtblPtr: Pointer?
      get() = __1546641859_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsItemItsOwnContainerOverride(item: IUnknown?): Boolean {
      val fnPtr = _1546641859_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1546641859_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun GetContainerForItemOverride(): DependencyObject? {
      val fnPtr = _1546641859_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1546641859_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ClearContainerForItemOverride(element: DependencyObject?, item: IUnknown?):
        Unit {
      val fnPtr = _1546641859_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546641859_Ptr, marshalToNative(element),
          marshalToNative(item),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun PrepareContainerForItemOverride(element: DependencyObject?,
        item: IUnknown?): Unit {
      val fnPtr = _1546641859_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546641859_Ptr, marshalToNative(element),
          marshalToNative(item),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun OnItemsChanged(e: IUnknown?): Unit {
      val fnPtr = _1546641859_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546641859_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun OnItemContainerStyleChanged(oldItemContainerStyle: Style?,
        newItemContainerStyle: Style?): Unit {
      val fnPtr = _1546641859_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546641859_Ptr, marshalToNative(oldItemContainerStyle),
          marshalToNative(newItemContainerStyle),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun OnItemContainerStyleSelectorChanged(oldItemContainerStyleSelector: StyleSelector?,
        newItemContainerStyleSelector: StyleSelector?): Unit {
      val fnPtr = _1546641859_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546641859_Ptr, marshalToNative(oldItemContainerStyleSelector),
          marshalToNative(newItemContainerStyleSelector),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun OnItemTemplateChanged(oldItemTemplate: DataTemplate?,
        newItemTemplate: DataTemplate?): Unit {
      val fnPtr = _1546641859_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546641859_Ptr, marshalToNative(oldItemTemplate),
          marshalToNative(newItemTemplate),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override
        fun OnItemTemplateSelectorChanged(oldItemTemplateSelector: DataTemplateSelector?,
        newItemTemplateSelector: DataTemplateSelector?): Unit {
      val fnPtr = _1546641859_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546641859_Ptr, marshalToNative(oldItemTemplateSelector),
          marshalToNative(newItemTemplateSelector),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun OnGroupStyleSelectorChanged(oldGroupStyleSelector: GroupStyleSelector?,
        newGroupStyleSelector: GroupStyleSelector?): Unit {
      val fnPtr = _1546641859_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1546641859_Ptr, marshalToNative(oldGroupStyleSelector),
          marshalToNative(newGroupStyleSelector),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IItemsControlOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1546641859_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsControlOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("285c215f64b25f7d88d256c6658f73ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsControlOverrides(ptr: Pointer?): WithDefault =
        IItemsControlOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsControlOverrides {
      val address = segment.toRawLongValue()
      return makeIItemsControlOverrides(Pointer(address))
    }

    public override fun toNative(obj: IItemsControlOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1546641859_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsControlOverrides): Array<IItemsControlOverrides?> =
        (elements as
        Array<IItemsControlOverrides?>).castToImpl<IItemsControlOverrides,IItemsControlOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsControlOverrides?> =
        arrayOfNulls<IItemsControlOverrides_Impl>(size) as Array<IItemsControlOverrides?>
  }
}
