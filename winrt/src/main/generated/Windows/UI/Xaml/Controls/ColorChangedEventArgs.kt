package Windows.UI.Xaml.Controls

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

@ABIMarker(ColorChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ColorChangedEventArgs;{34f7201f-aad0-4c3a-b97b-2abf36455539})")
@WinRTByReference(brClass = ColorChangedEventArgs.ByReference::class)
public class ColorChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IColorChangedEventArgs.WithDefault, IWinRTObject {
  private val __1616985386_Interface: IColorChangedEventArgs.WithDefault by lazy {
    as_1616985386()
  }


  public override val __1616985386_Ptr: JNAPointer? by lazy {
    __1616985386_Interface.__1616985386_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1616985386_Interface)

  private fun as_1616985386(): IColorChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IColorChangedEventArgs.ABI.makeIColorChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IColorChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IColorChangedEventArgs.ABI.makeIColorChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ColorChangedEventArgs> {
    public override fun getValue() = ColorChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ColorChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ColorChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ColorChangedEventArgs {
      val address = segment.toRawLongValue()
      return ColorChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ColorChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
