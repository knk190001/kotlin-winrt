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

@ABIMarker(OnlineIdSystemIdentity.ABI::class)
@Signature("rc(Windows.Security.Authentication.OnlineId.OnlineIdSystemIdentity;{743cd20d-b6ca-434d-8124-53ea12685307})")
@WinRTByReference(brClass = OnlineIdSystemIdentity.ByReference::class)
public class OnlineIdSystemIdentity(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IOnlineIdSystemIdentity.WithDefault, IWinRTObject {
  private val __1148600861_Interface: IOnlineIdSystemIdentity.WithDefault by lazy {
    as_1148600861()
  }


  public override val __1148600861_Ptr: JNAPointer? by lazy {
    __1148600861_Interface.__1148600861_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1148600861_Interface)

  private fun as_1148600861(): IOnlineIdSystemIdentity.WithDefault {
    if(pointer == NULL) {
      return(IOnlineIdSystemIdentity.ABI.makeIOnlineIdSystemIdentity(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOnlineIdSystemIdentity>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOnlineIdSystemIdentity.ABI.makeIOnlineIdSystemIdentity(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<OnlineIdSystemIdentity> {
    public override fun getValue() = OnlineIdSystemIdentity(pointer.getPointer(0))

    public fun setValue(value: OnlineIdSystemIdentity): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OnlineIdSystemIdentity, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): OnlineIdSystemIdentity {
      val address = segment.toRawLongValue()
      return OnlineIdSystemIdentity(Pointer(address))
    }

    public override fun toNative(obj: OnlineIdSystemIdentity): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
