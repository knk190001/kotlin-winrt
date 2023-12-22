package Windows.Graphics.Printing

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(PrintManager.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintManager;{ff2a9694-8c99-44fd-ae4a-19d9aa9a0f0a})")
@WinRTByReference(brClass = PrintManager.ByReference::class)
public class PrintManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintManager.WithDefault, IWinRTObject {
  private val __998526724_Interface: IPrintManager.WithDefault by lazy {
    as_998526724()
  }


  public override val __998526724_Ptr: JNAPointer? by lazy {
    __998526724_Interface.__998526724_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__998526724_Interface)

  private fun as_998526724(): IPrintManager.WithDefault {
    if(pointer == NULL) {
      return(IPrintManager.ABI.makeIPrintManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintManager.ABI.makeIPrintManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PrintManager> {
    public override fun getValue() = PrintManager(pointer.getPointer(0))

    public fun setValue(value: PrintManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintManager, MemoryAddress> {
    public val IPrintManagerStatic_Instance: IPrintManagerStatic by lazy {
      createIPrintManagerStatic()
    }


    public val IPrintManagerStatic2_Instance: IPrintManagerStatic2 by lazy {
      createIPrintManagerStatic2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPrintManagerStatic(): IPrintManagerStatic {
      val refiid = Guid.REFIID(IPrintManagerStatic.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing.PrintManager".toHandle(),refiid,interfacePtr)
      val result = IPrintManagerStatic.ABI.makeIPrintManagerStatic(interfacePtr.value)
      return result
    }

    public fun createIPrintManagerStatic2(): IPrintManagerStatic2 {
      val refiid = Guid.REFIID(IPrintManagerStatic2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing.PrintManager".toHandle(),refiid,interfacePtr)
      val result = IPrintManagerStatic2.ABI.makeIPrintManagerStatic2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PrintManager {
      val address = segment.toRawLongValue()
      return PrintManager(Pointer(address))
    }

    public override fun toNative(obj: PrintManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() = ABI.IPrintManagerStatic_Instance.GetForCurrentView()

    public fun ShowPrintUIAsync() = ABI.IPrintManagerStatic_Instance.ShowPrintUIAsync()

    public fun IsSupported() = ABI.IPrintManagerStatic2_Instance.IsSupported()
  }
}
