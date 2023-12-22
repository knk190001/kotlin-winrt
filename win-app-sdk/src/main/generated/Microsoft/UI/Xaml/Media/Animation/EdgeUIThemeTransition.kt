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

@ABIMarker(EdgeUIThemeTransition.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.EdgeUIThemeTransition;{57089964-e358-5fe2-84e7-15e82bba9c06})")
@WinRTByReference(brClass = EdgeUIThemeTransition.ByReference::class)
public class EdgeUIThemeTransition(
  ptr: JNAPointer? = NULL
) : Transition(ptr), IEdgeUIThemeTransition.WithDefault, IWinRTObject {
  private val __141517934_Interface: IEdgeUIThemeTransition.WithDefault by lazy {
    as_141517934()
  }


  public override val __141517934_Ptr: JNAPointer? by lazy {
    __141517934_Interface.__141517934_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__141517934_Interface)

  public constructor() : this(ABI.activate())

  private fun as_141517934(): IEdgeUIThemeTransition.WithDefault {
    if(pointer == NULL) {
      return(IEdgeUIThemeTransition.ABI.makeIEdgeUIThemeTransition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEdgeUIThemeTransition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEdgeUIThemeTransition.ABI.makeIEdgeUIThemeTransition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EdgeUIThemeTransition> {
    public override fun getValue() = EdgeUIThemeTransition(pointer.getPointer(0))

    public fun setValue(value: EdgeUIThemeTransition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EdgeUIThemeTransition, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IEdgeUIThemeTransitionStatics_Instance: IEdgeUIThemeTransitionStatics by lazy {
      createIEdgeUIThemeTransitionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.EdgeUIThemeTransition".toHandle(),
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

    public fun createIEdgeUIThemeTransitionStatics(): IEdgeUIThemeTransitionStatics {
      val refiid = Guid.REFIID(IEdgeUIThemeTransitionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.EdgeUIThemeTransition".toHandle(),refiid,interfacePtr)
      val result =
          IEdgeUIThemeTransitionStatics.ABI.makeIEdgeUIThemeTransitionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): EdgeUIThemeTransition {
      val address = segment.toRawLongValue()
      return EdgeUIThemeTransition(Pointer(address))
    }

    public override fun toNative(obj: EdgeUIThemeTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EdgeProperty() = ABI.IEdgeUIThemeTransitionStatics_Instance.get_EdgeProperty()
  }
}
