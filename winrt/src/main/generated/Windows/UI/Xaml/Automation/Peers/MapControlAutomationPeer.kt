package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Provider.IScrollProvider
import Windows.UI.Xaml.Automation.Provider.ITransformProvider
import Windows.UI.Xaml.Automation.Provider.ITransformProvider2
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

@ABIMarker(MapControlAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.MapControlAutomationPeer;{425beee4-f2e8-4bcb-9382-5dfdd11fe45f})")
@WinRTByReference(brClass = MapControlAutomationPeer.ByReference::class)
public class MapControlAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IMapControlAutomationPeer.WithDefault,
    IScrollProvider.WithDefault, ITransformProvider2.WithDefault, ITransformProvider.WithDefault,
    IWinRTObject {
  private val __1514110098_Interface: IMapControlAutomationPeer.WithDefault by lazy {
    as_1514110098()
  }


  private val __1079149302_Interface: IScrollProvider.WithDefault by lazy {
    as_1079149302()
  }


  private val __905016979_Interface: ITransformProvider2.WithDefault by lazy {
    as_905016979()
  }


  private val __1414667419_Interface: ITransformProvider.WithDefault by lazy {
    as_1414667419()
  }


  public override val __1514110098_Ptr: JNAPointer? by lazy {
    __1514110098_Interface.__1514110098_Ptr
  }


  public override val __1079149302_Ptr: JNAPointer? by lazy {
    __1079149302_Interface.__1079149302_Ptr
  }


  public override val __905016979_Ptr: JNAPointer? by lazy {
    __905016979_Interface.__905016979_Ptr
  }


  public override val __1414667419_Ptr: JNAPointer? by lazy {
    __1414667419_Interface.__1414667419_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1514110098_Interface, __1079149302_Interface, __905016979_Interface,
        __1414667419_Interface)

  private fun as_1514110098(): IMapControlAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IMapControlAutomationPeer.ABI.makeIMapControlAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapControlAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapControlAutomationPeer.ABI.makeIMapControlAutomationPeer(ref.value))
  }

  private fun as_1079149302(): IScrollProvider.WithDefault {
    if(pointer == NULL) {
      return(IScrollProvider.ABI.makeIScrollProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollProvider.ABI.makeIScrollProvider(ref.value))
  }

  private fun as_905016979(): ITransformProvider2.WithDefault {
    if(pointer == NULL) {
      return(ITransformProvider2.ABI.makeITransformProvider2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITransformProvider2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITransformProvider2.ABI.makeITransformProvider2(ref.value))
  }

  private fun as_1414667419(): ITransformProvider.WithDefault {
    if(pointer == NULL) {
      return(ITransformProvider.ABI.makeITransformProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITransformProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITransformProvider.ABI.makeITransformProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapControlAutomationPeer> {
    public override fun getValue() = MapControlAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: MapControlAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapControlAutomationPeer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MapControlAutomationPeer {
      val address = segment.toRawLongValue()
      return MapControlAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: MapControlAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
