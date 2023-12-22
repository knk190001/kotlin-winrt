package Windows.Graphics.Capture

import Windows.Graphics.DisplayId
import Windows.UI.Composition.Visual
import Windows.UI.WindowId
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GraphicsCaptureItem.ABI::class)
@Signature("rc(Windows.Graphics.Capture.GraphicsCaptureItem;{79c3f95b-31f7-4ec2-a464-632ef5d30760})")
@WinRTByReference(brClass = GraphicsCaptureItem.ByReference::class)
public class GraphicsCaptureItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGraphicsCaptureItem.WithDefault, IWinRTObject {
  private val __1108868877_Interface: IGraphicsCaptureItem.WithDefault by lazy {
    as_1108868877()
  }


  public override val __1108868877_Ptr: JNAPointer? by lazy {
    __1108868877_Interface.__1108868877_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1108868877_Interface)

  private fun as_1108868877(): IGraphicsCaptureItem.WithDefault {
    if(pointer == NULL) {
      return(IGraphicsCaptureItem.ABI.makeIGraphicsCaptureItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGraphicsCaptureItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGraphicsCaptureItem.ABI.makeIGraphicsCaptureItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GraphicsCaptureItem> {
    public override fun getValue() = GraphicsCaptureItem(pointer.getPointer(0))

    public fun setValue(value: GraphicsCaptureItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GraphicsCaptureItem, MemoryAddress> {
    public val IGraphicsCaptureItemStatics2_Instance: IGraphicsCaptureItemStatics2 by lazy {
      createIGraphicsCaptureItemStatics2()
    }


    public val IGraphicsCaptureItemStatics_Instance: IGraphicsCaptureItemStatics by lazy {
      createIGraphicsCaptureItemStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGraphicsCaptureItemStatics2(): IGraphicsCaptureItemStatics2 {
      val refiid = Guid.REFIID(IGraphicsCaptureItemStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Capture.GraphicsCaptureItem".toHandle(),refiid,interfacePtr)
      val result =
          IGraphicsCaptureItemStatics2.ABI.makeIGraphicsCaptureItemStatics2(interfacePtr.value)
      return result
    }

    public fun createIGraphicsCaptureItemStatics(): IGraphicsCaptureItemStatics {
      val refiid = Guid.REFIID(IGraphicsCaptureItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Capture.GraphicsCaptureItem".toHandle(),refiid,interfacePtr)
      val result =
          IGraphicsCaptureItemStatics.ABI.makeIGraphicsCaptureItemStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GraphicsCaptureItem {
      val address = segment.toRawLongValue()
      return GraphicsCaptureItem(Pointer(address))
    }

    public override fun toNative(obj: GraphicsCaptureItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryCreateFromWindowId(windowId: WindowId) =
        ABI.IGraphicsCaptureItemStatics2_Instance.TryCreateFromWindowId(windowId)

    public fun TryCreateFromDisplayId(displayId: DisplayId) =
        ABI.IGraphicsCaptureItemStatics2_Instance.TryCreateFromDisplayId(displayId)

    public fun CreateFromVisual(visual: Visual) =
        ABI.IGraphicsCaptureItemStatics_Instance.CreateFromVisual(visual)
  }
}
