package Windows.UI.Xaml.Media.Animation

import Windows.UI.Xaml.UIElement
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
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(EntranceNavigationTransitionInfo.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.EntranceNavigationTransitionInfo;{720a256b-1c8a-41ee-82ec-8a87c0cf47da})")
@WinRTByReference(brClass = EntranceNavigationTransitionInfo.ByReference::class)
public class EntranceNavigationTransitionInfo(
  ptr: JNAPointer? = NULL
) : NavigationTransitionInfo(ptr), IEntranceNavigationTransitionInfo.WithDefault, IWinRTObject {
  private val __354758221_Interface: IEntranceNavigationTransitionInfo.WithDefault by lazy {
    as_354758221()
  }


  public override val __354758221_Ptr: JNAPointer? by lazy {
    __354758221_Interface.__354758221_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__354758221_Interface)

  public constructor() : this(ABI.activate())

  private fun as_354758221(): IEntranceNavigationTransitionInfo.WithDefault {
    if(pointer == NULL) {
      return(IEntranceNavigationTransitionInfo.ABI.makeIEntranceNavigationTransitionInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEntranceNavigationTransitionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEntranceNavigationTransitionInfo.ABI.makeIEntranceNavigationTransitionInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EntranceNavigationTransitionInfo> {
    public override fun getValue() = EntranceNavigationTransitionInfo(pointer.getPointer(0))

    public fun setValue(value: EntranceNavigationTransitionInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EntranceNavigationTransitionInfo, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IEntranceNavigationTransitionInfoStatics_Instance:
        IEntranceNavigationTransitionInfoStatics by lazy {
      createIEntranceNavigationTransitionInfoStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.EntranceNavigationTransitionInfo".toHandle(),
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

    public fun createIEntranceNavigationTransitionInfoStatics():
        IEntranceNavigationTransitionInfoStatics {
      val refiid = Guid.REFIID(IEntranceNavigationTransitionInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.EntranceNavigationTransitionInfo".toHandle(),refiid,interfacePtr)
      val result =
          IEntranceNavigationTransitionInfoStatics.ABI.makeIEntranceNavigationTransitionInfoStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): EntranceNavigationTransitionInfo {
      val address = segment.toRawLongValue()
      return EntranceNavigationTransitionInfo(Pointer(address))
    }

    public override fun toNative(obj: EntranceNavigationTransitionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsTargetElementProperty() =
        ABI.IEntranceNavigationTransitionInfoStatics_Instance.get_IsTargetElementProperty()

    public fun GetIsTargetElement(element: UIElement) =
        ABI.IEntranceNavigationTransitionInfoStatics_Instance.GetIsTargetElement(element)

    public fun SetIsTargetElement(element: UIElement, value: Boolean) =
        ABI.IEntranceNavigationTransitionInfoStatics_Instance.SetIsTargetElement(element, value)
  }
}
