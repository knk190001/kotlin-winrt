package Windows.Management.Deployment

import Windows.Foundation.IAsyncOperation
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IPackageVolume2.ABI::class)
@Signature("{46abcf2e-9dd4-47a2-ab8c-c6408349bcd8}")
@Guid("46abcf2e9dd447a2ab8cc6408349bcd8")
@WinRTInterface("46abcf2e9dd447a2ab8cc6408349bcd8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageVolume2.ByReference::class)
public interface IPackageVolume2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsFullTrustPackageSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_IsAppxInstallSupported(): Boolean

  @InterfaceMethod(2)
  public fun GetAvailableSpaceAsync(): IAsyncOperation<WinDef.ULONG>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageVolume2> {
    public override fun getValue() = ABI.makeIPackageVolume2(pointer.getPointer(0))

    public fun setValue(value: IPackageVolume2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageVolume2 {
    public val __1473886006_Ptr: Pointer?

    public val _1473886006_VtblPtr: Pointer?
      get() = __1473886006_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsFullTrustPackageSupported(): Boolean {
      val fnPtr = _1473886006_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1473886006_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsAppxInstallSupported(): Boolean {
      val fnPtr = _1473886006_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1473886006_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetAvailableSpaceAsync(): IAsyncOperation<WinDef.ULONG>? {
      val fnPtr = _1473886006_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__1473886006_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WinDef.ULONG>>(result.getValue())
      return resultValue
    }
  }

  public class IPackageVolume2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1473886006_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageVolume2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("46abcf2e9dd447a2ab8cc6408349bcd8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageVolume2(ptr: Pointer?): WithDefault = IPackageVolume2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageVolume2 {
      val address = segment.toRawLongValue()
      return makeIPackageVolume2(Pointer(address))
    }

    public override fun toNative(obj: IPackageVolume2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1473886006_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageVolume2): Array<IPackageVolume2?> = (elements as
        Array<IPackageVolume2?>).castToImpl<IPackageVolume2,IPackageVolume2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageVolume2?> =
        arrayOfNulls<IPackageVolume2_Impl>(size) as Array<IPackageVolume2?>
  }
}
