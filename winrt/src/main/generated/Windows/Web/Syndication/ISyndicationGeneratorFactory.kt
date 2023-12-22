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

@ABIMarker(ISyndicationGeneratorFactory.ABI::class)
@Signature("{a34083e3-1e26-4dbc-ba9d-1ab84beff97b}")
@Guid("a34083e31e264dbcba9d1ab84beff97b")
@WinRTInterface("a34083e31e264dbcba9d1ab84beff97b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationGeneratorFactory.ByReference::class)
public interface ISyndicationGeneratorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateSyndicationGenerator(text: String?): SyndicationGenerator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationGeneratorFactory> {
    public override fun getValue() = ABI.makeISyndicationGeneratorFactory(pointer.getPointer(0))

    public fun setValue(value: ISyndicationGeneratorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationGeneratorFactory {
    public val __1886705255_Ptr: Pointer?

    public val _1886705255_VtblPtr: Pointer?
      get() = __1886705255_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateSyndicationGenerator(text: String?): SyndicationGenerator? {
      val fnPtr = _1886705255_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationGenerator>()
      val hr = fn.invokeHR(arrayOf(__1886705255_Ptr, marshalToNative(text), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationGenerator>(result.getValue())
      return resultValue
    }
  }

  public class ISyndicationGeneratorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1886705255_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationGeneratorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a34083e31e264dbcba9d1ab84beff97b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationGeneratorFactory(ptr: Pointer?): WithDefault =
        ISyndicationGeneratorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationGeneratorFactory {
      val address = segment.toRawLongValue()
      return makeISyndicationGeneratorFactory(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationGeneratorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1886705255_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationGeneratorFactory):
        Array<ISyndicationGeneratorFactory?> = (elements as
        Array<ISyndicationGeneratorFactory?>).castToImpl<ISyndicationGeneratorFactory,ISyndicationGeneratorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationGeneratorFactory?> =
        arrayOfNulls<ISyndicationGeneratorFactory_Impl>(size) as
        Array<ISyndicationGeneratorFactory?>
  }
}
