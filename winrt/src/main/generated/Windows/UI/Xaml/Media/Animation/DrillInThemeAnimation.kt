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

@ABIMarker(DrillInThemeAnimation.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.DrillInThemeAnimation;{b090b824-f1d2-41b8-87ba-78034126594c})")
@WinRTByReference(brClass = DrillInThemeAnimation.ByReference::class)
public class DrillInThemeAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IDrillInThemeAnimation.WithDefault, IWinRTObject {
  private val __553831541_Interface: IDrillInThemeAnimation.WithDefault by lazy {
    as_553831541()
  }


  public override val __553831541_Ptr: JNAPointer? by lazy {
    __553831541_Interface.__553831541_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__553831541_Interface)

  public constructor() : this(ABI.activate())

  private fun as_553831541(): IDrillInThemeAnimation.WithDefault {
    if(pointer == NULL) {
      return(IDrillInThemeAnimation.ABI.makeIDrillInThemeAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDrillInThemeAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDrillInThemeAnimation.ABI.makeIDrillInThemeAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DrillInThemeAnimation> {
    public override fun getValue() = DrillInThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: DrillInThemeAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DrillInThemeAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IDrillInThemeAnimationStatics_Instance: IDrillInThemeAnimationStatics by lazy {
      createIDrillInThemeAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.DrillInThemeAnimation".toHandle(),
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

    public fun createIDrillInThemeAnimationStatics(): IDrillInThemeAnimationStatics {
      val refiid = Guid.REFIID(IDrillInThemeAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.DrillInThemeAnimation".toHandle(),refiid,interfacePtr)
      val result =
          IDrillInThemeAnimationStatics.ABI.makeIDrillInThemeAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DrillInThemeAnimation {
      val address = segment.toRawLongValue()
      return DrillInThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: DrillInThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EntranceTargetNameProperty() =
        ABI.IDrillInThemeAnimationStatics_Instance.get_EntranceTargetNameProperty()

    public fun get_EntranceTargetProperty() =
        ABI.IDrillInThemeAnimationStatics_Instance.get_EntranceTargetProperty()

    public fun get_ExitTargetNameProperty() =
        ABI.IDrillInThemeAnimationStatics_Instance.get_ExitTargetNameProperty()

    public fun get_ExitTargetProperty() =
        ABI.IDrillInThemeAnimationStatics_Instance.get_ExitTargetProperty()
  }
}
