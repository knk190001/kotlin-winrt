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

@ABIMarker(ContentDialogButtonClickEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ContentDialogButtonClickEventArgs;{bae6261c-362f-5342-ba26-5f6990ef726c})")
@WinRTByReference(brClass = ContentDialogButtonClickEventArgs.ByReference::class)
public class ContentDialogButtonClickEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentDialogButtonClickEventArgs.WithDefault, IWinRTObject {
  private val __1821892197_Interface: IContentDialogButtonClickEventArgs.WithDefault by lazy {
    as_1821892197()
  }


  public override val __1821892197_Ptr: JNAPointer? by lazy {
    __1821892197_Interface.__1821892197_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1821892197_Interface)

  private fun as_1821892197(): IContentDialogButtonClickEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContentDialogButtonClickEventArgs.ABI.makeIContentDialogButtonClickEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentDialogButtonClickEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentDialogButtonClickEventArgs.ABI.makeIContentDialogButtonClickEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentDialogButtonClickEventArgs> {
    public override fun getValue() = ContentDialogButtonClickEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContentDialogButtonClickEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentDialogButtonClickEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContentDialogButtonClickEventArgs {
      val address = segment.toRawLongValue()
      return ContentDialogButtonClickEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContentDialogButtonClickEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
