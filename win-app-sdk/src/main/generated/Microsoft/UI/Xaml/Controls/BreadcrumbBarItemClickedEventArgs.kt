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

@ABIMarker(BreadcrumbBarItemClickedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.BreadcrumbBarItemClickedEventArgs;{1ceea503-365e-580d-bcd4-e9ad0248f6b5})")
@WinRTByReference(brClass = BreadcrumbBarItemClickedEventArgs.ByReference::class)
public class BreadcrumbBarItemClickedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBreadcrumbBarItemClickedEventArgs.WithDefault, IWinRTObject {
  private val __1609720748_Interface: IBreadcrumbBarItemClickedEventArgs.WithDefault by lazy {
    as_1609720748()
  }


  public override val __1609720748_Ptr: JNAPointer? by lazy {
    __1609720748_Interface.__1609720748_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1609720748_Interface)

  private fun as_1609720748(): IBreadcrumbBarItemClickedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBreadcrumbBarItemClickedEventArgs.ABI.makeIBreadcrumbBarItemClickedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBreadcrumbBarItemClickedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBreadcrumbBarItemClickedEventArgs.ABI.makeIBreadcrumbBarItemClickedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BreadcrumbBarItemClickedEventArgs> {
    public override fun getValue() = BreadcrumbBarItemClickedEventArgs(pointer.getPointer(0))

    public fun setValue(value: BreadcrumbBarItemClickedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BreadcrumbBarItemClickedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BreadcrumbBarItemClickedEventArgs {
      val address = segment.toRawLongValue()
      return BreadcrumbBarItemClickedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BreadcrumbBarItemClickedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
