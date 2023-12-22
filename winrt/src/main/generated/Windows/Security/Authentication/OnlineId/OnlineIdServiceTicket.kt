package Windows.Security.Authentication.OnlineId

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

@ABIMarker(OnlineIdServiceTicket.ABI::class)
@Signature("rc(Windows.Security.Authentication.OnlineId.OnlineIdServiceTicket;{c95c547f-d781-4a94-acb8-c59874238c26})")
@WinRTByReference(brClass = OnlineIdServiceTicket.ByReference::class)
public class OnlineIdServiceTicket(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IOnlineIdServiceTicket.WithDefault, IWinRTObject {
  private val __1293638027_Interface: IOnlineIdServiceTicket.WithDefault by lazy {
    as_1293638027()
  }


  public override val __1293638027_Ptr: JNAPointer? by lazy {
    __1293638027_Interface.__1293638027_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1293638027_Interface)

  private fun as_1293638027(): IOnlineIdServiceTicket.WithDefault {
    if(pointer == NULL) {
      return(IOnlineIdServiceTicket.ABI.makeIOnlineIdServiceTicket(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOnlineIdServiceTicket>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOnlineIdServiceTicket.ABI.makeIOnlineIdServiceTicket(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<OnlineIdServiceTicket> {
    public override fun getValue() = OnlineIdServiceTicket(pointer.getPointer(0))

    public fun setValue(value: OnlineIdServiceTicket): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OnlineIdServiceTicket, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): OnlineIdServiceTicket {
      val address = segment.toRawLongValue()
      return OnlineIdServiceTicket(Pointer(address))
    }

    public override fun toNative(obj: OnlineIdServiceTicket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
