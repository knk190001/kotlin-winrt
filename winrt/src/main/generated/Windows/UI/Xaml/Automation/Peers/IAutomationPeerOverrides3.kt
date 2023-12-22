package Windows.UI.Xaml.Automation.Peers

import Windows.Foundation.Collections.IVector
import Windows.Foundation.Point
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationPeerOverrides3.ABI::class)
@Signature("{b6f0c4ad-4d39-49e6-bb91-d924eefd8538}")
@Guid("b6f0c4ad4d3949e6bb91d924eefd8538")
@WinRTInterface("b6f0c4ad4d3949e6bb91d924eefd8538")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeerOverrides3.ByReference::class)
public interface IAutomationPeerOverrides3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun NavigateCore(direction: AutomationNavigationDirection?): IUnknown?

  @InterfaceMethod(1)
  public fun GetElementFromPointCore(pointInWindowCoordinates: Point?): IUnknown?

  @InterfaceMethod(2)
  public fun GetFocusedElementCore(): IUnknown?

  @InterfaceMethod(3)
  public fun GetAnnotationsCore(): IVector<AutomationPeerAnnotation?>?

  @InterfaceMethod(4)
  public fun GetPositionInSetCore(): Int

  @InterfaceMethod(5)
  public fun GetSizeOfSetCore(): Int

  @InterfaceMethod(6)
  public fun GetLevelCore(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeerOverrides3> {
    public override fun getValue() = ABI.makeIAutomationPeerOverrides3(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeerOverrides3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeerOverrides3 {
    public val __706645405_Ptr: Pointer?

    public val _706645405_VtblPtr: Pointer?
      get() = __706645405_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun NavigateCore(direction: AutomationNavigationDirection?): IUnknown? {
      val fnPtr = _706645405_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__706645405_Ptr, marshalToNative(direction), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetElementFromPointCore(pointInWindowCoordinates: Point?): IUnknown? {
      val fnPtr = _706645405_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__706645405_Ptr, marshalToNative(pointInWindowCoordinates),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetFocusedElementCore(): IUnknown? {
      val fnPtr = _706645405_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__706645405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetAnnotationsCore(): IVector<AutomationPeerAnnotation?>? {
      val fnPtr = _706645405_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<AutomationPeerAnnotation?>>()
      val hr = fn.invokeHR(arrayOf(__706645405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<AutomationPeerAnnotation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetPositionInSetCore(): Int {
      val fnPtr = _706645405_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__706645405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun GetSizeOfSetCore(): Int {
      val fnPtr = _706645405_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__706645405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun GetLevelCore(): Int {
      val fnPtr = _706645405_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__706645405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IAutomationPeerOverrides3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __706645405_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeerOverrides3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6f0c4ad4d3949e6bb91d924eefd8538")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeerOverrides3(ptr: Pointer?): WithDefault =
        IAutomationPeerOverrides3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeerOverrides3 {
      val address = segment.toRawLongValue()
      return makeIAutomationPeerOverrides3(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeerOverrides3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__706645405_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeerOverrides3):
        Array<IAutomationPeerOverrides3?> = (elements as
        Array<IAutomationPeerOverrides3?>).castToImpl<IAutomationPeerOverrides3,IAutomationPeerOverrides3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeerOverrides3?> =
        arrayOfNulls<IAutomationPeerOverrides3_Impl>(size) as Array<IAutomationPeerOverrides3?>
  }
}
