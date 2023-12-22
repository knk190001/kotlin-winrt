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

@ABIMarker(ContentDialogClosingDeferral.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ContentDialogClosingDeferral;{215d4d11-7e30-4cb9-a710-5a4f9cca8b42})")
@WinRTByReference(brClass = ContentDialogClosingDeferral.ByReference::class)
public class ContentDialogClosingDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentDialogClosingDeferral.WithDefault, IWinRTObject {
  private val __193720315_Interface: IContentDialogClosingDeferral.WithDefault by lazy {
    as_193720315()
  }


  public override val __193720315_Ptr: JNAPointer? by lazy {
    __193720315_Interface.__193720315_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__193720315_Interface)

  private fun as_193720315(): IContentDialogClosingDeferral.WithDefault {
    if(pointer == NULL) {
      return(IContentDialogClosingDeferral.ABI.makeIContentDialogClosingDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentDialogClosingDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentDialogClosingDeferral.ABI.makeIContentDialogClosingDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentDialogClosingDeferral> {
    public override fun getValue() = ContentDialogClosingDeferral(pointer.getPointer(0))

    public fun setValue(value: ContentDialogClosingDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentDialogClosingDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContentDialogClosingDeferral {
      val address = segment.toRawLongValue()
      return ContentDialogClosingDeferral(Pointer(address))
    }

    public override fun toNative(obj: ContentDialogClosingDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
