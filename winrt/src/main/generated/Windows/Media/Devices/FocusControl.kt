package Windows.Media.Devices

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

@ABIMarker(FocusControl.ABI::class)
@Signature("rc(Windows.Media.Devices.FocusControl;{c0d889f6-5228-4453-b153-85606592b238})")
@WinRTByReference(brClass = FocusControl.ByReference::class)
public class FocusControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFocusControl.WithDefault, IFocusControl2.WithDefault, IWinRTObject {
  private val __1920234234_Interface: IFocusControl.WithDefault by lazy {
    as_1920234234()
  }


  private val __602280940_Interface: IFocusControl2.WithDefault by lazy {
    as_602280940()
  }


  public override val __1920234234_Ptr: JNAPointer? by lazy {
    __1920234234_Interface.__1920234234_Ptr
  }


  public override val __602280940_Ptr: JNAPointer? by lazy {
    __602280940_Interface.__602280940_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1920234234_Interface, __602280940_Interface)

  private fun as_1920234234(): IFocusControl.WithDefault {
    if(pointer == NULL) {
      return(IFocusControl.ABI.makeIFocusControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFocusControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFocusControl.ABI.makeIFocusControl(ref.value))
  }

  private fun as_602280940(): IFocusControl2.WithDefault {
    if(pointer == NULL) {
      return(IFocusControl2.ABI.makeIFocusControl2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFocusControl2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFocusControl2.ABI.makeIFocusControl2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FocusControl> {
    public override fun getValue() = FocusControl(pointer.getPointer(0))

    public fun setValue(value: FocusControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FocusControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FocusControl {
      val address = segment.toRawLongValue()
      return FocusControl(Pointer(address))
    }

    public override fun toNative(obj: FocusControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
