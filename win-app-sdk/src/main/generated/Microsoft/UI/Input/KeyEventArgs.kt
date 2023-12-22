package Microsoft.UI.Input

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

@ABIMarker(KeyEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Input.KeyEventArgs;{40d5bb74-977e-5194-8039-9f6c44427bbb})")
@WinRTByReference(brClass = KeyEventArgs.ByReference::class)
public class KeyEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IKeyEventArgs.WithDefault, IWinRTObject {
  private val __301497615_Interface: IKeyEventArgs.WithDefault by lazy {
    as_301497615()
  }


  public override val __301497615_Ptr: JNAPointer? by lazy {
    __301497615_Interface.__301497615_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__301497615_Interface)

  private fun as_301497615(): IKeyEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IKeyEventArgs.ABI.makeIKeyEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyEventArgs.ABI.makeIKeyEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<KeyEventArgs> {
    public override fun getValue() = KeyEventArgs(pointer.getPointer(0))

    public fun setValue(value: KeyEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): KeyEventArgs {
      val address = segment.toRawLongValue()
      return KeyEventArgs(Pointer(address))
    }

    public override fun toNative(obj: KeyEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
