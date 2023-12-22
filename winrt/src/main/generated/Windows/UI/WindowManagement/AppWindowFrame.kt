package Windows.UI.WindowManagement

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

@ABIMarker(AppWindowFrame.ABI::class)
@Signature("rc(Windows.UI.WindowManagement.AppWindowFrame;{ac412946-e1ac-5230-944a-c60873dcf4a9})")
@WinRTByReference(brClass = AppWindowFrame.ByReference::class)
public class AppWindowFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppWindowFrameStyle.WithDefault, IAppWindowFrame.WithDefault, IWinRTObject {
  private val __1801824526_Interface: IAppWindowFrameStyle.WithDefault by lazy {
    as_1801824526()
  }


  private val __837252509_Interface: IAppWindowFrame.WithDefault by lazy {
    as_837252509()
  }


  public override val __1801824526_Ptr: JNAPointer? by lazy {
    __1801824526_Interface.__1801824526_Ptr
  }


  public override val __837252509_Ptr: JNAPointer? by lazy {
    __837252509_Interface.__837252509_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1801824526_Interface, __837252509_Interface)

  private fun as_1801824526(): IAppWindowFrameStyle.WithDefault {
    if(pointer == NULL) {
      return(IAppWindowFrameStyle.ABI.makeIAppWindowFrameStyle(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindowFrameStyle>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindowFrameStyle.ABI.makeIAppWindowFrameStyle(ref.value))
  }

  private fun as_837252509(): IAppWindowFrame.WithDefault {
    if(pointer == NULL) {
      return(IAppWindowFrame.ABI.makeIAppWindowFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindowFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindowFrame.ABI.makeIAppWindowFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AppWindowFrame>
      {
    public override fun getValue() = AppWindowFrame(pointer.getPointer(0))

    public fun setValue(value: AppWindowFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppWindowFrame, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppWindowFrame {
      val address = segment.toRawLongValue()
      return AppWindowFrame(Pointer(address))
    }

    public override fun toNative(obj: AppWindowFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
