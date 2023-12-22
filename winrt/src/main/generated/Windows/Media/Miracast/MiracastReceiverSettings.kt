package Windows.Media.Miracast

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

@ABIMarker(MiracastReceiverSettings.ABI::class)
@Signature("rc(Windows.Media.Miracast.MiracastReceiverSettings;{57cd2f24-c55a-5fbe-9464-eb05307705dd})")
@WinRTByReference(brClass = MiracastReceiverSettings.ByReference::class)
public class MiracastReceiverSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMiracastReceiverSettings.WithDefault, IWinRTObject {
  private val __625226662_Interface: IMiracastReceiverSettings.WithDefault by lazy {
    as_625226662()
  }


  public override val __625226662_Ptr: JNAPointer? by lazy {
    __625226662_Interface.__625226662_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__625226662_Interface)

  private fun as_625226662(): IMiracastReceiverSettings.WithDefault {
    if(pointer == NULL) {
      return(IMiracastReceiverSettings.ABI.makeIMiracastReceiverSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMiracastReceiverSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMiracastReceiverSettings.ABI.makeIMiracastReceiverSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MiracastReceiverSettings> {
    public override fun getValue() = MiracastReceiverSettings(pointer.getPointer(0))

    public fun setValue(value: MiracastReceiverSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MiracastReceiverSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MiracastReceiverSettings {
      val address = segment.toRawLongValue()
      return MiracastReceiverSettings(Pointer(address))
    }

    public override fun toNative(obj: MiracastReceiverSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
