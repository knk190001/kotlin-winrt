package Windows.Media.DialProtocol

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

@ABIMarker(DialDisconnectButtonClickedEventArgs.ABI::class)
@Signature("rc(Windows.Media.DialProtocol.DialDisconnectButtonClickedEventArgs;{52765152-9c81-4e55-adc2-0ebe99cde3b6})")
@WinRTByReference(brClass = DialDisconnectButtonClickedEventArgs.ByReference::class)
public class DialDisconnectButtonClickedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDialDisconnectButtonClickedEventArgs.WithDefault, IWinRTObject {
  private val __509358790_Interface: IDialDisconnectButtonClickedEventArgs.WithDefault by lazy {
    as_509358790()
  }


  public override val __509358790_Ptr: JNAPointer? by lazy {
    __509358790_Interface.__509358790_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__509358790_Interface)

  private fun as_509358790(): IDialDisconnectButtonClickedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDialDisconnectButtonClickedEventArgs.ABI.makeIDialDisconnectButtonClickedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDialDisconnectButtonClickedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDialDisconnectButtonClickedEventArgs.ABI.makeIDialDisconnectButtonClickedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DialDisconnectButtonClickedEventArgs> {
    public override fun getValue() = DialDisconnectButtonClickedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DialDisconnectButtonClickedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DialDisconnectButtonClickedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DialDisconnectButtonClickedEventArgs {
      val address = segment.toRawLongValue()
      return DialDisconnectButtonClickedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DialDisconnectButtonClickedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
