package Windows.UI.UIAutomation.Core

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

@ABIMarker(AutomationRemoteOperationResult.ABI::class)
@Signature("rc(Windows.UI.UIAutomation.Core.AutomationRemoteOperationResult;{e0f80c42-4a67-5534-bf5a-09e8a99b36b1})")
@WinRTByReference(brClass = AutomationRemoteOperationResult.ByReference::class)
public class AutomationRemoteOperationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAutomationRemoteOperationResult.WithDefault, IWinRTObject {
  private val __1432429647_Interface: IAutomationRemoteOperationResult.WithDefault by lazy {
    as_1432429647()
  }


  public override val __1432429647_Ptr: JNAPointer? by lazy {
    __1432429647_Interface.__1432429647_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1432429647_Interface)

  private fun as_1432429647(): IAutomationRemoteOperationResult.WithDefault {
    if(pointer == NULL) {
      return(IAutomationRemoteOperationResult.ABI.makeIAutomationRemoteOperationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationRemoteOperationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationRemoteOperationResult.ABI.makeIAutomationRemoteOperationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AutomationRemoteOperationResult> {
    public override fun getValue() = AutomationRemoteOperationResult(pointer.getPointer(0))

    public fun setValue(value: AutomationRemoteOperationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutomationRemoteOperationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AutomationRemoteOperationResult {
      val address = segment.toRawLongValue()
      return AutomationRemoteOperationResult(Pointer(address))
    }

    public override fun toNative(obj: AutomationRemoteOperationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
