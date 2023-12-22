package Windows.UI.Xaml.Media.Animation

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(DragItemThemeAnimation.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.DragItemThemeAnimation;{0c7d5db5-7ed6-4949-b4e6-a78c9f4f978d})")
@WinRTByReference(brClass = DragItemThemeAnimation.ByReference::class)
public class DragItemThemeAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IDragItemThemeAnimation.WithDefault, IWinRTObject {
  private val __1680966536_Interface: IDragItemThemeAnimation.WithDefault by lazy {
    as_1680966536()
  }


  public override val __1680966536_Ptr: JNAPointer? by lazy {
    __1680966536_Interface.__1680966536_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1680966536_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1680966536(): IDragItemThemeAnimation.WithDefault {
    if(pointer == NULL) {
      return(IDragItemThemeAnimation.ABI.makeIDragItemThemeAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDragItemThemeAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDragItemThemeAnimation.ABI.makeIDragItemThemeAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DragItemThemeAnimation> {
    public override fun getValue() = DragItemThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: DragItemThemeAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DragItemThemeAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IDragItemThemeAnimationStatics_Instance: IDragItemThemeAnimationStatics by lazy {
      createIDragItemThemeAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.DragItemThemeAnimation".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIDragItemThemeAnimationStatics(): IDragItemThemeAnimationStatics {
      val refiid = Guid.REFIID(IDragItemThemeAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.DragItemThemeAnimation".toHandle(),refiid,interfacePtr)
      val result =
          IDragItemThemeAnimationStatics.ABI.makeIDragItemThemeAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DragItemThemeAnimation {
      val address = segment.toRawLongValue()
      return DragItemThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: DragItemThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TargetNameProperty() =
        ABI.IDragItemThemeAnimationStatics_Instance.get_TargetNameProperty()
  }
}
