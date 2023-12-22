package Windows.UI.Composition

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PathKeyFrameAnimation.ABI::class)
@Signature("rc(Windows.UI.Composition.PathKeyFrameAnimation;{9d0d18c9-1576-4b3f-be60-1d5031f5e71b})")
@WinRTByReference(brClass = PathKeyFrameAnimation.ByReference::class)
public class PathKeyFrameAnimation(
  ptr: JNAPointer? = NULL
) : KeyFrameAnimation(ptr), IPathKeyFrameAnimation.WithDefault, IWinRTObject {
  private val __1460572227_Interface: IPathKeyFrameAnimation.WithDefault by lazy {
    as_1460572227()
  }


  public override val __1460572227_Ptr: JNAPointer? by lazy {
    __1460572227_Interface.__1460572227_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1460572227_Interface)

  private fun as_1460572227(): IPathKeyFrameAnimation.WithDefault {
    if(pointer == NULL) {
      return(IPathKeyFrameAnimation.ABI.makeIPathKeyFrameAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPathKeyFrameAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPathKeyFrameAnimation.ABI.makeIPathKeyFrameAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PathKeyFrameAnimation> {
    public override fun getValue() = PathKeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: PathKeyFrameAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PathKeyFrameAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PathKeyFrameAnimation {
      val address = segment.toRawLongValue()
      return PathKeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: PathKeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
