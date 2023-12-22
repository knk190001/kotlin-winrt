package Windows.Perception.Spatial

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

@ABIMarker(SpatialEntityAddedEventArgs.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialEntityAddedEventArgs;{a397f49b-156a-4707-ac2c-d31d570ed399})")
@WinRTByReference(brClass = SpatialEntityAddedEventArgs.ByReference::class)
public class SpatialEntityAddedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialEntityAddedEventArgs.WithDefault, IWinRTObject {
  private val __1885060731_Interface: ISpatialEntityAddedEventArgs.WithDefault by lazy {
    as_1885060731()
  }


  public override val __1885060731_Ptr: JNAPointer? by lazy {
    __1885060731_Interface.__1885060731_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1885060731_Interface)

  private fun as_1885060731(): ISpatialEntityAddedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialEntityAddedEventArgs.ABI.makeISpatialEntityAddedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialEntityAddedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialEntityAddedEventArgs.ABI.makeISpatialEntityAddedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialEntityAddedEventArgs> {
    public override fun getValue() = SpatialEntityAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialEntityAddedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialEntityAddedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialEntityAddedEventArgs {
      val address = segment.toRawLongValue()
      return SpatialEntityAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialEntityAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
