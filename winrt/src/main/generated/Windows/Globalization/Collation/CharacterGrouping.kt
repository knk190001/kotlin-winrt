package Windows.Globalization.Collation

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

@ABIMarker(CharacterGrouping.ABI::class)
@Signature("rc(Windows.Globalization.Collation.CharacterGrouping;{fae761bb-805d-4bb0-95bb-c1f7c3e8eb8e})")
@WinRTByReference(brClass = CharacterGrouping.ByReference::class)
public class CharacterGrouping(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICharacterGrouping.WithDefault, IWinRTObject {
  private val __1730464308_Interface: ICharacterGrouping.WithDefault by lazy {
    as_1730464308()
  }


  public override val __1730464308_Ptr: JNAPointer? by lazy {
    __1730464308_Interface.__1730464308_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1730464308_Interface)

  private fun as_1730464308(): ICharacterGrouping.WithDefault {
    if(pointer == NULL) {
      return(ICharacterGrouping.ABI.makeICharacterGrouping(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICharacterGrouping>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICharacterGrouping.ABI.makeICharacterGrouping(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CharacterGrouping> {
    public override fun getValue() = CharacterGrouping(pointer.getPointer(0))

    public fun setValue(value: CharacterGrouping): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CharacterGrouping, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CharacterGrouping {
      val address = segment.toRawLongValue()
      return CharacterGrouping(Pointer(address))
    }

    public override fun toNative(obj: CharacterGrouping): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
