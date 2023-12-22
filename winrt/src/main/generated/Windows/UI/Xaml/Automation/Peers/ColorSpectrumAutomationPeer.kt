package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Peers.IColorSpectrumAutomationPeerFactory.ABI.IID
import Windows.UI.Xaml.Controls.Primitives.ColorSpectrum
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

@ABIMarker(ColorSpectrumAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.ColorSpectrumAutomationPeer;{15d5ba03-010d-4ff7-9087-f4dd09f831b7})")
@WinRTByReference(brClass = ColorSpectrumAutomationPeer.ByReference::class)
public open class ColorSpectrumAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IColorSpectrumAutomationPeer.WithDefault, IWinRTObject {
  private val __2077408981_Interface: IColorSpectrumAutomationPeer.WithDefault by lazy {
    as_2077408981()
  }


  public override val __2077408981_Ptr: JNAPointer? by lazy {
    __2077408981_Interface.__2077408981_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2077408981_Interface)

  public constructor(owner: ColorSpectrum) : this(ABI.activate(owner))

  private fun as_2077408981(): IColorSpectrumAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IColorSpectrumAutomationPeer.ABI.makeIColorSpectrumAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IColorSpectrumAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IColorSpectrumAutomationPeer.ABI.makeIColorSpectrumAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ColorSpectrumAutomationPeer> {
    public override fun getValue() = ColorSpectrumAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: ColorSpectrumAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ColorSpectrumAutomationPeer, MemoryAddress> {
    public val IColorSpectrumAutomationPeerFactory_Instance: IColorSpectrumAutomationPeerFactory by
        lazy {
      createIColorSpectrumAutomationPeerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIColorSpectrumAutomationPeerFactory(): IColorSpectrumAutomationPeerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.Peers.ColorSpectrumAutomationPeer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IColorSpectrumAutomationPeerFactory.ABI.makeIColorSpectrumAutomationPeerFactory(factoryActivatorPtr.value))
    }

    public fun activate(owner: ColorSpectrum): JNAPointer? =
        IColorSpectrumAutomationPeerFactory_Instance.CreateInstanceWithOwner(owner, null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ColorSpectrumAutomationPeer {
      val address = segment.toRawLongValue()
      return ColorSpectrumAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: ColorSpectrumAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
