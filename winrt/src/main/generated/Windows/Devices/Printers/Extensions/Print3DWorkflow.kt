package Windows.Devices.Printers.Extensions

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

@ABIMarker(Print3DWorkflow.ABI::class)
@Signature("rc(Windows.Devices.Printers.Extensions.Print3DWorkflow;{c56f74bd-3669-4a66-ab42-c8151930cd34})")
@WinRTByReference(brClass = Print3DWorkflow.ByReference::class)
public class Print3DWorkflow(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrint3DWorkflow.WithDefault, IPrint3DWorkflow2.WithDefault, IWinRTObject {
  private val __1418715137_Interface: IPrint3DWorkflow.WithDefault by lazy {
    as_1418715137()
  }


  private val __1030496337_Interface: IPrint3DWorkflow2.WithDefault by lazy {
    as_1030496337()
  }


  public override val __1418715137_Ptr: JNAPointer? by lazy {
    __1418715137_Interface.__1418715137_Ptr
  }


  public override val __1030496337_Ptr: JNAPointer? by lazy {
    __1030496337_Interface.__1030496337_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1418715137_Interface, __1030496337_Interface)

  private fun as_1418715137(): IPrint3DWorkflow.WithDefault {
    if(pointer == NULL) {
      return(IPrint3DWorkflow.ABI.makeIPrint3DWorkflow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrint3DWorkflow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrint3DWorkflow.ABI.makeIPrint3DWorkflow(ref.value))
  }

  private fun as_1030496337(): IPrint3DWorkflow2.WithDefault {
    if(pointer == NULL) {
      return(IPrint3DWorkflow2.ABI.makeIPrint3DWorkflow2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrint3DWorkflow2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrint3DWorkflow2.ABI.makeIPrint3DWorkflow2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Print3DWorkflow> {
    public override fun getValue() = Print3DWorkflow(pointer.getPointer(0))

    public fun setValue(value: Print3DWorkflow): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Print3DWorkflow, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Print3DWorkflow {
      val address = segment.toRawLongValue()
      return Print3DWorkflow(Pointer(address))
    }

    public override fun toNative(obj: Print3DWorkflow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
