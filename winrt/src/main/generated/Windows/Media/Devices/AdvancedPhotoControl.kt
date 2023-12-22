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

@ABIMarker(AdvancedPhotoControl.ABI::class)
@Signature("rc(Windows.Media.Devices.AdvancedPhotoControl;{c5b15486-9001-4682-9309-68eae0080eec})")
@WinRTByReference(brClass = AdvancedPhotoControl.ByReference::class)
public class AdvancedPhotoControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdvancedPhotoControl.WithDefault, IWinRTObject {
  private val __51137874_Interface: IAdvancedPhotoControl.WithDefault by lazy {
    as_51137874()
  }


  public override val __51137874_Ptr: JNAPointer? by lazy {
    __51137874_Interface.__51137874_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__51137874_Interface)

  private fun as_51137874(): IAdvancedPhotoControl.WithDefault {
    if(pointer == NULL) {
      return(IAdvancedPhotoControl.ABI.makeIAdvancedPhotoControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdvancedPhotoControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdvancedPhotoControl.ABI.makeIAdvancedPhotoControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdvancedPhotoControl> {
    public override fun getValue() = AdvancedPhotoControl(pointer.getPointer(0))

    public fun setValue(value: AdvancedPhotoControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdvancedPhotoControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AdvancedPhotoControl {
      val address = segment.toRawLongValue()
      return AdvancedPhotoControl(Pointer(address))
    }

    public override fun toNative(obj: AdvancedPhotoControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
