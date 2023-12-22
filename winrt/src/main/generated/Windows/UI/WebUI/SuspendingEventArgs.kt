package Windows.UI.WebUI

import Windows.ApplicationModel.ISuspendingEventArgs
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

@ABIMarker(SuspendingEventArgs.ABI::class)
@Signature("rc(Windows.UI.WebUI.SuspendingEventArgs;{96061c05-2dba-4d08-b0bd-2b30a131c6aa})")
@WinRTByReference(brClass = SuspendingEventArgs.ByReference::class)
public class SuspendingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISuspendingEventArgs.WithDefault, IWinRTObject {
  private val __75596276_Interface: ISuspendingEventArgs.WithDefault by lazy {
    as_75596276()
  }


  public override val __75596276_Ptr: JNAPointer? by lazy {
    __75596276_Interface.__75596276_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__75596276_Interface)

  private fun as_75596276(): ISuspendingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISuspendingEventArgs.ABI.makeISuspendingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISuspendingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISuspendingEventArgs.ABI.makeISuspendingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SuspendingEventArgs> {
    public override fun getValue() = SuspendingEventArgs(pointer.getPointer(0))

    public fun setValue(value: SuspendingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SuspendingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SuspendingEventArgs {
      val address = segment.toRawLongValue()
      return SuspendingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SuspendingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
