package Microsoft.Windows.Security.AccessControl

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
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISecurityDescriptorHelpersStatics.ABI::class)
@Signature("{14fa9e8d-59f0-5017-852f-3ae24fd5ebb1}")
@Guid("14fa9e8d59f05017852f3ae24fd5ebb1")
@WinRTInterface("14fa9e8d59f05017852f3ae24fd5ebb1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecurityDescriptorHelpersStatics.ByReference::class)
public interface ISecurityDescriptorHelpersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetSddlForAppContainerNames(
    accessRequests: Array<AppContainerNameAndAccess?>,
    principalStringSid: String?,
    principalAccessMask: WinDef.UINT
  ): String?

  @InterfaceMethod(1)
  public fun GetSecurityDescriptorBytesFromAppContainerNames(
    accessRequests: Array<AppContainerNameAndAccess?>,
    principalStringSid: String?,
    principalAccessMask: WinDef.UINT
  ): Array<Byte>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecurityDescriptorHelpersStatics> {
    public override fun getValue() =
        ABI.makeISecurityDescriptorHelpersStatics(pointer.getPointer(0))

    public fun setValue(value: ISecurityDescriptorHelpersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecurityDescriptorHelpersStatics {
    public val __1932648226_Ptr: Pointer?

    public val _1932648226_VtblPtr: Pointer?
      get() = __1932648226_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetSddlForAppContainerNames(
      accessRequests: Array<AppContainerNameAndAccess?>,
      principalStringSid: String?,
      principalAccessMask: WinDef.UINT
    ): String? {
      val fnPtr = _1932648226_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1932648226_Ptr,
          accessRequests.size,marshalToNative(accessRequests), marshalToNative(principalStringSid),
          principalAccessMask, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetSecurityDescriptorBytesFromAppContainerNames(
      accessRequests: Array<AppContainerNameAndAccess?>,
      principalStringSid: String?,
      principalAccessMask: WinDef.UINT
    ): Array<Byte>? {
      val fnPtr = _1932648226_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__1932648226_Ptr,
          accessRequests.size,marshalToNative(accessRequests), marshalToNative(principalStringSid),
          principalAccessMask, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }
  }

  public class ISecurityDescriptorHelpersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1932648226_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecurityDescriptorHelpersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("14fa9e8d59f05017852f3ae24fd5ebb1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecurityDescriptorHelpersStatics(ptr: Pointer?): WithDefault =
        ISecurityDescriptorHelpersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISecurityDescriptorHelpersStatics {
      val address = segment.toRawLongValue()
      return makeISecurityDescriptorHelpersStatics(Pointer(address))
    }

    public override fun toNative(obj: ISecurityDescriptorHelpersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1932648226_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecurityDescriptorHelpersStatics):
        Array<ISecurityDescriptorHelpersStatics?> = (elements as
        Array<ISecurityDescriptorHelpersStatics?>).castToImpl<ISecurityDescriptorHelpersStatics,ISecurityDescriptorHelpersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISecurityDescriptorHelpersStatics?> =
        arrayOfNulls<ISecurityDescriptorHelpersStatics_Impl>(size) as
        Array<ISecurityDescriptorHelpersStatics?>
  }
}
