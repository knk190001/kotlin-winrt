package Windows.UI.UIAutomation

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

@ABIMarker(AutomationConnection.ABI::class)
@Signature("rc(Windows.UI.UIAutomation.AutomationConnection;{aad262ed-0ef4-5d43-97be-a834e27b65b9})")
@WinRTByReference(brClass = AutomationConnection.ByReference::class)
public class AutomationConnection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAutomationConnection.WithDefault, IWinRTObject {
  private val __994239708_Interface: IAutomationConnection.WithDefault by lazy {
    as_994239708()
  }


  public override val __994239708_Ptr: JNAPointer? by lazy {
    __994239708_Interface.__994239708_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__994239708_Interface)

  private fun as_994239708(): IAutomationConnection.WithDefault {
    if(pointer == NULL) {
      return(IAutomationConnection.ABI.makeIAutomationConnection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationConnection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationConnection.ABI.makeIAutomationConnection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AutomationConnection> {
    public override fun getValue() = AutomationConnection(pointer.getPointer(0))

    public fun setValue(value: AutomationConnection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutomationConnection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AutomationConnection {
      val address = segment.toRawLongValue()
      return AutomationConnection(Pointer(address))
    }

    public override fun toNative(obj: AutomationConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
