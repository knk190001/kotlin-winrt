package Microsoft.UI.Content

import Microsoft.UI.WindowId
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

@ABIMarker(ContentAppWindowBridge.ABI::class)
@Signature("rc(Microsoft.UI.Content.ContentAppWindowBridge;{a17d6b39-5b52-5974-88e5-60cde3967b5e})")
@WinRTByReference(brClass = ContentAppWindowBridge.ByReference::class)
public class ContentAppWindowBridge(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentAppWindowBridge.WithDefault, IContentNodeOwner.WithDefault,
    IWinRTObject {
  private val __1228048565_Interface: IContentAppWindowBridge.WithDefault by lazy {
    as_1228048565()
  }


  private val __723244670_Interface: IContentNodeOwner.WithDefault by lazy {
    as_723244670()
  }


  public override val __1228048565_Ptr: JNAPointer? by lazy {
    __1228048565_Interface.__1228048565_Ptr
  }


  public override val __723244670_Ptr: JNAPointer? by lazy {
    __723244670_Interface.__723244670_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1228048565_Interface, __723244670_Interface)

  private fun as_1228048565(): IContentAppWindowBridge.WithDefault {
    if(pointer == NULL) {
      return(IContentAppWindowBridge.ABI.makeIContentAppWindowBridge(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentAppWindowBridge>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentAppWindowBridge.ABI.makeIContentAppWindowBridge(ref.value))
  }

  private fun as_723244670(): IContentNodeOwner.WithDefault {
    if(pointer == NULL) {
      return(IContentNodeOwner.ABI.makeIContentNodeOwner(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentNodeOwner>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentNodeOwner.ABI.makeIContentNodeOwner(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentAppWindowBridge> {
    public override fun getValue() = ContentAppWindowBridge(pointer.getPointer(0))

    public fun setValue(value: ContentAppWindowBridge): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentAppWindowBridge, MemoryAddress> {
    public val IContentAppWindowBridgeStatics_Instance: IContentAppWindowBridgeStatics by lazy {
      createIContentAppWindowBridgeStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContentAppWindowBridgeStatics(): IContentAppWindowBridgeStatics {
      val refiid = Guid.REFIID(IContentAppWindowBridgeStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Content.ContentAppWindowBridge".toHandle(),refiid,interfacePtr)
      val result =
          IContentAppWindowBridgeStatics.ABI.makeIContentAppWindowBridgeStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ContentAppWindowBridge {
      val address = segment.toRawLongValue()
      return ContentAppWindowBridge(Pointer(address))
    }

    public override fun toNative(obj: ContentAppWindowBridge): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForWindowId(childWindowId: WindowId) =
        ABI.IContentAppWindowBridgeStatics_Instance.GetForWindowId(childWindowId)
  }
}
