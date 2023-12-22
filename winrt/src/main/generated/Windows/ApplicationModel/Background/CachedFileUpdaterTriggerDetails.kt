package Windows.ApplicationModel.Background

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

@ABIMarker(CachedFileUpdaterTriggerDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.CachedFileUpdaterTriggerDetails;{71838c13-1314-47b4-9597-dc7e248c17cc})")
@WinRTByReference(brClass = CachedFileUpdaterTriggerDetails.ByReference::class)
public class CachedFileUpdaterTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICachedFileUpdaterTriggerDetails.WithDefault, IWinRTObject {
  private val __1470419812_Interface: ICachedFileUpdaterTriggerDetails.WithDefault by lazy {
    as_1470419812()
  }


  public override val __1470419812_Ptr: JNAPointer? by lazy {
    __1470419812_Interface.__1470419812_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1470419812_Interface)

  private fun as_1470419812(): ICachedFileUpdaterTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(ICachedFileUpdaterTriggerDetails.ABI.makeICachedFileUpdaterTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICachedFileUpdaterTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICachedFileUpdaterTriggerDetails.ABI.makeICachedFileUpdaterTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CachedFileUpdaterTriggerDetails> {
    public override fun getValue() = CachedFileUpdaterTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: CachedFileUpdaterTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CachedFileUpdaterTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CachedFileUpdaterTriggerDetails {
      val address = segment.toRawLongValue()
      return CachedFileUpdaterTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: CachedFileUpdaterTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
