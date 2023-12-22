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

@ABIMarker(GlobalSystemMediaTransportControlsSession.ABI::class)
@Signature("rc(Windows.Media.Control.GlobalSystemMediaTransportControlsSession;{7148c835-9b14-5ae2-ab85-dc9b1c14e1a8})")
@WinRTByReference(brClass = GlobalSystemMediaTransportControlsSession.ByReference::class)
public class GlobalSystemMediaTransportControlsSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGlobalSystemMediaTransportControlsSession.WithDefault, IWinRTObject {
  private val __717736312_Interface: IGlobalSystemMediaTransportControlsSession.WithDefault by
      lazy {
    as_717736312()
  }


  public override val __717736312_Ptr: JNAPointer? by lazy {
    __717736312_Interface.__717736312_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__717736312_Interface)

  private fun as_717736312(): IGlobalSystemMediaTransportControlsSession.WithDefault {
    if(pointer == NULL) {
      return(IGlobalSystemMediaTransportControlsSession.ABI.makeIGlobalSystemMediaTransportControlsSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGlobalSystemMediaTransportControlsSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGlobalSystemMediaTransportControlsSession.ABI.makeIGlobalSystemMediaTransportControlsSession(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GlobalSystemMediaTransportControlsSession> {
    public override fun getValue() =
        GlobalSystemMediaTransportControlsSession(pointer.getPointer(0))

    public fun setValue(value: GlobalSystemMediaTransportControlsSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GlobalSystemMediaTransportControlsSession, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        GlobalSystemMediaTransportControlsSession {
      val address = segment.toRawLongValue()
      return GlobalSystemMediaTransportControlsSession(Pointer(address))
    }

    public override fun toNative(obj: GlobalSystemMediaTransportControlsSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
