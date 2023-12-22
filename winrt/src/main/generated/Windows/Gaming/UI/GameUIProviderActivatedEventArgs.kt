package Windows.Gaming.UI

import Windows.ApplicationModel.Activation.IActivatedEventArgs
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

@ABIMarker(GameUIProviderActivatedEventArgs.ABI::class)
@Signature("rc(Windows.Gaming.UI.GameUIProviderActivatedEventArgs;{a7b3203e-caf7-4ded-bbd2-47de43bb6dd5})")
@WinRTByReference(brClass = GameUIProviderActivatedEventArgs.ByReference::class)
public class GameUIProviderActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameUIProviderActivatedEventArgs.WithDefault,
    IActivatedEventArgs.WithDefault, IWinRTObject {
  private val __17613022_Interface: IGameUIProviderActivatedEventArgs.WithDefault by lazy {
    as_17613022()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  public override val __17613022_Ptr: JNAPointer? by lazy {
    __17613022_Interface.__17613022_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__17613022_Interface, __1721660047_Interface)

  private fun as_17613022(): IGameUIProviderActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGameUIProviderActivatedEventArgs.ABI.makeIGameUIProviderActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameUIProviderActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameUIProviderActivatedEventArgs.ABI.makeIGameUIProviderActivatedEventArgs(ref.value))
  }

  private fun as_1721660047(): IActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameUIProviderActivatedEventArgs> {
    public override fun getValue() = GameUIProviderActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: GameUIProviderActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameUIProviderActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GameUIProviderActivatedEventArgs {
      val address = segment.toRawLongValue()
      return GameUIProviderActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GameUIProviderActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
