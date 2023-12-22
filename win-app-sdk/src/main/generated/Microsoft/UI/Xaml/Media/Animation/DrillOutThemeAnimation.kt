package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(DrillOutThemeAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.DrillOutThemeAnimation;{9a93b9cc-925f-525a-9eac-55d39db3d314})")
@WinRTByReference(brClass = DrillOutThemeAnimation.ByReference::class)
public class DrillOutThemeAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IDrillOutThemeAnimation.WithDefault, IWinRTObject {
  private val __1359317833_Interface: IDrillOutThemeAnimation.WithDefault by lazy {
    as_1359317833()
  }


  public override val __1359317833_Ptr: JNAPointer? by lazy {
    __1359317833_Interface.__1359317833_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1359317833_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1359317833(): IDrillOutThemeAnimation.WithDefault {
    if(pointer == NULL) {
      return(IDrillOutThemeAnimation.ABI.makeIDrillOutThemeAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDrillOutThemeAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDrillOutThemeAnimation.ABI.makeIDrillOutThemeAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DrillOutThemeAnimation> {
    public override fun getValue() = DrillOutThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: DrillOutThemeAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DrillOutThemeAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IDrillOutThemeAnimationStatics_Instance: IDrillOutThemeAnimationStatics by lazy {
      createIDrillOutThemeAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.DrillOutThemeAnimation".toHandle(),
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

    public fun createIDrillOutThemeAnimationStatics(): IDrillOutThemeAnimationStatics {
      val refiid = Guid.REFIID(IDrillOutThemeAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.DrillOutThemeAnimation".toHandle(),refiid,interfacePtr)
      val result =
          IDrillOutThemeAnimationStatics.ABI.makeIDrillOutThemeAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DrillOutThemeAnimation {
      val address = segment.toRawLongValue()
      return DrillOutThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: DrillOutThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EntranceTargetNameProperty() =
        ABI.IDrillOutThemeAnimationStatics_Instance.get_EntranceTargetNameProperty()

    public fun get_EntranceTargetProperty() =
        ABI.IDrillOutThemeAnimationStatics_Instance.get_EntranceTargetProperty()

    public fun get_ExitTargetNameProperty() =
        ABI.IDrillOutThemeAnimationStatics_Instance.get_ExitTargetNameProperty()

    public fun get_ExitTargetProperty() =
        ABI.IDrillOutThemeAnimationStatics_Instance.get_ExitTargetProperty()
  }
}
