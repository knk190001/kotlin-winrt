package Windows.Networking.NetworkOperators

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

@ABIMarker(UssdReply.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.UssdReply;{2f9acf82-2005-4d5d-bf81-2aba1b4be4a8})")
@WinRTByReference(brClass = UssdReply.ByReference::class)
public class UssdReply(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUssdReply.WithDefault, IWinRTObject {
  private val __840857826_Interface: IUssdReply.WithDefault by lazy {
    as_840857826()
  }


  public override val __840857826_Ptr: JNAPointer? by lazy {
    __840857826_Interface.__840857826_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__840857826_Interface)

  private fun as_840857826(): IUssdReply.WithDefault {
    if(pointer == NULL) {
      return(IUssdReply.ABI.makeIUssdReply(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUssdReply>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUssdReply.ABI.makeIUssdReply(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UssdReply> {
    public override fun getValue() = UssdReply(pointer.getPointer(0))

    public fun setValue(value: UssdReply): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UssdReply, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UssdReply {
      val address = segment.toRawLongValue()
      return UssdReply(Pointer(address))
    }

    public override fun toNative(obj: UssdReply): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
