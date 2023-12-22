package Windows.Devices.Perception

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

@ABIMarker(PerceptionFrameSourcePropertiesChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionFrameSourcePropertiesChangedEventArgs;{6c68e068-bcf1-4ecc-b891-7625d1244b6b})")
@WinRTByReference(brClass = PerceptionFrameSourcePropertiesChangedEventArgs.ByReference::class)
public class PerceptionFrameSourcePropertiesChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionFrameSourcePropertiesChangedEventArgs.WithDefault, IWinRTObject {
  private val __1828931471_Interface: IPerceptionFrameSourcePropertiesChangedEventArgs.WithDefault
      by lazy {
    as_1828931471()
  }


  public override val __1828931471_Ptr: JNAPointer? by lazy {
    __1828931471_Interface.__1828931471_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1828931471_Interface)

  private fun as_1828931471(): IPerceptionFrameSourcePropertiesChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionFrameSourcePropertiesChangedEventArgs.ABI.makeIPerceptionFrameSourcePropertiesChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionFrameSourcePropertiesChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionFrameSourcePropertiesChangedEventArgs.ABI.makeIPerceptionFrameSourcePropertiesChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionFrameSourcePropertiesChangedEventArgs> {
    public override fun getValue() =
        PerceptionFrameSourcePropertiesChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PerceptionFrameSourcePropertiesChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionFrameSourcePropertiesChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PerceptionFrameSourcePropertiesChangedEventArgs {
      val address = segment.toRawLongValue()
      return PerceptionFrameSourcePropertiesChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PerceptionFrameSourcePropertiesChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
