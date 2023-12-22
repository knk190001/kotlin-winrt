package Windows.Media.Streaming.Adaptive

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

@ABIMarker(AdaptiveMediaSourceCreationResult.ABI::class)
@Signature("rc(Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceCreationResult;{4686b6b2-800f-4e31-9093-76d4782013e7})")
@WinRTByReference(brClass = AdaptiveMediaSourceCreationResult.ByReference::class)
public class AdaptiveMediaSourceCreationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdaptiveMediaSourceCreationResult.WithDefault,
    IAdaptiveMediaSourceCreationResult2.WithDefault, IWinRTObject {
  private val __385018285_Interface: IAdaptiveMediaSourceCreationResult.WithDefault by lazy {
    as_385018285()
  }


  private val __949335103_Interface: IAdaptiveMediaSourceCreationResult2.WithDefault by lazy {
    as_949335103()
  }


  public override val __385018285_Ptr: JNAPointer? by lazy {
    __385018285_Interface.__385018285_Ptr
  }


  public override val __949335103_Ptr: JNAPointer? by lazy {
    __949335103_Interface.__949335103_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__385018285_Interface, __949335103_Interface)

  private fun as_385018285(): IAdaptiveMediaSourceCreationResult.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceCreationResult.ABI.makeIAdaptiveMediaSourceCreationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceCreationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceCreationResult.ABI.makeIAdaptiveMediaSourceCreationResult(ref.value))
  }

  private fun as_949335103(): IAdaptiveMediaSourceCreationResult2.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceCreationResult2.ABI.makeIAdaptiveMediaSourceCreationResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceCreationResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceCreationResult2.ABI.makeIAdaptiveMediaSourceCreationResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdaptiveMediaSourceCreationResult> {
    public override fun getValue() = AdaptiveMediaSourceCreationResult(pointer.getPointer(0))

    public fun setValue(value: AdaptiveMediaSourceCreationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdaptiveMediaSourceCreationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AdaptiveMediaSourceCreationResult {
      val address = segment.toRawLongValue()
      return AdaptiveMediaSourceCreationResult(Pointer(address))
    }

    public override fun toNative(obj: AdaptiveMediaSourceCreationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
