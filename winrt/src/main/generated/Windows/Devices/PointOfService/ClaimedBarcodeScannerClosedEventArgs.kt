package Windows.Devices.PointOfService

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

@ABIMarker(ClaimedBarcodeScannerClosedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.ClaimedBarcodeScannerClosedEventArgs;{cf7d5489-a22c-4c65-a901-88d77d833954})")
@WinRTByReference(brClass = ClaimedBarcodeScannerClosedEventArgs.ByReference::class)
public class ClaimedBarcodeScannerClosedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IClaimedBarcodeScannerClosedEventArgs.WithDefault, IWinRTObject {
  private val __193036079_Interface: IClaimedBarcodeScannerClosedEventArgs.WithDefault by lazy {
    as_193036079()
  }


  public override val __193036079_Ptr: JNAPointer? by lazy {
    __193036079_Interface.__193036079_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__193036079_Interface)

  private fun as_193036079(): IClaimedBarcodeScannerClosedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IClaimedBarcodeScannerClosedEventArgs.ABI.makeIClaimedBarcodeScannerClosedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedBarcodeScannerClosedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedBarcodeScannerClosedEventArgs.ABI.makeIClaimedBarcodeScannerClosedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ClaimedBarcodeScannerClosedEventArgs> {
    public override fun getValue() = ClaimedBarcodeScannerClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ClaimedBarcodeScannerClosedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClaimedBarcodeScannerClosedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ClaimedBarcodeScannerClosedEventArgs {
      val address = segment.toRawLongValue()
      return ClaimedBarcodeScannerClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ClaimedBarcodeScannerClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
