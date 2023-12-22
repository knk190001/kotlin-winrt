package Microsoft.UI.Xaml.Shapes

import Microsoft.UI.Xaml.FrameworkElement
import Microsoft.UI.Xaml.Shapes.IShapeFactory.ABI.IID
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
@Signature("rc(Microsoft.UI.Xaml.Shapes.Shape;{9941aad3-6af2-5ba2-9085-8506d5f2485e})")
@WinRTByReference(brClass = Shape.ByReference::class)
public open class Shape(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IShape.WithDefault, IWinRTObject {
  private val __749576822_Interface: IShape.WithDefault by lazy {
    as_749576822()
  }


  public override val __749576822_Ptr: JNAPointer? by lazy {
    __749576822_Interface.__749576822_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__749576822_Interface)

  public constructor() : this(ABI.activate())

  private fun as_749576822(): IShape.WithDefault {
    if(pointer == NULL) {
      return(IShape.ABI.makeIShape(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IShape>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IShape.ABI.makeIShape(ref.value))
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
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Shapes.Shape".toHandle(),refiid,interfacePtr)
      val result = IShapeStatics.ABI.makeIShapeStatics(interfacePtr.value)
      return result
    }

    public fun createIShapeFactory(): IShapeFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Shapes.Shape".toHandle(),refiid,factoryActivatorPtr)
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
