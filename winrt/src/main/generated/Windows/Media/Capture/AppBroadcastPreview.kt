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

@ABIMarker(AppBroadcastPreview.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastPreview;{14b60f5a-6e4a-4b80-a14f-67ee77d153e7})")
@WinRTByReference(brClass = AppBroadcastPreview.ByReference::class)
public class AppBroadcastPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastPreview.WithDefault, IWinRTObject {
  private val __1215914288_Interface: IAppBroadcastPreview.WithDefault by lazy {
    as_1215914288()
  }


  public override val __1215914288_Ptr: JNAPointer? by lazy {
    __1215914288_Interface.__1215914288_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1215914288_Interface)

  private fun as_1215914288(): IAppBroadcastPreview.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastPreview.ABI.makeIAppBroadcastPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastPreview.ABI.makeIAppBroadcastPreview(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastPreview> {
    public override fun getValue() = AppBroadcastPreview(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastPreview, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBroadcastPreview {
      val address = segment.toRawLongValue()
      return AppBroadcastPreview(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
