package Windows.Devices.Input

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

@ABIMarker(MouseEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Input.MouseEventArgs;{f625aa5d-2354-4cc7-9230-96941c969fde})")
@WinRTByReference(brClass = MouseEventArgs.ByReference::class)
public class MouseEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMouseEventArgs.WithDefault, IWinRTObject {
  private val __1757668205_Interface: IMouseEventArgs.WithDefault by lazy {
    as_1757668205()
  }


  public override val __1757668205_Ptr: JNAPointer? by lazy {
    __1757668205_Interface.__1757668205_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1757668205_Interface)

  private fun as_1757668205(): IMouseEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMouseEventArgs.ABI.makeIMouseEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMouseEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMouseEventArgs.ABI.makeIMouseEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MouseEventArgs>
      {
    public override fun getValue() = MouseEventArgs(pointer.getPointer(0))

    public fun setValue(value: MouseEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MouseEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MouseEventArgs {
      val address = segment.toRawLongValue()
      return MouseEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MouseEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
