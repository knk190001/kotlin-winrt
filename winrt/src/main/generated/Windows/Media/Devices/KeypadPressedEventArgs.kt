package Windows.Media.Devices

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

@ABIMarker(KeypadPressedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Devices.KeypadPressedEventArgs;{d3a43900-b4fa-49cd-9442-89af6568f601})")
@WinRTByReference(brClass = KeypadPressedEventArgs.ByReference::class)
public class KeypadPressedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IKeypadPressedEventArgs.WithDefault, IWinRTObject {
  private val __624796906_Interface: IKeypadPressedEventArgs.WithDefault by lazy {
    as_624796906()
  }


  public override val __624796906_Ptr: JNAPointer? by lazy {
    __624796906_Interface.__624796906_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__624796906_Interface)

  private fun as_624796906(): IKeypadPressedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IKeypadPressedEventArgs.ABI.makeIKeypadPressedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeypadPressedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeypadPressedEventArgs.ABI.makeIKeypadPressedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KeypadPressedEventArgs> {
    public override fun getValue() = KeypadPressedEventArgs(pointer.getPointer(0))

    public fun setValue(value: KeypadPressedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeypadPressedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): KeypadPressedEventArgs {
      val address = segment.toRawLongValue()
      return KeypadPressedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: KeypadPressedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
