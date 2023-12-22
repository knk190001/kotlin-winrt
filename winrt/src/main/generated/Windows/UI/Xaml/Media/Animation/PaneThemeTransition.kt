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

@ABIMarker(PaneThemeTransition.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.PaneThemeTransition;{4708eb8e-4bfc-ee46-d4f9-708def3fbb2b})")
@WinRTByReference(brClass = PaneThemeTransition.ByReference::class)
public class PaneThemeTransition(
  ptr: JNAPointer? = NULL
) : Transition(ptr), IPaneThemeTransition.WithDefault, IWinRTObject {
  private val __60583856_Interface: IPaneThemeTransition.WithDefault by lazy {
    as_60583856()
  }


  public override val __60583856_Ptr: JNAPointer? by lazy {
    __60583856_Interface.__60583856_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__60583856_Interface)

  public constructor() : this(ABI.activate())

  private fun as_60583856(): IPaneThemeTransition.WithDefault {
    if(pointer == NULL) {
      return(IPaneThemeTransition.ABI.makeIPaneThemeTransition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaneThemeTransition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaneThemeTransition.ABI.makeIPaneThemeTransition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PaneThemeTransition> {
    public override fun getValue() = PaneThemeTransition(pointer.getPointer(0))

    public fun setValue(value: PaneThemeTransition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaneThemeTransition, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPaneThemeTransitionStatics_Instance: IPaneThemeTransitionStatics by lazy {
      createIPaneThemeTransitionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.PaneThemeTransition".toHandle(),
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

    public fun createIPaneThemeTransitionStatics(): IPaneThemeTransitionStatics {
      val refiid = Guid.REFIID(IPaneThemeTransitionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.PaneThemeTransition".toHandle(),refiid,interfacePtr)
      val result =
          IPaneThemeTransitionStatics.ABI.makeIPaneThemeTransitionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PaneThemeTransition {
      val address = segment.toRawLongValue()
      return PaneThemeTransition(Pointer(address))
    }

    public override fun toNative(obj: PaneThemeTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EdgeProperty() = ABI.IPaneThemeTransitionStatics_Instance.get_EdgeProperty()
  }
}
