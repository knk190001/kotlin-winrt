package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(FlyoutBaseClosingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.FlyoutBaseClosingEventArgs;{7cb280b4-1cca-5a5a-8ea4-191a2bbc8b32})")
@WinRTByReference(brClass = FlyoutBaseClosingEventArgs.ByReference::class)
public class FlyoutBaseClosingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFlyoutBaseClosingEventArgs.WithDefault, IWinRTObject {
  private val __1325625855_Interface: IFlyoutBaseClosingEventArgs.WithDefault by lazy {
    as_1325625855()
  }


  public override val __1325625855_Ptr: JNAPointer? by lazy {
    __1325625855_Interface.__1325625855_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1325625855_Interface)

  private fun as_1325625855(): IFlyoutBaseClosingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IFlyoutBaseClosingEventArgs.ABI.makeIFlyoutBaseClosingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyoutBaseClosingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyoutBaseClosingEventArgs.ABI.makeIFlyoutBaseClosingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FlyoutBaseClosingEventArgs> {
    public override fun getValue() = FlyoutBaseClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: FlyoutBaseClosingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FlyoutBaseClosingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FlyoutBaseClosingEventArgs {
      val address = segment.toRawLongValue()
      return FlyoutBaseClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: FlyoutBaseClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
