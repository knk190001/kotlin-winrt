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

@ABIMarker(GameBarServicesCommandEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.GameBarServicesCommandEventArgs;{a74226b2-f176-4fcf-8fbb-cf698b2eb8e0})")
@WinRTByReference(brClass = GameBarServicesCommandEventArgs.ByReference::class)
public class GameBarServicesCommandEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameBarServicesCommandEventArgs.WithDefault, IWinRTObject {
  private val __384424685_Interface: IGameBarServicesCommandEventArgs.WithDefault by lazy {
    as_384424685()
  }


  public override val __384424685_Ptr: JNAPointer? by lazy {
    __384424685_Interface.__384424685_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__384424685_Interface)

  private fun as_384424685(): IGameBarServicesCommandEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGameBarServicesCommandEventArgs.ABI.makeIGameBarServicesCommandEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameBarServicesCommandEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameBarServicesCommandEventArgs.ABI.makeIGameBarServicesCommandEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameBarServicesCommandEventArgs> {
    public override fun getValue() = GameBarServicesCommandEventArgs(pointer.getPointer(0))

    public fun setValue(value: GameBarServicesCommandEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameBarServicesCommandEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GameBarServicesCommandEventArgs {
      val address = segment.toRawLongValue()
      return GameBarServicesCommandEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GameBarServicesCommandEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
