package Windows.Management.Deployment.Preview

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

@ABIMarker(IInstalledClassicAppInfo.ABI::class)
@Signature("{0a7d3da3-65d0-4086-80d6-0610d760207d}")
@Guid("0a7d3da365d0408680d60610d760207d")
@WinRTInterface("0a7d3da365d0408680d60610d760207d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInstalledClassicAppInfo.ByReference::class)
public interface IInstalledClassicAppInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayName(): String?

  @InterfaceMethod(1)
  public fun get_DisplayVersion(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInstalledClassicAppInfo> {
    public override fun getValue() = ABI.makeIInstalledClassicAppInfo(pointer.getPointer(0))

    public fun setValue(value: IInstalledClassicAppInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInstalledClassicAppInfo {
    public val __1016081715_Ptr: Pointer?

    public val _1016081715_VtblPtr: Pointer?
      get() = __1016081715_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1016081715_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1016081715_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayVersion(): String? {
      val fnPtr = _1016081715_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1016081715_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IInstalledClassicAppInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1016081715_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInstalledClassicAppInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0a7d3da365d0408680d60610d760207d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInstalledClassicAppInfo(ptr: Pointer?): WithDefault =
        IInstalledClassicAppInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInstalledClassicAppInfo {
      val address = segment.toRawLongValue()
      return makeIInstalledClassicAppInfo(Pointer(address))
    }

    public override fun toNative(obj: IInstalledClassicAppInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1016081715_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInstalledClassicAppInfo):
        Array<IInstalledClassicAppInfo?> = (elements as
        Array<IInstalledClassicAppInfo?>).castToImpl<IInstalledClassicAppInfo,IInstalledClassicAppInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInstalledClassicAppInfo?> =
        arrayOfNulls<IInstalledClassicAppInfo_Impl>(size) as Array<IInstalledClassicAppInfo?>
  }
}
