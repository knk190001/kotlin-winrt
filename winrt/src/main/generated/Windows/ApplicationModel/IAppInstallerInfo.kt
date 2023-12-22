package Windows.ApplicationModel

import Windows.Foundation.Uri
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

@ABIMarker(IAppInstallerInfo.ABI::class)
@Signature("{29ab2ac0-d4f6-42a3-adcd-d6583c659508}")
@Guid("29ab2ac0d4f642a3adcdd6583c659508")
@WinRTInterface("29ab2ac0d4f642a3adcdd6583c659508")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallerInfo.ByReference::class)
public interface IAppInstallerInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallerInfo> {
    public override fun getValue() = ABI.makeIAppInstallerInfo(pointer.getPointer(0))

    public fun setValue(value: IAppInstallerInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallerInfo {
    public val __1750704794_Ptr: Pointer?

    public val _1750704794_VtblPtr: Pointer?
      get() = __1750704794_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _1750704794_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1750704794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IAppInstallerInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1750704794_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallerInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29ab2ac0d4f642a3adcdd6583c659508")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallerInfo(ptr: Pointer?): WithDefault = IAppInstallerInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallerInfo {
      val address = segment.toRawLongValue()
      return makeIAppInstallerInfo(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallerInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1750704794_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallerInfo): Array<IAppInstallerInfo?> = (elements
        as Array<IAppInstallerInfo?>).castToImpl<IAppInstallerInfo,IAppInstallerInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallerInfo?> =
        arrayOfNulls<IAppInstallerInfo_Impl>(size) as Array<IAppInstallerInfo?>
  }
}
