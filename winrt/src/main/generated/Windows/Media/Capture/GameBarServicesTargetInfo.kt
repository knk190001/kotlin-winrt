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

@ABIMarker(GameBarServicesTargetInfo.ABI::class)
@Signature("rc(Windows.Media.Capture.GameBarServicesTargetInfo;{b4202f92-1611-4e05-b6ef-dfd737ae33b0})")
@WinRTByReference(brClass = GameBarServicesTargetInfo.ByReference::class)
public class GameBarServicesTargetInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameBarServicesTargetInfo.WithDefault, IWinRTObject {
  private val __545746778_Interface: IGameBarServicesTargetInfo.WithDefault by lazy {
    as_545746778()
  }


  public override val __545746778_Ptr: JNAPointer? by lazy {
    __545746778_Interface.__545746778_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__545746778_Interface)

  private fun as_545746778(): IGameBarServicesTargetInfo.WithDefault {
    if(pointer == NULL) {
      return(IGameBarServicesTargetInfo.ABI.makeIGameBarServicesTargetInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameBarServicesTargetInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameBarServicesTargetInfo.ABI.makeIGameBarServicesTargetInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameBarServicesTargetInfo> {
    public override fun getValue() = GameBarServicesTargetInfo(pointer.getPointer(0))

    public fun setValue(value: GameBarServicesTargetInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameBarServicesTargetInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GameBarServicesTargetInfo {
      val address = segment.toRawLongValue()
      return GameBarServicesTargetInfo(Pointer(address))
    }

    public override fun toNative(obj: GameBarServicesTargetInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
