package Windows.ApplicationModel.SocialInfo.Provider

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

@ABIMarker(SocialDashboardItemUpdater.ABI::class)
@Signature("rc(Windows.ApplicationModel.SocialInfo.Provider.SocialDashboardItemUpdater;{3cde9dc9-4800-46cd-869b-1973ec685bde})")
@WinRTByReference(brClass = SocialDashboardItemUpdater.ByReference::class)
public class SocialDashboardItemUpdater(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISocialDashboardItemUpdater.WithDefault, IWinRTObject {
  private val __985636578_Interface: ISocialDashboardItemUpdater.WithDefault by lazy {
    as_985636578()
  }


  public override val __985636578_Ptr: JNAPointer? by lazy {
    __985636578_Interface.__985636578_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__985636578_Interface)

  private fun as_985636578(): ISocialDashboardItemUpdater.WithDefault {
    if(pointer == NULL) {
      return(ISocialDashboardItemUpdater.ABI.makeISocialDashboardItemUpdater(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISocialDashboardItemUpdater>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISocialDashboardItemUpdater.ABI.makeISocialDashboardItemUpdater(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SocialDashboardItemUpdater> {
    public override fun getValue() = SocialDashboardItemUpdater(pointer.getPointer(0))

    public fun setValue(value: SocialDashboardItemUpdater): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SocialDashboardItemUpdater, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SocialDashboardItemUpdater {
      val address = segment.toRawLongValue()
      return SocialDashboardItemUpdater(Pointer(address))
    }

    public override fun toNative(obj: SocialDashboardItemUpdater): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
