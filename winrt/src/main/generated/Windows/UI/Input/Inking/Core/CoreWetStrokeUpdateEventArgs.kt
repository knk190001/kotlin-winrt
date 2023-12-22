package Windows.UI.Input.Inking.Core

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

@ABIMarker(CoreWetStrokeUpdateEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.Core.CoreWetStrokeUpdateEventArgs;{fb07d14c-3380-457a-a987-991357896c1b})")
@WinRTByReference(brClass = CoreWetStrokeUpdateEventArgs.ByReference::class)
public class CoreWetStrokeUpdateEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWetStrokeUpdateEventArgs.WithDefault, IWinRTObject {
  private val __287931014_Interface: ICoreWetStrokeUpdateEventArgs.WithDefault by lazy {
    as_287931014()
  }


  public override val __287931014_Ptr: JNAPointer? by lazy {
    __287931014_Interface.__287931014_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__287931014_Interface)

  private fun as_287931014(): ICoreWetStrokeUpdateEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWetStrokeUpdateEventArgs.ABI.makeICoreWetStrokeUpdateEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWetStrokeUpdateEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWetStrokeUpdateEventArgs.ABI.makeICoreWetStrokeUpdateEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWetStrokeUpdateEventArgs> {
    public override fun getValue() = CoreWetStrokeUpdateEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWetStrokeUpdateEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWetStrokeUpdateEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWetStrokeUpdateEventArgs {
      val address = segment.toRawLongValue()
      return CoreWetStrokeUpdateEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWetStrokeUpdateEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
