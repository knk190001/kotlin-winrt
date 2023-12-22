package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ISwapChainPanelFactory.ABI.IID
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

@ABIMarker(SwapChainPanel.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.SwapChainPanel;{08844f85-aa1b-540d-bef2-b2bb7b257f8c})")
@WinRTByReference(brClass = SwapChainPanel.ByReference::class)
public open class SwapChainPanel(
  ptr: JNAPointer? = NULL
) : Grid(ptr), ISwapChainPanel.WithDefault, IWinRTObject {
  private val __983845693_Interface: ISwapChainPanel.WithDefault by lazy {
    as_983845693()
  }


  public override val __983845693_Ptr: JNAPointer? by lazy {
    __983845693_Interface.__983845693_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__983845693_Interface)

  public constructor() : this(ABI.activate())

  private fun as_983845693(): ISwapChainPanel.WithDefault {
    if(pointer == NULL) {
      return(ISwapChainPanel.ABI.makeISwapChainPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISwapChainPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISwapChainPanel.ABI.makeISwapChainPanel(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SwapChainPanel>
      {
    public override fun getValue() = SwapChainPanel(pointer.getPointer(0))

    public fun setValue(value: SwapChainPanel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SwapChainPanel, MemoryAddress> {
    public val ISwapChainPanelStatics_Instance: ISwapChainPanelStatics by lazy {
      createISwapChainPanelStatics()
    }


    public val ISwapChainPanelFactory_Instance: ISwapChainPanelFactory by lazy {
      createISwapChainPanelFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISwapChainPanelStatics(): ISwapChainPanelStatics {
      val refiid = Guid.REFIID(ISwapChainPanelStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SwapChainPanel".toHandle(),refiid,interfacePtr)
      val result = ISwapChainPanelStatics.ABI.makeISwapChainPanelStatics(interfacePtr.value)
      return result
    }

    public fun createISwapChainPanelFactory(): ISwapChainPanelFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SwapChainPanel".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISwapChainPanelFactory.ABI.makeISwapChainPanelFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ISwapChainPanelFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SwapChainPanel {
      val address = segment.toRawLongValue()
      return SwapChainPanel(Pointer(address))
    }

    public override fun toNative(obj: SwapChainPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CompositionScaleXProperty() =
        ABI.ISwapChainPanelStatics_Instance.get_CompositionScaleXProperty()

    public fun get_CompositionScaleYProperty() =
        ABI.ISwapChainPanelStatics_Instance.get_CompositionScaleYProperty()
  }
}
