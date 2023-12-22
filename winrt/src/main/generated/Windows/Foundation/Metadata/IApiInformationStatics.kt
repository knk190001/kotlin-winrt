package Windows.Foundation.Metadata

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IApiInformationStatics.ABI::class)
@Signature("{997439fe-f681-4a11-b416-c13a47e8ba36}")
@Guid("997439fef6814a11b416c13a47e8ba36")
@WinRTInterface("997439fef6814a11b416c13a47e8ba36")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApiInformationStatics.ByReference::class)
public interface IApiInformationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsTypePresent(typeName: String?): Boolean

  @InterfaceMethod(1)
  public fun IsMethodPresent(typeName: String?, methodName: String?): Boolean

  @InterfaceMethod(2)
  public fun IsMethodPresent(
    typeName: String?,
    methodName: String?,
    inputParameterCount: WinDef.UINT
  ): Boolean

  @InterfaceMethod(3)
  public fun IsEventPresent(typeName: String?, eventName: String?): Boolean

  @InterfaceMethod(4)
  public fun IsPropertyPresent(typeName: String?, propertyName: String?): Boolean

  @InterfaceMethod(5)
  public fun IsReadOnlyPropertyPresent(typeName: String?, propertyName: String?): Boolean

  @InterfaceMethod(6)
  public fun IsWriteablePropertyPresent(typeName: String?, propertyName: String?): Boolean

  @InterfaceMethod(7)
  public fun IsEnumNamedValuePresent(enumTypeName: String?, valueName: String?): Boolean

  @InterfaceMethod(8)
  public fun IsApiContractPresent(contractName: String?, majorVersion: WinDef.USHORT): Boolean

  @InterfaceMethod(9)
  public fun IsApiContractPresent(
    contractName: String?,
    majorVersion: WinDef.USHORT,
    minorVersion: WinDef.USHORT
  ): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApiInformationStatics> {
    public override fun getValue() = ABI.makeIApiInformationStatics(pointer.getPointer(0))

    public fun setValue(value: IApiInformationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApiInformationStatics {
    public val __1830103209_Ptr: Pointer?

    public val _1830103209_VtblPtr: Pointer?
      get() = __1830103209_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsTypePresent(typeName: String?): Boolean {
      val fnPtr = _1830103209_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1830103209_Ptr, marshalToNative(typeName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun IsMethodPresent(typeName: String?, methodName: String?): Boolean {
      val fnPtr = _1830103209_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1830103209_Ptr, marshalToNative(typeName),
          marshalToNative(methodName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun IsMethodPresent(
      typeName: String?,
      methodName: String?,
      inputParameterCount: WinDef.UINT
    ): Boolean {
      val fnPtr = _1830103209_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1830103209_Ptr, marshalToNative(typeName),
          marshalToNative(methodName), inputParameterCount, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun IsEventPresent(typeName: String?, eventName: String?): Boolean {
      val fnPtr = _1830103209_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1830103209_Ptr, marshalToNative(typeName),
          marshalToNative(eventName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun IsPropertyPresent(typeName: String?, propertyName: String?): Boolean {
      val fnPtr = _1830103209_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1830103209_Ptr, marshalToNative(typeName),
          marshalToNative(propertyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun IsReadOnlyPropertyPresent(typeName: String?, propertyName: String?):
        Boolean {
      val fnPtr = _1830103209_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1830103209_Ptr, marshalToNative(typeName),
          marshalToNative(propertyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun IsWriteablePropertyPresent(typeName: String?, propertyName: String?):
        Boolean {
      val fnPtr = _1830103209_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1830103209_Ptr, marshalToNative(typeName),
          marshalToNative(propertyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun IsEnumNamedValuePresent(enumTypeName: String?, valueName: String?):
        Boolean {
      val fnPtr = _1830103209_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1830103209_Ptr, marshalToNative(enumTypeName),
          marshalToNative(valueName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun IsApiContractPresent(contractName: String?, majorVersion: WinDef.USHORT):
        Boolean {
      val fnPtr = _1830103209_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1830103209_Ptr, marshalToNative(contractName), majorVersion,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun IsApiContractPresent(
      contractName: String?,
      majorVersion: WinDef.USHORT,
      minorVersion: WinDef.USHORT
    ): Boolean {
      val fnPtr = _1830103209_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1830103209_Ptr, marshalToNative(contractName), majorVersion,
          minorVersion, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IApiInformationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1830103209_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApiInformationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("997439fef6814a11b416c13a47e8ba36")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApiInformationStatics(ptr: Pointer?): WithDefault =
        IApiInformationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApiInformationStatics {
      val address = segment.toRawLongValue()
      return makeIApiInformationStatics(Pointer(address))
    }

    public override fun toNative(obj: IApiInformationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1830103209_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApiInformationStatics): Array<IApiInformationStatics?> =
        (elements as
        Array<IApiInformationStatics?>).castToImpl<IApiInformationStatics,IApiInformationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApiInformationStatics?> =
        arrayOfNulls<IApiInformationStatics_Impl>(size) as Array<IApiInformationStatics?>
  }
}
