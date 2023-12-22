package Windows.Media.Devices

import Windows.Devices.Enumeration.Panel
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPanelBasedOptimizationControl.ABI::class)
@Signature("{33323223-6247-5419-a5a4-3d808645d917}")
@Guid("3332322362475419a5a43d808645d917")
@WinRTInterface("3332322362475419a5a43d808645d917")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPanelBasedOptimizationControl.ByReference::class)
public interface IPanelBasedOptimizationControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_Panel(): Panel?

  @InterfaceMethod(2)
  public fun put_Panel(value: Panel?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPanelBasedOptimizationControl> {
    public override fun getValue() = ABI.makeIPanelBasedOptimizationControl(pointer.getPointer(0))

    public fun setValue(value: IPanelBasedOptimizationControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPanelBasedOptimizationControl {
    public val __1177506080_Ptr: Pointer?

    public val _1177506080_VtblPtr: Pointer?
      get() = __1177506080_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSupported(): Boolean {
      val fnPtr = _1177506080_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1177506080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Panel(): Panel? {
      val fnPtr = _1177506080_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Panel>()
      val hr = fn.invokeHR(arrayOf(__1177506080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Panel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Panel(value: Panel?): Unit {
      val fnPtr = _1177506080_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1177506080_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPanelBasedOptimizationControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1177506080_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPanelBasedOptimizationControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3332322362475419a5a43d808645d917")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPanelBasedOptimizationControl(ptr: Pointer?): WithDefault =
        IPanelBasedOptimizationControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPanelBasedOptimizationControl {
      val address = segment.toRawLongValue()
      return makeIPanelBasedOptimizationControl(Pointer(address))
    }

    public override fun toNative(obj: IPanelBasedOptimizationControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1177506080_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPanelBasedOptimizationControl):
        Array<IPanelBasedOptimizationControl?> = (elements as
        Array<IPanelBasedOptimizationControl?>).castToImpl<IPanelBasedOptimizationControl,IPanelBasedOptimizationControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPanelBasedOptimizationControl?> =
        arrayOfNulls<IPanelBasedOptimizationControl_Impl>(size) as
        Array<IPanelBasedOptimizationControl?>
  }
}
