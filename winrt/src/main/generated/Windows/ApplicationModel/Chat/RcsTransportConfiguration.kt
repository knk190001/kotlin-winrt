package Windows.ApplicationModel.Chat

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

@ABIMarker(RcsTransportConfiguration.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.RcsTransportConfiguration;{1fccb102-2472-4bb9-9988-c1211c83e8a9})")
@WinRTByReference(brClass = RcsTransportConfiguration.ByReference::class)
public class RcsTransportConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRcsTransportConfiguration.WithDefault, IWinRTObject {
  private val __627187624_Interface: IRcsTransportConfiguration.WithDefault by lazy {
    as_627187624()
  }


  public override val __627187624_Ptr: JNAPointer? by lazy {
    __627187624_Interface.__627187624_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__627187624_Interface)

  private fun as_627187624(): IRcsTransportConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IRcsTransportConfiguration.ABI.makeIRcsTransportConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRcsTransportConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRcsTransportConfiguration.ABI.makeIRcsTransportConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RcsTransportConfiguration> {
    public override fun getValue() = RcsTransportConfiguration(pointer.getPointer(0))

    public fun setValue(value: RcsTransportConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RcsTransportConfiguration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RcsTransportConfiguration {
      val address = segment.toRawLongValue()
      return RcsTransportConfiguration(Pointer(address))
    }

    public override fun toNative(obj: RcsTransportConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
