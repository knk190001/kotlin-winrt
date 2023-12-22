package Windows.Services.Maps.LocalSearch

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

@ABIMarker(LocalLocationRatingInfo.ABI::class)
@Signature("rc(Windows.Services.Maps.LocalSearch.LocalLocationRatingInfo;{cb1dab56-3354-4311-8bc0-a2d4d5eb806e})")
@WinRTByReference(brClass = LocalLocationRatingInfo.ByReference::class)
public class LocalLocationRatingInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILocalLocationRatingInfo.WithDefault, IWinRTObject {
  private val __35029373_Interface: ILocalLocationRatingInfo.WithDefault by lazy {
    as_35029373()
  }


  public override val __35029373_Ptr: JNAPointer? by lazy {
    __35029373_Interface.__35029373_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__35029373_Interface)

  private fun as_35029373(): ILocalLocationRatingInfo.WithDefault {
    if(pointer == NULL) {
      return(ILocalLocationRatingInfo.ABI.makeILocalLocationRatingInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILocalLocationRatingInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILocalLocationRatingInfo.ABI.makeILocalLocationRatingInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LocalLocationRatingInfo> {
    public override fun getValue() = LocalLocationRatingInfo(pointer.getPointer(0))

    public fun setValue(value: LocalLocationRatingInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LocalLocationRatingInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LocalLocationRatingInfo {
      val address = segment.toRawLongValue()
      return LocalLocationRatingInfo(Pointer(address))
    }

    public override fun toNative(obj: LocalLocationRatingInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
