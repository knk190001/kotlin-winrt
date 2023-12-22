package Windows.Devices.PointOfService

import Windows.Foundation.IClosable
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

@ABIMarker(ClaimedMagneticStripeReader.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.ClaimedMagneticStripeReader;{475ca8f3-9417-48bc-b9d7-4163a7844c02})")
@WinRTByReference(brClass = ClaimedMagneticStripeReader.ByReference::class)
public class ClaimedMagneticStripeReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IClaimedMagneticStripeReader.WithDefault,
    IClaimedMagneticStripeReader2.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __574392208_Interface: IClaimedMagneticStripeReader.WithDefault by lazy {
    as_574392208()
  }


  private val __626289314_Interface: IClaimedMagneticStripeReader2.WithDefault by lazy {
    as_626289314()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __574392208_Ptr: JNAPointer? by lazy {
    __574392208_Interface.__574392208_Ptr
  }


  public override val __626289314_Ptr: JNAPointer? by lazy {
    __626289314_Interface.__626289314_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__574392208_Interface, __626289314_Interface, __1260617006_Interface)

  private fun as_574392208(): IClaimedMagneticStripeReader.WithDefault {
    if(pointer == NULL) {
      return(IClaimedMagneticStripeReader.ABI.makeIClaimedMagneticStripeReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedMagneticStripeReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedMagneticStripeReader.ABI.makeIClaimedMagneticStripeReader(ref.value))
  }

  private fun as_626289314(): IClaimedMagneticStripeReader2.WithDefault {
    if(pointer == NULL) {
      return(IClaimedMagneticStripeReader2.ABI.makeIClaimedMagneticStripeReader2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedMagneticStripeReader2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedMagneticStripeReader2.ABI.makeIClaimedMagneticStripeReader2(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ClaimedMagneticStripeReader> {
    public override fun getValue() = ClaimedMagneticStripeReader(pointer.getPointer(0))

    public fun setValue(value: ClaimedMagneticStripeReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClaimedMagneticStripeReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ClaimedMagneticStripeReader {
      val address = segment.toRawLongValue()
      return ClaimedMagneticStripeReader(Pointer(address))
    }

    public override fun toNative(obj: ClaimedMagneticStripeReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
