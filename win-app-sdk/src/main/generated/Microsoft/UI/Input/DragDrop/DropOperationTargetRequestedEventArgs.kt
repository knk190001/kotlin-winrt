package Microsoft.UI.Input.DragDrop

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

@ABIMarker(DropOperationTargetRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Input.DragDrop.DropOperationTargetRequestedEventArgs;{f61c5b62-720e-59ff-ad0b-e77fc5b8a4a3})")
@WinRTByReference(brClass = DropOperationTargetRequestedEventArgs.ByReference::class)
public class DropOperationTargetRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDropOperationTargetRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1410600022_Interface: IDropOperationTargetRequestedEventArgs.WithDefault by lazy {
    as_1410600022()
  }


  public override val __1410600022_Ptr: JNAPointer? by lazy {
    __1410600022_Interface.__1410600022_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1410600022_Interface)

  private fun as_1410600022(): IDropOperationTargetRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDropOperationTargetRequestedEventArgs.ABI.makeIDropOperationTargetRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDropOperationTargetRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDropOperationTargetRequestedEventArgs.ABI.makeIDropOperationTargetRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DropOperationTargetRequestedEventArgs> {
    public override fun getValue() = DropOperationTargetRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DropOperationTargetRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DropOperationTargetRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DropOperationTargetRequestedEventArgs {
      val address = segment.toRawLongValue()
      return DropOperationTargetRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DropOperationTargetRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
