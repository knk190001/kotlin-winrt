package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IObservableVector
import Windows.UI.Xaml.DataTemplate
import Windows.UI.Xaml.Media.Animation.TransitionCollection
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IItemsControl.ABI::class)
@Signature("{f4a91dd8-d979-4381-8652-bda0342a765e}")
@Guid("f4a91dd8d97943818652bda0342a765e")
@WinRTInterface("f4a91dd8d97943818652bda0342a765e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsControl.ByReference::class)
public interface IItemsControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemsSource(): IUnknown?

  @InterfaceMethod(1)
  public fun put_ItemsSource(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_Items(): ItemCollection?

  @InterfaceMethod(3)
  public fun get_ItemTemplate(): DataTemplate?

  @InterfaceMethod(4)
  public fun put_ItemTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(5)
  public fun get_ItemTemplateSelector(): DataTemplateSelector?

  @InterfaceMethod(6)
  public fun put_ItemTemplateSelector(value: DataTemplateSelector?): Unit

  @InterfaceMethod(7)
  public fun get_ItemsPanel(): ItemsPanelTemplate?

  @InterfaceMethod(8)
  public fun put_ItemsPanel(value: ItemsPanelTemplate?): Unit

  @InterfaceMethod(9)
  public fun get_DisplayMemberPath(): String?

  @InterfaceMethod(10)
  public fun put_DisplayMemberPath(value: String?): Unit

  @InterfaceMethod(11)
  public fun get_ItemContainerStyle(): Style?

  @InterfaceMethod(12)
  public fun put_ItemContainerStyle(value: Style?): Unit

  @InterfaceMethod(13)
  public fun get_ItemContainerStyleSelector(): StyleSelector?

  @InterfaceMethod(14)
  public fun put_ItemContainerStyleSelector(value: StyleSelector?): Unit

  @InterfaceMethod(15)
  public fun get_ItemContainerGenerator(): ItemContainerGenerator?

  @InterfaceMethod(16)
  public fun get_ItemContainerTransitions(): TransitionCollection?

  @InterfaceMethod(17)
  public fun put_ItemContainerTransitions(value: TransitionCollection?): Unit

  @InterfaceMethod(18)
  public fun get_GroupStyle(): IObservableVector<GroupStyle?>?

  @InterfaceMethod(19)
  public fun get_GroupStyleSelector(): GroupStyleSelector?

  @InterfaceMethod(20)
  public fun put_GroupStyleSelector(value: GroupStyleSelector?): Unit

  @InterfaceMethod(21)
  public fun get_IsGrouping(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IItemsControl>
      {
    public override fun getValue() = ABI.makeIItemsControl(pointer.getPointer(0))

    public fun setValue(value: IItemsControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsControl {
    public val __1193611367_Ptr: Pointer?

    public val _1193611367_VtblPtr: Pointer?
      get() = __1193611367_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemsSource(): IUnknown? {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ItemsSource(value: IUnknown?): Unit {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Items(): ItemCollection? {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemCollection>()
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ItemTemplate(): DataTemplate? {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ItemTemplate(value: DataTemplate?): Unit {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_ItemTemplateSelector(): DataTemplateSelector? {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplateSelector>()
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplateSelector>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_ItemTemplateSelector(value: DataTemplateSelector?): Unit {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_ItemsPanel(): ItemsPanelTemplate? {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemsPanelTemplate>()
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemsPanelTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_ItemsPanel(value: ItemsPanelTemplate?): Unit {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_DisplayMemberPath(): String? {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_DisplayMemberPath(value: String?): Unit {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_ItemContainerStyle(): Style? {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_ItemContainerStyle(value: Style?): Unit {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_ItemContainerStyleSelector(): StyleSelector? {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StyleSelector>()
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StyleSelector>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_ItemContainerStyleSelector(value: StyleSelector?): Unit {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_ItemContainerGenerator(): ItemContainerGenerator? {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemContainerGenerator>()
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemContainerGenerator>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_ItemContainerTransitions(): TransitionCollection? {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_ItemContainerTransitions(value: TransitionCollection?): Unit {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_GroupStyle(): IObservableVector<GroupStyle?>? {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IObservableVector<GroupStyle?>>()
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IObservableVector<GroupStyle?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_GroupStyleSelector(): GroupStyleSelector? {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GroupStyleSelector>()
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GroupStyleSelector>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_GroupStyleSelector(value: GroupStyleSelector?): Unit {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_IsGrouping(): Boolean {
      val fnPtr = _1193611367_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1193611367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IItemsControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1193611367_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f4a91dd8d97943818652bda0342a765e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsControl(ptr: Pointer?): WithDefault = IItemsControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsControl {
      val address = segment.toRawLongValue()
      return makeIItemsControl(Pointer(address))
    }

    public override fun toNative(obj: IItemsControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1193611367_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsControl): Array<IItemsControl?> = (elements as
        Array<IItemsControl?>).castToImpl<IItemsControl,IItemsControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsControl?> =
        arrayOfNulls<IItemsControl_Impl>(size) as Array<IItemsControl?>
  }
}
