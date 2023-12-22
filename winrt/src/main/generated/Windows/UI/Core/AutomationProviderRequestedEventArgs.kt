package Windows.UI.Core

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

@ABIMarker(AutomationProviderRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Core.AutomationProviderRequestedEventArgs;{961ff258-21bf-4b42-a298-fa479d4c52e2})")
@WinRTByReference(brClass = AutomationProviderRequestedEventArgs.ByReference::class)
public class AutomationProviderRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAutomationProviderRequestedEventArgs.WithDefault,
    ICoreWindowEventArgs.WithDefault, IWinRTObject {
  private val __38662292_Interface: IAutomationProviderRequestedEventArgs.WithDefault by lazy {
    as_38662292()
  }


  private val __407060269_Interface: ICoreWindowEventArgs.WithDefault by lazy {
    as_407060269()
  }


  public override val __38662292_Ptr: JNAPointer? by lazy {
    __38662292_Interface.__38662292_Ptr
  }


  public override val __407060269_Ptr: JNAPointer? by lazy {
    __407060269_Interface.__407060269_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__38662292_Interface, __407060269_Interface)

  private fun as_38662292(): IAutomationProviderRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAutomationProviderRequestedEventArgs.ABI.makeIAutomationProviderRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationProviderRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationProviderRequestedEventArgs.ABI.makeIAutomationProviderRequestedEventArgs(ref.value))
  }

  private fun as_407060269(): ICoreWindowEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWindowEventArgs.ABI.makeICoreWindowEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWindowEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWindowEventArgs.ABI.makeICoreWindowEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AutomationProviderRequestedEventArgs> {
    public override fun getValue() = AutomationProviderRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AutomationProviderRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutomationProviderRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AutomationProviderRequestedEventArgs {
      val address = segment.toRawLongValue()
      return AutomationProviderRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AutomationProviderRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
