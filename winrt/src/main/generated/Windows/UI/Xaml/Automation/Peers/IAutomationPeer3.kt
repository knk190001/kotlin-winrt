package Windows.UI.Xaml.Automation.Peers

import Windows.Foundation.Collections.IVector
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Point
import Windows.UI.Xaml.Automation.AutomationTextEditChangeType
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationPeer3.ABI::class)
@Signature("{d3cfb977-0084-41d7-a221-28158d3bc32c}")
@Guid("d3cfb977008441d7a22128158d3bc32c")
@WinRTInterface("d3cfb977008441d7a22128158d3bc32c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeer3.ByReference::class)
public interface IAutomationPeer3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Navigate(direction: AutomationNavigationDirection?): IUnknown?

  @InterfaceMethod(1)
  public fun GetElementFromPoint(pointInWindowCoordinates: Point?): IUnknown?

  @InterfaceMethod(2)
  public fun GetFocusedElement(): IUnknown?

  @InterfaceMethod(3)
  public fun ShowContextMenu(): Unit

  @InterfaceMethod(4)
  public fun GetControlledPeers(): IVectorView<AutomationPeer?>?

  @InterfaceMethod(5)
  public fun GetAnnotations(): IVector<AutomationPeerAnnotation?>?

  @InterfaceMethod(6)
  public fun SetParent(peer: AutomationPeer?): Unit

  @InterfaceMethod(7)
  public
      fun RaiseTextEditTextChangedEvent(automationTextEditChangeType: AutomationTextEditChangeType?,
      changedData: IVectorView<String?>?): Unit

  @InterfaceMethod(8)
  public fun GetPositionInSet(): Int

  @InterfaceMethod(9)
  public fun GetSizeOfSet(): Int

  @InterfaceMethod(10)
  public fun GetLevel(): Int

  @InterfaceMethod(11)
  public fun RaiseStructureChangedEvent(structureChangeType: AutomationStructureChangeType?,
      child: AutomationPeer?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeer3> {
    public override fun getValue() = ABI.makeIAutomationPeer3(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeer3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeer3 {
    public val __1075421566_Ptr: Pointer?

    public val _1075421566_VtblPtr: Pointer?
      get() = __1075421566_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Navigate(direction: AutomationNavigationDirection?): IUnknown? {
      val fnPtr = _1075421566_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1075421566_Ptr, marshalToNative(direction), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetElementFromPoint(pointInWindowCoordinates: Point?): IUnknown? {
      val fnPtr = _1075421566_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1075421566_Ptr, marshalToNative(pointInWindowCoordinates),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetFocusedElement(): IUnknown? {
      val fnPtr = _1075421566_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1075421566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ShowContextMenu(): Unit {
      val fnPtr = _1075421566_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1075421566_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetControlledPeers(): IVectorView<AutomationPeer?>? {
      val fnPtr = _1075421566_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AutomationPeer?>>()
      val hr = fn.invokeHR(arrayOf(__1075421566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AutomationPeer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetAnnotations(): IVector<AutomationPeerAnnotation?>? {
      val fnPtr = _1075421566_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<AutomationPeerAnnotation?>>()
      val hr = fn.invokeHR(arrayOf(__1075421566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<AutomationPeerAnnotation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun SetParent(peer: AutomationPeer?): Unit {
      val fnPtr = _1075421566_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1075421566_Ptr, marshalToNative(peer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override
        fun RaiseTextEditTextChangedEvent(automationTextEditChangeType: AutomationTextEditChangeType?,
        changedData: IVectorView<String?>?): Unit {
      val fnPtr = _1075421566_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1075421566_Ptr, marshalToNative(automationTextEditChangeType),
          marshalToNative(changedData),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun GetPositionInSet(): Int {
      val fnPtr = _1075421566_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1075421566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun GetSizeOfSet(): Int {
      val fnPtr = _1075421566_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1075421566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun GetLevel(): Int {
      val fnPtr = _1075421566_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1075421566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override
        fun RaiseStructureChangedEvent(structureChangeType: AutomationStructureChangeType?,
        child: AutomationPeer?): Unit {
      val fnPtr = _1075421566_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1075421566_Ptr, marshalToNative(structureChangeType),
          marshalToNative(child),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAutomationPeer3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1075421566_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeer3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d3cfb977008441d7a22128158d3bc32c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeer3(ptr: Pointer?): WithDefault = IAutomationPeer3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeer3 {
      val address = segment.toRawLongValue()
      return makeIAutomationPeer3(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeer3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1075421566_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeer3): Array<IAutomationPeer3?> = (elements as
        Array<IAutomationPeer3?>).castToImpl<IAutomationPeer3,IAutomationPeer3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeer3?> =
        arrayOfNulls<IAutomationPeer3_Impl>(size) as Array<IAutomationPeer3?>
  }
}
