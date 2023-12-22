package Windows.Web.Syndication

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

@ABIMarker(ISyndicationCategoryFactory.ABI::class)
@Signature("{ab42802f-49e0-4525-8ab2-ab45c02528ff}")
@Guid("ab42802f49e045258ab2ab45c02528ff")
@WinRTInterface("ab42802f49e045258ab2ab45c02528ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationCategoryFactory.ByReference::class)
public interface ISyndicationCategoryFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateSyndicationCategory(term: String?): SyndicationCategory?

  @InterfaceMethod(1)
  public fun CreateSyndicationCategoryEx(
    term: String?,
    scheme: String?,
    label: String?
  ): SyndicationCategory?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationCategoryFactory> {
    public override fun getValue() = ABI.makeISyndicationCategoryFactory(pointer.getPointer(0))

    public fun setValue(value: ISyndicationCategoryFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationCategoryFactory {
    public val __587657340_Ptr: Pointer?

    public val _587657340_VtblPtr: Pointer?
      get() = __587657340_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateSyndicationCategory(term: String?): SyndicationCategory? {
      val fnPtr = _587657340_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationCategory>()
      val hr = fn.invokeHR(arrayOf(__587657340_Ptr, marshalToNative(term), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationCategory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateSyndicationCategoryEx(
      term: String?,
      scheme: String?,
      label: String?
    ): SyndicationCategory? {
      val fnPtr = _587657340_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationCategory>()
      val hr = fn.invokeHR(arrayOf(__587657340_Ptr, marshalToNative(term), marshalToNative(scheme),
          marshalToNative(label), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationCategory>(result.getValue())
      return resultValue
    }
  }

  public class ISyndicationCategoryFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __587657340_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationCategoryFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab42802f49e045258ab2ab45c02528ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationCategoryFactory(ptr: Pointer?): WithDefault =
        ISyndicationCategoryFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationCategoryFactory {
      val address = segment.toRawLongValue()
      return makeISyndicationCategoryFactory(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationCategoryFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__587657340_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationCategoryFactory):
        Array<ISyndicationCategoryFactory?> = (elements as
        Array<ISyndicationCategoryFactory?>).castToImpl<ISyndicationCategoryFactory,ISyndicationCategoryFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationCategoryFactory?> =
        arrayOfNulls<ISyndicationCategoryFactory_Impl>(size) as Array<ISyndicationCategoryFactory?>
  }
}
