package Microsoft.UI.Content

import Microsoft.UI.Composition.Compositor
import Microsoft.UI.IClosableNotifier
import Microsoft.UI.WindowId
import Windows.Foundation.IClosable
import Windows.UI.Composition.ContainerVisual
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

@ABIMarker(SystemVisualSiteBridge.ABI::class)
@Signature("rc(Microsoft.UI.Content.SystemVisualSiteBridge;{6eedd227-3802-5772-b24e-1d8b736cffa7})")
@WinRTByReference(brClass = SystemVisualSiteBridge.ByReference::class)
public class SystemVisualSiteBridge(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemVisualSiteBridge.WithDefault, IClosableNotifier.WithDefault,
    IContentSiteBridge.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __946250249_Interface: ISystemVisualSiteBridge.WithDefault by lazy {
    as_946250249()
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


  public override val __946250249_Ptr: JNAPointer? by lazy {
    __946250249_Interface.__946250249_Ptr
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
    get() = arrayOf(__946250249_Interface, __105354978_Interface, __2064691231_Interface,
        __1260617006_Interface)

  private fun as_946250249(): ISystemVisualSiteBridge.WithDefault {
    if(pointer == NULL) {
      return(ISystemVisualSiteBridge.ABI.makeISystemVisualSiteBridge(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemVisualSiteBridge>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemVisualSiteBridge.ABI.makeISystemVisualSiteBridge(ref.value))
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
      IByReference<SystemVisualSiteBridge> {
    public override fun getValue() = SystemVisualSiteBridge(pointer.getPointer(0))

    public fun setValue(value: SystemVisualSiteBridge): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemVisualSiteBridge, MemoryAddress> {
    public val ISystemVisualSiteBridgeStatics_Instance: ISystemVisualSiteBridgeStatics by lazy {
      createISystemVisualSiteBridgeStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISystemVisualSiteBridgeStatics(): ISystemVisualSiteBridgeStatics {
      val refiid = Guid.REFIID(ISystemVisualSiteBridgeStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Content.SystemVisualSiteBridge".toHandle(),refiid,interfacePtr)
      val result =
          ISystemVisualSiteBridgeStatics.ABI.makeISystemVisualSiteBridgeStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SystemVisualSiteBridge {
      val address = segment.toRawLongValue()
      return SystemVisualSiteBridge(Pointer(address))
    }

    public override fun toNative(obj: SystemVisualSiteBridge): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(
      localCompositor: Compositor,
      hostVisual: ContainerVisual,
      parentForInputWindowId: WindowId
    ) = ABI.ISystemVisualSiteBridgeStatics_Instance.Create(localCompositor, hostVisual,
        parentForInputWindowId)
  }
}
