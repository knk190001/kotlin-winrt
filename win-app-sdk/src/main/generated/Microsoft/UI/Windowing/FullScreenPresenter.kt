package Microsoft.UI.Windowing

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(FullScreenPresenter.ABI::class)
@Signature("rc(Microsoft.UI.Windowing.FullScreenPresenter;{fa9141fd-b8dd-5da1-8b2b-7cdadb76f593})")
@WinRTByReference(brClass = FullScreenPresenter.ByReference::class)
public class FullScreenPresenter(
  ptr: JNAPointer? = NULL
) : AppWindowPresenter(ptr), IFullScreenPresenter.WithDefault, IWinRTObject {
  private val __244445724_Interface: IFullScreenPresenter.WithDefault by lazy {
    as_244445724()
  }


  public override val __244445724_Ptr: JNAPointer? by lazy {
    __244445724_Interface.__244445724_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__244445724_Interface)

  private fun as_244445724(): IFullScreenPresenter.WithDefault {
    if(pointer == NULL) {
      return(IFullScreenPresenter.ABI.makeIFullScreenPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFullScreenPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFullScreenPresenter.ABI.makeIFullScreenPresenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FullScreenPresenter> {
    public override fun getValue() = FullScreenPresenter(pointer.getPointer(0))

    public fun setValue(value: FullScreenPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FullScreenPresenter, MemoryAddress> {
    public val IFullScreenPresenterStatics_Instance: IFullScreenPresenterStatics by lazy {
      createIFullScreenPresenterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFullScreenPresenterStatics(): IFullScreenPresenterStatics {
      val refiid = Guid.REFIID(IFullScreenPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Windowing.FullScreenPresenter".toHandle(),refiid,interfacePtr)
      val result =
          IFullScreenPresenterStatics.ABI.makeIFullScreenPresenterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): FullScreenPresenter {
      val address = segment.toRawLongValue()
      return FullScreenPresenter(Pointer(address))
    }

    public override fun toNative(obj: FullScreenPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create() = ABI.IFullScreenPresenterStatics_Instance.Create()
  }
}
