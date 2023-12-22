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

@ABIMarker(SectionsInViewChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.SectionsInViewChangedEventArgs;{dd49ee6b-d165-430f-a37d-b807064f85e1})")
@WinRTByReference(brClass = SectionsInViewChangedEventArgs.ByReference::class)
public class SectionsInViewChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISectionsInViewChangedEventArgs.WithDefault, IWinRTObject {
  private val __334591305_Interface: ISectionsInViewChangedEventArgs.WithDefault by lazy {
    as_334591305()
  }


  public override val __334591305_Ptr: JNAPointer? by lazy {
    __334591305_Interface.__334591305_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__334591305_Interface)

  private fun as_334591305(): ISectionsInViewChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISectionsInViewChangedEventArgs.ABI.makeISectionsInViewChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISectionsInViewChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISectionsInViewChangedEventArgs.ABI.makeISectionsInViewChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SectionsInViewChangedEventArgs> {
    public override fun getValue() = SectionsInViewChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SectionsInViewChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SectionsInViewChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SectionsInViewChangedEventArgs {
      val address = segment.toRawLongValue()
      return SectionsInViewChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SectionsInViewChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
