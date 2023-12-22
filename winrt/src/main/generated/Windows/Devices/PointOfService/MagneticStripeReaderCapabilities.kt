package Windows.Devices.PointOfService

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

@ABIMarker(MagneticStripeReaderCapabilities.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.MagneticStripeReaderCapabilities;{7128809c-c440-44a2-a467-469175d02896})")
@WinRTByReference(brClass = MagneticStripeReaderCapabilities.ByReference::class)
public class MagneticStripeReaderCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMagneticStripeReaderCapabilities.WithDefault, IWinRTObject {
  private val __1567099767_Interface: IMagneticStripeReaderCapabilities.WithDefault by lazy {
    as_1567099767()
  }


  public override val __1567099767_Ptr: JNAPointer? by lazy {
    __1567099767_Interface.__1567099767_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1567099767_Interface)

  private fun as_1567099767(): IMagneticStripeReaderCapabilities.WithDefault {
    if(pointer == NULL) {
      return(IMagneticStripeReaderCapabilities.ABI.makeIMagneticStripeReaderCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMagneticStripeReaderCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMagneticStripeReaderCapabilities.ABI.makeIMagneticStripeReaderCapabilities(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MagneticStripeReaderCapabilities> {
    public override fun getValue() = MagneticStripeReaderCapabilities(pointer.getPointer(0))

    public fun setValue(value: MagneticStripeReaderCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MagneticStripeReaderCapabilities, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MagneticStripeReaderCapabilities {
      val address = segment.toRawLongValue()
      return MagneticStripeReaderCapabilities(Pointer(address))
    }

    public override fun toNative(obj: MagneticStripeReaderCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
