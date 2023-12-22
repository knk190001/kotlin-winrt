package Windows.Devices.Display.Core

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

@ABIMarker(DisplayTask.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayTask;{5e087448-135b-5bb0-bf63-637f84227c7a})")
@WinRTByReference(brClass = DisplayTask.ByReference::class)
public class DisplayTask(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayTask.WithDefault, IDisplayTask2.WithDefault, IWinRTObject {
  private val __619954011_Interface: IDisplayTask.WithDefault by lazy {
    as_619954011()
  }


  private val __2038705107_Interface: IDisplayTask2.WithDefault by lazy {
    as_2038705107()
  }


  public override val __619954011_Ptr: JNAPointer? by lazy {
    __619954011_Interface.__619954011_Ptr
  }


  public override val __2038705107_Ptr: JNAPointer? by lazy {
    __2038705107_Interface.__2038705107_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__619954011_Interface, __2038705107_Interface)

  private fun as_619954011(): IDisplayTask.WithDefault {
    if(pointer == NULL) {
      return(IDisplayTask.ABI.makeIDisplayTask(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayTask>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayTask.ABI.makeIDisplayTask(ref.value))
  }

  private fun as_2038705107(): IDisplayTask2.WithDefault {
    if(pointer == NULL) {
      return(IDisplayTask2.ABI.makeIDisplayTask2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayTask2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayTask2.ABI.makeIDisplayTask2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DisplayTask> {
    public override fun getValue() = DisplayTask(pointer.getPointer(0))

    public fun setValue(value: DisplayTask): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayTask, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayTask {
      val address = segment.toRawLongValue()
      return DisplayTask(Pointer(address))
    }

    public override fun toNative(obj: DisplayTask): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
