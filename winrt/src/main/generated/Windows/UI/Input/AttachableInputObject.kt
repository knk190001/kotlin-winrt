package Windows.UI.Input

import Windows.Foundation.IClosable
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

@ABIMarker(AttachableInputObject.ABI::class)
@Signature("rc(Windows.UI.Input.AttachableInputObject;{9b822734-a3c1-542a-b2f4-0e32b773fb07})")
@WinRTByReference(brClass = AttachableInputObject.ByReference::class)
public open class AttachableInputObject(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAttachableInputObject.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1220166404_Interface: IAttachableInputObject.WithDefault by lazy {
    as_1220166404()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1220166404_Ptr: JNAPointer? by lazy {
    __1220166404_Interface.__1220166404_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1220166404_Interface, __1260617006_Interface)

  private fun as_1220166404(): IAttachableInputObject.WithDefault {
    if(pointer == NULL) {
      return(IAttachableInputObject.ABI.makeIAttachableInputObject(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAttachableInputObject>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAttachableInputObject.ABI.makeIAttachableInputObject(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AttachableInputObject> {
    public override fun getValue() = AttachableInputObject(pointer.getPointer(0))

    public fun setValue(value: AttachableInputObject): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AttachableInputObject, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AttachableInputObject {
      val address = segment.toRawLongValue()
      return AttachableInputObject(Pointer(address))
    }

    public override fun toNative(obj: AttachableInputObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
