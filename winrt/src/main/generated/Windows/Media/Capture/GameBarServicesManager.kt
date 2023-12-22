package Windows.Media.Capture

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(GameBarServicesManager.ABI::class)
@Signature("rc(Windows.Media.Capture.GameBarServicesManager;{3a4b9cfa-7f8b-4c60-9dbb-0bcd262dffc6})")
@WinRTByReference(brClass = GameBarServicesManager.ByReference::class)
public class GameBarServicesManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameBarServicesManager.WithDefault, IWinRTObject {
  private val __2096470458_Interface: IGameBarServicesManager.WithDefault by lazy {
    as_2096470458()
  }


  public override val __2096470458_Ptr: JNAPointer? by lazy {
    __2096470458_Interface.__2096470458_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2096470458_Interface)

  private fun as_2096470458(): IGameBarServicesManager.WithDefault {
    if(pointer == NULL) {
      return(IGameBarServicesManager.ABI.makeIGameBarServicesManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameBarServicesManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameBarServicesManager.ABI.makeIGameBarServicesManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameBarServicesManager> {
    public override fun getValue() = GameBarServicesManager(pointer.getPointer(0))

    public fun setValue(value: GameBarServicesManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameBarServicesManager, MemoryAddress> {
    public val IGameBarServicesManagerStatics_Instance: IGameBarServicesManagerStatics by lazy {
      createIGameBarServicesManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGameBarServicesManagerStatics(): IGameBarServicesManagerStatics {
      val refiid = Guid.REFIID(IGameBarServicesManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Capture.GameBarServicesManager".toHandle(),refiid,interfacePtr)
      val result =
          IGameBarServicesManagerStatics.ABI.makeIGameBarServicesManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GameBarServicesManager {
      val address = segment.toRawLongValue()
      return GameBarServicesManager(Pointer(address))
    }

    public override fun toNative(obj: GameBarServicesManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IGameBarServicesManagerStatics_Instance.GetDefault()
  }
}
