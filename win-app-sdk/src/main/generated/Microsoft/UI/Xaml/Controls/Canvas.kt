package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ICanvasFactory.ABI.IID
import Microsoft.UI.Xaml.UIElement
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Canvas.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Canvas;{457ba139-1146-51d2-807e-d9d65c927060})")
@WinRTByReference(brClass = Canvas.ByReference::class)
public open class Canvas(
  ptr: JNAPointer? = NULL
) : Panel(ptr), ICanvas.WithDefault, IWinRTObject {
  private val __1894552031_Interface: ICanvas.WithDefault by lazy {
    as_1894552031()
  }


  public override val __1894552031_Ptr: JNAPointer? by lazy {
    __1894552031_Interface.__1894552031_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1894552031_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1894552031(): ICanvas.WithDefault {
    if(pointer == NULL) {
      return(ICanvas.ABI.makeICanvas(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICanvas>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICanvas.ABI.makeICanvas(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Canvas> {
    public override fun getValue() = Canvas(pointer.getPointer(0))

    public fun setValue(value: Canvas): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Canvas, MemoryAddress> {
    public val ICanvasStatics_Instance: ICanvasStatics by lazy {
      createICanvasStatics()
    }


    public val ICanvasFactory_Instance: ICanvasFactory by lazy {
      createICanvasFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICanvasStatics(): ICanvasStatics {
      val refiid = Guid.REFIID(ICanvasStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Canvas".toHandle(),refiid,interfacePtr)
      val result = ICanvasStatics.ABI.makeICanvasStatics(interfacePtr.value)
      return result
    }

    public fun createICanvasFactory(): ICanvasFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Canvas".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICanvasFactory.ABI.makeICanvasFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ICanvasFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Canvas {
      val address = segment.toRawLongValue()
      return Canvas(Pointer(address))
    }

    public override fun toNative(obj: Canvas): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LeftProperty() = ABI.ICanvasStatics_Instance.get_LeftProperty()

    public fun GetLeft(element: UIElement) = ABI.ICanvasStatics_Instance.GetLeft(element)

    public fun SetLeft(element: UIElement, length: Double) =
        ABI.ICanvasStatics_Instance.SetLeft(element, length)

    public fun get_TopProperty() = ABI.ICanvasStatics_Instance.get_TopProperty()

    public fun GetTop(element: UIElement) = ABI.ICanvasStatics_Instance.GetTop(element)

    public fun SetTop(element: UIElement, length: Double) =
        ABI.ICanvasStatics_Instance.SetTop(element, length)

    public fun get_ZIndexProperty() = ABI.ICanvasStatics_Instance.get_ZIndexProperty()

    public fun GetZIndex(element: UIElement) = ABI.ICanvasStatics_Instance.GetZIndex(element)

    public fun SetZIndex(element: UIElement, value: Int) =
        ABI.ICanvasStatics_Instance.SetZIndex(element, value)
  }
}
