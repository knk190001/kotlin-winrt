package Windows.Graphics.Printing.PrintSupport

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

@ABIMarker(PrintSupportSettingsUISession.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintSupport.PrintSupportSettingsUISession;{c6da2251-83c3-55e4-a0f8-5de8b062adbf})")
@WinRTByReference(brClass = PrintSupportSettingsUISession.ByReference::class)
public class PrintSupportSettingsUISession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintSupportSettingsUISession.WithDefault, IWinRTObject {
  private val __1455759657_Interface: IPrintSupportSettingsUISession.WithDefault by lazy {
    as_1455759657()
  }


  public override val __1455759657_Ptr: JNAPointer? by lazy {
    __1455759657_Interface.__1455759657_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1455759657_Interface)

  private fun as_1455759657(): IPrintSupportSettingsUISession.WithDefault {
    if(pointer == NULL) {
      return(IPrintSupportSettingsUISession.ABI.makeIPrintSupportSettingsUISession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintSupportSettingsUISession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintSupportSettingsUISession.ABI.makeIPrintSupportSettingsUISession(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintSupportSettingsUISession> {
    public override fun getValue() = PrintSupportSettingsUISession(pointer.getPointer(0))

    public fun setValue(value: PrintSupportSettingsUISession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintSupportSettingsUISession, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintSupportSettingsUISession {
      val address = segment.toRawLongValue()
      return PrintSupportSettingsUISession(Pointer(address))
    }

    public override fun toNative(obj: PrintSupportSettingsUISession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
