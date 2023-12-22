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

@ABIMarker(AppBroadcastBackgroundServiceStreamInfo.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastBackgroundServiceStreamInfo;{31dc02bc-990a-4904-aa96-fe364381f136})")
@WinRTByReference(brClass = AppBroadcastBackgroundServiceStreamInfo.ByReference::class)
public class AppBroadcastBackgroundServiceStreamInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastBackgroundServiceStreamInfo.WithDefault,
    IAppBroadcastBackgroundServiceStreamInfo2.WithDefault, IWinRTObject {
  private val __1727517373_Interface: IAppBroadcastBackgroundServiceStreamInfo.WithDefault by lazy {
    as_1727517373()
  }


  private val __2013431061_Interface: IAppBroadcastBackgroundServiceStreamInfo2.WithDefault by
      lazy {
    as_2013431061()
  }


  public override val __1727517373_Ptr: JNAPointer? by lazy {
    __1727517373_Interface.__1727517373_Ptr
  }


  public override val __2013431061_Ptr: JNAPointer? by lazy {
    __2013431061_Interface.__2013431061_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1727517373_Interface, __2013431061_Interface)

  private fun as_1727517373(): IAppBroadcastBackgroundServiceStreamInfo.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastBackgroundServiceStreamInfo.ABI.makeIAppBroadcastBackgroundServiceStreamInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastBackgroundServiceStreamInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastBackgroundServiceStreamInfo.ABI.makeIAppBroadcastBackgroundServiceStreamInfo(ref.value))
  }

  private fun as_2013431061(): IAppBroadcastBackgroundServiceStreamInfo2.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastBackgroundServiceStreamInfo2.ABI.makeIAppBroadcastBackgroundServiceStreamInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastBackgroundServiceStreamInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastBackgroundServiceStreamInfo2.ABI.makeIAppBroadcastBackgroundServiceStreamInfo2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastBackgroundServiceStreamInfo> {
    public override fun getValue() = AppBroadcastBackgroundServiceStreamInfo(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastBackgroundServiceStreamInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastBackgroundServiceStreamInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppBroadcastBackgroundServiceStreamInfo {
      val address = segment.toRawLongValue()
      return AppBroadcastBackgroundServiceStreamInfo(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastBackgroundServiceStreamInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
