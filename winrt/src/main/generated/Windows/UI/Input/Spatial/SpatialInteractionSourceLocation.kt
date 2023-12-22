package Windows.UI.Input.Spatial

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

@ABIMarker(SpatialInteractionSourceLocation.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialInteractionSourceLocation;{ea4696c4-7e8b-30ca-bcc5-c77189cea30a})")
@WinRTByReference(brClass = SpatialInteractionSourceLocation.ByReference::class)
public class SpatialInteractionSourceLocation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialInteractionSourceLocation.WithDefault,
    ISpatialInteractionSourceLocation2.WithDefault, ISpatialInteractionSourceLocation3.WithDefault,
    IWinRTObject {
  private val __611273578_Interface: ISpatialInteractionSourceLocation.WithDefault by lazy {
    as_611273578()
  }


  private val __1769611684_Interface: ISpatialInteractionSourceLocation2.WithDefault by lazy {
    as_1769611684()
  }


  private val __1769611683_Interface: ISpatialInteractionSourceLocation3.WithDefault by lazy {
    as_1769611683()
  }


  public override val __611273578_Ptr: JNAPointer? by lazy {
    __611273578_Interface.__611273578_Ptr
  }


  public override val __1769611684_Ptr: JNAPointer? by lazy {
    __1769611684_Interface.__1769611684_Ptr
  }


  public override val __1769611683_Ptr: JNAPointer? by lazy {
    __1769611683_Interface.__1769611683_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__611273578_Interface, __1769611684_Interface, __1769611683_Interface)

  private fun as_611273578(): ISpatialInteractionSourceLocation.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionSourceLocation.ABI.makeISpatialInteractionSourceLocation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionSourceLocation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionSourceLocation.ABI.makeISpatialInteractionSourceLocation(ref.value))
  }

  private fun as_1769611684(): ISpatialInteractionSourceLocation2.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionSourceLocation2.ABI.makeISpatialInteractionSourceLocation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionSourceLocation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionSourceLocation2.ABI.makeISpatialInteractionSourceLocation2(ref.value))
  }

  private fun as_1769611683(): ISpatialInteractionSourceLocation3.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionSourceLocation3.ABI.makeISpatialInteractionSourceLocation3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionSourceLocation3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionSourceLocation3.ABI.makeISpatialInteractionSourceLocation3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialInteractionSourceLocation> {
    public override fun getValue() = SpatialInteractionSourceLocation(pointer.getPointer(0))

    public fun setValue(value: SpatialInteractionSourceLocation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialInteractionSourceLocation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialInteractionSourceLocation {
      val address = segment.toRawLongValue()
      return SpatialInteractionSourceLocation(Pointer(address))
    }

    public override fun toNative(obj: SpatialInteractionSourceLocation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
