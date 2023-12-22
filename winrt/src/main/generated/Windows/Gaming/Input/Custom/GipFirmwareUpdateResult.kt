package Windows.Gaming.Input.Custom

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

@ABIMarker(GipFirmwareUpdateResult.ABI::class)
@Signature("rc(Windows.Gaming.Input.Custom.GipFirmwareUpdateResult;{6b794d32-8553-4292-8e03-e16651a2f8bc})")
@WinRTByReference(brClass = GipFirmwareUpdateResult.ByReference::class)
public class GipFirmwareUpdateResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGipFirmwareUpdateResult.WithDefault, IWinRTObject {
  private val __1784188785_Interface: IGipFirmwareUpdateResult.WithDefault by lazy {
    as_1784188785()
  }


  public override val __1784188785_Ptr: JNAPointer? by lazy {
    __1784188785_Interface.__1784188785_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1784188785_Interface)

  private fun as_1784188785(): IGipFirmwareUpdateResult.WithDefault {
    if(pointer == NULL) {
      return(IGipFirmwareUpdateResult.ABI.makeIGipFirmwareUpdateResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGipFirmwareUpdateResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGipFirmwareUpdateResult.ABI.makeIGipFirmwareUpdateResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GipFirmwareUpdateResult> {
    public override fun getValue() = GipFirmwareUpdateResult(pointer.getPointer(0))

    public fun setValue(value: GipFirmwareUpdateResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GipFirmwareUpdateResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GipFirmwareUpdateResult {
      val address = segment.toRawLongValue()
      return GipFirmwareUpdateResult(Pointer(address))
    }

    public override fun toNative(obj: GipFirmwareUpdateResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
