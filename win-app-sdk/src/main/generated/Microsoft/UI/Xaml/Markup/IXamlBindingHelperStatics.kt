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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
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
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXamlBindingHelperStatics.ABI::class)
@Signature("{93c7dad3-f9c2-5372-84dc-9e9c4661d083}")
@Guid("93c7dad3f9c2537284dc9e9c4661d083")
@WinRTInterface("93c7dad3f9c2537284dc9e9c4661d083")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlBindingHelperStatics.ByReference::class)
public interface IXamlBindingHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DataTemplateComponentProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetDataTemplateComponent(element: DependencyObject?): IDataTemplateComponent?

  @InterfaceMethod(2)
  public fun SetDataTemplateComponent(element: DependencyObject?, value: IDataTemplateComponent?):
      Unit

  @InterfaceMethod(3)
  public fun SuspendRendering(target: UIElement?): Unit

  @InterfaceMethod(4)
  public fun ResumeRendering(target: UIElement?): Unit

  @InterfaceMethod(5)
  public fun ConvertValue(type: TypeName?, value: IUnknown?): IUnknown?

  @InterfaceMethod(6)
  public fun SetPropertyFromString(
    dependencyObject: IUnknown?,
    propertyToSet: DependencyProperty?,
    value: String?
  ): Unit

  @InterfaceMethod(7)
  public fun SetPropertyFromBoolean(
    dependencyObject: IUnknown?,
    propertyToSet: DependencyProperty?,
    value: Boolean
  ): Unit

  @InterfaceMethod(8)
  public fun SetPropertyFromChar16(
    dependencyObject: IUnknown?,
    propertyToSet: DependencyProperty?,
    value: Char
  ): Unit

  @InterfaceMethod(9)
  public fun SetPropertyFromDateTime(
    dependencyObject: IUnknown?,
    propertyToSet: DependencyProperty?,
    value: DateTime?
  ): Unit

  @InterfaceMethod(10)
  public fun SetPropertyFromDouble(
    dependencyObject: IUnknown?,
    propertyToSet: DependencyProperty?,
    value: Double
  ): Unit

  @InterfaceMethod(11)
  public fun SetPropertyFromInt32(
    dependencyObject: IUnknown?,
    propertyToSet: DependencyProperty?,
    value: Int
  ): Unit

  @InterfaceMethod(12)
  public fun SetPropertyFromUInt32(
    dependencyObject: IUnknown?,
    propertyToSet: DependencyProperty?,
    value: WinDef.UINT
  ): Unit

  @InterfaceMethod(13)
  public fun SetPropertyFromInt64(
    dependencyObject: IUnknown?,
    propertyToSet: DependencyProperty?,
    value: Long
  ): Unit

  @InterfaceMethod(14)
  public fun SetPropertyFromUInt64(
    dependencyObject: IUnknown?,
    propertyToSet: DependencyProperty?,
    value: WinDef.ULONG
  ): Unit

  @InterfaceMethod(15)
  public fun SetPropertyFromSingle(
    dependencyObject: IUnknown?,
    propertyToSet: DependencyProperty?,
    value: Float
  ): Unit

  @InterfaceMethod(16)
  public fun SetPropertyFromPoint(
    dependencyObject: IUnknown?,
    propertyToSet: DependencyProperty?,
    value: Point?
  ): Unit

  @InterfaceMethod(17)
  public fun SetPropertyFromRect(
    dependencyObject: IUnknown?,
    propertyToSet: DependencyProperty?,
    value: Rect?
  ): Unit

  @InterfaceMethod(18)
  public fun SetPropertyFromSize(
    dependencyObject: IUnknown?,
    propertyToSet: DependencyProperty?,
    value: Size?
  ): Unit

  @InterfaceMethod(19)
  public fun SetPropertyFromTimeSpan(
    dependencyObject: IUnknown?,
    propertyToSet: DependencyProperty?,
    value: TimeSpan?
  ): Unit

  @InterfaceMethod(20)
  public fun SetPropertyFromByte(
    dependencyObject: IUnknown?,
    propertyToSet: DependencyProperty?,
    value: Byte
  ): Unit

  @InterfaceMethod(21)
  public fun SetPropertyFromUri(
    dependencyObject: IUnknown?,
    propertyToSet: DependencyProperty?,
    value: Uri?
  ): Unit

  @InterfaceMethod(22)
  public fun SetPropertyFromObject(
    dependencyObject: IUnknown?,
    propertyToSet: DependencyProperty?,
    value: IUnknown?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlBindingHelperStatics> {
    public override fun getValue() = ABI.makeIXamlBindingHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IXamlBindingHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlBindingHelperStatics {
    public val __1532169553_Ptr: Pointer?

    public val _1532169553_VtblPtr: Pointer?
      get() = __1532169553_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DataTemplateComponentProperty(): DependencyProperty? {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDataTemplateComponent(element: DependencyObject?):
        IDataTemplateComponent? {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IDataTemplateComponent>()
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IDataTemplateComponent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetDataTemplateComponent(element: DependencyObject?,
        value: IDataTemplateComponent?): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun SuspendRendering(target: UIElement?): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(target),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun ResumeRendering(target: UIElement?): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(target),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun ConvertValue(type: TypeName?, value: IUnknown?): IUnknown? {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(type), marshalToNative(value),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun SetPropertyFromString(
      dependencyObject: IUnknown?,
      propertyToSet: DependencyProperty?,
      value: String?
    ): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(dependencyObject),
          marshalToNative(propertyToSet), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun SetPropertyFromBoolean(
      dependencyObject: IUnknown?,
      propertyToSet: DependencyProperty?,
      value: Boolean
    ): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(dependencyObject),
          marshalToNative(propertyToSet), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun SetPropertyFromChar16(
      dependencyObject: IUnknown?,
      propertyToSet: DependencyProperty?,
      value: Char
    ): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(dependencyObject),
          marshalToNative(propertyToSet), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun SetPropertyFromDateTime(
      dependencyObject: IUnknown?,
      propertyToSet: DependencyProperty?,
      value: DateTime?
    ): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(dependencyObject),
          marshalToNative(propertyToSet), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun SetPropertyFromDouble(
      dependencyObject: IUnknown?,
      propertyToSet: DependencyProperty?,
      value: Double
    ): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(dependencyObject),
          marshalToNative(propertyToSet), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun SetPropertyFromInt32(
      dependencyObject: IUnknown?,
      propertyToSet: DependencyProperty?,
      value: Int
    ): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(dependencyObject),
          marshalToNative(propertyToSet), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun SetPropertyFromUInt32(
      dependencyObject: IUnknown?,
      propertyToSet: DependencyProperty?,
      value: WinDef.UINT
    ): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(dependencyObject),
          marshalToNative(propertyToSet), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun SetPropertyFromInt64(
      dependencyObject: IUnknown?,
      propertyToSet: DependencyProperty?,
      value: Long
    ): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(dependencyObject),
          marshalToNative(propertyToSet), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun SetPropertyFromUInt64(
      dependencyObject: IUnknown?,
      propertyToSet: DependencyProperty?,
      value: WinDef.ULONG
    ): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(dependencyObject),
          marshalToNative(propertyToSet), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun SetPropertyFromSingle(
      dependencyObject: IUnknown?,
      propertyToSet: DependencyProperty?,
      value: Float
    ): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(dependencyObject),
          marshalToNative(propertyToSet), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun SetPropertyFromPoint(
      dependencyObject: IUnknown?,
      propertyToSet: DependencyProperty?,
      value: Point?
    ): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(dependencyObject),
          marshalToNative(propertyToSet), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun SetPropertyFromRect(
      dependencyObject: IUnknown?,
      propertyToSet: DependencyProperty?,
      value: Rect?
    ): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(dependencyObject),
          marshalToNative(propertyToSet), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun SetPropertyFromSize(
      dependencyObject: IUnknown?,
      propertyToSet: DependencyProperty?,
      value: Size?
    ): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(dependencyObject),
          marshalToNative(propertyToSet), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun SetPropertyFromTimeSpan(
      dependencyObject: IUnknown?,
      propertyToSet: DependencyProperty?,
      value: TimeSpan?
    ): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(dependencyObject),
          marshalToNative(propertyToSet), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun SetPropertyFromByte(
      dependencyObject: IUnknown?,
      propertyToSet: DependencyProperty?,
      value: Byte
    ): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(dependencyObject),
          marshalToNative(propertyToSet), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun SetPropertyFromUri(
      dependencyObject: IUnknown?,
      propertyToSet: DependencyProperty?,
      value: Uri?
    ): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(dependencyObject),
          marshalToNative(propertyToSet), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun SetPropertyFromObject(
      dependencyObject: IUnknown?,
      propertyToSet: DependencyProperty?,
      value: IUnknown?
    ): Unit {
      val fnPtr = _1532169553_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1532169553_Ptr, marshalToNative(dependencyObject),
          marshalToNative(propertyToSet), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlBindingHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1532169553_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlBindingHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93c7dad3f9c2537284dc9e9c4661d083")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlBindingHelperStatics(ptr: Pointer?): WithDefault =
        IXamlBindingHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlBindingHelperStatics {
      val address = segment.toRawLongValue()
      return makeIXamlBindingHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IXamlBindingHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1532169553_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlBindingHelperStatics):
        Array<IXamlBindingHelperStatics?> = (elements as
        Array<IXamlBindingHelperStatics?>).castToImpl<IXamlBindingHelperStatics,IXamlBindingHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlBindingHelperStatics?> =
        arrayOfNulls<IXamlBindingHelperStatics_Impl>(size) as Array<IXamlBindingHelperStatics?>
  }
}
