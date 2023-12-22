package Windows.ApplicationModel.Store.Preview.InstallControl

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

@ABIMarker(IAppInstallStatus3.ABI::class)
@Signature("{cb880c56-837b-4b4c-9ebb-6d44a0a96307}")
@Guid("cb880c56837b4b4c9ebb6d44a0a96307")
@WinRTInterface("cb880c56837b4b4c9ebb6d44a0a96307")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallStatus3.ByReference::class)
public interface IAppInstallStatus3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsStaged(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallStatus3> {
    public override fun getValue() = ABI.makeIAppInstallStatus3(pointer.getPointer(0))

    public fun setValue(value: IAppInstallStatus3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallStatus3 {
    public val __1923593795_Ptr: Pointer?

    public val _1923593795_VtblPtr: Pointer?
      get() = __1923593795_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsStaged(): Boolean {
      val fnPtr = _1923593795_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1923593795_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppInstallStatus3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1923593795_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallStatus3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb880c56837b4b4c9ebb6d44a0a96307")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallStatus3(ptr: Pointer?): WithDefault = IAppInstallStatus3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallStatus3 {
      val address = segment.toRawLongValue()
      return makeIAppInstallStatus3(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallStatus3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1923593795_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallStatus3): Array<IAppInstallStatus3?> =
        (elements as
        Array<IAppInstallStatus3?>).castToImpl<IAppInstallStatus3,IAppInstallStatus3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallStatus3?> =
        arrayOfNulls<IAppInstallStatus3_Impl>(size) as Array<IAppInstallStatus3?>
  }
}
