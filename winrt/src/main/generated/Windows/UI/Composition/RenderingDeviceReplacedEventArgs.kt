package Windows.UI.Composition

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RenderingDeviceReplacedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Composition.RenderingDeviceReplacedEventArgs;{3a31ac7d-28bf-4e7a-8524-71679d480f38})")
@WinRTByReference(brClass = RenderingDeviceReplacedEventArgs.ByReference::class)
public class RenderingDeviceReplacedEventArgs(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), IRenderingDeviceReplacedEventArgs.WithDefault, IWinRTObject {
  private val __497543187_Interface: IRenderingDeviceReplacedEventArgs.WithDefault by lazy {
    as_497543187()
  }


  public override val __497543187_Ptr: JNAPointer? by lazy {
    __497543187_Interface.__497543187_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__497543187_Interface)

  private fun as_497543187(): IRenderingDeviceReplacedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRenderingDeviceReplacedEventArgs.ABI.makeIRenderingDeviceReplacedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRenderingDeviceReplacedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRenderingDeviceReplacedEventArgs.ABI.makeIRenderingDeviceReplacedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RenderingDeviceReplacedEventArgs> {
    public override fun getValue() = RenderingDeviceReplacedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RenderingDeviceReplacedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RenderingDeviceReplacedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RenderingDeviceReplacedEventArgs {
      val address = segment.toRawLongValue()
      return RenderingDeviceReplacedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RenderingDeviceReplacedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
