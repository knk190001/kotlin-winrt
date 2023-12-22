package Windows.Media.Capture

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

@ABIMarker(AppBroadcastPlugIn.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastPlugIn;{520c1e66-6513-4574-ac54-23b79729615b})")
@WinRTByReference(brClass = AppBroadcastPlugIn.ByReference::class)
public class AppBroadcastPlugIn(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastPlugIn.WithDefault, IWinRTObject {
  private val __1419616491_Interface: IAppBroadcastPlugIn.WithDefault by lazy {
    as_1419616491()
  }


  public override val __1419616491_Ptr: JNAPointer? by lazy {
    __1419616491_Interface.__1419616491_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1419616491_Interface)

  private fun as_1419616491(): IAppBroadcastPlugIn.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastPlugIn.ABI.makeIAppBroadcastPlugIn(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastPlugIn>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastPlugIn.ABI.makeIAppBroadcastPlugIn(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastPlugIn> {
    public override fun getValue() = AppBroadcastPlugIn(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastPlugIn): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastPlugIn, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBroadcastPlugIn {
      val address = segment.toRawLongValue()
      return AppBroadcastPlugIn(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastPlugIn): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
