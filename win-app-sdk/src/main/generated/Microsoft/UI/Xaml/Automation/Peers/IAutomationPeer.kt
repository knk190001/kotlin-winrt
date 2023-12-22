package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.AutomationProperty
import Microsoft.UI.Xaml.Automation.AutomationTextEditChangeType
import Windows.Foundation.Collections.IVector
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Point
import Windows.Foundation.Rect
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationPeer.ABI::class)
@Signature("{e51d3e4e-34f0-568c-999f-6277e2afe6d7}")
@Guid("e51d3e4e34f0568c999f6277e2afe6d7")
@WinRTInterface("e51d3e4e34f0568c999f6277e2afe6d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeer.ByReference::class)
public interface IAutomationPeer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EventsSource(): AutomationPeer?

  @InterfaceMethod(1)
  public fun put_EventsSource(value: AutomationPeer?): Unit

  @InterfaceMethod(2)
  public fun GetPattern(patternInterface: PatternInterface?): IUnknown?

  @InterfaceMethod(3)
  public fun RaiseAutomationEvent(eventId: AutomationEvents?): Unit

  @InterfaceMethod(4)
  public fun RaisePropertyChangedEvent(
    automationProperty: AutomationProperty?,
    oldValue: IUnknown?,
    newValue: IUnknown?
  ): Unit

  @InterfaceMethod(5)
  public fun GetAcceleratorKey(): String?

  @InterfaceMethod(6)
  public fun GetAccessKey(): String?

  @InterfaceMethod(7)
  public fun GetAutomationControlType(): AutomationControlType?

  @InterfaceMethod(8)
  public fun GetAutomationId(): String?

  @InterfaceMethod(9)
  public fun GetBoundingRectangle(): Rect?

  @InterfaceMethod(10)
  public fun GetChildren(): IVector<AutomationPeer?>?

  @InterfaceMethod(11)
  public fun Navigate(direction: AutomationNavigationDirection?): IUnknown?

  @InterfaceMethod(12)
  public fun GetClassName(): String?

  @InterfaceMethod(13)
  public fun GetClickablePoint(): Point?

  @InterfaceMethod(14)
  public fun GetHelpText(): String?

  @InterfaceMethod(15)
  public fun GetItemStatus(): String?

  @InterfaceMethod(16)
  public fun GetItemType(): String?

  @InterfaceMethod(17)
  public fun GetLabeledBy(): AutomationPeer?

  @InterfaceMethod(18)
  public fun GetLocalizedControlType(): String?

  @InterfaceMethod(19)
  public fun GetName(): String?

  @InterfaceMethod(20)
  public fun GetOrientation(): AutomationOrientation?

  @InterfaceMethod(21)
  public fun HasKeyboardFocus(): Boolean

  @InterfaceMethod(22)
  public fun IsContentElement(): Boolean

  @InterfaceMethod(23)
  public fun IsControlElement(): Boolean

  @InterfaceMethod(24)
  public fun IsEnabled(): Boolean

  @InterfaceMethod(25)
  public fun IsKeyboardFocusable(): Boolean

  @InterfaceMethod(26)
  public fun IsOffscreen(): Boolean

  @InterfaceMethod(27)
  public fun IsPassword(): Boolean

  @InterfaceMethod(28)
  public fun IsRequiredForForm(): Boolean

  @InterfaceMethod(29)
  public fun SetFocus(): Unit

  @InterfaceMethod(30)
  public fun GetParent(): AutomationPeer?

  @InterfaceMethod(31)
  public fun InvalidatePeer(): Unit

  @InterfaceMethod(32)
  public fun GetPeerFromPoint(point: Point?): AutomationPeer?

  @InterfaceMethod(33)
  public fun GetElementFromPoint(pointInWindowCoordinates: Point?): IUnknown?

  @InterfaceMethod(34)
  public fun GetFocusedElement(): IUnknown?

  @InterfaceMethod(35)
  public fun GetLiveSetting(): AutomationLiveSetting?

  @InterfaceMethod(36)
  public fun ShowContextMenu(): Unit

  @InterfaceMethod(37)
  public fun GetControlledPeers(): IVectorView<AutomationPeer?>?

  @InterfaceMethod(38)
  public fun GetAnnotations(): IVector<AutomationPeerAnnotation?>?

  @InterfaceMethod(39)
  public fun SetParent(peer: AutomationPeer?): Unit

  @InterfaceMethod(40)
  public
      fun RaiseTextEditTextChangedEvent(automationTextEditChangeType: AutomationTextEditChangeType?,
      changedData: IVectorView<String?>?): Unit

  @InterfaceMethod(41)
  public fun GetPositionInSet(): Int

  @InterfaceMethod(42)
  public fun GetSizeOfSet(): Int

  @InterfaceMethod(43)
  public fun GetLevel(): Int

  @InterfaceMethod(44)
  public fun RaiseStructureChangedEvent(structureChangeType: AutomationStructureChangeType?,
      child: AutomationPeer?): Unit

  @InterfaceMethod(45)
  public fun GetLandmarkType(): AutomationLandmarkType?

  @InterfaceMethod(46)
  public fun GetLocalizedLandmarkType(): String?

  @InterfaceMethod(47)
  public fun IsPeripheral(): Boolean

  @InterfaceMethod(48)
  public fun IsDataValidForForm(): Boolean

  @InterfaceMethod(49)
  public fun GetFullDescription(): String?

  @InterfaceMethod(50)
  public fun GetCulture(): Int

  @InterfaceMethod(51)
  public fun RaiseNotificationEvent(
    notificationKind: AutomationNotificationKind?,
    notificationProcessing: AutomationNotificationProcessing?,
    displayString: String?,
    activityId: String?
  ): Unit

  @InterfaceMethod(52)
  public fun GetHeadingLevel(): AutomationHeadingLevel?

  @InterfaceMethod(53)
  public fun IsDialog(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeer> {
    public override fun getValue() = ABI.makeIAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeer {
    public val __460510404_Ptr: Pointer?

    public val _460510404_VtblPtr: Pointer?
      get() = __460510404_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EventsSource(): AutomationPeer? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationPeer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_EventsSource(value: AutomationPeer?): Unit {
      val fnPtr = _460510404_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetPattern(patternInterface: PatternInterface?): IUnknown? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr, marshalToNative(patternInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RaiseAutomationEvent(eventId: AutomationEvents?): Unit {
      val fnPtr = _460510404_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr, marshalToNative(eventId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun RaisePropertyChangedEvent(
      automationProperty: AutomationProperty?,
      oldValue: IUnknown?,
      newValue: IUnknown?
    ): Unit {
      val fnPtr = _460510404_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr, marshalToNative(automationProperty),
          marshalToNative(oldValue), marshalToNative(newValue),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun GetAcceleratorKey(): String? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetAccessKey(): String? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetAutomationControlType(): AutomationControlType? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationControlType>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationControlType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetAutomationId(): String? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetBoundingRectangle(): Rect? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetChildren(): IVector<AutomationPeer?>? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<AutomationPeer?>>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<AutomationPeer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun Navigate(direction: AutomationNavigationDirection?): IUnknown? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr, marshalToNative(direction), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun GetClassName(): String? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetClickablePoint(): Point? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun GetHelpText(): String? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun GetItemStatus(): String? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun GetItemType(): String? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun GetLabeledBy(): AutomationPeer? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationPeer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun GetLocalizedControlType(): String? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun GetName(): String? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun GetOrientation(): AutomationOrientation? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationOrientation>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationOrientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun HasKeyboardFocus(): Boolean {
      val fnPtr = _460510404_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(22)
    public override fun IsContentElement(): Boolean {
      val fnPtr = _460510404_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun IsControlElement(): Boolean {
      val fnPtr = _460510404_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(24)
    public override fun IsEnabled(): Boolean {
      val fnPtr = _460510404_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun IsKeyboardFocusable(): Boolean {
      val fnPtr = _460510404_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(26)
    public override fun IsOffscreen(): Boolean {
      val fnPtr = _460510404_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun IsPassword(): Boolean {
      val fnPtr = _460510404_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(28)
    public override fun IsRequiredForForm(): Boolean {
      val fnPtr = _460510404_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(29)
    public override fun SetFocus(): Unit {
      val fnPtr = _460510404_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun GetParent(): AutomationPeer? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationPeer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun InvalidatePeer(): Unit {
      val fnPtr = _460510404_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun GetPeerFromPoint(point: Point?): AutomationPeer? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr, marshalToNative(point), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationPeer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun GetElementFromPoint(pointInWindowCoordinates: Point?): IUnknown? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr, marshalToNative(pointInWindowCoordinates),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun GetFocusedElement(): IUnknown? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun GetLiveSetting(): AutomationLiveSetting? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationLiveSetting>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationLiveSetting>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun ShowContextMenu(): Unit {
      val fnPtr = _460510404_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun GetControlledPeers(): IVectorView<AutomationPeer?>? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AutomationPeer?>>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AutomationPeer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun GetAnnotations(): IVector<AutomationPeerAnnotation?>? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<AutomationPeerAnnotation?>>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<AutomationPeerAnnotation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun SetParent(peer: AutomationPeer?): Unit {
      val fnPtr = _460510404_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr, marshalToNative(peer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override
        fun RaiseTextEditTextChangedEvent(automationTextEditChangeType: AutomationTextEditChangeType?,
        changedData: IVectorView<String?>?): Unit {
      val fnPtr = _460510404_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr, marshalToNative(automationTextEditChangeType),
          marshalToNative(changedData),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun GetPositionInSet(): Int {
      val fnPtr = _460510404_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(42)
    public override fun GetSizeOfSet(): Int {
      val fnPtr = _460510404_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(43)
    public override fun GetLevel(): Int {
      val fnPtr = _460510404_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(44)
    public override
        fun RaiseStructureChangedEvent(structureChangeType: AutomationStructureChangeType?,
        child: AutomationPeer?): Unit {
      val fnPtr = _460510404_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr, marshalToNative(structureChangeType),
          marshalToNative(child),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun GetLandmarkType(): AutomationLandmarkType? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationLandmarkType>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationLandmarkType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun GetLocalizedLandmarkType(): String? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun IsPeripheral(): Boolean {
      val fnPtr = _460510404_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(48)
    public override fun IsDataValidForForm(): Boolean {
      val fnPtr = _460510404_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(49)
    public override fun GetFullDescription(): String? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun GetCulture(): Int {
      val fnPtr = _460510404_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(51)
    public override fun RaiseNotificationEvent(
      notificationKind: AutomationNotificationKind?,
      notificationProcessing: AutomationNotificationProcessing?,
      displayString: String?,
      activityId: String?
    ): Unit {
      val fnPtr = _460510404_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr, marshalToNative(notificationKind),
          marshalToNative(notificationProcessing), marshalToNative(displayString),
          marshalToNative(activityId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun GetHeadingLevel(): AutomationHeadingLevel? {
      val fnPtr = _460510404_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationHeadingLevel>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationHeadingLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun IsDialog(): Boolean {
      val fnPtr = _460510404_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__460510404_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __460510404_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e51d3e4e34f0568c999f6277e2afe6d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeer(ptr: Pointer?): WithDefault = IAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__460510404_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeer): Array<IAutomationPeer?> = (elements as
        Array<IAutomationPeer?>).castToImpl<IAutomationPeer,IAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeer?> =
        arrayOfNulls<IAutomationPeer_Impl>(size) as Array<IAutomationPeer?>
  }
}
