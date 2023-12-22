package Windows.Media.Protection.PlayReady

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

@ABIMarker(PlayReadyDomain.ABI::class)
@Signature("rc(Windows.Media.Protection.PlayReady.PlayReadyDomain;{adcc93ac-97e6-43ef-95e4-d7868f3b16a9})")
@WinRTByReference(brClass = PlayReadyDomain.ByReference::class)
public class PlayReadyDomain(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlayReadyDomain.WithDefault, IWinRTObject {
  private val __66638023_Interface: IPlayReadyDomain.WithDefault by lazy {
    as_66638023()
  }


  public override val __66638023_Ptr: JNAPointer? by lazy {
    __66638023_Interface.__66638023_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__66638023_Interface)

  private fun as_66638023(): IPlayReadyDomain.WithDefault {
    if(pointer == NULL) {
      return(IPlayReadyDomain.ABI.makeIPlayReadyDomain(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayReadyDomain>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayReadyDomain.ABI.makeIPlayReadyDomain(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlayReadyDomain> {
    public override fun getValue() = PlayReadyDomain(pointer.getPointer(0))

    public fun setValue(value: PlayReadyDomain): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayReadyDomain, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PlayReadyDomain {
      val address = segment.toRawLongValue()
      return PlayReadyDomain(Pointer(address))
    }

    public override fun toNative(obj: PlayReadyDomain): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
