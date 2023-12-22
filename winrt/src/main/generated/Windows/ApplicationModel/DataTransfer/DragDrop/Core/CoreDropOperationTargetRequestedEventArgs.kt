package Windows.ApplicationModel.DataTransfer.DragDrop.Core

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

@ABIMarker(CoreDropOperationTargetRequestedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.DragDrop.Core.CoreDropOperationTargetRequestedEventArgs;{2aca929a-5e28-4ea6-829e-29134e665d6d})")
@WinRTByReference(brClass = CoreDropOperationTargetRequestedEventArgs.ByReference::class)
public class CoreDropOperationTargetRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreDropOperationTargetRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1413307035_Interface: ICoreDropOperationTargetRequestedEventArgs.WithDefault by
      lazy {
    as_1413307035()
  }


  public override val __1413307035_Ptr: JNAPointer? by lazy {
    __1413307035_Interface.__1413307035_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1413307035_Interface)

  private fun as_1413307035(): ICoreDropOperationTargetRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreDropOperationTargetRequestedEventArgs.ABI.makeICoreDropOperationTargetRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreDropOperationTargetRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreDropOperationTargetRequestedEventArgs.ABI.makeICoreDropOperationTargetRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreDropOperationTargetRequestedEventArgs> {
    public override fun getValue() =
        CoreDropOperationTargetRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreDropOperationTargetRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreDropOperationTargetRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreDropOperationTargetRequestedEventArgs {
      val address = segment.toRawLongValue()
      return CoreDropOperationTargetRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreDropOperationTargetRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
