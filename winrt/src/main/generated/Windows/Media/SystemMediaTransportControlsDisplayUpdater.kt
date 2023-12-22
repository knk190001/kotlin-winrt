package Windows.Media

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

@ABIMarker(SystemMediaTransportControlsDisplayUpdater.ABI::class)
@Signature("rc(Windows.Media.SystemMediaTransportControlsDisplayUpdater;{8abbc53e-fa55-4ecf-ad8e-c984e5dd1550})")
@WinRTByReference(brClass = SystemMediaTransportControlsDisplayUpdater.ByReference::class)
public class SystemMediaTransportControlsDisplayUpdater(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemMediaTransportControlsDisplayUpdater.WithDefault, IWinRTObject {
  private val __1448600033_Interface: ISystemMediaTransportControlsDisplayUpdater.WithDefault by
      lazy {
    as_1448600033()
  }


  public override val __1448600033_Ptr: JNAPointer? by lazy {
    __1448600033_Interface.__1448600033_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1448600033_Interface)

  private fun as_1448600033(): ISystemMediaTransportControlsDisplayUpdater.WithDefault {
    if(pointer == NULL) {
      return(ISystemMediaTransportControlsDisplayUpdater.ABI.makeISystemMediaTransportControlsDisplayUpdater(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemMediaTransportControlsDisplayUpdater>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemMediaTransportControlsDisplayUpdater.ABI.makeISystemMediaTransportControlsDisplayUpdater(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemMediaTransportControlsDisplayUpdater> {
    public override fun getValue() =
        SystemMediaTransportControlsDisplayUpdater(pointer.getPointer(0))

    public fun setValue(value: SystemMediaTransportControlsDisplayUpdater): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemMediaTransportControlsDisplayUpdater, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SystemMediaTransportControlsDisplayUpdater {
      val address = segment.toRawLongValue()
      return SystemMediaTransportControlsDisplayUpdater(Pointer(address))
    }

    public override fun toNative(obj: SystemMediaTransportControlsDisplayUpdater): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
