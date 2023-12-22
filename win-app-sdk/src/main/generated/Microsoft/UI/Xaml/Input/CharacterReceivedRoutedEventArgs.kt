package Microsoft.UI.Xaml.Input

import Microsoft.UI.Xaml.RoutedEventArgs
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CharacterReceivedRoutedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.CharacterReceivedRoutedEventArgs;{e26ca5bb-34c3-5c1e-9a16-00b80b07a899})")
@WinRTByReference(brClass = CharacterReceivedRoutedEventArgs.ByReference::class)
public class CharacterReceivedRoutedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), ICharacterReceivedRoutedEventArgs.WithDefault, IWinRTObject {
  private val __1613939997_Interface: ICharacterReceivedRoutedEventArgs.WithDefault by lazy {
    as_1613939997()
  }


  public override val __1613939997_Ptr: JNAPointer? by lazy {
    __1613939997_Interface.__1613939997_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1613939997_Interface)

  private fun as_1613939997(): ICharacterReceivedRoutedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICharacterReceivedRoutedEventArgs.ABI.makeICharacterReceivedRoutedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICharacterReceivedRoutedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICharacterReceivedRoutedEventArgs.ABI.makeICharacterReceivedRoutedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CharacterReceivedRoutedEventArgs> {
    public override fun getValue() = CharacterReceivedRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CharacterReceivedRoutedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CharacterReceivedRoutedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CharacterReceivedRoutedEventArgs {
      val address = segment.toRawLongValue()
      return CharacterReceivedRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CharacterReceivedRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
