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

@ABIMarker(BarcodeScannerErrorOccurredEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.BarcodeScannerErrorOccurredEventArgs;{2cd2602f-cf3a-4002-a75a-c5ec468f0a20})")
@WinRTByReference(brClass = BarcodeScannerErrorOccurredEventArgs.ByReference::class)
public class BarcodeScannerErrorOccurredEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerErrorOccurredEventArgs.WithDefault, IWinRTObject {
  private val __1130441625_Interface: IBarcodeScannerErrorOccurredEventArgs.WithDefault by lazy {
    as_1130441625()
  }


  public override val __1130441625_Ptr: JNAPointer? by lazy {
    __1130441625_Interface.__1130441625_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1130441625_Interface)

  private fun as_1130441625(): IBarcodeScannerErrorOccurredEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerErrorOccurredEventArgs.ABI.makeIBarcodeScannerErrorOccurredEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerErrorOccurredEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerErrorOccurredEventArgs.ABI.makeIBarcodeScannerErrorOccurredEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerErrorOccurredEventArgs> {
    public override fun getValue() = BarcodeScannerErrorOccurredEventArgs(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerErrorOccurredEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerErrorOccurredEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BarcodeScannerErrorOccurredEventArgs {
      val address = segment.toRawLongValue()
      return BarcodeScannerErrorOccurredEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerErrorOccurredEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
