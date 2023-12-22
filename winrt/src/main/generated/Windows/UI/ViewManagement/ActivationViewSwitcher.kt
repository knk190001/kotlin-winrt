package Windows.UI.ViewManagement

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

@ABIMarker(ActivationViewSwitcher.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.ActivationViewSwitcher;{dca71bb6-7350-492b-aac7-c8a13d7224ad})")
@WinRTByReference(brClass = ActivationViewSwitcher.ByReference::class)
public class ActivationViewSwitcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IActivationViewSwitcher.WithDefault, IWinRTObject {
  private val __647006702_Interface: IActivationViewSwitcher.WithDefault by lazy {
    as_647006702()
  }


  public override val __647006702_Ptr: JNAPointer? by lazy {
    __647006702_Interface.__647006702_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__647006702_Interface)

  private fun as_647006702(): IActivationViewSwitcher.WithDefault {
    if(pointer == NULL) {
      return(IActivationViewSwitcher.ABI.makeIActivationViewSwitcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivationViewSwitcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivationViewSwitcher.ABI.makeIActivationViewSwitcher(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ActivationViewSwitcher> {
    public override fun getValue() = ActivationViewSwitcher(pointer.getPointer(0))

    public fun setValue(value: ActivationViewSwitcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ActivationViewSwitcher, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ActivationViewSwitcher {
      val address = segment.toRawLongValue()
      return ActivationViewSwitcher(Pointer(address))
    }

    public override fun toNative(obj: ActivationViewSwitcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
