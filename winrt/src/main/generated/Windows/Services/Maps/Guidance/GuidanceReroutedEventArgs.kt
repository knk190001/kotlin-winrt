package Windows.Services.Maps.Guidance

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

@ABIMarker(GuidanceReroutedEventArgs.ABI::class)
@Signature("rc(Windows.Services.Maps.Guidance.GuidanceReroutedEventArgs;{115d4008-d528-454e-bb94-a50341d2c9f1})")
@WinRTByReference(brClass = GuidanceReroutedEventArgs.ByReference::class)
public class GuidanceReroutedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGuidanceReroutedEventArgs.WithDefault, IWinRTObject {
  private val __1395033362_Interface: IGuidanceReroutedEventArgs.WithDefault by lazy {
    as_1395033362()
  }


  public override val __1395033362_Ptr: JNAPointer? by lazy {
    __1395033362_Interface.__1395033362_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1395033362_Interface)

  private fun as_1395033362(): IGuidanceReroutedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGuidanceReroutedEventArgs.ABI.makeIGuidanceReroutedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGuidanceReroutedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGuidanceReroutedEventArgs.ABI.makeIGuidanceReroutedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GuidanceReroutedEventArgs> {
    public override fun getValue() = GuidanceReroutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: GuidanceReroutedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GuidanceReroutedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GuidanceReroutedEventArgs {
      val address = segment.toRawLongValue()
      return GuidanceReroutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GuidanceReroutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
