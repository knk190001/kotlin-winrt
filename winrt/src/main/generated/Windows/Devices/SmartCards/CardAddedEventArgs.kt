package Windows.Devices.SmartCards

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

@ABIMarker(CardAddedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.CardAddedEventArgs;{18bbef98-f18b-4dd3-b118-dfb2c8e23cc6})")
@WinRTByReference(brClass = CardAddedEventArgs.ByReference::class)
public class CardAddedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICardAddedEventArgs.WithDefault, IWinRTObject {
  private val __1304964762_Interface: ICardAddedEventArgs.WithDefault by lazy {
    as_1304964762()
  }


  public override val __1304964762_Ptr: JNAPointer? by lazy {
    __1304964762_Interface.__1304964762_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1304964762_Interface)

  private fun as_1304964762(): ICardAddedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICardAddedEventArgs.ABI.makeICardAddedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICardAddedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICardAddedEventArgs.ABI.makeICardAddedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CardAddedEventArgs> {
    public override fun getValue() = CardAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CardAddedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CardAddedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CardAddedEventArgs {
      val address = segment.toRawLongValue()
      return CardAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CardAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
