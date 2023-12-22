package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Primitives.ICarouselPanelFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.VirtualizingPanel
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

@ABIMarker(CarouselPanel.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.CarouselPanel;{298d3800-e5c9-5003-b84c-a6538866e2d5})")
@WinRTByReference(brClass = CarouselPanel.ByReference::class)
public open class CarouselPanel(
  ptr: JNAPointer? = NULL
) : VirtualizingPanel(ptr), ICarouselPanel.WithDefault, IScrollSnapPointsInfo.WithDefault,
    IWinRTObject {
  private val __597962707_Interface: ICarouselPanel.WithDefault by lazy {
    as_597962707()
  }


  private val __1788393063_Interface: IScrollSnapPointsInfo.WithDefault by lazy {
    as_1788393063()
  }


  public override val __597962707_Ptr: JNAPointer? by lazy {
    __597962707_Interface.__597962707_Ptr
  }


  public override val __1788393063_Ptr: JNAPointer? by lazy {
    __1788393063_Interface.__1788393063_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__597962707_Interface, __1788393063_Interface)

  public constructor() : this(ABI.activate())

  private fun as_597962707(): ICarouselPanel.WithDefault {
    if(pointer == NULL) {
      return(ICarouselPanel.ABI.makeICarouselPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICarouselPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICarouselPanel.ABI.makeICarouselPanel(ref.value))
  }

  private fun as_1788393063(): IScrollSnapPointsInfo.WithDefault {
    if(pointer == NULL) {
      return(IScrollSnapPointsInfo.ABI.makeIScrollSnapPointsInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollSnapPointsInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollSnapPointsInfo.ABI.makeIScrollSnapPointsInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CarouselPanel>
      {
    public override fun getValue() = CarouselPanel(pointer.getPointer(0))

    public fun setValue(value: CarouselPanel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CarouselPanel, MemoryAddress> {
    public val ICarouselPanelFactory_Instance: ICarouselPanelFactory by lazy {
      createICarouselPanelFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICarouselPanelFactory(): ICarouselPanelFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.CarouselPanel".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICarouselPanelFactory.ABI.makeICarouselPanelFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ICarouselPanelFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): CarouselPanel {
      val address = segment.toRawLongValue()
      return CarouselPanel(Pointer(address))
    }

    public override fun toNative(obj: CarouselPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
