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

@ABIMarker(PointerDownThemeAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.PointerDownThemeAnimation;{abdd1acc-40df-595d-be68-0362fe681b91})")
@WinRTByReference(brClass = PointerDownThemeAnimation.ByReference::class)
public class PointerDownThemeAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IPointerDownThemeAnimation.WithDefault, IWinRTObject {
  private val __1062921089_Interface: IPointerDownThemeAnimation.WithDefault by lazy {
    as_1062921089()
  }


  public override val __1062921089_Ptr: JNAPointer? by lazy {
    __1062921089_Interface.__1062921089_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1062921089_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1062921089(): IPointerDownThemeAnimation.WithDefault {
    if(pointer == NULL) {
      return(IPointerDownThemeAnimation.ABI.makeIPointerDownThemeAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointerDownThemeAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointerDownThemeAnimation.ABI.makeIPointerDownThemeAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PointerDownThemeAnimation> {
    public override fun getValue() = PointerDownThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: PointerDownThemeAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PointerDownThemeAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPointerDownThemeAnimationStatics_Instance: IPointerDownThemeAnimationStatics by
        lazy {
      createIPointerDownThemeAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.PointerDownThemeAnimation".toHandle(),
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

    public fun createIPointerDownThemeAnimationStatics(): IPointerDownThemeAnimationStatics {
      val refiid = Guid.REFIID(IPointerDownThemeAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.PointerDownThemeAnimation".toHandle(),refiid,interfacePtr)
      val result =
          IPointerDownThemeAnimationStatics.ABI.makeIPointerDownThemeAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PointerDownThemeAnimation {
      val address = segment.toRawLongValue()
      return PointerDownThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: PointerDownThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TargetNameProperty() =
        ABI.IPointerDownThemeAnimationStatics_Instance.get_TargetNameProperty()
  }
}
