package Windows.Data.Text

import Windows.Foundation.Collections.IVectorView
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextConversionGenerator.ABI::class)
@Signature("{03606a5e-2aa9-4ab6-af8b-a562b63a8992}")
@Guid("03606a5e2aa94ab6af8ba562b63a8992")
@WinRTInterface("03606a5e2aa94ab6af8ba562b63a8992")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextConversionGenerator.ByReference::class)
public interface ITextConversionGenerator : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResolvedLanguage(): String?

  @InterfaceMethod(1)
  public fun get_LanguageAvailableButNotInstalled(): Boolean

  @InterfaceMethod(2)
  public fun GetCandidatesAsync(input: String?): IAsyncOperation<IVectorView<String?>?>?

  @InterfaceMethod(3)
  public fun GetCandidatesAsync(input: String?, maxCandidates: WinDef.UINT):
      IAsyncOperation<IVectorView<String?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextConversionGenerator> {
    public override fun getValue() = ABI.makeITextConversionGenerator(pointer.getPointer(0))

    public fun setValue(value: ITextConversionGenerator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextConversionGenerator {
    public val __1958047373_Ptr: Pointer?

    public val _1958047373_VtblPtr: Pointer?
      get() = __1958047373_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResolvedLanguage(): String? {
      val fnPtr = _1958047373_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1958047373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LanguageAvailableButNotInstalled(): Boolean {
      val fnPtr = _1958047373_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1958047373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetCandidatesAsync(input: String?):
        IAsyncOperation<IVectorView<String?>?>? {
      val fnPtr = _1958047373_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__1958047373_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<String?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetCandidatesAsync(input: String?, maxCandidates: WinDef.UINT):
        IAsyncOperation<IVectorView<String?>?>? {
      val fnPtr = _1958047373_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__1958047373_Ptr, marshalToNative(input), maxCandidates, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<String?>?>>(result.getValue())
      return resultValue
    }
  }

  public class ITextConversionGenerator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1958047373_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextConversionGenerator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03606a5e2aa94ab6af8ba562b63a8992")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextConversionGenerator(ptr: Pointer?): WithDefault =
        ITextConversionGenerator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextConversionGenerator {
      val address = segment.toRawLongValue()
      return makeITextConversionGenerator(Pointer(address))
    }

    public override fun toNative(obj: ITextConversionGenerator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1958047373_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextConversionGenerator):
        Array<ITextConversionGenerator?> = (elements as
        Array<ITextConversionGenerator?>).castToImpl<ITextConversionGenerator,ITextConversionGenerator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextConversionGenerator?> =
        arrayOfNulls<ITextConversionGenerator_Impl>(size) as Array<ITextConversionGenerator?>
  }
}
