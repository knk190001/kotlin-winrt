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

@ABIMarker(ApplicationViewTitleBar.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.ApplicationViewTitleBar;{00924ac0-932b-4a6b-9c4b-dc38c82478ce})")
@WinRTByReference(brClass = ApplicationViewTitleBar.ByReference::class)
public class ApplicationViewTitleBar(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IApplicationViewTitleBar.WithDefault, IWinRTObject {
  private val __780245758_Interface: IApplicationViewTitleBar.WithDefault by lazy {
    as_780245758()
  }


  public override val __780245758_Ptr: JNAPointer? by lazy {
    __780245758_Interface.__780245758_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__780245758_Interface)

  private fun as_780245758(): IApplicationViewTitleBar.WithDefault {
    if(pointer == NULL) {
      return(IApplicationViewTitleBar.ABI.makeIApplicationViewTitleBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationViewTitleBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationViewTitleBar.ABI.makeIApplicationViewTitleBar(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ApplicationViewTitleBar> {
    public override fun getValue() = ApplicationViewTitleBar(pointer.getPointer(0))

    public fun setValue(value: ApplicationViewTitleBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ApplicationViewTitleBar, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ApplicationViewTitleBar {
      val address = segment.toRawLongValue()
      return ApplicationViewTitleBar(Pointer(address))
    }

    public override fun toNative(obj: ApplicationViewTitleBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
