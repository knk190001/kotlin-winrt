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

@ABIMarker(Print3DTaskRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Print3DTaskRequestedEventArgs;{150cb77f-18c5-40d7-9f40-fab3096e05a9})")
@WinRTByReference(brClass = Print3DTaskRequestedEventArgs.ByReference::class)
public class Print3DTaskRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrint3DTaskRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1975922975_Interface: IPrint3DTaskRequestedEventArgs.WithDefault by lazy {
    as_1975922975()
  }


  public override val __1975922975_Ptr: JNAPointer? by lazy {
    __1975922975_Interface.__1975922975_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1975922975_Interface)

  private fun as_1975922975(): IPrint3DTaskRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrint3DTaskRequestedEventArgs.ABI.makeIPrint3DTaskRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrint3DTaskRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrint3DTaskRequestedEventArgs.ABI.makeIPrint3DTaskRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Print3DTaskRequestedEventArgs> {
    public override fun getValue() = Print3DTaskRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: Print3DTaskRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Print3DTaskRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Print3DTaskRequestedEventArgs {
      val address = segment.toRawLongValue()
      return Print3DTaskRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: Print3DTaskRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
