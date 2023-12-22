package Windows.UI.Input.Inking

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

@ABIMarker(InkPresenter.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkPresenter;{a69b70e2-887b-458f-b173-4fe4438930a3})")
@WinRTByReference(brClass = InkPresenter.ByReference::class)
public class InkPresenter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkPresenter.WithDefault, IInkPresenter2.WithDefault,
    IInkPresenter3.WithDefault, IWinRTObject {
  private val __592762884_Interface: IInkPresenter.WithDefault by lazy {
    as_592762884()
  }


  private val __1195780170_Interface: IInkPresenter2.WithDefault by lazy {
    as_1195780170()
  }


  private val __1195780169_Interface: IInkPresenter3.WithDefault by lazy {
    as_1195780169()
  }


  public override val __592762884_Ptr: JNAPointer? by lazy {
    __592762884_Interface.__592762884_Ptr
  }


  public override val __1195780170_Ptr: JNAPointer? by lazy {
    __1195780170_Interface.__1195780170_Ptr
  }


  public override val __1195780169_Ptr: JNAPointer? by lazy {
    __1195780169_Interface.__1195780169_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__592762884_Interface, __1195780170_Interface, __1195780169_Interface)

  private fun as_592762884(): IInkPresenter.WithDefault {
    if(pointer == NULL) {
      return(IInkPresenter.ABI.makeIInkPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkPresenter.ABI.makeIInkPresenter(ref.value))
  }

  private fun as_1195780170(): IInkPresenter2.WithDefault {
    if(pointer == NULL) {
      return(IInkPresenter2.ABI.makeIInkPresenter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkPresenter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkPresenter2.ABI.makeIInkPresenter2(ref.value))
  }

  private fun as_1195780169(): IInkPresenter3.WithDefault {
    if(pointer == NULL) {
      return(IInkPresenter3.ABI.makeIInkPresenter3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkPresenter3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkPresenter3.ABI.makeIInkPresenter3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InkPresenter> {
    public override fun getValue() = InkPresenter(pointer.getPointer(0))

    public fun setValue(value: InkPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkPresenter, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkPresenter {
      val address = segment.toRawLongValue()
      return InkPresenter(Pointer(address))
    }

    public override fun toNative(obj: InkPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
