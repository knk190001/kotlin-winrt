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

@ABIMarker(DisplaySource.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplaySource;{ecd15fc1-eadc-51bc-971d-3bc628db2dd4})")
@WinRTByReference(brClass = DisplaySource.ByReference::class)
public class DisplaySource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplaySource.WithDefault, IDisplaySource2.WithDefault, IWinRTObject {
  private val __1209019195_Interface: IDisplaySource.WithDefault by lazy {
    as_1209019195()
  }


  private val __1175110569_Interface: IDisplaySource2.WithDefault by lazy {
    as_1175110569()
  }


  public override val __1209019195_Ptr: JNAPointer? by lazy {
    __1209019195_Interface.__1209019195_Ptr
  }


  public override val __1175110569_Ptr: JNAPointer? by lazy {
    __1175110569_Interface.__1175110569_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1209019195_Interface, __1175110569_Interface)

  private fun as_1209019195(): IDisplaySource.WithDefault {
    if(pointer == NULL) {
      return(IDisplaySource.ABI.makeIDisplaySource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplaySource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplaySource.ABI.makeIDisplaySource(ref.value))
  }

  private fun as_1175110569(): IDisplaySource2.WithDefault {
    if(pointer == NULL) {
      return(IDisplaySource2.ABI.makeIDisplaySource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplaySource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplaySource2.ABI.makeIDisplaySource2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DisplaySource>
      {
    public override fun getValue() = DisplaySource(pointer.getPointer(0))

    public fun setValue(value: DisplaySource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplaySource, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplaySource {
      val address = segment.toRawLongValue()
      return DisplaySource(Pointer(address))
    }

    public override fun toNative(obj: DisplaySource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
