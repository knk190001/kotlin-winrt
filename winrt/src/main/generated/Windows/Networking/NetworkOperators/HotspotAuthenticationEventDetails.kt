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

@ABIMarker(HotspotAuthenticationEventDetails.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.HotspotAuthenticationEventDetails;{e756c791-1001-4de5-83c7-de61d88831d0})")
@WinRTByReference(brClass = HotspotAuthenticationEventDetails.ByReference::class)
public class HotspotAuthenticationEventDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHotspotAuthenticationEventDetails.WithDefault, IWinRTObject {
  private val __1117761482_Interface: IHotspotAuthenticationEventDetails.WithDefault by lazy {
    as_1117761482()
  }


  public override val __1117761482_Ptr: JNAPointer? by lazy {
    __1117761482_Interface.__1117761482_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1117761482_Interface)

  private fun as_1117761482(): IHotspotAuthenticationEventDetails.WithDefault {
    if(pointer == NULL) {
      return(IHotspotAuthenticationEventDetails.ABI.makeIHotspotAuthenticationEventDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHotspotAuthenticationEventDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHotspotAuthenticationEventDetails.ABI.makeIHotspotAuthenticationEventDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HotspotAuthenticationEventDetails> {
    public override fun getValue() = HotspotAuthenticationEventDetails(pointer.getPointer(0))

    public fun setValue(value: HotspotAuthenticationEventDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HotspotAuthenticationEventDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HotspotAuthenticationEventDetails {
      val address = segment.toRawLongValue()
      return HotspotAuthenticationEventDetails(Pointer(address))
    }

    public override fun toNative(obj: HotspotAuthenticationEventDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
