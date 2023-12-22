package Microsoft.UI.Composition

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
@Signature("rc(Microsoft.UI.Composition.AnimationPropertyInfo;{3d721a2b-9ccd-57bd-b6c2-ce9e04ae3606})")
@WinRTByReference(brClass = AnimationPropertyInfo.ByReference::class)
public class AnimationPropertyInfo(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), IAnimationPropertyInfo.WithDefault, IAnimationPropertyInfo2.WithDefault,
    IWinRTObject {
  private val __2022211406_Interface: IAnimationPropertyInfo.WithDefault by lazy {
    as_2022211406()
  }


  private val __1735955804_Interface: IAnimationPropertyInfo2.WithDefault by lazy {
    as_1735955804()
  }


  public override val __2022211406_Ptr: JNAPointer? by lazy {
    __2022211406_Interface.__2022211406_Ptr
  }


  public override val __1735955804_Ptr: JNAPointer? by lazy {
    __1735955804_Interface.__1735955804_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2022211406_Interface, __1735955804_Interface)

  private fun as_2022211406(): IAnimationPropertyInfo.WithDefault {
    if(pointer == NULL) {
      return(IAnimationPropertyInfo.ABI.makeIAnimationPropertyInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnimationPropertyInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnimationPropertyInfo.ABI.makeIAnimationPropertyInfo(ref.value))
  }

  private fun as_1735955804(): IAnimationPropertyInfo2.WithDefault {
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
