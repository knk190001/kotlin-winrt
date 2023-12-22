package Windows.Media.Capture

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

@ABIMarker(GameBarServicesManagerGameBarServicesCreatedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.GameBarServicesManagerGameBarServicesCreatedEventArgs;{ededbd9c-143e-49a3-a5ea-0b1995c8d46e})")
@WinRTByReference(brClass =
    GameBarServicesManagerGameBarServicesCreatedEventArgs.ByReference::class)
public class GameBarServicesManagerGameBarServicesCreatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameBarServicesManagerGameBarServicesCreatedEventArgs.WithDefault,
    IWinRTObject {
  private val __1080955448_Interface:
      IGameBarServicesManagerGameBarServicesCreatedEventArgs.WithDefault by lazy {
    as_1080955448()
  }


  public override val __1080955448_Ptr: JNAPointer? by lazy {
    __1080955448_Interface.__1080955448_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1080955448_Interface)

  private fun as_1080955448(): IGameBarServicesManagerGameBarServicesCreatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGameBarServicesManagerGameBarServicesCreatedEventArgs.ABI.makeIGameBarServicesManagerGameBarServicesCreatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameBarServicesManagerGameBarServicesCreatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameBarServicesManagerGameBarServicesCreatedEventArgs.ABI.makeIGameBarServicesManagerGameBarServicesCreatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameBarServicesManagerGameBarServicesCreatedEventArgs> {
    public override fun getValue() =
        GameBarServicesManagerGameBarServicesCreatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: GameBarServicesManagerGameBarServicesCreatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameBarServicesManagerGameBarServicesCreatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        GameBarServicesManagerGameBarServicesCreatedEventArgs {
      val address = segment.toRawLongValue()
      return GameBarServicesManagerGameBarServicesCreatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GameBarServicesManagerGameBarServicesCreatedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
