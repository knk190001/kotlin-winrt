package Windows.Globalization

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

@ABIMarker(IApplicationLanguagesStatics.ABI::class)
@Signature("{75b40847-0a4c-4a92-9565-fd63c95f7aed}")
@Guid("75b408470a4c4a929565fd63c95f7aed")
@WinRTInterface("75b408470a4c4a929565fd63c95f7aed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationLanguagesStatics.ByReference::class)
public interface IApplicationLanguagesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PrimaryLanguageOverride(): String?

  @InterfaceMethod(1)
  public fun put_PrimaryLanguageOverride(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Languages(): IVectorView<String?>?

  @InterfaceMethod(3)
  public fun get_ManifestLanguages(): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationLanguagesStatics> {
    public override fun getValue() = ABI.makeIApplicationLanguagesStatics(pointer.getPointer(0))

    public fun setValue(value: IApplicationLanguagesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationLanguagesStatics {
    public val __1670965383_Ptr: Pointer?

    public val _1670965383_VtblPtr: Pointer?
      get() = __1670965383_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrimaryLanguageOverride(): String? {
      val fnPtr = _1670965383_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1670965383_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PrimaryLanguageOverride(value: String?): Unit {
      val fnPtr = _1670965383_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1670965383_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Languages(): IVectorView<String?>? {
      val fnPtr = _1670965383_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1670965383_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ManifestLanguages(): IVectorView<String?>? {
      val fnPtr = _1670965383_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1670965383_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationLanguagesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1670965383_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationLanguagesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("75b408470a4c4a929565fd63c95f7aed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationLanguagesStatics(ptr: Pointer?): WithDefault =
        IApplicationLanguagesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationLanguagesStatics {
      val address = segment.toRawLongValue()
      return makeIApplicationLanguagesStatics(Pointer(address))
    }

    public override fun toNative(obj: IApplicationLanguagesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1670965383_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationLanguagesStatics):
        Array<IApplicationLanguagesStatics?> = (elements as
        Array<IApplicationLanguagesStatics?>).castToImpl<IApplicationLanguagesStatics,IApplicationLanguagesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationLanguagesStatics?> =
        arrayOfNulls<IApplicationLanguagesStatics_Impl>(size) as
        Array<IApplicationLanguagesStatics?>
  }
}
