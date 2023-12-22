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

@ABIMarker(RepositionThemeAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.RepositionThemeAnimation;{36f7e025-23c1-53de-8df9-7dc1e9c788fd})")
@WinRTByReference(brClass = RepositionThemeAnimation.ByReference::class)
public class RepositionThemeAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IRepositionThemeAnimation.WithDefault, IWinRTObject {
  private val __262710322_Interface: IRepositionThemeAnimation.WithDefault by lazy {
    as_262710322()
  }


  public override val __262710322_Ptr: JNAPointer? by lazy {
    __262710322_Interface.__262710322_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__262710322_Interface)

  public constructor() : this(ABI.activate())

  private fun as_262710322(): IRepositionThemeAnimation.WithDefault {
    if(pointer == NULL) {
      return(IRepositionThemeAnimation.ABI.makeIRepositionThemeAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRepositionThemeAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRepositionThemeAnimation.ABI.makeIRepositionThemeAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RepositionThemeAnimation> {
    public override fun getValue() = RepositionThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: RepositionThemeAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RepositionThemeAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IRepositionThemeAnimationStatics_Instance: IRepositionThemeAnimationStatics by lazy {
      createIRepositionThemeAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.RepositionThemeAnimation".toHandle(),
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

    public fun createIRepositionThemeAnimationStatics(): IRepositionThemeAnimationStatics {
      val refiid = Guid.REFIID(IRepositionThemeAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.RepositionThemeAnimation".toHandle(),refiid,interfacePtr)
      val result =
          IRepositionThemeAnimationStatics.ABI.makeIRepositionThemeAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RepositionThemeAnimation {
      val address = segment.toRawLongValue()
      return RepositionThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: RepositionThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TargetNameProperty() =
        ABI.IRepositionThemeAnimationStatics_Instance.get_TargetNameProperty()

    public fun get_FromHorizontalOffsetProperty() =
        ABI.IRepositionThemeAnimationStatics_Instance.get_FromHorizontalOffsetProperty()

    public fun get_FromVerticalOffsetProperty() =
        ABI.IRepositionThemeAnimationStatics_Instance.get_FromVerticalOffsetProperty()
  }
}
