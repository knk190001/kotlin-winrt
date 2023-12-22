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

@ABIMarker(GlobalSystemMediaTransportControlsSessionPlaybackControls.ABI::class)
@Signature("rc(Windows.Media.Control.GlobalSystemMediaTransportControlsSessionPlaybackControls;{6501a3e6-bc7a-503a-bb1b-68f158f3fb03})")
@WinRTByReference(brClass =
    GlobalSystemMediaTransportControlsSessionPlaybackControls.ByReference::class)
public class GlobalSystemMediaTransportControlsSessionPlaybackControls(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGlobalSystemMediaTransportControlsSessionPlaybackControls.WithDefault,
    IWinRTObject {
  private val __2065801369_Interface:
      IGlobalSystemMediaTransportControlsSessionPlaybackControls.WithDefault by lazy {
    as_2065801369()
  }


  public override val __2065801369_Ptr: JNAPointer? by lazy {
    __2065801369_Interface.__2065801369_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2065801369_Interface)

  private fun as_2065801369():
      IGlobalSystemMediaTransportControlsSessionPlaybackControls.WithDefault {
    if(pointer == NULL) {
      return(IGlobalSystemMediaTransportControlsSessionPlaybackControls.ABI.makeIGlobalSystemMediaTransportControlsSessionPlaybackControls(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGlobalSystemMediaTransportControlsSessionPlaybackControls>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGlobalSystemMediaTransportControlsSessionPlaybackControls.ABI.makeIGlobalSystemMediaTransportControlsSessionPlaybackControls(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GlobalSystemMediaTransportControlsSessionPlaybackControls> {
    public override fun getValue() =
        GlobalSystemMediaTransportControlsSessionPlaybackControls(pointer.getPointer(0))

    public fun setValue(value: GlobalSystemMediaTransportControlsSessionPlaybackControls): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GlobalSystemMediaTransportControlsSessionPlaybackControls, MemoryAddress>
      {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        GlobalSystemMediaTransportControlsSessionPlaybackControls {
      val address = segment.toRawLongValue()
      return GlobalSystemMediaTransportControlsSessionPlaybackControls(Pointer(address))
    }

    public override fun toNative(obj: GlobalSystemMediaTransportControlsSessionPlaybackControls):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
