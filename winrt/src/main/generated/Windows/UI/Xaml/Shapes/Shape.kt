package Windows.UI.Xaml.Shapes

import Windows.UI.Xaml.FrameworkElement
import Windows.UI.Xaml.Shapes.IShapeFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Shape.ABI::class)
@Signature("rc(Windows.UI.Xaml.Shapes.Shape;{786f2b75-9aa0-454d-ae06-a2466e37c832})")
@WinRTByReference(brClass = Shape.ByReference::class)
public open class Shape(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IShape.WithDefault, IShape2.WithDefault, IWinRTObject {
  private val __1600845825_Interface: IShape.WithDefault by lazy {
    as_1600845825()
  }


  private val __1913386927_Interface: IShape2.WithDefault by lazy {
    as_1913386927()
  }


  public override val __1600845825_Ptr: JNAPointer? by lazy {
    __1600845825_Interface.__1600845825_Ptr
  }


  public override val __1913386927_Ptr: JNAPointer? by lazy {
    __1913386927_Interface.__1913386927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1600845825_Interface, __1913386927_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1600845825(): IShape.WithDefault {
    if(pointer == NULL) {
      return(IShape.ABI.makeIShape(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IShape>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IShape.ABI.makeIShape(ref.value))
  }

  private fun as_1913386927(): IShape2.WithDefault {
    if(pointer == NULL) {
      return(IShape2.ABI.makeIShape2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IShape2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IShape2.ABI.makeIShape2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Shape> {
    public override fun getValue() = Shape(pointer.getPointer(0))

    public fun setValue(value: Shape): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Shape, MemoryAddress> {
    public val IShapeStatics_Instance: IShapeStatics by lazy {
      createIShapeStatics()
    }


    public val IShapeFactory_Instance: IShapeFactory by lazy {
      createIShapeFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIShapeStatics(): IShapeStatics {
      val refiid = Guid.REFIID(IShapeStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Shapes.Shape".toHandle(),refiid,interfacePtr)
      val result = IShapeStatics.ABI.makeIShapeStatics(interfacePtr.value)
      return result
    }

    public fun createIShapeFactory(): IShapeFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Shapes.Shape".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IShapeFactory.ABI.makeIShapeFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IShapeFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Shape {
      val address = segment.toRawLongValue()
      return Shape(Pointer(address))
    }

    public override fun toNative(obj: Shape): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FillProperty() = ABI.IShapeStatics_Instance.get_FillProperty()

    public fun get_StrokeProperty() = ABI.IShapeStatics_Instance.get_StrokeProperty()

    public fun get_StrokeMiterLimitProperty() =
        ABI.IShapeStatics_Instance.get_StrokeMiterLimitProperty()

    public fun get_StrokeThicknessProperty() =
        ABI.IShapeStatics_Instance.get_StrokeThicknessProperty()

    public fun get_StrokeStartLineCapProperty() =
        ABI.IShapeStatics_Instance.get_StrokeStartLineCapProperty()

    public fun get_StrokeEndLineCapProperty() =
        ABI.IShapeStatics_Instance.get_StrokeEndLineCapProperty()

    public fun get_StrokeLineJoinProperty() =
        ABI.IShapeStatics_Instance.get_StrokeLineJoinProperty()

    public fun get_StrokeDashOffsetProperty() =
        ABI.IShapeStatics_Instance.get_StrokeDashOffsetProperty()

    public fun get_StrokeDashCapProperty() = ABI.IShapeStatics_Instance.get_StrokeDashCapProperty()

    public fun get_StrokeDashArrayProperty() =
        ABI.IShapeStatics_Instance.get_StrokeDashArrayProperty()

    public fun get_StretchProperty() = ABI.IShapeStatics_Instance.get_StretchProperty()
  }
}
