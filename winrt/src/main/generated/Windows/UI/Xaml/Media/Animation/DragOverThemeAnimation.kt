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

@ABIMarker(DragOverThemeAnimation.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.DragOverThemeAnimation;{72f762f7-7e51-4a6b-b937-dc4b4c1c5458})")
@WinRTByReference(brClass = DragOverThemeAnimation.ByReference::class)
public class DragOverThemeAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IDragOverThemeAnimation.WithDefault, IWinRTObject {
  private val __1647943561_Interface: IDragOverThemeAnimation.WithDefault by lazy {
    as_1647943561()
  }


  public override val __1647943561_Ptr: JNAPointer? by lazy {
    __1647943561_Interface.__1647943561_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1647943561_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1647943561(): IDragOverThemeAnimation.WithDefault {
    if(pointer == NULL) {
      return(IDragOverThemeAnimation.ABI.makeIDragOverThemeAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDragOverThemeAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDragOverThemeAnimation.ABI.makeIDragOverThemeAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DragOverThemeAnimation> {
    public override fun getValue() = DragOverThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: DragOverThemeAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DragOverThemeAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IDragOverThemeAnimationStatics_Instance: IDragOverThemeAnimationStatics by lazy {
      createIDragOverThemeAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.DragOverThemeAnimation".toHandle(),
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

    public fun createIDragOverThemeAnimationStatics(): IDragOverThemeAnimationStatics {
      val refiid = Guid.REFIID(IDragOverThemeAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.DragOverThemeAnimation".toHandle(),refiid,interfacePtr)
      val result =
          IDragOverThemeAnimationStatics.ABI.makeIDragOverThemeAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DragOverThemeAnimation {
      val address = segment.toRawLongValue()
      return DragOverThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: DragOverThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TargetNameProperty() =
        ABI.IDragOverThemeAnimationStatics_Instance.get_TargetNameProperty()

    public fun get_ToOffsetProperty() =
        ABI.IDragOverThemeAnimationStatics_Instance.get_ToOffsetProperty()

    public fun get_DirectionProperty() =
        ABI.IDragOverThemeAnimationStatics_Instance.get_DirectionProperty()
  }
}
