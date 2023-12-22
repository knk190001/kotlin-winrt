package Windows.Devices.Display.Core

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

@ABIMarker(DisplayScanout.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayScanout;{e3051828-1ba5-50e7-8a39-bb1fd2f4f8b9})")
@WinRTByReference(brClass = DisplayScanout.ByReference::class)
public class DisplayScanout(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayScanout.WithDefault, IWinRTObject {
  private val __1537237871_Interface: IDisplayScanout.WithDefault by lazy {
    as_1537237871()
  }


  public override val __1537237871_Ptr: JNAPointer? by lazy {
    __1537237871_Interface.__1537237871_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1537237871_Interface)

  private fun as_1537237871(): IDisplayScanout.WithDefault {
    if(pointer == NULL) {
      return(IDisplayScanout.ABI.makeIDisplayScanout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayScanout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayScanout.ABI.makeIDisplayScanout(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DisplayScanout>
      {
    public override fun getValue() = DisplayScanout(pointer.getPointer(0))

    public fun setValue(value: DisplayScanout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayScanout, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayScanout {
      val address = segment.toRawLongValue()
      return DisplayScanout(Pointer(address))
    }

    public override fun toNative(obj: DisplayScanout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
