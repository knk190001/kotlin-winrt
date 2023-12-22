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

@ABIMarker(BarcodeScannerImagePreviewReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.BarcodeScannerImagePreviewReceivedEventArgs;{f3b7de85-6e8b-434e-9f58-06ef26bc4baf})")
@WinRTByReference(brClass = BarcodeScannerImagePreviewReceivedEventArgs.ByReference::class)
public class BarcodeScannerImagePreviewReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBarcodeScannerImagePreviewReceivedEventArgs.WithDefault, IWinRTObject {
  private val __1074174452_Interface: IBarcodeScannerImagePreviewReceivedEventArgs.WithDefault by
      lazy {
    as_1074174452()
  }


  public override val __1074174452_Ptr: JNAPointer? by lazy {
    __1074174452_Interface.__1074174452_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1074174452_Interface)

  private fun as_1074174452(): IBarcodeScannerImagePreviewReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBarcodeScannerImagePreviewReceivedEventArgs.ABI.makeIBarcodeScannerImagePreviewReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBarcodeScannerImagePreviewReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBarcodeScannerImagePreviewReceivedEventArgs.ABI.makeIBarcodeScannerImagePreviewReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BarcodeScannerImagePreviewReceivedEventArgs> {
    public override fun getValue() =
        BarcodeScannerImagePreviewReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: BarcodeScannerImagePreviewReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BarcodeScannerImagePreviewReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        BarcodeScannerImagePreviewReceivedEventArgs {
      val address = segment.toRawLongValue()
      return BarcodeScannerImagePreviewReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BarcodeScannerImagePreviewReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
