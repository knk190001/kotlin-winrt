package Windows.System.Profile

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

@ABIMarker(AnalyticsVersionInfo.ABI::class)
@Signature("rc(Windows.System.Profile.AnalyticsVersionInfo;{926130b8-9955-4c74-bdc1-7cd0decf9b03})")
@WinRTByReference(brClass = AnalyticsVersionInfo.ByReference::class)
public class AnalyticsVersionInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAnalyticsVersionInfo.WithDefault, IAnalyticsVersionInfo2.WithDefault,
    IWinRTObject {
  private val __1878501236_Interface: IAnalyticsVersionInfo.WithDefault by lazy {
    as_1878501236()
  }


  private val __1896003778_Interface: IAnalyticsVersionInfo2.WithDefault by lazy {
    as_1896003778()
  }


  public override val __1878501236_Ptr: JNAPointer? by lazy {
    __1878501236_Interface.__1878501236_Ptr
  }


  public override val __1896003778_Ptr: JNAPointer? by lazy {
    __1896003778_Interface.__1896003778_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1878501236_Interface, __1896003778_Interface)

  private fun as_1878501236(): IAnalyticsVersionInfo.WithDefault {
    if(pointer == NULL) {
      return(IAnalyticsVersionInfo.ABI.makeIAnalyticsVersionInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnalyticsVersionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnalyticsVersionInfo.ABI.makeIAnalyticsVersionInfo(ref.value))
  }

  private fun as_1896003778(): IAnalyticsVersionInfo2.WithDefault {
    if(pointer == NULL) {
      return(IAnalyticsVersionInfo2.ABI.makeIAnalyticsVersionInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnalyticsVersionInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnalyticsVersionInfo2.ABI.makeIAnalyticsVersionInfo2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AnalyticsVersionInfo> {
    public override fun getValue() = AnalyticsVersionInfo(pointer.getPointer(0))

    public fun setValue(value: AnalyticsVersionInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AnalyticsVersionInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AnalyticsVersionInfo {
      val address = segment.toRawLongValue()
      return AnalyticsVersionInfo(Pointer(address))
    }

    public override fun toNative(obj: AnalyticsVersionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
