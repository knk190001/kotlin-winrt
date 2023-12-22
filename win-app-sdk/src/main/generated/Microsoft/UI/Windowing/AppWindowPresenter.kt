package Microsoft.UI.Windowing

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

@ABIMarker(AppWindowPresenter.ABI::class)
@Signature("rc(Microsoft.UI.Windowing.AppWindowPresenter;{bc3042c2-c6c6-5632-8989-ff0ec6d3b40d})")
@WinRTByReference(brClass = AppWindowPresenter.ByReference::class)
public open class AppWindowPresenter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppWindowPresenter.WithDefault, IWinRTObject {
  private val __1149739704_Interface: IAppWindowPresenter.WithDefault by lazy {
    as_1149739704()
  }


  public override val __1149739704_Ptr: JNAPointer? by lazy {
    __1149739704_Interface.__1149739704_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1149739704_Interface)

  private fun as_1149739704(): IAppWindowPresenter.WithDefault {
    if(pointer == NULL) {
      return(IAppWindowPresenter.ABI.makeIAppWindowPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindowPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindowPresenter.ABI.makeIAppWindowPresenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppWindowPresenter> {
    public override fun getValue() = AppWindowPresenter(pointer.getPointer(0))

    public fun setValue(value: AppWindowPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppWindowPresenter, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppWindowPresenter {
      val address = segment.toRawLongValue()
      return AppWindowPresenter(Pointer(address))
    }

    public override fun toNative(obj: AppWindowPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
