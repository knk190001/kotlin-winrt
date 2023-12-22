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

@ABIMarker(LowLagPhotoControl.ABI::class)
@Signature("rc(Windows.Media.Devices.LowLagPhotoControl;{6d5c4dd0-fadf-415d-aee6-3baa529300c9})")
@WinRTByReference(brClass = LowLagPhotoControl.ByReference::class)
public class LowLagPhotoControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILowLagPhotoControl.WithDefault, IWinRTObject {
  private val __958530966_Interface: ILowLagPhotoControl.WithDefault by lazy {
    as_958530966()
  }


  public override val __958530966_Ptr: JNAPointer? by lazy {
    __958530966_Interface.__958530966_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__958530966_Interface)

  private fun as_958530966(): ILowLagPhotoControl.WithDefault {
    if(pointer == NULL) {
      return(ILowLagPhotoControl.ABI.makeILowLagPhotoControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILowLagPhotoControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILowLagPhotoControl.ABI.makeILowLagPhotoControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LowLagPhotoControl> {
    public override fun getValue() = LowLagPhotoControl(pointer.getPointer(0))

    public fun setValue(value: LowLagPhotoControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LowLagPhotoControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LowLagPhotoControl {
      val address = segment.toRawLongValue()
      return LowLagPhotoControl(Pointer(address))
    }

    public override fun toNative(obj: LowLagPhotoControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
