package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DataTemplate
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IItemsControlOverrides.ABI::class)
@Signature("{c79bb41b-a084-4301-a496-72971f364ed1}")
@Guid("c79bb41ba0844301a49672971f364ed1")
@WinRTInterface("c79bb41ba0844301a49672971f364ed1")
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
    public val __2007304846_Ptr: Pointer?

    public val _2007304846_VtblPtr: Pointer?
      get() = __2007304846_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsItemItsOwnContainerOverride(item: IUnknown?): Boolean {
      val fnPtr = _2007304846_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2007304846_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun GetContainerForItemOverride(): DependencyObject? {
      val fnPtr = _2007304846_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__2007304846_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ClearContainerForItemOverride(element: DependencyObject?, item: IUnknown?):
        Unit {
      val fnPtr = _2007304846_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2007304846_Ptr, marshalToNative(element),
          marshalToNative(item),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun PrepareContainerForItemOverride(element: DependencyObject?,
        item: IUnknown?): Unit {
      val fnPtr = _2007304846_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2007304846_Ptr, marshalToNative(element),
          marshalToNative(item),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun OnItemsChanged(e: IUnknown?): Unit {
      val fnPtr = _2007304846_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2007304846_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun OnItemContainerStyleChanged(oldItemContainerStyle: Style?,
        newItemContainerStyle: Style?): Unit {
      val fnPtr = _2007304846_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2007304846_Ptr, marshalToNative(oldItemContainerStyle),
          marshalToNative(newItemContainerStyle),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun OnItemContainerStyleSelectorChanged(oldItemContainerStyleSelector: StyleSelector?,
        newItemContainerStyleSelector: StyleSelector?): Unit {
      val fnPtr = _2007304846_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2007304846_Ptr, marshalToNative(oldItemContainerStyleSelector),
          marshalToNative(newItemContainerStyleSelector),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun OnItemTemplateChanged(oldItemTemplate: DataTemplate?,
        newItemTemplate: DataTemplate?): Unit {
      val fnPtr = _2007304846_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2007304846_Ptr, marshalToNative(oldItemTemplate),
          marshalToNative(newItemTemplate),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override
        fun OnItemTemplateSelectorChanged(oldItemTemplateSelector: DataTemplateSelector?,
        newItemTemplateSelector: DataTemplateSelector?): Unit {
      val fnPtr = _2007304846_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2007304846_Ptr, marshalToNative(oldItemTemplateSelector),
          marshalToNative(newItemTemplateSelector),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun OnGroupStyleSelectorChanged(oldGroupStyleSelector: GroupStyleSelector?,
        newGroupStyleSelector: GroupStyleSelector?): Unit {
      val fnPtr = _2007304846_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2007304846_Ptr, marshalToNative(oldGroupStyleSelector),
          marshalToNative(newGroupStyleSelector),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IItemsControlOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2007304846_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsControlOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c79bb41ba0844301a49672971f364ed1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsControlOverrides(ptr: Pointer?): WithDefault =
        IItemsControlOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsControlOverrides {
      val address = segment.toRawLongValue()
      return makeIItemsControlOverrides(Pointer(address))
    }

    public override fun toNative(obj: IItemsControlOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2007304846_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsControlOverrides): Array<IItemsControlOverrides?> =
        (elements as
        Array<IItemsControlOverrides?>).castToImpl<IItemsControlOverrides,IItemsControlOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsControlOverrides?> =
        arrayOfNulls<IItemsControlOverrides_Impl>(size) as Array<IItemsControlOverrides?>
  }
}
