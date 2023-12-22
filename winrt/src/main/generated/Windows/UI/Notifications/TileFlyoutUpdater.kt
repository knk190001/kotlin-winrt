package Windows.UI.Notifications

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

@ABIMarker(TileFlyoutUpdater.ABI::class)
@Signature("rc(Windows.UI.Notifications.TileFlyoutUpdater;{8d40c76a-c465-4052-a740-5c2654c1a089})")
@WinRTByReference(brClass = TileFlyoutUpdater.ByReference::class)
public class TileFlyoutUpdater(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITileFlyoutUpdater.WithDefault, IWinRTObject {
  private val __1491627984_Interface: ITileFlyoutUpdater.WithDefault by lazy {
    as_1491627984()
  }


  public override val __1491627984_Ptr: JNAPointer? by lazy {
    __1491627984_Interface.__1491627984_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1491627984_Interface)

  private fun as_1491627984(): ITileFlyoutUpdater.WithDefault {
    if(pointer == NULL) {
      return(ITileFlyoutUpdater.ABI.makeITileFlyoutUpdater(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITileFlyoutUpdater>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITileFlyoutUpdater.ABI.makeITileFlyoutUpdater(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TileFlyoutUpdater> {
    public override fun getValue() = TileFlyoutUpdater(pointer.getPointer(0))

    public fun setValue(value: TileFlyoutUpdater): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TileFlyoutUpdater, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TileFlyoutUpdater {
      val address = segment.toRawLongValue()
      return TileFlyoutUpdater(Pointer(address))
    }

    public override fun toNative(obj: TileFlyoutUpdater): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
