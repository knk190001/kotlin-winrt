package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.DependencyObject
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Storyboard.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.Storyboard;{04d41bb3-8721-519e-8e53-fb8b34920305})")
@WinRTByReference(brClass = Storyboard.ByReference::class)
public class Storyboard(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IStoryboard.WithDefault, IWinRTObject {
  private val __1021348020_Interface: IStoryboard.WithDefault by lazy {
    as_1021348020()
  }


  public override val __1021348020_Ptr: JNAPointer? by lazy {
    __1021348020_Interface.__1021348020_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1021348020_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1021348020(): IStoryboard.WithDefault {
    if(pointer == NULL) {
      return(IStoryboard.ABI.makeIStoryboard(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoryboard>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoryboard.ABI.makeIStoryboard(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Storyboard> {
    public override fun getValue() = Storyboard(pointer.getPointer(0))

    public fun setValue(value: Storyboard): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Storyboard, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IStoryboardStatics_Instance: IStoryboardStatics by lazy {
      createIStoryboardStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.Storyboard".toHandle(),
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

    public fun createIStoryboardStatics(): IStoryboardStatics {
      val refiid = Guid.REFIID(IStoryboardStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.Storyboard".toHandle(),refiid,interfacePtr)
      val result = IStoryboardStatics.ABI.makeIStoryboardStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Storyboard {
      val address = segment.toRawLongValue()
      return Storyboard(Pointer(address))
    }

    public override fun toNative(obj: Storyboard): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TargetPropertyProperty() =
        ABI.IStoryboardStatics_Instance.get_TargetPropertyProperty()

    public fun GetTargetProperty(element: Timeline) =
        ABI.IStoryboardStatics_Instance.GetTargetProperty(element)

    public fun SetTargetProperty(element: Timeline, path: String) =
        ABI.IStoryboardStatics_Instance.SetTargetProperty(element, path)

    public fun get_TargetNameProperty() = ABI.IStoryboardStatics_Instance.get_TargetNameProperty()

    public fun GetTargetName(element: Timeline) =
        ABI.IStoryboardStatics_Instance.GetTargetName(element)

    public fun SetTargetName(element: Timeline, name: String) =
        ABI.IStoryboardStatics_Instance.SetTargetName(element, name)

    public fun SetTarget(timeline: Timeline, target: DependencyObject) =
        ABI.IStoryboardStatics_Instance.SetTarget(timeline, target)
  }
}
