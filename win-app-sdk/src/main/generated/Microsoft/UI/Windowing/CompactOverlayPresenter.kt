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

@ABIMarker(CompactOverlayPresenter.ABI::class)
@Signature("rc(Microsoft.UI.Windowing.CompactOverlayPresenter;{efeb0812-6fc7-5b7d-bd92-cc8f9a6454c9})")
@WinRTByReference(brClass = CompactOverlayPresenter.ByReference::class)
public class CompactOverlayPresenter(
  ptr: JNAPointer? = NULL
) : AppWindowPresenter(ptr), ICompactOverlayPresenter.WithDefault, IWinRTObject {
  private val __894173962_Interface: ICompactOverlayPresenter.WithDefault by lazy {
    as_894173962()
  }


  public override val __894173962_Ptr: JNAPointer? by lazy {
    __894173962_Interface.__894173962_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__894173962_Interface)

  private fun as_894173962(): ICompactOverlayPresenter.WithDefault {
    if(pointer == NULL) {
      return(ICompactOverlayPresenter.ABI.makeICompactOverlayPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompactOverlayPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompactOverlayPresenter.ABI.makeICompactOverlayPresenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompactOverlayPresenter> {
    public override fun getValue() = CompactOverlayPresenter(pointer.getPointer(0))

    public fun setValue(value: CompactOverlayPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompactOverlayPresenter, MemoryAddress> {
    public val ICompactOverlayPresenterStatics_Instance: ICompactOverlayPresenterStatics by lazy {
      createICompactOverlayPresenterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICompactOverlayPresenterStatics(): ICompactOverlayPresenterStatics {
      val refiid = Guid.REFIID(ICompactOverlayPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Windowing.CompactOverlayPresenter".toHandle(),refiid,interfacePtr)
      val result =
          ICompactOverlayPresenterStatics.ABI.makeICompactOverlayPresenterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CompactOverlayPresenter {
      val address = segment.toRawLongValue()
      return CompactOverlayPresenter(Pointer(address))
    }

    public override fun toNative(obj: CompactOverlayPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create() = ABI.ICompactOverlayPresenterStatics_Instance.Create()
  }
}
