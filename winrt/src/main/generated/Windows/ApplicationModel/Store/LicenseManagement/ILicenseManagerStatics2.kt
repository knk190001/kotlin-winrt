package Windows.ApplicationModel.Store.LicenseManagement

import Windows.Foundation.IAsyncAction
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

@ABIMarker(ILicenseManagerStatics2.ABI::class)
@Signature("{ab2ec47b-1f79-4480-b87e-2c499e601ba3}")
@Guid("ab2ec47b1f794480b87e2c499e601ba3")
@WinRTInterface("ab2ec47b1f794480b87e2c499e601ba3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILicenseManagerStatics2.ByReference::class)
public interface ILicenseManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RefreshLicensesAsync(refreshOption: LicenseRefreshOption?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILicenseManagerStatics2> {
    public override fun getValue() = ABI.makeILicenseManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: ILicenseManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILicenseManagerStatics2 {
    public val __70164213_Ptr: Pointer?

    public val _70164213_VtblPtr: Pointer?
      get() = __70164213_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RefreshLicensesAsync(refreshOption: LicenseRefreshOption?): IAsyncAction? {
      val fnPtr = _70164213_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__70164213_Ptr, marshalToNative(refreshOption), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ILicenseManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __70164213_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILicenseManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab2ec47b1f794480b87e2c499e601ba3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILicenseManagerStatics2(ptr: Pointer?): WithDefault =
        ILicenseManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILicenseManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeILicenseManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: ILicenseManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__70164213_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILicenseManagerStatics2): Array<ILicenseManagerStatics2?>
        = (elements as
        Array<ILicenseManagerStatics2?>).castToImpl<ILicenseManagerStatics2,ILicenseManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILicenseManagerStatics2?> =
        arrayOfNulls<ILicenseManagerStatics2_Impl>(size) as Array<ILicenseManagerStatics2?>
  }
}
