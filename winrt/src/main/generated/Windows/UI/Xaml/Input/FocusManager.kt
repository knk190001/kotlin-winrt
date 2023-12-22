package Windows.UI.Xaml.Input

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Rect
import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.FocusState
import Windows.UI.Xaml.XamlRoot
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
@Signature("rc(Windows.UI.Xaml.Input.FocusManager;{c843f50b-3b83-4da1-9d6f-557c1169f341})")
@WinRTByReference(brClass = FocusManager.ByReference::class)
public class FocusManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFocusManager.WithDefault, IWinRTObject {
  private val __528237963_Interface: IFocusManager.WithDefault by lazy {
    as_528237963()
  }


  public override val __528237963_Ptr: JNAPointer? by lazy {
    __528237963_Interface.__528237963_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__528237963_Interface)

  private fun as_528237963(): IFocusManager.WithDefault {
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


    public val IFocusManagerStatics2_Instance: IFocusManagerStatics2 by lazy {
      createIFocusManagerStatics2()
    }


    public val IFocusManagerStatics3_Instance: IFocusManagerStatics3 by lazy {
      createIFocusManagerStatics3()
    }


    public val IFocusManagerStatics5_Instance: IFocusManagerStatics5 by lazy {
      createIFocusManagerStatics5()
    }


    public val IFocusManagerStatics7_Instance: IFocusManagerStatics7 by lazy {
      createIFocusManagerStatics7()
    }


    public val IFocusManagerStatics4_Instance: IFocusManagerStatics4 by lazy {
      createIFocusManagerStatics4()
    }


    public val IFocusManagerStatics6_Instance: IFocusManagerStatics6 by lazy {
      createIFocusManagerStatics6()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFocusManagerStatics(): IFocusManagerStatics {
      val refiid = Guid.REFIID(IFocusManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.FocusManager".toHandle(),refiid,interfacePtr)
      val result = IFocusManagerStatics.ABI.makeIFocusManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIFocusManagerStatics2(): IFocusManagerStatics2 {
      val refiid = Guid.REFIID(IFocusManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.FocusManager".toHandle(),refiid,interfacePtr)
      val result = IFocusManagerStatics2.ABI.makeIFocusManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIFocusManagerStatics3(): IFocusManagerStatics3 {
      val refiid = Guid.REFIID(IFocusManagerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.FocusManager".toHandle(),refiid,interfacePtr)
      val result = IFocusManagerStatics3.ABI.makeIFocusManagerStatics3(interfacePtr.value)
      return result
    }

    public fun createIFocusManagerStatics5(): IFocusManagerStatics5 {
      val refiid = Guid.REFIID(IFocusManagerStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.FocusManager".toHandle(),refiid,interfacePtr)
      val result = IFocusManagerStatics5.ABI.makeIFocusManagerStatics5(interfacePtr.value)
      return result
    }

    public fun createIFocusManagerStatics7(): IFocusManagerStatics7 {
      val refiid = Guid.REFIID(IFocusManagerStatics7.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.FocusManager".toHandle(),refiid,interfacePtr)
      val result = IFocusManagerStatics7.ABI.makeIFocusManagerStatics7(interfacePtr.value)
      return result
    }

    public fun createIFocusManagerStatics4(): IFocusManagerStatics4 {
      val refiid = Guid.REFIID(IFocusManagerStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.FocusManager".toHandle(),refiid,interfacePtr)
      val result = IFocusManagerStatics4.ABI.makeIFocusManagerStatics4(interfacePtr.value)
      return result
    }

    public fun createIFocusManagerStatics6(): IFocusManagerStatics6 {
      val refiid = Guid.REFIID(IFocusManagerStatics6.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.FocusManager".toHandle(),refiid,interfacePtr)
      val result = IFocusManagerStatics6.ABI.makeIFocusManagerStatics6(interfacePtr.value)
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
    public fun GetFocusedElement() = ABI.IFocusManagerStatics_Instance.GetFocusedElement()

    public fun TryMoveFocus(focusNavigationDirection: FocusNavigationDirection) =
        ABI.IFocusManagerStatics2_Instance.TryMoveFocus(focusNavigationDirection)

    public fun FindNextFocusableElement(focusNavigationDirection: FocusNavigationDirection) =
        ABI.IFocusManagerStatics3_Instance.FindNextFocusableElement(focusNavigationDirection)

    public fun FindNextFocusableElement(focusNavigationDirection: FocusNavigationDirection,
        hintRect: Rect) =
        ABI.IFocusManagerStatics3_Instance.FindNextFocusableElement(focusNavigationDirection,
        hintRect)

    public fun TryFocusAsync(element: DependencyObject, value: FocusState) =
        ABI.IFocusManagerStatics5_Instance.TryFocusAsync(element, value)

    public fun TryMoveFocusAsync(focusNavigationDirection: FocusNavigationDirection) =
        ABI.IFocusManagerStatics5_Instance.TryMoveFocusAsync(focusNavigationDirection)

    public fun TryMoveFocusAsync(focusNavigationDirection: FocusNavigationDirection,
        focusNavigationOptions: FindNextElementOptions) =
        ABI.IFocusManagerStatics5_Instance.TryMoveFocusAsync(focusNavigationDirection,
        focusNavigationOptions)

    public fun GetFocusedElement(xamlRoot: XamlRoot) =
        ABI.IFocusManagerStatics7_Instance.GetFocusedElement(xamlRoot)

    public fun TryMoveFocus(focusNavigationDirection: FocusNavigationDirection,
        focusNavigationOptions: FindNextElementOptions) =
        ABI.IFocusManagerStatics4_Instance.TryMoveFocus(focusNavigationDirection,
        focusNavigationOptions)

    public fun FindNextElement(focusNavigationDirection: FocusNavigationDirection) =
        ABI.IFocusManagerStatics4_Instance.FindNextElement(focusNavigationDirection)

    public fun FindFirstFocusableElement(searchScope: DependencyObject) =
        ABI.IFocusManagerStatics4_Instance.FindFirstFocusableElement(searchScope)

    public fun FindLastFocusableElement(searchScope: DependencyObject) =
        ABI.IFocusManagerStatics4_Instance.FindLastFocusableElement(searchScope)

    public fun FindNextElement(focusNavigationDirection: FocusNavigationDirection,
        focusNavigationOptions: FindNextElementOptions) =
        ABI.IFocusManagerStatics4_Instance.FindNextElement(focusNavigationDirection,
        focusNavigationOptions)

    public fun add_GotFocus(handler: EventHandler<FocusManagerGotFocusEventArgs?>) =
        ABI.IFocusManagerStatics6_Instance.add_GotFocus(handler)

    public fun remove_GotFocus(token: EventRegistrationToken) =
        ABI.IFocusManagerStatics6_Instance.remove_GotFocus(token)

    public fun add_LostFocus(handler: EventHandler<FocusManagerLostFocusEventArgs?>) =
        ABI.IFocusManagerStatics6_Instance.add_LostFocus(handler)

    public fun remove_LostFocus(token: EventRegistrationToken) =
        ABI.IFocusManagerStatics6_Instance.remove_LostFocus(token)

    public fun add_GettingFocus(handler: EventHandler<GettingFocusEventArgs?>) =
        ABI.IFocusManagerStatics6_Instance.add_GettingFocus(handler)

    public fun remove_GettingFocus(token: EventRegistrationToken) =
        ABI.IFocusManagerStatics6_Instance.remove_GettingFocus(token)

    public fun add_LosingFocus(handler: EventHandler<LosingFocusEventArgs?>) =
        ABI.IFocusManagerStatics6_Instance.add_LosingFocus(handler)

    public fun remove_LosingFocus(token: EventRegistrationToken) =
        ABI.IFocusManagerStatics6_Instance.remove_LosingFocus(token)
  }
}
