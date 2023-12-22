package Windows.Devices.Haptics

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

@ABIMarker(SimpleHapticsControllerFeedback.ABI::class)
@Signature("rc(Windows.Devices.Haptics.SimpleHapticsControllerFeedback;{3d577ef8-4cee-11e6-b535-001bdc06ab3b})")
@WinRTByReference(brClass = SimpleHapticsControllerFeedback.ByReference::class)
public class SimpleHapticsControllerFeedback(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISimpleHapticsControllerFeedback.WithDefault, IWinRTObject {
  private val __1564083998_Interface: ISimpleHapticsControllerFeedback.WithDefault by lazy {
    as_1564083998()
  }


  public override val __1564083998_Ptr: JNAPointer? by lazy {
    __1564083998_Interface.__1564083998_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1564083998_Interface)

  private fun as_1564083998(): ISimpleHapticsControllerFeedback.WithDefault {
    if(pointer == NULL) {
      return(ISimpleHapticsControllerFeedback.ABI.makeISimpleHapticsControllerFeedback(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISimpleHapticsControllerFeedback>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISimpleHapticsControllerFeedback.ABI.makeISimpleHapticsControllerFeedback(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SimpleHapticsControllerFeedback> {
    public override fun getValue() = SimpleHapticsControllerFeedback(pointer.getPointer(0))

    public fun setValue(value: SimpleHapticsControllerFeedback): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SimpleHapticsControllerFeedback, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SimpleHapticsControllerFeedback {
      val address = segment.toRawLongValue()
      return SimpleHapticsControllerFeedback(Pointer(address))
    }

    public override fun toNative(obj: SimpleHapticsControllerFeedback): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
