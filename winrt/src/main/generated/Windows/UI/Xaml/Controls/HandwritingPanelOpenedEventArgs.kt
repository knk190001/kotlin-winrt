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

@ABIMarker(HandwritingPanelOpenedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.HandwritingPanelOpenedEventArgs;{fc15b16d-9f15-47b0-b97a-94a68cc61345})")
@WinRTByReference(brClass = HandwritingPanelOpenedEventArgs.ByReference::class)
public class HandwritingPanelOpenedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHandwritingPanelOpenedEventArgs.WithDefault, IWinRTObject {
  private val __899757851_Interface: IHandwritingPanelOpenedEventArgs.WithDefault by lazy {
    as_899757851()
  }


  public override val __899757851_Ptr: JNAPointer? by lazy {
    __899757851_Interface.__899757851_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__899757851_Interface)

  private fun as_899757851(): IHandwritingPanelOpenedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IHandwritingPanelOpenedEventArgs.ABI.makeIHandwritingPanelOpenedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHandwritingPanelOpenedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHandwritingPanelOpenedEventArgs.ABI.makeIHandwritingPanelOpenedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HandwritingPanelOpenedEventArgs> {
    public override fun getValue() = HandwritingPanelOpenedEventArgs(pointer.getPointer(0))

    public fun setValue(value: HandwritingPanelOpenedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HandwritingPanelOpenedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HandwritingPanelOpenedEventArgs {
      val address = segment.toRawLongValue()
      return HandwritingPanelOpenedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: HandwritingPanelOpenedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
