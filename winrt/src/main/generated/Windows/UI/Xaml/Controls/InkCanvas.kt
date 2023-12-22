package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IInkCanvasFactory.ABI.IID
import Windows.UI.Xaml.FrameworkElement
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

@ABIMarker(InkCanvas.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.InkCanvas;{29443c28-8e48-4fc8-a473-35b0ba12acea})")
@WinRTByReference(brClass = InkCanvas.ByReference::class)
public open class InkCanvas(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IInkCanvas.WithDefault, IWinRTObject {
  private val __2145286210_Interface: IInkCanvas.WithDefault by lazy {
    as_2145286210()
  }


  public override val __2145286210_Ptr: JNAPointer? by lazy {
    __2145286210_Interface.__2145286210_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2145286210_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2145286210(): IInkCanvas.WithDefault {
    if(pointer == NULL) {
      return(IInkCanvas.ABI.makeIInkCanvas(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkCanvas>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkCanvas.ABI.makeIInkCanvas(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InkCanvas> {
    public override fun getValue() = InkCanvas(pointer.getPointer(0))

    public fun setValue(value: InkCanvas): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkCanvas, MemoryAddress> {
    public val IInkCanvasFactory_Instance: IInkCanvasFactory by lazy {
      createIInkCanvasFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkCanvasFactory(): IInkCanvasFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkCanvas".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInkCanvasFactory.ABI.makeIInkCanvasFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IInkCanvasFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): InkCanvas {
      val address = segment.toRawLongValue()
      return InkCanvas(Pointer(address))
    }

    public override fun toNative(obj: InkCanvas): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
