package Windows.ApplicationModel.Preview.InkWorkspace

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

@ABIMarker(InkWorkspaceHostedAppManager.ABI::class)
@Signature("rc(Windows.ApplicationModel.Preview.InkWorkspace.InkWorkspaceHostedAppManager;{fe0a7990-5e59-4bb7-8a63-7d218cd96300})")
@WinRTByReference(brClass = InkWorkspaceHostedAppManager.ByReference::class)
public class InkWorkspaceHostedAppManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkWorkspaceHostedAppManager.WithDefault, IWinRTObject {
  private val __1802966284_Interface: IInkWorkspaceHostedAppManager.WithDefault by lazy {
    as_1802966284()
  }


  public override val __1802966284_Ptr: JNAPointer? by lazy {
    __1802966284_Interface.__1802966284_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1802966284_Interface)

  private fun as_1802966284(): IInkWorkspaceHostedAppManager.WithDefault {
    if(pointer == NULL) {
      return(IInkWorkspaceHostedAppManager.ABI.makeIInkWorkspaceHostedAppManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkWorkspaceHostedAppManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkWorkspaceHostedAppManager.ABI.makeIInkWorkspaceHostedAppManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkWorkspaceHostedAppManager> {
    public override fun getValue() = InkWorkspaceHostedAppManager(pointer.getPointer(0))

    public fun setValue(value: InkWorkspaceHostedAppManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkWorkspaceHostedAppManager, MemoryAddress> {
    public val IInkWorkspaceHostedAppManagerStatics_Instance: IInkWorkspaceHostedAppManagerStatics
        by lazy {
      createIInkWorkspaceHostedAppManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkWorkspaceHostedAppManagerStatics(): IInkWorkspaceHostedAppManagerStatics {
      val refiid = Guid.REFIID(IInkWorkspaceHostedAppManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Preview.InkWorkspace.InkWorkspaceHostedAppManager".toHandle(),refiid,interfacePtr)
      val result =
          IInkWorkspaceHostedAppManagerStatics.ABI.makeIInkWorkspaceHostedAppManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InkWorkspaceHostedAppManager {
      val address = segment.toRawLongValue()
      return InkWorkspaceHostedAppManager(Pointer(address))
    }

    public override fun toNative(obj: InkWorkspaceHostedAppManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentApp() =
        ABI.IInkWorkspaceHostedAppManagerStatics_Instance.GetForCurrentApp()
  }
}
