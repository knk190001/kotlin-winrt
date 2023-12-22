package Microsoft.UI.Content

import Microsoft.UI.Composition.Compositor
import Windows.Foundation.IClosable
import Windows.UI.Core.CoreWindow
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

@ABIMarker(CoreWindowSiteBridge.ABI::class)
@Signature("rc(Microsoft.UI.Content.CoreWindowSiteBridge;{03e1c02e-e5e3-526a-8492-939e26ee09d5})")
@WinRTByReference(brClass = CoreWindowSiteBridge.ByReference::class)
public class CoreWindowSiteBridge(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWindowSiteBridge.WithDefault, IContentSiteBridge.WithDefault,
    IClosable.WithDefault, IWinRTObject {
  private val __544103081_Interface: ICoreWindowSiteBridge.WithDefault by lazy {
    as_544103081()
  }


  private val __2064691231_Interface: IContentSiteBridge.WithDefault by lazy {
    as_2064691231()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __544103081_Ptr: JNAPointer? by lazy {
    __544103081_Interface.__544103081_Ptr
  }


  public override val __2064691231_Ptr: JNAPointer? by lazy {
    __2064691231_Interface.__2064691231_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__544103081_Interface, __2064691231_Interface, __1260617006_Interface)

  private fun as_544103081(): ICoreWindowSiteBridge.WithDefault {
    if(pointer == NULL) {
      return(ICoreWindowSiteBridge.ABI.makeICoreWindowSiteBridge(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWindowSiteBridge>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWindowSiteBridge.ABI.makeICoreWindowSiteBridge(ref.value))
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
      IByReference<CoreWindowSiteBridge> {
    public override fun getValue() = CoreWindowSiteBridge(pointer.getPointer(0))

    public fun setValue(value: CoreWindowSiteBridge): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWindowSiteBridge, MemoryAddress> {
    public val ICoreWindowSiteBridgeStatics_Instance: ICoreWindowSiteBridgeStatics by lazy {
      createICoreWindowSiteBridgeStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreWindowSiteBridgeStatics(): ICoreWindowSiteBridgeStatics {
      val refiid = Guid.REFIID(ICoreWindowSiteBridgeStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Content.CoreWindowSiteBridge".toHandle(),refiid,interfacePtr)
      val result =
          ICoreWindowSiteBridgeStatics.ABI.makeICoreWindowSiteBridgeStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CoreWindowSiteBridge {
      val address = segment.toRawLongValue()
      return CoreWindowSiteBridge(Pointer(address))
    }

    public override fun toNative(obj: CoreWindowSiteBridge): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(compositor: Compositor, coreWindow: CoreWindow) =
        ABI.ICoreWindowSiteBridgeStatics_Instance.Create(compositor, coreWindow)

    public fun IsSupported() = ABI.ICoreWindowSiteBridgeStatics_Instance.IsSupported()
  }
}
