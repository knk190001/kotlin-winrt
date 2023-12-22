package Windows.UI.Xaml.Input

import Windows.UI.Xaml.RoutedEventArgs
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
@Signature("rc(Windows.UI.Xaml.Input.CharacterReceivedRoutedEventArgs;{7849fd82-48e4-444d-9419-93ab8892c107})")
@WinRTByReference(brClass = CharacterReceivedRoutedEventArgs.ByReference::class)
public class CharacterReceivedRoutedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), ICharacterReceivedRoutedEventArgs.WithDefault, IWinRTObject {
  private val __2051273448_Interface: ICharacterReceivedRoutedEventArgs.WithDefault by lazy {
    as_2051273448()
  }


  public override val __2051273448_Ptr: JNAPointer? by lazy {
    __2051273448_Interface.__2051273448_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2051273448_Interface)

  private fun as_2051273448(): ICharacterReceivedRoutedEventArgs.WithDefault {
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
