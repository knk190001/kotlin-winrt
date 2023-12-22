package Windows.ApplicationModel.Store.LicenseManagement

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.HResult
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

@ABIMarker(ILicenseSatisfactionResult.ABI::class)
@Signature("{3c674f73-3c87-4ee1-8201-f428359bd3af}")
@Guid("3c674f733c874ee18201f428359bd3af")
@WinRTInterface("3c674f733c874ee18201f428359bd3af")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILicenseSatisfactionResult.ByReference::class)
public interface ILicenseSatisfactionResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LicenseSatisfactionInfos(): IMapView<String?, LicenseSatisfactionInfo?>?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILicenseSatisfactionResult> {
    public override fun getValue() = ABI.makeILicenseSatisfactionResult(pointer.getPointer(0))

    public fun setValue(value: ILicenseSatisfactionResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILicenseSatisfactionResult {
    public val __922870478_Ptr: Pointer?

    public val _922870478_VtblPtr: Pointer?
      get() = __922870478_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LicenseSatisfactionInfos(): IMapView<String?,
        LicenseSatisfactionInfo?>? {
      val fnPtr = _922870478_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, LicenseSatisfactionInfo?>>()
      val hr = fn.invokeHR(arrayOf(__922870478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?,
          LicenseSatisfactionInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _922870478_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__922870478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class ILicenseSatisfactionResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __922870478_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILicenseSatisfactionResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c674f733c874ee18201f428359bd3af")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILicenseSatisfactionResult(ptr: Pointer?): WithDefault =
        ILicenseSatisfactionResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILicenseSatisfactionResult {
      val address = segment.toRawLongValue()
      return makeILicenseSatisfactionResult(Pointer(address))
    }

    public override fun toNative(obj: ILicenseSatisfactionResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__922870478_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILicenseSatisfactionResult):
        Array<ILicenseSatisfactionResult?> = (elements as
        Array<ILicenseSatisfactionResult?>).castToImpl<ILicenseSatisfactionResult,ILicenseSatisfactionResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILicenseSatisfactionResult?> =
        arrayOfNulls<ILicenseSatisfactionResult_Impl>(size) as Array<ILicenseSatisfactionResult?>
  }
}
