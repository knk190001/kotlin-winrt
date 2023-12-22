package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ISwapChainBackgroundPanelFactory.ABI.IID
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

@ABIMarker(SwapChainBackgroundPanel.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.SwapChainBackgroundPanel;{095a213f-ffea-55ff-b875-e698254ba6df})")
@WinRTByReference(brClass = SwapChainBackgroundPanel.ByReference::class)
public open class SwapChainBackgroundPanel(
  ptr: JNAPointer? = NULL
) : Grid(ptr), ISwapChainBackgroundPanel.WithDefault, IWinRTObject {
  private val __888955025_Interface: ISwapChainBackgroundPanel.WithDefault by lazy {
    as_888955025()
  }


  public override val __888955025_Ptr: JNAPointer? by lazy {
    __888955025_Interface.__888955025_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__888955025_Interface)

  public constructor() : this(ABI.activate())

  private fun as_888955025(): ISwapChainBackgroundPanel.WithDefault {
    if(pointer == NULL) {
      return(ISwapChainBackgroundPanel.ABI.makeISwapChainBackgroundPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISwapChainBackgroundPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISwapChainBackgroundPanel.ABI.makeISwapChainBackgroundPanel(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SwapChainBackgroundPanel> {
    public override fun getValue() = SwapChainBackgroundPanel(pointer.getPointer(0))

    public fun setValue(value: SwapChainBackgroundPanel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SwapChainBackgroundPanel, MemoryAddress> {
    public val ISwapChainBackgroundPanelFactory_Instance: ISwapChainBackgroundPanelFactory by lazy {
      createISwapChainBackgroundPanelFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISwapChainBackgroundPanelFactory(): ISwapChainBackgroundPanelFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SwapChainBackgroundPanel".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISwapChainBackgroundPanelFactory.ABI.makeISwapChainBackgroundPanelFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        ISwapChainBackgroundPanelFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SwapChainBackgroundPanel {
      val address = segment.toRawLongValue()
      return SwapChainBackgroundPanel(Pointer(address))
    }

    public override fun toNative(obj: SwapChainBackgroundPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
