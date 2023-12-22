package Windows.ApplicationModel.Core

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

@ABIMarker(CoreApplicationViewTitleBar.ABI::class)
@Signature("rc(Windows.ApplicationModel.Core.CoreApplicationViewTitleBar;{006d35e3-e1f1-431b-9508-29b96926ac53})")
@WinRTByReference(brClass = CoreApplicationViewTitleBar.ByReference::class)
public class CoreApplicationViewTitleBar(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreApplicationViewTitleBar.WithDefault, IWinRTObject {
  private val __1351628049_Interface: ICoreApplicationViewTitleBar.WithDefault by lazy {
    as_1351628049()
  }


  public override val __1351628049_Ptr: JNAPointer? by lazy {
    __1351628049_Interface.__1351628049_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1351628049_Interface)

  private fun as_1351628049(): ICoreApplicationViewTitleBar.WithDefault {
    if(pointer == NULL) {
      return(ICoreApplicationViewTitleBar.ABI.makeICoreApplicationViewTitleBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreApplicationViewTitleBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreApplicationViewTitleBar.ABI.makeICoreApplicationViewTitleBar(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreApplicationViewTitleBar> {
    public override fun getValue() = CoreApplicationViewTitleBar(pointer.getPointer(0))

    public fun setValue(value: CoreApplicationViewTitleBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreApplicationViewTitleBar, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreApplicationViewTitleBar {
      val address = segment.toRawLongValue()
      return CoreApplicationViewTitleBar(Pointer(address))
    }

    public override fun toNative(obj: CoreApplicationViewTitleBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
