package Windows.Management

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

@ABIMarker(MdmSession.ABI::class)
@Signature("rc(Windows.Management.MdmSession;{fe89314c-8f64-4797-a9d7-9d88f86ae166})")
@WinRTByReference(brClass = MdmSession.ByReference::class)
public class MdmSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMdmSession.WithDefault, IWinRTObject {
  private val __1098332059_Interface: IMdmSession.WithDefault by lazy {
    as_1098332059()
  }


  public override val __1098332059_Ptr: JNAPointer? by lazy {
    __1098332059_Interface.__1098332059_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1098332059_Interface)

  private fun as_1098332059(): IMdmSession.WithDefault {
    if(pointer == NULL) {
      return(IMdmSession.ABI.makeIMdmSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMdmSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMdmSession.ABI.makeIMdmSession(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MdmSession> {
    public override fun getValue() = MdmSession(pointer.getPointer(0))

    public fun setValue(value: MdmSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MdmSession, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MdmSession {
      val address = segment.toRawLongValue()
      return MdmSession(Pointer(address))
    }

    public override fun toNative(obj: MdmSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
