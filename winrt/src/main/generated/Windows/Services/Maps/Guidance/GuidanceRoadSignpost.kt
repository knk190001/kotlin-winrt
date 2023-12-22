package Windows.Services.Maps.Guidance

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

@ABIMarker(GuidanceRoadSignpost.ABI::class)
@Signature("rc(Windows.Services.Maps.Guidance.GuidanceRoadSignpost;{f1a728b6-f77a-4742-8312-53300f9845f0})")
@WinRTByReference(brClass = GuidanceRoadSignpost.ByReference::class)
public class GuidanceRoadSignpost(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGuidanceRoadSignpost.WithDefault, IWinRTObject {
  private val __957126796_Interface: IGuidanceRoadSignpost.WithDefault by lazy {
    as_957126796()
  }


  public override val __957126796_Ptr: JNAPointer? by lazy {
    __957126796_Interface.__957126796_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__957126796_Interface)

  private fun as_957126796(): IGuidanceRoadSignpost.WithDefault {
    if(pointer == NULL) {
      return(IGuidanceRoadSignpost.ABI.makeIGuidanceRoadSignpost(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGuidanceRoadSignpost>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGuidanceRoadSignpost.ABI.makeIGuidanceRoadSignpost(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GuidanceRoadSignpost> {
    public override fun getValue() = GuidanceRoadSignpost(pointer.getPointer(0))

    public fun setValue(value: GuidanceRoadSignpost): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GuidanceRoadSignpost, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GuidanceRoadSignpost {
      val address = segment.toRawLongValue()
      return GuidanceRoadSignpost(Pointer(address))
    }

    public override fun toNative(obj: GuidanceRoadSignpost): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
