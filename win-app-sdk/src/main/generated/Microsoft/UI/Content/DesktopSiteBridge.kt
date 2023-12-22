package Microsoft.UI.Content

import Microsoft.UI.IClosableNotifier
import Windows.Foundation.IClosable
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

@ABIMarker(DesktopSiteBridge.ABI::class)
@Signature("rc(Microsoft.UI.Content.DesktopSiteBridge;{f0ae8750-905c-50a2-8a12-4545c6245bb4})")
@WinRTByReference(brClass = DesktopSiteBridge.ByReference::class)
public open class DesktopSiteBridge(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDesktopSiteBridge.WithDefault, IDesktopSiteBridge2.WithDefault,
    IClosableNotifier.WithDefault, IContentSiteBridge.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __2052135938_Interface: IDesktopSiteBridge.WithDefault by lazy {
    as_2052135938()
  }


  private val __808295312_Interface: IDesktopSiteBridge2.WithDefault by lazy {
    as_808295312()
  }


  private val __105354978_Interface: IClosableNotifier.WithDefault by lazy {
    as_105354978()
  }


  private val __2064691231_Interface: IContentSiteBridge.WithDefault by lazy {
    as_2064691231()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __2052135938_Ptr: JNAPointer? by lazy {
    __2052135938_Interface.__2052135938_Ptr
  }


  public override val __808295312_Ptr: JNAPointer? by lazy {
    __808295312_Interface.__808295312_Ptr
  }


  public override val __105354978_Ptr: JNAPointer? by lazy {
    __105354978_Interface.__105354978_Ptr
  }


  public override val __2064691231_Ptr: JNAPointer? by lazy {
    __2064691231_Interface.__2064691231_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2052135938_Interface, __808295312_Interface, __105354978_Interface,
        __2064691231_Interface, __1260617006_Interface)

  private fun as_2052135938(): IDesktopSiteBridge.WithDefault {
    if(pointer == NULL) {
      return(IDesktopSiteBridge.ABI.makeIDesktopSiteBridge(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDesktopSiteBridge>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDesktopSiteBridge.ABI.makeIDesktopSiteBridge(ref.value))
  }

  private fun as_808295312(): IDesktopSiteBridge2.WithDefault {
    if(pointer == NULL) {
      return(IDesktopSiteBridge2.ABI.makeIDesktopSiteBridge2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDesktopSiteBridge2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDesktopSiteBridge2.ABI.makeIDesktopSiteBridge2(ref.value))
  }

  private fun as_105354978(): IClosableNotifier.WithDefault {
    if(pointer == NULL) {
      return(IClosableNotifier.ABI.makeIClosableNotifier(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosableNotifier>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosableNotifier.ABI.makeIClosableNotifier(ref.value))
  }

  private fun as_2064691231(): IContentSiteBridge.WithDefault {
    if(pointer == NULL) {
      return(IContentSiteBridge.ABI.makeIContentSiteBridge(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentSiteBridge>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentSiteBridge.ABI.makeIContentSiteBridge(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DesktopSiteBridge> {
    public override fun getValue() = DesktopSiteBridge(pointer.getPointer(0))

    public fun setValue(value: DesktopSiteBridge): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DesktopSiteBridge, MemoryAddress> {
    public val IDesktopSiteBridgeStatics_Instance: IDesktopSiteBridgeStatics by lazy {
      createIDesktopSiteBridgeStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDesktopSiteBridgeStatics(): IDesktopSiteBridgeStatics {
      val refiid = Guid.REFIID(IDesktopSiteBridgeStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Content.DesktopSiteBridge".toHandle(),refiid,interfacePtr)
      val result = IDesktopSiteBridgeStatics.ABI.makeIDesktopSiteBridgeStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DesktopSiteBridge {
      val address = segment.toRawLongValue()
      return DesktopSiteBridge(Pointer(address))
    }

    public override fun toNative(obj: DesktopSiteBridge): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsSupported() = ABI.IDesktopSiteBridgeStatics_Instance.IsSupported()
  }
}
