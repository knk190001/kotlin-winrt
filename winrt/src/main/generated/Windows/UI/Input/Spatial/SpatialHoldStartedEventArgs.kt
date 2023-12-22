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

@ABIMarker(SpatialHoldStartedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialHoldStartedEventArgs;{8e343d79-acb6-4144-8615-2cfba8a3cb3f})")
@WinRTByReference(brClass = SpatialHoldStartedEventArgs.ByReference::class)
public class SpatialHoldStartedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialHoldStartedEventArgs.WithDefault, IWinRTObject {
  private val __889310337_Interface: ISpatialHoldStartedEventArgs.WithDefault by lazy {
    as_889310337()
  }


  public override val __889310337_Ptr: JNAPointer? by lazy {
    __889310337_Interface.__889310337_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__889310337_Interface)

  private fun as_889310337(): ISpatialHoldStartedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialHoldStartedEventArgs.ABI.makeISpatialHoldStartedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialHoldStartedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialHoldStartedEventArgs.ABI.makeISpatialHoldStartedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialHoldStartedEventArgs> {
    public override fun getValue() = SpatialHoldStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialHoldStartedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialHoldStartedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialHoldStartedEventArgs {
      val address = segment.toRawLongValue()
      return SpatialHoldStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialHoldStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
