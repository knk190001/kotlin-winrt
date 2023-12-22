package Windows.UI.Core

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

@ABIMarker(CharacterReceivedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Core.CharacterReceivedEventArgs;{c584659f-99b2-4bcc-bd33-04e63f42902e})")
@WinRTByReference(brClass = CharacterReceivedEventArgs.ByReference::class)
public class CharacterReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICharacterReceivedEventArgs.WithDefault, ICoreWindowEventArgs.WithDefault,
    IWinRTObject {
  private val __1037800872_Interface: ICharacterReceivedEventArgs.WithDefault by lazy {
    as_1037800872()
  }


  private val __407060269_Interface: ICoreWindowEventArgs.WithDefault by lazy {
    as_407060269()
  }


  public override val __1037800872_Ptr: JNAPointer? by lazy {
    __1037800872_Interface.__1037800872_Ptr
  }


  public override val __407060269_Ptr: JNAPointer? by lazy {
    __407060269_Interface.__407060269_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1037800872_Interface, __407060269_Interface)

  private fun as_1037800872(): ICharacterReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICharacterReceivedEventArgs.ABI.makeICharacterReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICharacterReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICharacterReceivedEventArgs.ABI.makeICharacterReceivedEventArgs(ref.value))
  }

  private fun as_407060269(): ICoreWindowEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWindowEventArgs.ABI.makeICoreWindowEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWindowEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWindowEventArgs.ABI.makeICoreWindowEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CharacterReceivedEventArgs> {
    public override fun getValue() = CharacterReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CharacterReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CharacterReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CharacterReceivedEventArgs {
      val address = segment.toRawLongValue()
      return CharacterReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CharacterReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
