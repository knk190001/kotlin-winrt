package Windows.UI.ViewManagement

import Windows.Foundation.Size
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IApplicationViewStatics3.ABI::class)
@Signature("{a28d7594-8c41-4e13-9719-5164796fe4c7}")
@Guid("a28d75948c414e1397195164796fe4c7")
@WinRTInterface("a28d75948c414e1397195164796fe4c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationViewStatics3.ByReference::class)
public interface IApplicationViewStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PreferredLaunchWindowingMode(): ApplicationViewWindowingMode?

  @InterfaceMethod(1)
  public fun put_PreferredLaunchWindowingMode(value: ApplicationViewWindowingMode?): Unit

  @InterfaceMethod(2)
  public fun get_PreferredLaunchViewSize(): Size?

  @InterfaceMethod(3)
  public fun put_PreferredLaunchViewSize(value: Size?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationViewStatics3> {
    public override fun getValue() = ABI.makeIApplicationViewStatics3(pointer.getPointer(0))

    public fun setValue(value: IApplicationViewStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationViewStatics3 {
    public val __326373007_Ptr: Pointer?

    public val _326373007_VtblPtr: Pointer?
      get() = __326373007_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PreferredLaunchWindowingMode(): ApplicationViewWindowingMode? {
      val fnPtr = _326373007_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationViewWindowingMode>()
      val hr = fn.invokeHR(arrayOf(__326373007_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationViewWindowingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PreferredLaunchWindowingMode(value: ApplicationViewWindowingMode?):
        Unit {
      val fnPtr = _326373007_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__326373007_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PreferredLaunchViewSize(): Size? {
      val fnPtr = _326373007_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__326373007_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_PreferredLaunchViewSize(value: Size?): Unit {
      val fnPtr = _326373007_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__326373007_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IApplicationViewStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __326373007_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationViewStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a28d75948c414e1397195164796fe4c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationViewStatics3(ptr: Pointer?): WithDefault =
        IApplicationViewStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationViewStatics3 {
      val address = segment.toRawLongValue()
      return makeIApplicationViewStatics3(Pointer(address))
    }

    public override fun toNative(obj: IApplicationViewStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__326373007_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationViewStatics3):
        Array<IApplicationViewStatics3?> = (elements as
        Array<IApplicationViewStatics3?>).castToImpl<IApplicationViewStatics3,IApplicationViewStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationViewStatics3?> =
        arrayOfNulls<IApplicationViewStatics3_Impl>(size) as Array<IApplicationViewStatics3?>
  }
}
