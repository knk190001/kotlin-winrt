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

@ABIMarker(GameBarServices.ABI::class)
@Signature("rc(Windows.Media.Capture.GameBarServices;{2dbead57-50a6-499e-8c6c-d330a7311796})")
@WinRTByReference(brClass = GameBarServices.ByReference::class)
public class GameBarServices(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameBarServices.WithDefault, IWinRTObject {
  private val __1268420761_Interface: IGameBarServices.WithDefault by lazy {
    as_1268420761()
  }


  public override val __1268420761_Ptr: JNAPointer? by lazy {
    __1268420761_Interface.__1268420761_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1268420761_Interface)

  private fun as_1268420761(): IGameBarServices.WithDefault {
    if(pointer == NULL) {
      return(IGameBarServices.ABI.makeIGameBarServices(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameBarServices>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameBarServices.ABI.makeIGameBarServices(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameBarServices> {
    public override fun getValue() = GameBarServices(pointer.getPointer(0))

    public fun setValue(value: GameBarServices): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameBarServices, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GameBarServices {
      val address = segment.toRawLongValue()
      return GameBarServices(Pointer(address))
    }

    public override fun toNative(obj: GameBarServices): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
