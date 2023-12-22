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

@ABIMarker(ISyndicationAttributeFactory.ABI::class)
@Signature("{624f1599-ed3e-420f-be86-640414886e4b}")
@Guid("624f1599ed3e420fbe86640414886e4b")
@WinRTInterface("624f1599ed3e420fbe86640414886e4b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationAttributeFactory.ByReference::class)
public interface ISyndicationAttributeFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateSyndicationAttribute(
    attributeName: String?,
    attributeNamespace: String?,
    attributeValue: String?
  ): SyndicationAttribute?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationAttributeFactory> {
    public override fun getValue() = ABI.makeISyndicationAttributeFactory(pointer.getPointer(0))

    public fun setValue(value: ISyndicationAttributeFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationAttributeFactory {
    public val __1248517506_Ptr: Pointer?

    public val _1248517506_VtblPtr: Pointer?
      get() = __1248517506_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateSyndicationAttribute(
      attributeName: String?,
      attributeNamespace: String?,
      attributeValue: String?
    ): SyndicationAttribute? {
      val fnPtr = _1248517506_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationAttribute>()
      val hr = fn.invokeHR(arrayOf(__1248517506_Ptr, marshalToNative(attributeName),
          marshalToNative(attributeNamespace), marshalToNative(attributeValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationAttribute>(result.getValue())
      return resultValue
    }
  }

  public class ISyndicationAttributeFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1248517506_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationAttributeFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("624f1599ed3e420fbe86640414886e4b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationAttributeFactory(ptr: Pointer?): WithDefault =
        ISyndicationAttributeFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationAttributeFactory {
      val address = segment.toRawLongValue()
      return makeISyndicationAttributeFactory(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationAttributeFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1248517506_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationAttributeFactory):
        Array<ISyndicationAttributeFactory?> = (elements as
        Array<ISyndicationAttributeFactory?>).castToImpl<ISyndicationAttributeFactory,ISyndicationAttributeFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationAttributeFactory?> =
        arrayOfNulls<ISyndicationAttributeFactory_Impl>(size) as
        Array<ISyndicationAttributeFactory?>
  }
}
