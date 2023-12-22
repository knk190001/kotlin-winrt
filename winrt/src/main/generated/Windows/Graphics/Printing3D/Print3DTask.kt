package Windows.Graphics.Printing3D

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

@ABIMarker(Print3DTask.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Print3DTask;{8ce3d080-2118-4c28-80de-f426d70191ae})")
@WinRTByReference(brClass = Print3DTask.ByReference::class)
public class Print3DTask(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrint3DTask.WithDefault, IWinRTObject {
  private val __889142792_Interface: IPrint3DTask.WithDefault by lazy {
    as_889142792()
  }


  public override val __889142792_Ptr: JNAPointer? by lazy {
    __889142792_Interface.__889142792_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__889142792_Interface)

  private fun as_889142792(): IPrint3DTask.WithDefault {
    if(pointer == NULL) {
      return(IPrint3DTask.ABI.makeIPrint3DTask(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrint3DTask>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrint3DTask.ABI.makeIPrint3DTask(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Print3DTask> {
    public override fun getValue() = Print3DTask(pointer.getPointer(0))

    public fun setValue(value: Print3DTask): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Print3DTask, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Print3DTask {
      val address = segment.toRawLongValue()
      return Print3DTask(Pointer(address))
    }

    public override fun toNative(obj: Print3DTask): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
