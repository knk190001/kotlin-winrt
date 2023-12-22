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

@ABIMarker(Print3DTaskSourceRequestedArgs.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Print3DTaskSourceRequestedArgs;{c77c9aba-24af-424d-a3bf-92250c355602})")
@WinRTByReference(brClass = Print3DTaskSourceRequestedArgs.ByReference::class)
public class Print3DTaskSourceRequestedArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrint3DTaskSourceRequestedArgs.WithDefault, IWinRTObject {
  private val __1943770104_Interface: IPrint3DTaskSourceRequestedArgs.WithDefault by lazy {
    as_1943770104()
  }


  public override val __1943770104_Ptr: JNAPointer? by lazy {
    __1943770104_Interface.__1943770104_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1943770104_Interface)

  private fun as_1943770104(): IPrint3DTaskSourceRequestedArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrint3DTaskSourceRequestedArgs.ABI.makeIPrint3DTaskSourceRequestedArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrint3DTaskSourceRequestedArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrint3DTaskSourceRequestedArgs.ABI.makeIPrint3DTaskSourceRequestedArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Print3DTaskSourceRequestedArgs> {
    public override fun getValue() = Print3DTaskSourceRequestedArgs(pointer.getPointer(0))

    public fun setValue(value: Print3DTaskSourceRequestedArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Print3DTaskSourceRequestedArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Print3DTaskSourceRequestedArgs {
      val address = segment.toRawLongValue()
      return Print3DTaskSourceRequestedArgs(Pointer(address))
    }

    public override fun toNative(obj: Print3DTaskSourceRequestedArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
