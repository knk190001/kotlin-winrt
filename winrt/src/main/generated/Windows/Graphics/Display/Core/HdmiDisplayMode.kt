package Windows.Graphics.Display.Core

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

@ABIMarker(HdmiDisplayMode.ABI::class)
@Signature("rc(Windows.Graphics.Display.Core.HdmiDisplayMode;{0c06d5ad-1b90-4f51-9981-ef5a1c0ddf66})")
@WinRTByReference(brClass = HdmiDisplayMode.ByReference::class)
public class HdmiDisplayMode(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHdmiDisplayMode.WithDefault, IHdmiDisplayMode2.WithDefault, IWinRTObject {
  private val __1022497817_Interface: IHdmiDisplayMode.WithDefault by lazy {
    as_1022497817()
  }


  private val __1632661205_Interface: IHdmiDisplayMode2.WithDefault by lazy {
    as_1632661205()
  }


  public override val __1022497817_Ptr: JNAPointer? by lazy {
    __1022497817_Interface.__1022497817_Ptr
  }


  public override val __1632661205_Ptr: JNAPointer? by lazy {
    __1632661205_Interface.__1632661205_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1022497817_Interface, __1632661205_Interface)

  private fun as_1022497817(): IHdmiDisplayMode.WithDefault {
    if(pointer == NULL) {
      return(IHdmiDisplayMode.ABI.makeIHdmiDisplayMode(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHdmiDisplayMode>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHdmiDisplayMode.ABI.makeIHdmiDisplayMode(ref.value))
  }

  private fun as_1632661205(): IHdmiDisplayMode2.WithDefault {
    if(pointer == NULL) {
      return(IHdmiDisplayMode2.ABI.makeIHdmiDisplayMode2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHdmiDisplayMode2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHdmiDisplayMode2.ABI.makeIHdmiDisplayMode2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HdmiDisplayMode> {
    public override fun getValue() = HdmiDisplayMode(pointer.getPointer(0))

    public fun setValue(value: HdmiDisplayMode): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HdmiDisplayMode, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HdmiDisplayMode {
      val address = segment.toRawLongValue()
      return HdmiDisplayMode(Pointer(address))
    }

    public override fun toNative(obj: HdmiDisplayMode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
