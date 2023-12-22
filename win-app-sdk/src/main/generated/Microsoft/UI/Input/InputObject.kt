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

@ABIMarker(InputObject.ABI::class)
@Signature("rc(Microsoft.UI.Input.InputObject;{42edbc88-d386-544d-b1b8-68617fe68282})")
@WinRTByReference(brClass = InputObject.ByReference::class)
public open class InputObject(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInputObject.WithDefault, IWinRTObject {
  private val __294184816_Interface: IInputObject.WithDefault by lazy {
    as_294184816()
  }


  public override val __294184816_Ptr: JNAPointer? by lazy {
    __294184816_Interface.__294184816_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__294184816_Interface)

  private fun as_294184816(): IInputObject.WithDefault {
    if(pointer == NULL) {
      return(IInputObject.ABI.makeIInputObject(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputObject>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputObject.ABI.makeIInputObject(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InputObject> {
    public override fun getValue() = InputObject(pointer.getPointer(0))

    public fun setValue(value: InputObject): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputObject, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InputObject {
      val address = segment.toRawLongValue()
      return InputObject(Pointer(address))
    }

    public override fun toNative(obj: InputObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
