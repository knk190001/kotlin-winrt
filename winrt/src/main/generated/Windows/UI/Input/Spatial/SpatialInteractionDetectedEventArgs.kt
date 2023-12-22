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

@ABIMarker(SpatialInteractionDetectedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialInteractionDetectedEventArgs;{075878e4-5961-3b41-9dfb-cea5d89cc38a})")
@WinRTByReference(brClass = SpatialInteractionDetectedEventArgs.ByReference::class)
public class SpatialInteractionDetectedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialInteractionDetectedEventArgs.WithDefault,
    ISpatialInteractionDetectedEventArgs2.WithDefault, IWinRTObject {
  private val __1141512399_Interface: ISpatialInteractionDetectedEventArgs.WithDefault by lazy {
    as_1141512399()
  }


  private val __1027146051_Interface: ISpatialInteractionDetectedEventArgs2.WithDefault by lazy {
    as_1027146051()
  }


  public override val __1141512399_Ptr: JNAPointer? by lazy {
    __1141512399_Interface.__1141512399_Ptr
  }


  public override val __1027146051_Ptr: JNAPointer? by lazy {
    __1027146051_Interface.__1027146051_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1141512399_Interface, __1027146051_Interface)

  private fun as_1141512399(): ISpatialInteractionDetectedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionDetectedEventArgs.ABI.makeISpatialInteractionDetectedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionDetectedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionDetectedEventArgs.ABI.makeISpatialInteractionDetectedEventArgs(ref.value))
  }

  private fun as_1027146051(): ISpatialInteractionDetectedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionDetectedEventArgs2.ABI.makeISpatialInteractionDetectedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionDetectedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionDetectedEventArgs2.ABI.makeISpatialInteractionDetectedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialInteractionDetectedEventArgs> {
    public override fun getValue() = SpatialInteractionDetectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialInteractionDetectedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialInteractionDetectedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialInteractionDetectedEventArgs {
      val address = segment.toRawLongValue()
      return SpatialInteractionDetectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialInteractionDetectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
