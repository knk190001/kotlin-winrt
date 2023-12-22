package Windows.UI.Core

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

@ABIMarker(CoreWindowResizeManager.ABI::class)
@Signature("rc(Windows.UI.Core.CoreWindowResizeManager;{b8f0b925-b350-48b3-a198-5c1a84700243})")
@WinRTByReference(brClass = CoreWindowResizeManager.ByReference::class)
public class CoreWindowResizeManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWindowResizeManager.WithDefault,
    ICoreWindowResizeManagerLayoutCapability.WithDefault, IWinRTObject {
  private val __396116463_Interface: ICoreWindowResizeManager.WithDefault by lazy {
    as_396116463()
  }


  private val __1133729777_Interface: ICoreWindowResizeManagerLayoutCapability.WithDefault by lazy {
    as_1133729777()
  }


  public override val __396116463_Ptr: JNAPointer? by lazy {
    __396116463_Interface.__396116463_Ptr
  }


  public override val __1133729777_Ptr: JNAPointer? by lazy {
    __1133729777_Interface.__1133729777_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__396116463_Interface, __1133729777_Interface)

  private fun as_396116463(): ICoreWindowResizeManager.WithDefault {
    if(pointer == NULL) {
      return(ICoreWindowResizeManager.ABI.makeICoreWindowResizeManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWindowResizeManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWindowResizeManager.ABI.makeICoreWindowResizeManager(ref.value))
  }

  private fun as_1133729777(): ICoreWindowResizeManagerLayoutCapability.WithDefault {
    if(pointer == NULL) {
      return(ICoreWindowResizeManagerLayoutCapability.ABI.makeICoreWindowResizeManagerLayoutCapability(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWindowResizeManagerLayoutCapability>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWindowResizeManagerLayoutCapability.ABI.makeICoreWindowResizeManagerLayoutCapability(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWindowResizeManager> {
    public override fun getValue() = CoreWindowResizeManager(pointer.getPointer(0))

    public fun setValue(value: CoreWindowResizeManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWindowResizeManager, MemoryAddress> {
    public val ICoreWindowResizeManagerStatics_Instance: ICoreWindowResizeManagerStatics by lazy {
      createICoreWindowResizeManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreWindowResizeManagerStatics(): ICoreWindowResizeManagerStatics {
      val refiid = Guid.REFIID(ICoreWindowResizeManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Core.CoreWindowResizeManager".toHandle(),refiid,interfacePtr)
      val result =
          ICoreWindowResizeManagerStatics.ABI.makeICoreWindowResizeManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CoreWindowResizeManager {
      val address = segment.toRawLongValue()
      return CoreWindowResizeManager(Pointer(address))
    }

    public override fun toNative(obj: CoreWindowResizeManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() =
        ABI.ICoreWindowResizeManagerStatics_Instance.GetForCurrentView()
  }
}
