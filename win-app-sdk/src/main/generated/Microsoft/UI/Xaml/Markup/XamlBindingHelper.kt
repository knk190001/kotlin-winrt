package Microsoft.UI.Xaml.Markup

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.DependencyProperty
import Microsoft.UI.Xaml.UIElement
import Windows.Foundation.DateTime
import Windows.Foundation.Point
import Windows.Foundation.Rect
import Windows.Foundation.Size
import Windows.Foundation.TimeSpan
import Windows.Foundation.Uri
import Windows.UI.Xaml.Interop.TypeName
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Byte
import kotlin.Char
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(XamlBindingHelper.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Markup.XamlBindingHelper;{607a9bf2-5a6d-5c89-a756-bb44f24f28f8})")
@WinRTByReference(brClass = XamlBindingHelper.ByReference::class)
public class XamlBindingHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXamlBindingHelper.WithDefault, IWinRTObject {
  private val __2089837514_Interface: IXamlBindingHelper.WithDefault by lazy {
    as_2089837514()
  }


  public override val __2089837514_Ptr: JNAPointer? by lazy {
    __2089837514_Interface.__2089837514_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2089837514_Interface)

  private fun as_2089837514(): IXamlBindingHelper.WithDefault {
    if(pointer == NULL) {
      return(IXamlBindingHelper.ABI.makeIXamlBindingHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlBindingHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlBindingHelper.ABI.makeIXamlBindingHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XamlBindingHelper> {
    public override fun getValue() = XamlBindingHelper(pointer.getPointer(0))

    public fun setValue(value: XamlBindingHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XamlBindingHelper, MemoryAddress> {
    public val IXamlBindingHelperStatics_Instance: IXamlBindingHelperStatics by lazy {
      createIXamlBindingHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIXamlBindingHelperStatics(): IXamlBindingHelperStatics {
      val refiid = Guid.REFIID(IXamlBindingHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Markup.XamlBindingHelper".toHandle(),refiid,interfacePtr)
      val result = IXamlBindingHelperStatics.ABI.makeIXamlBindingHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): XamlBindingHelper {
      val address = segment.toRawLongValue()
      return XamlBindingHelper(Pointer(address))
    }

    public override fun toNative(obj: XamlBindingHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DataTemplateComponentProperty() =
        ABI.IXamlBindingHelperStatics_Instance.get_DataTemplateComponentProperty()

    public fun GetDataTemplateComponent(element: DependencyObject) =
        ABI.IXamlBindingHelperStatics_Instance.GetDataTemplateComponent(element)

    public fun SetDataTemplateComponent(element: DependencyObject, value: IDataTemplateComponent) =
        ABI.IXamlBindingHelperStatics_Instance.SetDataTemplateComponent(element, value)

    public fun SuspendRendering(target: UIElement) =
        ABI.IXamlBindingHelperStatics_Instance.SuspendRendering(target)

    public fun ResumeRendering(target: UIElement) =
        ABI.IXamlBindingHelperStatics_Instance.ResumeRendering(target)

    public fun ConvertValue(type: TypeName, value: IUnknown) =
        ABI.IXamlBindingHelperStatics_Instance.ConvertValue(type, value)

    public fun SetPropertyFromString(
      dependencyObject: IUnknown,
      propertyToSet: DependencyProperty,
      value: String
    ) = ABI.IXamlBindingHelperStatics_Instance.SetPropertyFromString(dependencyObject,
        propertyToSet, value)

    public fun SetPropertyFromBoolean(
      dependencyObject: IUnknown,
      propertyToSet: DependencyProperty,
      value: Boolean
    ) = ABI.IXamlBindingHelperStatics_Instance.SetPropertyFromBoolean(dependencyObject,
        propertyToSet, value)

    public fun SetPropertyFromChar16(
      dependencyObject: IUnknown,
      propertyToSet: DependencyProperty,
      value: Char
    ) = ABI.IXamlBindingHelperStatics_Instance.SetPropertyFromChar16(dependencyObject,
        propertyToSet, value)

    public fun SetPropertyFromDateTime(
      dependencyObject: IUnknown,
      propertyToSet: DependencyProperty,
      value: DateTime
    ) = ABI.IXamlBindingHelperStatics_Instance.SetPropertyFromDateTime(dependencyObject,
        propertyToSet, value)

    public fun SetPropertyFromDouble(
      dependencyObject: IUnknown,
      propertyToSet: DependencyProperty,
      value: Double
    ) = ABI.IXamlBindingHelperStatics_Instance.SetPropertyFromDouble(dependencyObject,
        propertyToSet, value)

    public fun SetPropertyFromInt32(
      dependencyObject: IUnknown,
      propertyToSet: DependencyProperty,
      value: Int
    ) = ABI.IXamlBindingHelperStatics_Instance.SetPropertyFromInt32(dependencyObject, propertyToSet,
        value)

    public fun SetPropertyFromUInt32(
      dependencyObject: IUnknown,
      propertyToSet: DependencyProperty,
      value: WinDef.UINT
    ) = ABI.IXamlBindingHelperStatics_Instance.SetPropertyFromUInt32(dependencyObject,
        propertyToSet, value)

    public fun SetPropertyFromInt64(
      dependencyObject: IUnknown,
      propertyToSet: DependencyProperty,
      value: Long
    ) = ABI.IXamlBindingHelperStatics_Instance.SetPropertyFromInt64(dependencyObject, propertyToSet,
        value)

    public fun SetPropertyFromUInt64(
      dependencyObject: IUnknown,
      propertyToSet: DependencyProperty,
      value: WinDef.ULONG
    ) = ABI.IXamlBindingHelperStatics_Instance.SetPropertyFromUInt64(dependencyObject,
        propertyToSet, value)

    public fun SetPropertyFromSingle(
      dependencyObject: IUnknown,
      propertyToSet: DependencyProperty,
      value: Float
    ) = ABI.IXamlBindingHelperStatics_Instance.SetPropertyFromSingle(dependencyObject,
        propertyToSet, value)

    public fun SetPropertyFromPoint(
      dependencyObject: IUnknown,
      propertyToSet: DependencyProperty,
      value: Point
    ) = ABI.IXamlBindingHelperStatics_Instance.SetPropertyFromPoint(dependencyObject, propertyToSet,
        value)

    public fun SetPropertyFromRect(
      dependencyObject: IUnknown,
      propertyToSet: DependencyProperty,
      value: Rect
    ) = ABI.IXamlBindingHelperStatics_Instance.SetPropertyFromRect(dependencyObject, propertyToSet,
        value)

    public fun SetPropertyFromSize(
      dependencyObject: IUnknown,
      propertyToSet: DependencyProperty,
      value: Size
    ) = ABI.IXamlBindingHelperStatics_Instance.SetPropertyFromSize(dependencyObject, propertyToSet,
        value)

    public fun SetPropertyFromTimeSpan(
      dependencyObject: IUnknown,
      propertyToSet: DependencyProperty,
      value: TimeSpan
    ) = ABI.IXamlBindingHelperStatics_Instance.SetPropertyFromTimeSpan(dependencyObject,
        propertyToSet, value)

    public fun SetPropertyFromByte(
      dependencyObject: IUnknown,
      propertyToSet: DependencyProperty,
      value: Byte
    ) = ABI.IXamlBindingHelperStatics_Instance.SetPropertyFromByte(dependencyObject, propertyToSet,
        value)

    public fun SetPropertyFromUri(
      dependencyObject: IUnknown,
      propertyToSet: DependencyProperty,
      value: Uri
    ) = ABI.IXamlBindingHelperStatics_Instance.SetPropertyFromUri(dependencyObject, propertyToSet,
        value)

    public fun SetPropertyFromObject(
      dependencyObject: IUnknown,
      propertyToSet: DependencyProperty,
      value: IUnknown
    ) = ABI.IXamlBindingHelperStatics_Instance.SetPropertyFromObject(dependencyObject,
        propertyToSet, value)
  }
}
