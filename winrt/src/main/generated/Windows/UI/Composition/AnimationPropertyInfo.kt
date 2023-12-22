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

@ABIMarker(AnimationPropertyInfo.ABI::class)
@Signature("rc(Windows.UI.Composition.AnimationPropertyInfo;{f4716f05-ed77-4e3c-b328-5c3985b3738f})")
@WinRTByReference(brClass = AnimationPropertyInfo.ByReference::class)
public class AnimationPropertyInfo(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), IAnimationPropertyInfo.WithDefault, IAnimationPropertyInfo2.WithDefault,
    IWinRTObject {
  private val __1003004199_Interface: IAnimationPropertyInfo.WithDefault by lazy {
    as_1003004199()
  }


  private val __1028359047_Interface: IAnimationPropertyInfo2.WithDefault by lazy {
    as_1028359047()
  }


  public override val __1003004199_Ptr: JNAPointer? by lazy {
    __1003004199_Interface.__1003004199_Ptr
  }


  public override val __1028359047_Ptr: JNAPointer? by lazy {
    __1028359047_Interface.__1028359047_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1003004199_Interface, __1028359047_Interface)

  private fun as_1003004199(): IAnimationPropertyInfo.WithDefault {
    if(pointer == NULL) {
      return(IAnimationPropertyInfo.ABI.makeIAnimationPropertyInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnimationPropertyInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnimationPropertyInfo.ABI.makeIAnimationPropertyInfo(ref.value))
  }

  private fun as_1028359047(): IAnimationPropertyInfo2.WithDefault {
    if(pointer == NULL) {
      return(IAnimationPropertyInfo2.ABI.makeIAnimationPropertyInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnimationPropertyInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnimationPropertyInfo2.ABI.makeIAnimationPropertyInfo2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AnimationPropertyInfo> {
    public override fun getValue() = AnimationPropertyInfo(pointer.getPointer(0))

    public fun setValue(value: AnimationPropertyInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AnimationPropertyInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AnimationPropertyInfo {
      val address = segment.toRawLongValue()
      return AnimationPropertyInfo(Pointer(address))
    }

    public override fun toNative(obj: AnimationPropertyInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
