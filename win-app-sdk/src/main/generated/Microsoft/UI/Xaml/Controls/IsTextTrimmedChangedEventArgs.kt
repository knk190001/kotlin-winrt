package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IsTextTrimmedChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.IsTextTrimmedChangedEventArgs;{3c709b2f-16ba-55d2-b6f6-dfc54a1ed021})")
@WinRTByReference(brClass = IsTextTrimmedChangedEventArgs.ByReference::class)
public class IsTextTrimmedChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIsTextTrimmedChangedEventArgs.WithDefault, IWinRTObject {
  private val __2107869969_Interface: IIsTextTrimmedChangedEventArgs.WithDefault by lazy {
    as_2107869969()
  }


  public override val __2107869969_Ptr: JNAPointer? by lazy {
    __2107869969_Interface.__2107869969_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2107869969_Interface)

  private fun as_2107869969(): IIsTextTrimmedChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IIsTextTrimmedChangedEventArgs.ABI.makeIIsTextTrimmedChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsTextTrimmedChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsTextTrimmedChangedEventArgs.ABI.makeIIsTextTrimmedChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsTextTrimmedChangedEventArgs> {
    public override fun getValue() = IsTextTrimmedChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IsTextTrimmedChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsTextTrimmedChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): IsTextTrimmedChangedEventArgs {
      val address = segment.toRawLongValue()
      return IsTextTrimmedChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IsTextTrimmedChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
