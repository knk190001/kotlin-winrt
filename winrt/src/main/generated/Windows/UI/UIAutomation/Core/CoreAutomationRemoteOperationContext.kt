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

@ABIMarker(CoreAutomationRemoteOperationContext.ABI::class)
@Signature("rc(Windows.UI.UIAutomation.Core.CoreAutomationRemoteOperationContext;{b9af9cbb-3d3e-5918-a16b-7861626a3aeb})")
@WinRTByReference(brClass = CoreAutomationRemoteOperationContext.ByReference::class)
public class CoreAutomationRemoteOperationContext(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreAutomationRemoteOperationContext.WithDefault, IWinRTObject {
  private val __547889498_Interface: ICoreAutomationRemoteOperationContext.WithDefault by lazy {
    as_547889498()
  }


  public override val __547889498_Ptr: JNAPointer? by lazy {
    __547889498_Interface.__547889498_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__547889498_Interface)

  private fun as_547889498(): ICoreAutomationRemoteOperationContext.WithDefault {
    if(pointer == NULL) {
      return(ICoreAutomationRemoteOperationContext.ABI.makeICoreAutomationRemoteOperationContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreAutomationRemoteOperationContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreAutomationRemoteOperationContext.ABI.makeICoreAutomationRemoteOperationContext(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreAutomationRemoteOperationContext> {
    public override fun getValue() = CoreAutomationRemoteOperationContext(pointer.getPointer(0))

    public fun setValue(value: CoreAutomationRemoteOperationContext): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreAutomationRemoteOperationContext, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreAutomationRemoteOperationContext {
      val address = segment.toRawLongValue()
      return CoreAutomationRemoteOperationContext(Pointer(address))
    }

    public override fun toNative(obj: CoreAutomationRemoteOperationContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
