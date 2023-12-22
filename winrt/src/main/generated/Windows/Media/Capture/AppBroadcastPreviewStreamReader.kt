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

@ABIMarker(AppBroadcastPreviewStreamReader.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastPreviewStreamReader;{92228d50-db3f-40a8-8cd4-f4e371ddab37})")
@WinRTByReference(brClass = AppBroadcastPreviewStreamReader.ByReference::class)
public class AppBroadcastPreviewStreamReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastPreviewStreamReader.WithDefault, IWinRTObject {
  private val __1794269619_Interface: IAppBroadcastPreviewStreamReader.WithDefault by lazy {
    as_1794269619()
  }


  public override val __1794269619_Ptr: JNAPointer? by lazy {
    __1794269619_Interface.__1794269619_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1794269619_Interface)

  private fun as_1794269619(): IAppBroadcastPreviewStreamReader.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastPreviewStreamReader.ABI.makeIAppBroadcastPreviewStreamReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastPreviewStreamReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastPreviewStreamReader.ABI.makeIAppBroadcastPreviewStreamReader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastPreviewStreamReader> {
    public override fun getValue() = AppBroadcastPreviewStreamReader(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastPreviewStreamReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastPreviewStreamReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBroadcastPreviewStreamReader {
      val address = segment.toRawLongValue()
      return AppBroadcastPreviewStreamReader(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastPreviewStreamReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
