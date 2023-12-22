package Windows.UI.Xaml.Core.Direct

import Windows.Foundation.DateTime
import Windows.Foundation.Point
import Windows.Foundation.Rect
import Windows.Foundation.Size
import Windows.Foundation.TimeSpan
import Windows.UI.Color
import Windows.UI.Xaml.CornerRadius
import Windows.UI.Xaml.Duration
import Windows.UI.Xaml.GridLength
import Windows.UI.Xaml.Media.Matrix
import Windows.UI.Xaml.Media.Media3D.Matrix3D
import Windows.UI.Xaml.Thickness
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXamlDirect.ABI::class)
@Signature("{5ffa1295-add2-590f-a051-70989b866ade}")
@Guid("5ffa1295add2590fa05170989b866ade")
@WinRTInterface("5ffa1295add2590fa05170989b866ade")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlDirect.ByReference::class)
public interface IXamlDirect : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetObject(xamlDirectObject: IXamlDirectObject?): IUnknown?

  @InterfaceMethod(1)
  public fun GetXamlDirectObject(`object`: IUnknown?): IXamlDirectObject?

  @InterfaceMethod(2)
  public fun CreateInstance(typeIndex: XamlTypeIndex?): IXamlDirectObject?

  @InterfaceMethod(3)
  public fun SetObjectProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: IUnknown?
  ): Unit

  @InterfaceMethod(4)
  public fun SetXamlDirectObjectProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: IXamlDirectObject?
  ): Unit

  @InterfaceMethod(5)
  public fun SetBooleanProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: Boolean
  ): Unit

  @InterfaceMethod(6)
  public fun SetDoubleProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: Double
  ): Unit

  @InterfaceMethod(7)
  public fun SetInt32Property(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: Int
  ): Unit

  @InterfaceMethod(8)
  public fun SetStringProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: String?
  ): Unit

  @InterfaceMethod(9)
  public fun SetDateTimeProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: DateTime?
  ): Unit

  @InterfaceMethod(10)
  public fun SetPointProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: Point?
  ): Unit

  @InterfaceMethod(11)
  public fun SetRectProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: Rect?
  ): Unit

  @InterfaceMethod(12)
  public fun SetSizeProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: Size?
  ): Unit

  @InterfaceMethod(13)
  public fun SetTimeSpanProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: TimeSpan?
  ): Unit

  @InterfaceMethod(14)
  public fun SetColorProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: Color?
  ): Unit

  @InterfaceMethod(15)
  public fun SetCornerRadiusProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: CornerRadius?
  ): Unit

  @InterfaceMethod(16)
  public fun SetDurationProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: Duration?
  ): Unit

  @InterfaceMethod(17)
  public fun SetGridLengthProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: GridLength?
  ): Unit

  @InterfaceMethod(18)
  public fun SetThicknessProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: Thickness?
  ): Unit

  @InterfaceMethod(19)
  public fun SetMatrixProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: Matrix?
  ): Unit

  @InterfaceMethod(20)
  public fun SetMatrix3DProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: Matrix3D?
  ): Unit

  @InterfaceMethod(21)
  public fun SetEnumProperty(
    xamlDirectObject: IXamlDirectObject?,
    propertyIndex: XamlPropertyIndex?,
    value: WinDef.UINT
  ): Unit

  @InterfaceMethod(22)
  public fun GetObjectProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): IUnknown?

  @InterfaceMethod(23)
  public fun GetXamlDirectObjectProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): IXamlDirectObject?

  @InterfaceMethod(24)
  public fun GetBooleanProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): Boolean

  @InterfaceMethod(25)
  public fun GetDoubleProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): Double

  @InterfaceMethod(26)
  public fun GetInt32Property(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): Int

  @InterfaceMethod(27)
  public fun GetStringProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): String?

  @InterfaceMethod(28)
  public fun GetDateTimeProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): DateTime?

  @InterfaceMethod(29)
  public fun GetPointProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): Point?

  @InterfaceMethod(30)
  public fun GetRectProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): Rect?

  @InterfaceMethod(31)
  public fun GetSizeProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): Size?

  @InterfaceMethod(32)
  public fun GetTimeSpanProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): TimeSpan?

  @InterfaceMethod(33)
  public fun GetColorProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): Color?

  @InterfaceMethod(34)
  public fun GetCornerRadiusProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): CornerRadius?

  @InterfaceMethod(35)
  public fun GetDurationProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): Duration?

  @InterfaceMethod(36)
  public fun GetGridLengthProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): GridLength?

  @InterfaceMethod(37)
  public fun GetThicknessProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): Thickness?

  @InterfaceMethod(38)
  public fun GetMatrixProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): Matrix?

  @InterfaceMethod(39)
  public fun GetMatrix3DProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): Matrix3D?

  @InterfaceMethod(40)
  public fun GetEnumProperty(xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?): WinDef.UINT

  @InterfaceMethod(41)
  public fun ClearProperty(xamlDirectObject: IXamlDirectObject?, propertyIndex: XamlPropertyIndex?):
      Unit

  @InterfaceMethod(42)
  public fun GetCollectionCount(xamlDirectObject: IXamlDirectObject?): WinDef.UINT

  @InterfaceMethod(43)
  public fun GetXamlDirectObjectFromCollectionAt(xamlDirectObject: IXamlDirectObject?,
      index: WinDef.UINT): IXamlDirectObject?

  @InterfaceMethod(44)
  public fun AddToCollection(xamlDirectObject: IXamlDirectObject?, value: IXamlDirectObject?): Unit

  @InterfaceMethod(45)
  public fun InsertIntoCollectionAt(
    xamlDirectObject: IXamlDirectObject?,
    index: WinDef.UINT,
    value: IXamlDirectObject?
  ): Unit

  @InterfaceMethod(46)
  public fun RemoveFromCollection(xamlDirectObject: IXamlDirectObject?, value: IXamlDirectObject?):
      Boolean

  @InterfaceMethod(47)
  public fun RemoveFromCollectionAt(xamlDirectObject: IXamlDirectObject?, index: WinDef.UINT): Unit

  @InterfaceMethod(48)
  public fun ClearCollection(xamlDirectObject: IXamlDirectObject?): Unit

  @InterfaceMethod(49)
  public fun AddEventHandler(
    xamlDirectObject: IXamlDirectObject?,
    eventIndex: XamlEventIndex?,
    handler: IUnknown?
  ): Unit

  @InterfaceMethod(50)
  public fun AddEventHandler(
    xamlDirectObject: IXamlDirectObject?,
    eventIndex: XamlEventIndex?,
    handler: IUnknown?,
    handledEventsToo: Boolean
  ): Unit

  @InterfaceMethod(51)
  public fun RemoveEventHandler(
    xamlDirectObject: IXamlDirectObject?,
    eventIndex: XamlEventIndex?,
    handler: IUnknown?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IXamlDirect> {
    public override fun getValue() = ABI.makeIXamlDirect(pointer.getPointer(0))

    public fun setValue(value: IXamlDirect_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlDirect {
    public val __2082189255_Ptr: Pointer?

    public val _2082189255_VtblPtr: Pointer?
      get() = __2082189255_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetObject(xamlDirectObject: IXamlDirectObject?): IUnknown? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetXamlDirectObject(`object`: IUnknown?): IXamlDirectObject? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXamlDirectObject>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(`object`), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXamlDirectObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateInstance(typeIndex: XamlTypeIndex?): IXamlDirectObject? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXamlDirectObject>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(typeIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXamlDirectObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetObjectProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: IUnknown?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun SetXamlDirectObjectProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: IXamlDirectObject?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun SetBooleanProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: Boolean
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SetDoubleProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: Double
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun SetInt32Property(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: Int
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun SetStringProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: String?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun SetDateTimeProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: DateTime?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun SetPointProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: Point?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun SetRectProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: Rect?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun SetSizeProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: Size?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun SetTimeSpanProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: TimeSpan?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun SetColorProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: Color?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun SetCornerRadiusProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: CornerRadius?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun SetDurationProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: Duration?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun SetGridLengthProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: GridLength?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun SetThicknessProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: Thickness?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun SetMatrixProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: Matrix?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun SetMatrix3DProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: Matrix3D?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun SetEnumProperty(
      xamlDirectObject: IXamlDirectObject?,
      propertyIndex: XamlPropertyIndex?,
      value: WinDef.UINT
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun GetObjectProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): IUnknown? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun GetXamlDirectObjectProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): IXamlDirectObject? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXamlDirectObject>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXamlDirectObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun GetBooleanProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): Boolean {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun GetDoubleProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): Double {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(26)
    public override fun GetInt32Property(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): Int {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun GetStringProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): String? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun GetDateTimeProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): DateTime? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun GetPointProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): Point? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun GetRectProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): Rect? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun GetSizeProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): Size? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun GetTimeSpanProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): TimeSpan? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun GetColorProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): Color? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun GetCornerRadiusProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): CornerRadius? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CornerRadius>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CornerRadius>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun GetDurationProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): Duration? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Duration>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Duration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun GetGridLengthProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): GridLength? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridLength>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridLength>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun GetThicknessProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): Thickness? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun GetMatrixProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): Matrix? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun GetMatrix3DProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): Matrix3D? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix3D>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix3D>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(40)
    public override fun GetEnumProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): WinDef.UINT {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(41)
    public override fun ClearProperty(xamlDirectObject: IXamlDirectObject?,
        propertyIndex: XamlPropertyIndex?): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(propertyIndex),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun GetCollectionCount(xamlDirectObject: IXamlDirectObject?): WinDef.UINT {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(43)
    public override fun GetXamlDirectObjectFromCollectionAt(xamlDirectObject: IXamlDirectObject?,
        index: WinDef.UINT): IXamlDirectObject? {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXamlDirectObject>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject), index,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXamlDirectObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun AddToCollection(xamlDirectObject: IXamlDirectObject?,
        value: IXamlDirectObject?): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun InsertIntoCollectionAt(
      xamlDirectObject: IXamlDirectObject?,
      index: WinDef.UINT,
      value: IXamlDirectObject?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject), index,
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun RemoveFromCollection(xamlDirectObject: IXamlDirectObject?,
        value: IXamlDirectObject?): Boolean {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(47)
    public override fun RemoveFromCollectionAt(xamlDirectObject: IXamlDirectObject?,
        index: WinDef.UINT): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject), index,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun ClearCollection(xamlDirectObject: IXamlDirectObject?): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(49)
    public override fun AddEventHandler(
      xamlDirectObject: IXamlDirectObject?,
      eventIndex: XamlEventIndex?,
      handler: IUnknown?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(eventIndex), marshalToNative(handler),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun AddEventHandler(
      xamlDirectObject: IXamlDirectObject?,
      eventIndex: XamlEventIndex?,
      handler: IUnknown?,
      handledEventsToo: Boolean
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(eventIndex), marshalToNative(handler), handledEventsToo,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(51)
    public override fun RemoveEventHandler(
      xamlDirectObject: IXamlDirectObject?,
      eventIndex: XamlEventIndex?,
      handler: IUnknown?
    ): Unit {
      val fnPtr = _2082189255_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2082189255_Ptr, marshalToNative(xamlDirectObject),
          marshalToNative(eventIndex), marshalToNative(handler),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlDirect_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2082189255_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlDirect, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ffa1295add2590fa05170989b866ade")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlDirect(ptr: Pointer?): WithDefault = IXamlDirect_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlDirect {
      val address = segment.toRawLongValue()
      return makeIXamlDirect(Pointer(address))
    }

    public override fun toNative(obj: IXamlDirect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2082189255_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlDirect): Array<IXamlDirect?> = (elements as
        Array<IXamlDirect?>).castToImpl<IXamlDirect,IXamlDirect_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlDirect?> =
        arrayOfNulls<IXamlDirect_Impl>(size) as Array<IXamlDirect?>
  }
}
