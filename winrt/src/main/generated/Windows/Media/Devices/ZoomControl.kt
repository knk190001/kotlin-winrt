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

@ABIMarker(ZoomControl.ABI::class)
@Signature("rc(Windows.Media.Devices.ZoomControl;{3a1e0b12-32da-4c17-bfd7-8d0c73c8f5a5})")
@WinRTByReference(brClass = ZoomControl.ByReference::class)
public class ZoomControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IZoomControl.WithDefault, IZoomControl2.WithDefault, IWinRTObject {
  private val __80475721_Interface: IZoomControl.WithDefault by lazy {
    as_80475721()
  }


  private val __1800219895_Interface: IZoomControl2.WithDefault by lazy {
    as_1800219895()
  }


  public override val __80475721_Ptr: JNAPointer? by lazy {
    __80475721_Interface.__80475721_Ptr
  }


  public override val __1800219895_Ptr: JNAPointer? by lazy {
    __1800219895_Interface.__1800219895_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__80475721_Interface, __1800219895_Interface)

  private fun as_80475721(): IZoomControl.WithDefault {
    if(pointer == NULL) {
      return(IZoomControl.ABI.makeIZoomControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IZoomControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IZoomControl.ABI.makeIZoomControl(ref.value))
  }

  private fun as_1800219895(): IZoomControl2.WithDefault {
    if(pointer == NULL) {
      return(IZoomControl2.ABI.makeIZoomControl2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IZoomControl2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IZoomControl2.ABI.makeIZoomControl2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ZoomControl> {
    public override fun getValue() = ZoomControl(pointer.getPointer(0))

    public fun setValue(value: ZoomControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ZoomControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ZoomControl {
      val address = segment.toRawLongValue()
      return ZoomControl(Pointer(address))
    }

    public override fun toNative(obj: ZoomControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
