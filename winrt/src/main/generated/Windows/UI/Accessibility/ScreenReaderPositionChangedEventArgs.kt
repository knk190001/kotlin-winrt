package Windows.UI.Accessibility

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

@ABIMarker(ScreenReaderPositionChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Accessibility.ScreenReaderPositionChangedEventArgs;{557eb5e5-54d0-5ccd-9fc5-ed33357f8a9f})")
@WinRTByReference(brClass = ScreenReaderPositionChangedEventArgs.ByReference::class)
public class ScreenReaderPositionChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScreenReaderPositionChangedEventArgs.WithDefault, IWinRTObject {
  private val __1215205573_Interface: IScreenReaderPositionChangedEventArgs.WithDefault by lazy {
    as_1215205573()
  }


  public override val __1215205573_Ptr: JNAPointer? by lazy {
    __1215205573_Interface.__1215205573_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1215205573_Interface)

  private fun as_1215205573(): IScreenReaderPositionChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IScreenReaderPositionChangedEventArgs.ABI.makeIScreenReaderPositionChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScreenReaderPositionChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScreenReaderPositionChangedEventArgs.ABI.makeIScreenReaderPositionChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScreenReaderPositionChangedEventArgs> {
    public override fun getValue() = ScreenReaderPositionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ScreenReaderPositionChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScreenReaderPositionChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ScreenReaderPositionChangedEventArgs {
      val address = segment.toRawLongValue()
      return ScreenReaderPositionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ScreenReaderPositionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
