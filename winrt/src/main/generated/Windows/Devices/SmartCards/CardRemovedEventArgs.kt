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

@ABIMarker(CardRemovedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.CardRemovedEventArgs;{15331aaf-22d7-4945-afc9-03b46f42a6cd})")
@WinRTByReference(brClass = CardRemovedEventArgs.ByReference::class)
public class CardRemovedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICardRemovedEventArgs.WithDefault, IWinRTObject {
  private val __1990821498_Interface: ICardRemovedEventArgs.WithDefault by lazy {
    as_1990821498()
  }


  public override val __1990821498_Ptr: JNAPointer? by lazy {
    __1990821498_Interface.__1990821498_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1990821498_Interface)

  private fun as_1990821498(): ICardRemovedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICardRemovedEventArgs.ABI.makeICardRemovedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICardRemovedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICardRemovedEventArgs.ABI.makeICardRemovedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CardRemovedEventArgs> {
    public override fun getValue() = CardRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CardRemovedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CardRemovedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CardRemovedEventArgs {
      val address = segment.toRawLongValue()
      return CardRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CardRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
