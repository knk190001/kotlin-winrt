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

@ABIMarker(AppBroadcastStreamReader.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastStreamReader;{b338bcf9-3364-4460-b5f1-3cc2796a8aa2})")
@WinRTByReference(brClass = AppBroadcastStreamReader.ByReference::class)
public class AppBroadcastStreamReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastStreamReader.WithDefault, IWinRTObject {
  private val __235694085_Interface: IAppBroadcastStreamReader.WithDefault by lazy {
    as_235694085()
  }


  public override val __235694085_Ptr: JNAPointer? by lazy {
    __235694085_Interface.__235694085_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__235694085_Interface)

  private fun as_235694085(): IAppBroadcastStreamReader.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastStreamReader.ABI.makeIAppBroadcastStreamReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastStreamReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastStreamReader.ABI.makeIAppBroadcastStreamReader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastStreamReader> {
    public override fun getValue() = AppBroadcastStreamReader(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastStreamReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastStreamReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBroadcastStreamReader {
      val address = segment.toRawLongValue()
      return AppBroadcastStreamReader(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastStreamReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
