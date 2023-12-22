package Microsoft.UI.Xaml.Input

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.FocusState
import Microsoft.UI.Xaml.XamlRoot
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Rect
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(FocusManager.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.FocusManager;{9fd07bc5-d2d4-53fe-a31a-846de8b7a257})")
@WinRTByReference(brClass = FocusManager.ByReference::class)
public class FocusManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFocusManager.WithDefault, IWinRTObject {
  private val __2083486656_Interface: IFocusManager.WithDefault by lazy {
    as_2083486656()
  }


  public override val __2083486656_Ptr: JNAPointer? by lazy {
    __2083486656_Interface.__2083486656_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2083486656_Interface)

  private fun as_2083486656(): IFocusManager.WithDefault {
    if(pointer == NULL) {
      return(IFocusManager.ABI.makeIFocusManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFocusManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFocusManager.ABI.makeIFocusManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FocusManager> {
    public override fun getValue() = FocusManager(pointer.getPointer(0))

    public fun setValue(value: FocusManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FocusManager, MemoryAddress> {
    public val IFocusManagerStatics_Instance: IFocusManagerStatics by lazy {
      createIFocusManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFocusManagerStatics(): IFocusManagerStatics {
      val refiid = Guid.REFIID(IFocusManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Input.FocusManager".toHandle(),refiid,interfacePtr)
      val result = IFocusManagerStatics.ABI.makeIFocusManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): FocusManager {
      val address = segment.toRawLongValue()
      return FocusManager(Pointer(address))
    }

    public override fun toNative(obj: FocusManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun add_GotFocus(handler: EventHandler<FocusManagerGotFocusEventArgs?>) =
        ABI.IFocusManagerStatics_Instance.add_GotFocus(handler)

    public fun remove_GotFocus(token: EventRegistrationToken) =
        ABI.IFocusManagerStatics_Instance.remove_GotFocus(token)

    public fun add_LostFocus(handler: EventHandler<FocusManagerLostFocusEventArgs?>) =
        ABI.IFocusManagerStatics_Instance.add_LostFocus(handler)

    public fun remove_LostFocus(token: EventRegistrationToken) =
        ABI.IFocusManagerStatics_Instance.remove_LostFocus(token)

    public fun add_GettingFocus(handler: EventHandler<GettingFocusEventArgs?>) =
        ABI.IFocusManagerStatics_Instance.add_GettingFocus(handler)

    public fun remove_GettingFocus(token: EventRegistrationToken) =
        ABI.IFocusManagerStatics_Instance.remove_GettingFocus(token)

    public fun add_LosingFocus(handler: EventHandler<LosingFocusEventArgs?>) =
        ABI.IFocusManagerStatics_Instance.add_LosingFocus(handler)

    public fun remove_LosingFocus(token: EventRegistrationToken) =
        ABI.IFocusManagerStatics_Instance.remove_LosingFocus(token)

    public fun TryFocusAsync(element: DependencyObject, value: FocusState) =
        ABI.IFocusManagerStatics_Instance.TryFocusAsync(element, value)

    public fun TryMoveFocusAsync(focusNavigationDirection: FocusNavigationDirection) =
        ABI.IFocusManagerStatics_Instance.TryMoveFocusAsync(focusNavigationDirection)

    public fun TryMoveFocusAsync(focusNavigationDirection: FocusNavigationDirection,
        focusNavigationOptions: FindNextElementOptions) =
        ABI.IFocusManagerStatics_Instance.TryMoveFocusAsync(focusNavigationDirection,
        focusNavigationOptions)

    public fun TryMoveFocus(focusNavigationDirection: FocusNavigationDirection,
        focusNavigationOptions: FindNextElementOptions) =
        ABI.IFocusManagerStatics_Instance.TryMoveFocus(focusNavigationDirection,
        focusNavigationOptions)

    public fun FindNextElement(focusNavigationDirection: FocusNavigationDirection) =
        ABI.IFocusManagerStatics_Instance.FindNextElement(focusNavigationDirection)

    public fun FindFirstFocusableElement(searchScope: DependencyObject) =
        ABI.IFocusManagerStatics_Instance.FindFirstFocusableElement(searchScope)

    public fun FindLastFocusableElement(searchScope: DependencyObject) =
        ABI.IFocusManagerStatics_Instance.FindLastFocusableElement(searchScope)

    public fun FindNextElement(focusNavigationDirection: FocusNavigationDirection,
        focusNavigationOptions: FindNextElementOptions) =
        ABI.IFocusManagerStatics_Instance.FindNextElement(focusNavigationDirection,
        focusNavigationOptions)

    public fun FindNextFocusableElement(focusNavigationDirection: FocusNavigationDirection) =
        ABI.IFocusManagerStatics_Instance.FindNextFocusableElement(focusNavigationDirection)

    public fun FindNextFocusableElement(focusNavigationDirection: FocusNavigationDirection,
        hintRect: Rect) =
        ABI.IFocusManagerStatics_Instance.FindNextFocusableElement(focusNavigationDirection,
        hintRect)

    public fun TryMoveFocus(focusNavigationDirection: FocusNavigationDirection) =
        ABI.IFocusManagerStatics_Instance.TryMoveFocus(focusNavigationDirection)

    public fun GetFocusedElement() = ABI.IFocusManagerStatics_Instance.GetFocusedElement()

    public fun GetFocusedElement(xamlRoot: XamlRoot) =
        ABI.IFocusManagerStatics_Instance.GetFocusedElement(xamlRoot)
  }
}
