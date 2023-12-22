package Windows.UI.Core.AnimationMetrics

import Windows.UI.Core.AnimationMetrics.IAnimationDescriptionFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(AnimationDescription.ABI::class)
@Signature("rc(Windows.UI.Core.AnimationMetrics.AnimationDescription;{7d11a549-be3d-41de-b081-05c149962f9b})")
@WinRTByReference(brClass = AnimationDescription.ByReference::class)
public class AnimationDescription(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAnimationDescription.WithDefault, IWinRTObject {
  private val __1187980482_Interface: IAnimationDescription.WithDefault by lazy {
    as_1187980482()
  }


  public override val __1187980482_Ptr: JNAPointer? by lazy {
    __1187980482_Interface.__1187980482_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1187980482_Interface)

  public constructor(effect: AnimationEffect, target: AnimationEffectTarget) :
      this(ABI.activate(effect, target))

  private fun as_1187980482(): IAnimationDescription.WithDefault {
    if(pointer == NULL) {
      return(IAnimationDescription.ABI.makeIAnimationDescription(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnimationDescription>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnimationDescription.ABI.makeIAnimationDescription(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AnimationDescription> {
    public override fun getValue() = AnimationDescription(pointer.getPointer(0))

    public fun setValue(value: AnimationDescription): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AnimationDescription, MemoryAddress> {
    public val IAnimationDescriptionFactory_Instance: IAnimationDescriptionFactory by lazy {
      createIAnimationDescriptionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAnimationDescriptionFactory(): IAnimationDescriptionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Core.AnimationMetrics.AnimationDescription".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAnimationDescriptionFactory.ABI.makeIAnimationDescriptionFactory(factoryActivatorPtr.value))
    }

    public fun activate(effect: AnimationEffect, target: AnimationEffectTarget): JNAPointer? =
        IAnimationDescriptionFactory_Instance.CreateInstance(effect, target)?.pointer

    public override fun fromNative(segment: MemoryAddress): AnimationDescription {
      val address = segment.toRawLongValue()
      return AnimationDescription(Pointer(address))
    }

    public override fun toNative(obj: AnimationDescription): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
