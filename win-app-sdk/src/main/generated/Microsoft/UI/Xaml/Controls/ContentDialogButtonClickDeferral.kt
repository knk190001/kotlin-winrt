package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ContentDialogButtonClickDeferral.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ContentDialogButtonClickDeferral;{ddca6d2e-a81a-5f61-8b87-e4b6ec5fa398})")
@WinRTByReference(brClass = ContentDialogButtonClickDeferral.ByReference::class)
public class ContentDialogButtonClickDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentDialogButtonClickDeferral.WithDefault, IWinRTObject {
  private val __33935335_Interface: IContentDialogButtonClickDeferral.WithDefault by lazy {
    as_33935335()
  }


  public override val __33935335_Ptr: JNAPointer? by lazy {
    __33935335_Interface.__33935335_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__33935335_Interface)

  private fun as_33935335(): IContentDialogButtonClickDeferral.WithDefault {
    if(pointer == NULL) {
      return(IContentDialogButtonClickDeferral.ABI.makeIContentDialogButtonClickDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentDialogButtonClickDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentDialogButtonClickDeferral.ABI.makeIContentDialogButtonClickDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentDialogButtonClickDeferral> {
    public override fun getValue() = ContentDialogButtonClickDeferral(pointer.getPointer(0))

    public fun setValue(value: ContentDialogButtonClickDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentDialogButtonClickDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContentDialogButtonClickDeferral {
      val address = segment.toRawLongValue()
      return ContentDialogButtonClickDeferral(Pointer(address))
    }

    public override fun toNative(obj: ContentDialogButtonClickDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
