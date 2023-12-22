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

@ABIMarker(RepositionThemeTransition.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.RepositionThemeTransition;{7728e3f0-24b1-5484-824a-c0b41c2745d5})")
@WinRTByReference(brClass = RepositionThemeTransition.ByReference::class)
public class RepositionThemeTransition(
  ptr: JNAPointer? = NULL
) : Transition(ptr), IRepositionThemeTransition.WithDefault, IWinRTObject {
  private val __1810823783_Interface: IRepositionThemeTransition.WithDefault by lazy {
    as_1810823783()
  }


  public override val __1810823783_Ptr: JNAPointer? by lazy {
    __1810823783_Interface.__1810823783_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1810823783_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1810823783(): IRepositionThemeTransition.WithDefault {
    if(pointer == NULL) {
      return(IRepositionThemeTransition.ABI.makeIRepositionThemeTransition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRepositionThemeTransition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRepositionThemeTransition.ABI.makeIRepositionThemeTransition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RepositionThemeTransition> {
    public override fun getValue() = RepositionThemeTransition(pointer.getPointer(0))

    public fun setValue(value: RepositionThemeTransition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RepositionThemeTransition, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IRepositionThemeTransitionStatics_Instance: IRepositionThemeTransitionStatics by
        lazy {
      createIRepositionThemeTransitionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.RepositionThemeTransition".toHandle(),
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

    public fun createIRepositionThemeTransitionStatics(): IRepositionThemeTransitionStatics {
      val refiid = Guid.REFIID(IRepositionThemeTransitionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.RepositionThemeTransition".toHandle(),refiid,interfacePtr)
      val result =
          IRepositionThemeTransitionStatics.ABI.makeIRepositionThemeTransitionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RepositionThemeTransition {
      val address = segment.toRawLongValue()
      return RepositionThemeTransition(Pointer(address))
    }

    public override fun toNative(obj: RepositionThemeTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsStaggeringEnabledProperty() =
        ABI.IRepositionThemeTransitionStatics_Instance.get_IsStaggeringEnabledProperty()
  }
}
