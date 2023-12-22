package Windows.Media.Control

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

@ABIMarker(GlobalSystemMediaTransportControlsSessionTimelineProperties.ABI::class)
@Signature("rc(Windows.Media.Control.GlobalSystemMediaTransportControlsSessionTimelineProperties;{ede34136-6f25-588d-8ecf-ea5b6735aaa5})")
@WinRTByReference(brClass =
    GlobalSystemMediaTransportControlsSessionTimelineProperties.ByReference::class)
public class GlobalSystemMediaTransportControlsSessionTimelineProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGlobalSystemMediaTransportControlsSessionTimelineProperties.WithDefault,
    IWinRTObject {
  private val __1475411716_Interface:
      IGlobalSystemMediaTransportControlsSessionTimelineProperties.WithDefault by lazy {
    as_1475411716()
  }


  public override val __1475411716_Ptr: JNAPointer? by lazy {
    __1475411716_Interface.__1475411716_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1475411716_Interface)

  private fun as_1475411716():
      IGlobalSystemMediaTransportControlsSessionTimelineProperties.WithDefault {
    if(pointer == NULL) {
      return(IGlobalSystemMediaTransportControlsSessionTimelineProperties.ABI.makeIGlobalSystemMediaTransportControlsSessionTimelineProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGlobalSystemMediaTransportControlsSessionTimelineProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGlobalSystemMediaTransportControlsSessionTimelineProperties.ABI.makeIGlobalSystemMediaTransportControlsSessionTimelineProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GlobalSystemMediaTransportControlsSessionTimelineProperties> {
    public override fun getValue() =
        GlobalSystemMediaTransportControlsSessionTimelineProperties(pointer.getPointer(0))

    public fun setValue(value: GlobalSystemMediaTransportControlsSessionTimelineProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GlobalSystemMediaTransportControlsSessionTimelineProperties,
      MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        GlobalSystemMediaTransportControlsSessionTimelineProperties {
      val address = segment.toRawLongValue()
      return GlobalSystemMediaTransportControlsSessionTimelineProperties(Pointer(address))
    }

    public override fun toNative(obj: GlobalSystemMediaTransportControlsSessionTimelineProperties):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
