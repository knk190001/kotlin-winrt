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

@ABIMarker(AppBroadcastPreviewStreamVideoHeader.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastPreviewStreamVideoHeader;{8bef6113-da84-4499-a7ab-87118cb4a157})")
@WinRTByReference(brClass = AppBroadcastPreviewStreamVideoHeader.ByReference::class)
public class AppBroadcastPreviewStreamVideoHeader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastPreviewStreamVideoHeader.WithDefault, IWinRTObject {
  private val __1816946680_Interface: IAppBroadcastPreviewStreamVideoHeader.WithDefault by lazy {
    as_1816946680()
  }


  public override val __1816946680_Ptr: JNAPointer? by lazy {
    __1816946680_Interface.__1816946680_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1816946680_Interface)

  private fun as_1816946680(): IAppBroadcastPreviewStreamVideoHeader.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastPreviewStreamVideoHeader.ABI.makeIAppBroadcastPreviewStreamVideoHeader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastPreviewStreamVideoHeader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastPreviewStreamVideoHeader.ABI.makeIAppBroadcastPreviewStreamVideoHeader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastPreviewStreamVideoHeader> {
    public override fun getValue() = AppBroadcastPreviewStreamVideoHeader(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastPreviewStreamVideoHeader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastPreviewStreamVideoHeader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBroadcastPreviewStreamVideoHeader {
      val address = segment.toRawLongValue()
      return AppBroadcastPreviewStreamVideoHeader(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastPreviewStreamVideoHeader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
