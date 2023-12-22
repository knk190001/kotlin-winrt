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

@ABIMarker(SpatialInteractionSourceEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialInteractionSourceEventArgs;{23b786cf-ec23-3979-b27c-eb0e12feb7c7})")
@WinRTByReference(brClass = SpatialInteractionSourceEventArgs.ByReference::class)
public class SpatialInteractionSourceEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialInteractionSourceEventArgs.WithDefault,
    ISpatialInteractionSourceEventArgs2.WithDefault, IWinRTObject {
  private val __541564458_Interface: ISpatialInteractionSourceEventArgs.WithDefault by lazy {
    as_541564458()
  }


  private val __391371036_Interface: ISpatialInteractionSourceEventArgs2.WithDefault by lazy {
    as_391371036()
  }


  public override val __541564458_Ptr: JNAPointer? by lazy {
    __541564458_Interface.__541564458_Ptr
  }


  public override val __391371036_Ptr: JNAPointer? by lazy {
    __391371036_Interface.__391371036_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__541564458_Interface, __391371036_Interface)

  private fun as_541564458(): ISpatialInteractionSourceEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionSourceEventArgs.ABI.makeISpatialInteractionSourceEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionSourceEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionSourceEventArgs.ABI.makeISpatialInteractionSourceEventArgs(ref.value))
  }

  private fun as_391371036(): ISpatialInteractionSourceEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionSourceEventArgs2.ABI.makeISpatialInteractionSourceEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionSourceEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionSourceEventArgs2.ABI.makeISpatialInteractionSourceEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialInteractionSourceEventArgs> {
    public override fun getValue() = SpatialInteractionSourceEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialInteractionSourceEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialInteractionSourceEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialInteractionSourceEventArgs {
      val address = segment.toRawLongValue()
      return SpatialInteractionSourceEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialInteractionSourceEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
