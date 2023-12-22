package Microsoft.UI.Input.Experimental

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

@ABIMarker(ExpInputSite.ABI::class)
@Signature("rc(Microsoft.UI.Input.Experimental.ExpInputSite;{6b707b95-bbe8-5131-a6d7-b11c26cb7cb6})")
@WinRTByReference(brClass = ExpInputSite.ByReference::class)
public class ExpInputSite(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IExpInputSite.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1760906249_Interface: IExpInputSite.WithDefault by lazy {
    as_1760906249()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1760906249_Ptr: JNAPointer? by lazy {
    __1760906249_Interface.__1760906249_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1760906249_Interface, __1260617006_Interface)

  private fun as_1760906249(): IExpInputSite.WithDefault {
    if(pointer == NULL) {
      return(IExpInputSite.ABI.makeIExpInputSite(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpInputSite>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpInputSite.ABI.makeIExpInputSite(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ExpInputSite> {
    public override fun getValue() = ExpInputSite(pointer.getPointer(0))

    public fun setValue(value: ExpInputSite): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExpInputSite, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ExpInputSite {
      val address = segment.toRawLongValue()
      return ExpInputSite(Pointer(address))
    }

    public override fun toNative(obj: ExpInputSite): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
