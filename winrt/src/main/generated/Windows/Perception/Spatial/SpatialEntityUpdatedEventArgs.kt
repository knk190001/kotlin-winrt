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

@ABIMarker(SpatialEntityUpdatedEventArgs.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialEntityUpdatedEventArgs;{e5671766-627b-43cb-a49f-b3be6d47deed})")
@WinRTByReference(brClass = SpatialEntityUpdatedEventArgs.ByReference::class)
public class SpatialEntityUpdatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialEntityUpdatedEventArgs.WithDefault, IWinRTObject {
  private val __1201532896_Interface: ISpatialEntityUpdatedEventArgs.WithDefault by lazy {
    as_1201532896()
  }


  public override val __1201532896_Ptr: JNAPointer? by lazy {
    __1201532896_Interface.__1201532896_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1201532896_Interface)

  private fun as_1201532896(): ISpatialEntityUpdatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialEntityUpdatedEventArgs.ABI.makeISpatialEntityUpdatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialEntityUpdatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialEntityUpdatedEventArgs.ABI.makeISpatialEntityUpdatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialEntityUpdatedEventArgs> {
    public override fun getValue() = SpatialEntityUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialEntityUpdatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialEntityUpdatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialEntityUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return SpatialEntityUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialEntityUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
