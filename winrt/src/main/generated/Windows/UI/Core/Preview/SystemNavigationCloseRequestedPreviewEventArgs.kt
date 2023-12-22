package Windows.UI.Core.Preview

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

@ABIMarker(SystemNavigationCloseRequestedPreviewEventArgs.ABI::class)
@Signature("rc(Windows.UI.Core.Preview.SystemNavigationCloseRequestedPreviewEventArgs;{83d00de1-cbe5-4f31-8414-361da046518f})")
@WinRTByReference(brClass = SystemNavigationCloseRequestedPreviewEventArgs.ByReference::class)
public class SystemNavigationCloseRequestedPreviewEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemNavigationCloseRequestedPreviewEventArgs.WithDefault, IWinRTObject {
  private val __1413736887_Interface: ISystemNavigationCloseRequestedPreviewEventArgs.WithDefault by
      lazy {
    as_1413736887()
  }


  public override val __1413736887_Ptr: JNAPointer? by lazy {
    __1413736887_Interface.__1413736887_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1413736887_Interface)

  private fun as_1413736887(): ISystemNavigationCloseRequestedPreviewEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISystemNavigationCloseRequestedPreviewEventArgs.ABI.makeISystemNavigationCloseRequestedPreviewEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemNavigationCloseRequestedPreviewEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemNavigationCloseRequestedPreviewEventArgs.ABI.makeISystemNavigationCloseRequestedPreviewEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemNavigationCloseRequestedPreviewEventArgs> {
    public override fun getValue() =
        SystemNavigationCloseRequestedPreviewEventArgs(pointer.getPointer(0))

    public fun setValue(value: SystemNavigationCloseRequestedPreviewEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemNavigationCloseRequestedPreviewEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SystemNavigationCloseRequestedPreviewEventArgs {
      val address = segment.toRawLongValue()
      return SystemNavigationCloseRequestedPreviewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SystemNavigationCloseRequestedPreviewEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
