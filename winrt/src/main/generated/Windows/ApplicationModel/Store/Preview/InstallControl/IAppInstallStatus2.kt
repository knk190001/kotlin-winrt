package Windows.ApplicationModel.Store.Preview.InstallControl

import Windows.System.User
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

@ABIMarker(IAppInstallStatus2.ABI::class)
@Signature("{96e7818a-5e92-4aa9-8edc-58fed4b87e00}")
@Guid("96e7818a5e924aa98edc58fed4b87e00")
@WinRTInterface("96e7818a5e924aa98edc58fed4b87e00")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallStatus2.ByReference::class)
public interface IAppInstallStatus2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_User(): User?

  @InterfaceMethod(1)
  public fun get_ReadyForLaunch(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallStatus2> {
    public override fun getValue() = ABI.makeIAppInstallStatus2(pointer.getPointer(0))

    public fun setValue(value: IAppInstallStatus2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallStatus2 {
    public val __1923593796_Ptr: Pointer?

    public val _1923593796_VtblPtr: Pointer?
      get() = __1923593796_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _1923593796_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1923593796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ReadyForLaunch(): Boolean {
      val fnPtr = _1923593796_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1923593796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppInstallStatus2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1923593796_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallStatus2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96e7818a5e924aa98edc58fed4b87e00")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallStatus2(ptr: Pointer?): WithDefault = IAppInstallStatus2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallStatus2 {
      val address = segment.toRawLongValue()
      return makeIAppInstallStatus2(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallStatus2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1923593796_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallStatus2): Array<IAppInstallStatus2?> =
        (elements as
        Array<IAppInstallStatus2?>).castToImpl<IAppInstallStatus2,IAppInstallStatus2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallStatus2?> =
        arrayOfNulls<IAppInstallStatus2_Impl>(size) as Array<IAppInstallStatus2?>
  }
}
