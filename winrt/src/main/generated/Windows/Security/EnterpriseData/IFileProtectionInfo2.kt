package Windows.Security.EnterpriseData

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

@ABIMarker(IFileProtectionInfo2.ABI::class)
@Signature("{82123a4c-557a-498d-8e94-944cd5836432}")
@Guid("82123a4c557a498d8e94944cd5836432")
@WinRTInterface("82123a4c557a498d8e94944cd5836432")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileProtectionInfo2.ByReference::class)
public interface IFileProtectionInfo2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsProtectWhileOpenSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileProtectionInfo2> {
    public override fun getValue() = ABI.makeIFileProtectionInfo2(pointer.getPointer(0))

    public fun setValue(value: IFileProtectionInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileProtectionInfo2 {
    public val __535412908_Ptr: Pointer?

    public val _535412908_VtblPtr: Pointer?
      get() = __535412908_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsProtectWhileOpenSupported(): Boolean {
      val fnPtr = _535412908_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__535412908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IFileProtectionInfo2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __535412908_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileProtectionInfo2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("82123a4c557a498d8e94944cd5836432")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileProtectionInfo2(ptr: Pointer?): WithDefault = IFileProtectionInfo2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileProtectionInfo2 {
      val address = segment.toRawLongValue()
      return makeIFileProtectionInfo2(Pointer(address))
    }

    public override fun toNative(obj: IFileProtectionInfo2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__535412908_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileProtectionInfo2): Array<IFileProtectionInfo2?> =
        (elements as
        Array<IFileProtectionInfo2?>).castToImpl<IFileProtectionInfo2,IFileProtectionInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileProtectionInfo2?> =
        arrayOfNulls<IFileProtectionInfo2_Impl>(size) as Array<IFileProtectionInfo2?>
  }
}
