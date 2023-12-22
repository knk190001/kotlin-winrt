package Windows.Devices.Perception

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

@ABIMarker(PerceptionVideoProfile.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionVideoProfile;{75763ea3-011a-470e-8225-6f05ade25648})")
@WinRTByReference(brClass = PerceptionVideoProfile.ByReference::class)
public class PerceptionVideoProfile(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionVideoProfile.WithDefault, IWinRTObject {
  private val __460244091_Interface: IPerceptionVideoProfile.WithDefault by lazy {
    as_460244091()
  }


  public override val __460244091_Ptr: JNAPointer? by lazy {
    __460244091_Interface.__460244091_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__460244091_Interface)

  private fun as_460244091(): IPerceptionVideoProfile.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionVideoProfile.ABI.makeIPerceptionVideoProfile(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionVideoProfile>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionVideoProfile.ABI.makeIPerceptionVideoProfile(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionVideoProfile> {
    public override fun getValue() = PerceptionVideoProfile(pointer.getPointer(0))

    public fun setValue(value: PerceptionVideoProfile): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionVideoProfile, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PerceptionVideoProfile {
      val address = segment.toRawLongValue()
      return PerceptionVideoProfile(Pointer(address))
    }

    public override fun toNative(obj: PerceptionVideoProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
