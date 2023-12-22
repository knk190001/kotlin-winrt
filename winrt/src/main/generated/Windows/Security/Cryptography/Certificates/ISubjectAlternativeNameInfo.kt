package Windows.Security.Cryptography.Certificates

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(ISubjectAlternativeNameInfo.ABI::class)
@Signature("{582859f1-569d-4c20-be7b-4e1c9a0bc52b}")
@Guid("582859f1569d4c20be7b4e1c9a0bc52b")
@WinRTInterface("582859f1569d4c20be7b4e1c9a0bc52b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISubjectAlternativeNameInfo.ByReference::class)
public interface ISubjectAlternativeNameInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EmailName(): IVectorView<String?>?

  @InterfaceMethod(1)
  public fun get_IPAddress(): IVectorView<String?>?

  @InterfaceMethod(2)
  public fun get_Url(): IVectorView<String?>?

  @InterfaceMethod(3)
  public fun get_DnsName(): IVectorView<String?>?

  @InterfaceMethod(4)
  public fun get_DistinguishedName(): IVectorView<String?>?

  @InterfaceMethod(5)
  public fun get_PrincipalName(): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISubjectAlternativeNameInfo> {
    public override fun getValue() = ABI.makeISubjectAlternativeNameInfo(pointer.getPointer(0))

    public fun setValue(value: ISubjectAlternativeNameInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISubjectAlternativeNameInfo {
    public val __1812128696_Ptr: Pointer?

    public val _1812128696_VtblPtr: Pointer?
      get() = __1812128696_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EmailName(): IVectorView<String?>? {
      val fnPtr = _1812128696_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1812128696_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IPAddress(): IVectorView<String?>? {
      val fnPtr = _1812128696_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1812128696_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Url(): IVectorView<String?>? {
      val fnPtr = _1812128696_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1812128696_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DnsName(): IVectorView<String?>? {
      val fnPtr = _1812128696_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1812128696_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DistinguishedName(): IVectorView<String?>? {
      val fnPtr = _1812128696_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1812128696_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PrincipalName(): IVectorView<String?>? {
      val fnPtr = _1812128696_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1812128696_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class ISubjectAlternativeNameInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1812128696_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISubjectAlternativeNameInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("582859f1569d4c20be7b4e1c9a0bc52b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISubjectAlternativeNameInfo(ptr: Pointer?): WithDefault =
        ISubjectAlternativeNameInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISubjectAlternativeNameInfo {
      val address = segment.toRawLongValue()
      return makeISubjectAlternativeNameInfo(Pointer(address))
    }

    public override fun toNative(obj: ISubjectAlternativeNameInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1812128696_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISubjectAlternativeNameInfo):
        Array<ISubjectAlternativeNameInfo?> = (elements as
        Array<ISubjectAlternativeNameInfo?>).castToImpl<ISubjectAlternativeNameInfo,ISubjectAlternativeNameInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISubjectAlternativeNameInfo?> =
        arrayOfNulls<ISubjectAlternativeNameInfo_Impl>(size) as Array<ISubjectAlternativeNameInfo?>
  }
}
