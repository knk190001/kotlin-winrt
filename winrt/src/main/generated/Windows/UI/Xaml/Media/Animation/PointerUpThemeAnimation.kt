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

@ABIMarker(PointerUpThemeAnimation.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.PointerUpThemeAnimation;{e9e9d07d-6340-4828-ad12-690694b9910b})")
@WinRTByReference(brClass = PointerUpThemeAnimation.ByReference::class)
public class PointerUpThemeAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IPointerUpThemeAnimation.WithDefault, IWinRTObject {
  private val __1303043379_Interface: IPointerUpThemeAnimation.WithDefault by lazy {
    as_1303043379()
  }


  public override val __1303043379_Ptr: JNAPointer? by lazy {
    __1303043379_Interface.__1303043379_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1303043379_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1303043379(): IPointerUpThemeAnimation.WithDefault {
    if(pointer == NULL) {
      return(IPointerUpThemeAnimation.ABI.makeIPointerUpThemeAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointerUpThemeAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointerUpThemeAnimation.ABI.makeIPointerUpThemeAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PointerUpThemeAnimation> {
    public override fun getValue() = PointerUpThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: PointerUpThemeAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PointerUpThemeAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPointerUpThemeAnimationStatics_Instance: IPointerUpThemeAnimationStatics by lazy {
      createIPointerUpThemeAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.PointerUpThemeAnimation".toHandle(),
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

    public fun createIPointerUpThemeAnimationStatics(): IPointerUpThemeAnimationStatics {
      val refiid = Guid.REFIID(IPointerUpThemeAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.PointerUpThemeAnimation".toHandle(),refiid,interfacePtr)
      val result =
          IPointerUpThemeAnimationStatics.ABI.makeIPointerUpThemeAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PointerUpThemeAnimation {
      val address = segment.toRawLongValue()
      return PointerUpThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: PointerUpThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TargetNameProperty() =
        ABI.IPointerUpThemeAnimationStatics_Instance.get_TargetNameProperty()
  }
}
