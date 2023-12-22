package Windows.Gaming.UI

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(GameChatOverlayMessageSource.ABI::class)
@Signature("rc(Windows.Gaming.UI.GameChatOverlayMessageSource;{1e177397-59fb-4f4f-8e9a-80acf817743c})")
@WinRTByReference(brClass = GameChatOverlayMessageSource.ByReference::class)
public class GameChatOverlayMessageSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameChatOverlayMessageSource.WithDefault, IWinRTObject {
  private val __1057642179_Interface: IGameChatOverlayMessageSource.WithDefault by lazy {
    as_1057642179()
  }


  public override val __1057642179_Ptr: JNAPointer? by lazy {
    __1057642179_Interface.__1057642179_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1057642179_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1057642179(): IGameChatOverlayMessageSource.WithDefault {
    if(pointer == NULL) {
      return(IGameChatOverlayMessageSource.ABI.makeIGameChatOverlayMessageSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameChatOverlayMessageSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameChatOverlayMessageSource.ABI.makeIGameChatOverlayMessageSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameChatOverlayMessageSource> {
    public override fun getValue() = GameChatOverlayMessageSource(pointer.getPointer(0))

    public fun setValue(value: GameChatOverlayMessageSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameChatOverlayMessageSource, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.UI.GameChatOverlayMessageSource".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): GameChatOverlayMessageSource {
      val address = segment.toRawLongValue()
      return GameChatOverlayMessageSource(Pointer(address))
    }

    public override fun toNative(obj: GameChatOverlayMessageSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
