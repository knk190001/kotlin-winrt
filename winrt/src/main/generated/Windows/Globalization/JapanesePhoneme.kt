package Windows.Globalization

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

@ABIMarker(JapanesePhoneme.ABI::class)
@Signature("rc(Windows.Globalization.JapanesePhoneme;{2f6a9300-e85b-43e6-897d-5d82f862df21})")
@WinRTByReference(brClass = JapanesePhoneme.ByReference::class)
public class JapanesePhoneme(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IJapanesePhoneme.WithDefault, IWinRTObject {
  private val __1368152574_Interface: IJapanesePhoneme.WithDefault by lazy {
    as_1368152574()
  }


  public override val __1368152574_Ptr: JNAPointer? by lazy {
    __1368152574_Interface.__1368152574_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1368152574_Interface)

  private fun as_1368152574(): IJapanesePhoneme.WithDefault {
    if(pointer == NULL) {
      return(IJapanesePhoneme.ABI.makeIJapanesePhoneme(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IJapanesePhoneme>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJapanesePhoneme.ABI.makeIJapanesePhoneme(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<JapanesePhoneme> {
    public override fun getValue() = JapanesePhoneme(pointer.getPointer(0))

    public fun setValue(value: JapanesePhoneme): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<JapanesePhoneme, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): JapanesePhoneme {
      val address = segment.toRawLongValue()
      return JapanesePhoneme(Pointer(address))
    }

    public override fun toNative(obj: JapanesePhoneme): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
