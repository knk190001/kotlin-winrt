package Windows.UI.Xaml.Automation

import Windows.UI.Xaml.Automation.Peers.AutomationLandmarkType
import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.DependencyProperty
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(IAutomationPropertiesStatics4.ABI::class)
@Signature("{f7d62655-311a-4b7c-a131-524e89cd3cf9}")
@Guid("f7d62655311a4b7ca131524e89cd3cf9")
@WinRTInterface("f7d62655311a4b7ca131524e89cd3cf9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPropertiesStatics4.ByReference::class)
public interface IAutomationPropertiesStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LandmarkTypeProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetLandmarkType(element: DependencyObject?): AutomationLandmarkType?

  @InterfaceMethod(2)
  public fun SetLandmarkType(element: DependencyObject?, value: AutomationLandmarkType?): Unit

  @InterfaceMethod(3)
  public fun get_LocalizedLandmarkTypeProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun GetLocalizedLandmarkType(element: DependencyObject?): String?

  @InterfaceMethod(5)
  public fun SetLocalizedLandmarkType(element: DependencyObject?, value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPropertiesStatics4> {
    public override fun getValue() = ABI.makeIAutomationPropertiesStatics4(pointer.getPointer(0))

    public fun setValue(value: IAutomationPropertiesStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPropertiesStatics4 {
    public val __445074932_Ptr: Pointer?

    public val _445074932_VtblPtr: Pointer?
      get() = __445074932_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LandmarkTypeProperty(): DependencyProperty? {
      val fnPtr = _445074932_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074932_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetLandmarkType(element: DependencyObject?): AutomationLandmarkType? {
      val fnPtr = _445074932_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationLandmarkType>()
      val hr = fn.invokeHR(arrayOf(__445074932_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationLandmarkType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetLandmarkType(element: DependencyObject?, value: AutomationLandmarkType?):
        Unit {
      val fnPtr = _445074932_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445074932_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_LocalizedLandmarkTypeProperty(): DependencyProperty? {
      val fnPtr = _445074932_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__445074932_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetLocalizedLandmarkType(element: DependencyObject?): String? {
      val fnPtr = _445074932_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__445074932_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SetLocalizedLandmarkType(element: DependencyObject?, value: String?): Unit {
      val fnPtr = _445074932_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445074932_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAutomationPropertiesStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __445074932_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPropertiesStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f7d62655311a4b7ca131524e89cd3cf9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPropertiesStatics4(ptr: Pointer?): WithDefault =
        IAutomationPropertiesStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPropertiesStatics4 {
      val address = segment.toRawLongValue()
      return makeIAutomationPropertiesStatics4(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPropertiesStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__445074932_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPropertiesStatics4):
        Array<IAutomationPropertiesStatics4?> = (elements as
        Array<IAutomationPropertiesStatics4?>).castToImpl<IAutomationPropertiesStatics4,IAutomationPropertiesStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPropertiesStatics4?> =
        arrayOfNulls<IAutomationPropertiesStatics4_Impl>(size) as
        Array<IAutomationPropertiesStatics4?>
  }
}
