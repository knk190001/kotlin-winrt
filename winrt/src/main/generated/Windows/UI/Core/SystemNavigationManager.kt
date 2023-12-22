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

@ABIMarker(SystemNavigationManager.ABI::class)
@Signature("rc(Windows.UI.Core.SystemNavigationManager;{93023118-cf50-42a6-9706-69107fa122e1})")
@WinRTByReference(brClass = SystemNavigationManager.ByReference::class)
public class SystemNavigationManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemNavigationManager.WithDefault, ISystemNavigationManager2.WithDefault,
    IWinRTObject {
  private val __1671331249_Interface: ISystemNavigationManager.WithDefault by lazy {
    as_1671331249()
  }


  private val __271661117_Interface: ISystemNavigationManager2.WithDefault by lazy {
    as_271661117()
  }


  public override val __1671331249_Ptr: JNAPointer? by lazy {
    __1671331249_Interface.__1671331249_Ptr
  }


  public override val __271661117_Ptr: JNAPointer? by lazy {
    __271661117_Interface.__271661117_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1671331249_Interface, __271661117_Interface)

  private fun as_1671331249(): ISystemNavigationManager.WithDefault {
    if(pointer == NULL) {
      return(ISystemNavigationManager.ABI.makeISystemNavigationManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemNavigationManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemNavigationManager.ABI.makeISystemNavigationManager(ref.value))
  }

  private fun as_271661117(): ISystemNavigationManager2.WithDefault {
    if(pointer == NULL) {
      return(ISystemNavigationManager2.ABI.makeISystemNavigationManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemNavigationManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemNavigationManager2.ABI.makeISystemNavigationManager2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemNavigationManager> {
    public override fun getValue() = SystemNavigationManager(pointer.getPointer(0))

    public fun setValue(value: SystemNavigationManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemNavigationManager, MemoryAddress> {
    public val ISystemNavigationManagerStatics_Instance: ISystemNavigationManagerStatics by lazy {
      createISystemNavigationManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISystemNavigationManagerStatics(): ISystemNavigationManagerStatics {
      val refiid = Guid.REFIID(ISystemNavigationManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Core.SystemNavigationManager".toHandle(),refiid,interfacePtr)
      val result =
          ISystemNavigationManagerStatics.ABI.makeISystemNavigationManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SystemNavigationManager {
      val address = segment.toRawLongValue()
      return SystemNavigationManager(Pointer(address))
    }

    public override fun toNative(obj: SystemNavigationManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() =
        ABI.ISystemNavigationManagerStatics_Instance.GetForCurrentView()
  }
}
