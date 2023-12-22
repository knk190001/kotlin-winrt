package Windows.UI.ViewManagement

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

@ABIMarker(IStatusBarStatics.ABI::class)
@Signature("{8b463fdf-422f-4561-8806-fb1289cadfb7}")
@Guid("8b463fdf422f45618806fb1289cadfb7")
@WinRTInterface("8b463fdf422f45618806fb1289cadfb7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStatusBarStatics.ByReference::class)
public interface IStatusBarStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): StatusBar?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStatusBarStatics> {
    public override fun getValue() = ABI.makeIStatusBarStatics(pointer.getPointer(0))

    public fun setValue(value: IStatusBarStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStatusBarStatics {
    public val __36880298_Ptr: Pointer?

    public val _36880298_VtblPtr: Pointer?
      get() = __36880298_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): StatusBar? {
      val fnPtr = _36880298_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StatusBar>()
      val hr = fn.invokeHR(arrayOf(__36880298_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StatusBar>(result.getValue())
      return resultValue
    }
  }

  public class IStatusBarStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __36880298_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStatusBarStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8b463fdf422f45618806fb1289cadfb7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStatusBarStatics(ptr: Pointer?): WithDefault = IStatusBarStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStatusBarStatics {
      val address = segment.toRawLongValue()
      return makeIStatusBarStatics(Pointer(address))
    }

    public override fun toNative(obj: IStatusBarStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__36880298_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStatusBarStatics): Array<IStatusBarStatics?> = (elements
        as Array<IStatusBarStatics?>).castToImpl<IStatusBarStatics,IStatusBarStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStatusBarStatics?> =
        arrayOfNulls<IStatusBarStatics_Impl>(size) as Array<IStatusBarStatics?>
  }
}
