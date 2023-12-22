package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(OperationCompletedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.OperationCompletedEventArgs;{e7af329d-051d-4fab-b1a9-47fd77f70a41})")
@WinRTByReference(brClass = OperationCompletedEventArgs.ByReference::class)
public class OperationCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IOperationCompletedEventArgs.WithDefault,
    IOperationCompletedEventArgs2.WithDefault, IWinRTObject {
  private val __1889688393_Interface: IOperationCompletedEventArgs.WithDefault by lazy {
    as_1889688393()
  }


  private val __1549201911_Interface: IOperationCompletedEventArgs2.WithDefault by lazy {
    as_1549201911()
  }


  public override val __1889688393_Ptr: JNAPointer? by lazy {
    __1889688393_Interface.__1889688393_Ptr
  }


  public override val __1549201911_Ptr: JNAPointer? by lazy {
    __1549201911_Interface.__1549201911_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1889688393_Interface, __1549201911_Interface)

  private fun as_1889688393(): IOperationCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IOperationCompletedEventArgs.ABI.makeIOperationCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOperationCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOperationCompletedEventArgs.ABI.makeIOperationCompletedEventArgs(ref.value))
  }

  private fun as_1549201911(): IOperationCompletedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IOperationCompletedEventArgs2.ABI.makeIOperationCompletedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOperationCompletedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOperationCompletedEventArgs2.ABI.makeIOperationCompletedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<OperationCompletedEventArgs> {
    public override fun getValue() = OperationCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: OperationCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OperationCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): OperationCompletedEventArgs {
      val address = segment.toRawLongValue()
      return OperationCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: OperationCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
