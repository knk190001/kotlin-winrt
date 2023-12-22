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

@ABIMarker(NonClientPointerEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Input.NonClientPointerEventArgs;{a5b44aec-b797-505a-a129-ae4e5271c73c})")
@WinRTByReference(brClass = NonClientPointerEventArgs.ByReference::class)
public class NonClientPointerEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INonClientPointerEventArgs.WithDefault, IWinRTObject {
  private val __449565337_Interface: INonClientPointerEventArgs.WithDefault by lazy {
    as_449565337()
  }


  public override val __449565337_Ptr: JNAPointer? by lazy {
    __449565337_Interface.__449565337_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__449565337_Interface)

  private fun as_449565337(): INonClientPointerEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INonClientPointerEventArgs.ABI.makeINonClientPointerEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INonClientPointerEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INonClientPointerEventArgs.ABI.makeINonClientPointerEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NonClientPointerEventArgs> {
    public override fun getValue() = NonClientPointerEventArgs(pointer.getPointer(0))

    public fun setValue(value: NonClientPointerEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NonClientPointerEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NonClientPointerEventArgs {
      val address = segment.toRawLongValue()
      return NonClientPointerEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NonClientPointerEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
