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

@ABIMarker(EntranceThemeTransition.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.EntranceThemeTransition;{07698c09-a8e3-419a-a01d-7410a0ae8ec8})")
@WinRTByReference(brClass = EntranceThemeTransition.ByReference::class)
public class EntranceThemeTransition(
  ptr: JNAPointer? = NULL
) : Transition(ptr), IEntranceThemeTransition.WithDefault, IWinRTObject {
  private val __1164552798_Interface: IEntranceThemeTransition.WithDefault by lazy {
    as_1164552798()
  }


  public override val __1164552798_Ptr: JNAPointer? by lazy {
    __1164552798_Interface.__1164552798_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1164552798_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1164552798(): IEntranceThemeTransition.WithDefault {
    if(pointer == NULL) {
      return(IEntranceThemeTransition.ABI.makeIEntranceThemeTransition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEntranceThemeTransition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEntranceThemeTransition.ABI.makeIEntranceThemeTransition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EntranceThemeTransition> {
    public override fun getValue() = EntranceThemeTransition(pointer.getPointer(0))

    public fun setValue(value: EntranceThemeTransition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EntranceThemeTransition, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IEntranceThemeTransitionStatics_Instance: IEntranceThemeTransitionStatics by lazy {
      createIEntranceThemeTransitionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.EntranceThemeTransition".toHandle(),
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

    public fun createIEntranceThemeTransitionStatics(): IEntranceThemeTransitionStatics {
      val refiid = Guid.REFIID(IEntranceThemeTransitionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.EntranceThemeTransition".toHandle(),refiid,interfacePtr)
      val result =
          IEntranceThemeTransitionStatics.ABI.makeIEntranceThemeTransitionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): EntranceThemeTransition {
      val address = segment.toRawLongValue()
      return EntranceThemeTransition(Pointer(address))
    }

    public override fun toNative(obj: EntranceThemeTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FromHorizontalOffsetProperty() =
        ABI.IEntranceThemeTransitionStatics_Instance.get_FromHorizontalOffsetProperty()

    public fun get_FromVerticalOffsetProperty() =
        ABI.IEntranceThemeTransitionStatics_Instance.get_FromVerticalOffsetProperty()

    public fun get_IsStaggeringEnabledProperty() =
        ABI.IEntranceThemeTransitionStatics_Instance.get_IsStaggeringEnabledProperty()
  }
}
