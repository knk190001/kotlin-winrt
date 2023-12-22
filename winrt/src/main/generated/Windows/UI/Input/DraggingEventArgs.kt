package Windows.UI.Input

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

@ABIMarker(DraggingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.DraggingEventArgs;{1c905384-083c-4bd3-b559-179cddeb33ec})")
@WinRTByReference(brClass = DraggingEventArgs.ByReference::class)
public class DraggingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDraggingEventArgs.WithDefault, IDraggingEventArgs2.WithDefault, IWinRTObject
    {
  private val __535982342_Interface: IDraggingEventArgs.WithDefault by lazy {
    as_535982342()
  }


  private val __564416632_Interface: IDraggingEventArgs2.WithDefault by lazy {
    as_564416632()
  }


  public override val __535982342_Ptr: JNAPointer? by lazy {
    __535982342_Interface.__535982342_Ptr
  }


  public override val __564416632_Ptr: JNAPointer? by lazy {
    __564416632_Interface.__564416632_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__535982342_Interface, __564416632_Interface)

  private fun as_535982342(): IDraggingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDraggingEventArgs.ABI.makeIDraggingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDraggingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDraggingEventArgs.ABI.makeIDraggingEventArgs(ref.value))
  }

  private fun as_564416632(): IDraggingEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IDraggingEventArgs2.ABI.makeIDraggingEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDraggingEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDraggingEventArgs2.ABI.makeIDraggingEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DraggingEventArgs> {
    public override fun getValue() = DraggingEventArgs(pointer.getPointer(0))

    public fun setValue(value: DraggingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DraggingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DraggingEventArgs {
      val address = segment.toRawLongValue()
      return DraggingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DraggingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
