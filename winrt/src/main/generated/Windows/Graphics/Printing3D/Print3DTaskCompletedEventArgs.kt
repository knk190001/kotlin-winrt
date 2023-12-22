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

@ABIMarker(Print3DTaskCompletedEventArgs.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Print3DTaskCompletedEventArgs;{cc1914af-2614-4f1d-accc-d6fc4fda5455})")
@WinRTByReference(brClass = Print3DTaskCompletedEventArgs.ByReference::class)
public class Print3DTaskCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrint3DTaskCompletedEventArgs.WithDefault, IWinRTObject {
  private val __111532196_Interface: IPrint3DTaskCompletedEventArgs.WithDefault by lazy {
    as_111532196()
  }


  public override val __111532196_Ptr: JNAPointer? by lazy {
    __111532196_Interface.__111532196_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__111532196_Interface)

  private fun as_111532196(): IPrint3DTaskCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrint3DTaskCompletedEventArgs.ABI.makeIPrint3DTaskCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrint3DTaskCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrint3DTaskCompletedEventArgs.ABI.makeIPrint3DTaskCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Print3DTaskCompletedEventArgs> {
    public override fun getValue() = Print3DTaskCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: Print3DTaskCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Print3DTaskCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Print3DTaskCompletedEventArgs {
      val address = segment.toRawLongValue()
      return Print3DTaskCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: Print3DTaskCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
