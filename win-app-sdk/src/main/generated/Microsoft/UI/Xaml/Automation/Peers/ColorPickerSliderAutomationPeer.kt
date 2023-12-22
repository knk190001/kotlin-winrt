package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Peers.IColorPickerSliderAutomationPeerFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Primitives.ColorPickerSlider
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

@ABIMarker(ColorPickerSliderAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.ColorPickerSliderAutomationPeer;{793d35d4-4152-50fa-b5f4-f6c045c1339d})")
@WinRTByReference(brClass = ColorPickerSliderAutomationPeer.ByReference::class)
public open class ColorPickerSliderAutomationPeer(
  ptr: JNAPointer? = NULL
) : SliderAutomationPeer(ptr), IColorPickerSliderAutomationPeer.WithDefault, IWinRTObject {
  private val __649329656_Interface: IColorPickerSliderAutomationPeer.WithDefault by lazy {
    as_649329656()
  }


  public override val __649329656_Ptr: JNAPointer? by lazy {
    __649329656_Interface.__649329656_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__649329656_Interface)

  public constructor(owner: ColorPickerSlider) : this(ABI.activate(owner))

  private fun as_649329656(): IColorPickerSliderAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IColorPickerSliderAutomationPeer.ABI.makeIColorPickerSliderAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IColorPickerSliderAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IColorPickerSliderAutomationPeer.ABI.makeIColorPickerSliderAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ColorPickerSliderAutomationPeer> {
    public override fun getValue() = ColorPickerSliderAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ColorPickerSliderAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ColorPickerSliderAutomationPeer, MemoryAddress> {
    public val IColorPickerSliderAutomationPeerFactory_Instance:
        IColorPickerSliderAutomationPeerFactory by lazy {
      createIColorPickerSliderAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIColorPickerSliderAutomationPeerFactory():
        IColorPickerSliderAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.Peers.ColorPickerSliderAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IColorPickerSliderAutomationPeerFactory.ABI.makeIColorPickerSliderAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ColorPickerSlider): JNAPointer? =
        IColorPickerSliderAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ColorPickerSliderAutomationPeer {
      val address = segment.toRawLongValue()
      return ColorPickerSliderAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ColorPickerSliderAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
