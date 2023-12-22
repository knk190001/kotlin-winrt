package Windows.Devices.AllJoyn

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

@ABIMarker(AllJoynCredentials.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynCredentials;{824650f2-a190-40b1-abab-349ec244dfaa})")
@WinRTByReference(brClass = AllJoynCredentials.ByReference::class)
public class AllJoynCredentials(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynCredentials.WithDefault, IWinRTObject {
  private val __1782206187_Interface: IAllJoynCredentials.WithDefault by lazy {
    as_1782206187()
  }


  public override val __1782206187_Ptr: JNAPointer? by lazy {
    __1782206187_Interface.__1782206187_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1782206187_Interface)

  private fun as_1782206187(): IAllJoynCredentials.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynCredentials.ABI.makeIAllJoynCredentials(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynCredentials>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynCredentials.ABI.makeIAllJoynCredentials(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynCredentials> {
    public override fun getValue() = AllJoynCredentials(pointer.getPointer(0))

    public fun setValue(value: AllJoynCredentials): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynCredentials, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AllJoynCredentials {
      val address = segment.toRawLongValue()
      return AllJoynCredentials(Pointer(address))
    }

    public override fun toNative(obj: AllJoynCredentials): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
