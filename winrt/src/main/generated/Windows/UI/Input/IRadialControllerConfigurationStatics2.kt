package Windows.UI.Input

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

@ABIMarker(IRadialControllerConfigurationStatics2.ABI::class)
@Signature("{53e08b17-e205-48d3-9caf-80ff47c4d7c7}")
@Guid("53e08b17e20548d39caf80ff47c4d7c7")
@WinRTInterface("53e08b17e20548d39caf80ff47c4d7c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerConfigurationStatics2.ByReference::class)
public interface IRadialControllerConfigurationStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_AppController(value: RadialController?): Unit

  @InterfaceMethod(1)
  public fun get_AppController(): RadialController?

  @InterfaceMethod(2)
  public fun put_IsAppControllerEnabled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_IsAppControllerEnabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerConfigurationStatics2> {
    public override fun getValue() =
        ABI.makeIRadialControllerConfigurationStatics2(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerConfigurationStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerConfigurationStatics2 {
    public val __1364981830_Ptr: Pointer?

    public val _1364981830_VtblPtr: Pointer?
      get() = __1364981830_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_AppController(value: RadialController?): Unit {
      val fnPtr = _1364981830_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1364981830_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_AppController(): RadialController? {
      val fnPtr = _1364981830_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadialController>()
      val hr = fn.invokeHR(arrayOf(__1364981830_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadialController>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_IsAppControllerEnabled(value: Boolean): Unit {
      val fnPtr = _1364981830_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1364981830_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsAppControllerEnabled(): Boolean {
      val fnPtr = _1364981830_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1364981830_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IRadialControllerConfigurationStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1364981830_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerConfigurationStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("53e08b17e20548d39caf80ff47c4d7c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerConfigurationStatics2(ptr: Pointer?): WithDefault =
        IRadialControllerConfigurationStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadialControllerConfigurationStatics2 {
      val address = segment.toRawLongValue()
      return makeIRadialControllerConfigurationStatics2(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerConfigurationStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1364981830_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerConfigurationStatics2):
        Array<IRadialControllerConfigurationStatics2?> = (elements as
        Array<IRadialControllerConfigurationStatics2?>).castToImpl<IRadialControllerConfigurationStatics2,IRadialControllerConfigurationStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialControllerConfigurationStatics2?> =
        arrayOfNulls<IRadialControllerConfigurationStatics2_Impl>(size) as
        Array<IRadialControllerConfigurationStatics2?>
  }
}
