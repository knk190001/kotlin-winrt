package Microsoft.UI.Xaml.Automation.Peers

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IAutomationPeerOverrides.ABI::class)
@Signature("{44f8f6df-1b60-512d-a295-dd8c276c4618}")
@Guid("44f8f6df1b60512da295dd8c276c4618")
@WinRTInterface("44f8f6df1b60512da295dd8c276c4618")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeerOverrides.ByReference::class)
public interface IAutomationPeerOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetPatternCore(patternInterface: PatternInterface?): IUnknown?

  @InterfaceMethod(1)
  public fun GetAcceleratorKeyCore(): String?

  @InterfaceMethod(2)
  public fun GetAccessKeyCore(): String?

  @InterfaceMethod(3)
  public fun GetAutomationControlTypeCore(): AutomationControlType?

  @InterfaceMethod(4)
  public fun GetAutomationIdCore(): String?

  @InterfaceMethod(5)
  public fun GetBoundingRectangleCore(): Rect?

  @InterfaceMethod(6)
  public fun GetChildrenCore(): IVector<AutomationPeer?>?

  @InterfaceMethod(7)
  public fun NavigateCore(direction: AutomationNavigationDirection?): IUnknown?

  @InterfaceMethod(8)
  public fun GetClassNameCore(): String?

  @InterfaceMethod(9)
  public fun GetClickablePointCore(): Point?

  @InterfaceMethod(10)
  public fun GetHelpTextCore(): String?

  @InterfaceMethod(11)
  public fun GetItemStatusCore(): String?

  @InterfaceMethod(12)
  public fun GetItemTypeCore(): String?

  @InterfaceMethod(13)
  public fun GetLabeledByCore(): AutomationPeer?

  @InterfaceMethod(14)
  public fun GetLocalizedControlTypeCore(): String?

  @InterfaceMethod(15)
  public fun GetNameCore(): String?

  @InterfaceMethod(16)
  public fun GetOrientationCore(): AutomationOrientation?

  @InterfaceMethod(17)
  public fun HasKeyboardFocusCore(): Boolean

  @InterfaceMethod(18)
  public fun IsContentElementCore(): Boolean

  @InterfaceMethod(19)
  public fun IsControlElementCore(): Boolean

  @InterfaceMethod(20)
  public fun IsEnabledCore(): Boolean

  @InterfaceMethod(21)
  public fun IsKeyboardFocusableCore(): Boolean

  @InterfaceMethod(22)
  public fun IsOffscreenCore(): Boolean

  @InterfaceMethod(23)
  public fun IsPasswordCore(): Boolean

  @InterfaceMethod(24)
  public fun IsRequiredForFormCore(): Boolean

  @InterfaceMethod(25)
  public fun SetFocusCore(): Unit

  @InterfaceMethod(26)
  public fun GetPeerFromPointCore(point: Point?): AutomationPeer?

  @InterfaceMethod(27)
  public fun GetElementFromPointCore(pointInWindowCoordinates: Point?): IUnknown?

  @InterfaceMethod(28)
  public fun GetFocusedElementCore(): IUnknown?

  @InterfaceMethod(29)
  public fun GetLiveSettingCore(): AutomationLiveSetting?

  @InterfaceMethod(30)
  public fun ShowContextMenuCore(): Unit

  @InterfaceMethod(31)
  public fun GetControlledPeersCore(): IVectorView<AutomationPeer?>?

  @InterfaceMethod(32)
  public fun GetAnnotationsCore(): IVector<AutomationPeerAnnotation?>?

  @InterfaceMethod(33)
  public fun GetPositionInSetCore(): Int

  @InterfaceMethod(34)
  public fun GetSizeOfSetCore(): Int

  @InterfaceMethod(35)
  public fun GetLevelCore(): Int

  @InterfaceMethod(36)
  public fun GetLandmarkTypeCore(): AutomationLandmarkType?

  @InterfaceMethod(37)
  public fun GetLocalizedLandmarkTypeCore(): String?

  @InterfaceMethod(38)
  public fun IsPeripheralCore(): Boolean

  @InterfaceMethod(39)
  public fun IsDataValidForFormCore(): Boolean

  @InterfaceMethod(40)
  public fun GetFullDescriptionCore(): String?

  @InterfaceMethod(41)
  public fun GetDescribedByCore(): IIterable<AutomationPeer?>?

  @InterfaceMethod(42)
  public fun GetFlowsToCore(): IIterable<AutomationPeer?>?

  @InterfaceMethod(43)
  public fun GetFlowsFromCore(): IIterable<AutomationPeer?>?

  @InterfaceMethod(44)
  public fun GetCultureCore(): Int

  @InterfaceMethod(45)
  public fun GetHeadingLevelCore(): AutomationHeadingLevel?

  @InterfaceMethod(46)
  public fun IsDialogCore(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeerOverrides> {
    public override fun getValue() = ABI.makeIAutomationPeerOverrides(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeerOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeerOverrides {
    public val __871877045_Ptr: Pointer?

    public val _871877045_VtblPtr: Pointer?
      get() = __871877045_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetPatternCore(patternInterface: PatternInterface?): IUnknown? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr, marshalToNative(patternInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAcceleratorKeyCore(): String? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetAccessKeyCore(): String? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetAutomationControlTypeCore(): AutomationControlType? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationControlType>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationControlType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetAutomationIdCore(): String? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetBoundingRectangleCore(): Rect? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetChildrenCore(): IVector<AutomationPeer?>? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<AutomationPeer?>>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<AutomationPeer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun NavigateCore(direction: AutomationNavigationDirection?): IUnknown? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr, marshalToNative(direction), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetClassNameCore(): String? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetClickablePointCore(): Point? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetHelpTextCore(): String? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun GetItemStatusCore(): String? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun GetItemTypeCore(): String? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetLabeledByCore(): AutomationPeer? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationPeer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun GetLocalizedControlTypeCore(): String? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun GetNameCore(): String? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun GetOrientationCore(): AutomationOrientation? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationOrientation>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationOrientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun HasKeyboardFocusCore(): Boolean {
      val fnPtr = _871877045_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun IsContentElementCore(): Boolean {
      val fnPtr = _871877045_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun IsControlElementCore(): Boolean {
      val fnPtr = _871877045_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun IsEnabledCore(): Boolean {
      val fnPtr = _871877045_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun IsKeyboardFocusableCore(): Boolean {
      val fnPtr = _871877045_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(22)
    public override fun IsOffscreenCore(): Boolean {
      val fnPtr = _871877045_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun IsPasswordCore(): Boolean {
      val fnPtr = _871877045_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(24)
    public override fun IsRequiredForFormCore(): Boolean {
      val fnPtr = _871877045_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun SetFocusCore(): Unit {
      val fnPtr = _871877045_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun GetPeerFromPointCore(point: Point?): AutomationPeer? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr, marshalToNative(point), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationPeer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun GetElementFromPointCore(pointInWindowCoordinates: Point?): IUnknown? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr, marshalToNative(pointInWindowCoordinates),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun GetFocusedElementCore(): IUnknown? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun GetLiveSettingCore(): AutomationLiveSetting? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationLiveSetting>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationLiveSetting>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun ShowContextMenuCore(): Unit {
      val fnPtr = _871877045_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun GetControlledPeersCore(): IVectorView<AutomationPeer?>? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AutomationPeer?>>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AutomationPeer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun GetAnnotationsCore(): IVector<AutomationPeerAnnotation?>? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<AutomationPeerAnnotation?>>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<AutomationPeerAnnotation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun GetPositionInSetCore(): Int {
      val fnPtr = _871877045_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(34)
    public override fun GetSizeOfSetCore(): Int {
      val fnPtr = _871877045_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(35)
    public override fun GetLevelCore(): Int {
      val fnPtr = _871877045_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(36)
    public override fun GetLandmarkTypeCore(): AutomationLandmarkType? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationLandmarkType>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationLandmarkType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun GetLocalizedLandmarkTypeCore(): String? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun IsPeripheralCore(): Boolean {
      val fnPtr = _871877045_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(39)
    public override fun IsDataValidForFormCore(): Boolean {
      val fnPtr = _871877045_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(40)
    public override fun GetFullDescriptionCore(): String? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun GetDescribedByCore(): IIterable<AutomationPeer?>? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<AutomationPeer?>>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<AutomationPeer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun GetFlowsToCore(): IIterable<AutomationPeer?>? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<AutomationPeer?>>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<AutomationPeer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun GetFlowsFromCore(): IIterable<AutomationPeer?>? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<AutomationPeer?>>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<AutomationPeer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun GetCultureCore(): Int {
      val fnPtr = _871877045_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(45)
    public override fun GetHeadingLevelCore(): AutomationHeadingLevel? {
      val fnPtr = _871877045_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationHeadingLevel>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationHeadingLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun IsDialogCore(): Boolean {
      val fnPtr = _871877045_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__871877045_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAutomationPeerOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __871877045_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeerOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("44f8f6df1b60512da295dd8c276c4618")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeerOverrides(ptr: Pointer?): WithDefault =
        IAutomationPeerOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeerOverrides {
      val address = segment.toRawLongValue()
      return makeIAutomationPeerOverrides(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeerOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__871877045_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeerOverrides):
        Array<IAutomationPeerOverrides?> = (elements as
        Array<IAutomationPeerOverrides?>).castToImpl<IAutomationPeerOverrides,IAutomationPeerOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeerOverrides?> =
        arrayOfNulls<IAutomationPeerOverrides_Impl>(size) as Array<IAutomationPeerOverrides?>
  }
}
